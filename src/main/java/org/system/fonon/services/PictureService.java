package org.system.fonon.services;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.system.fonon.dao.PictureRepository;
import org.system.fonon.entities.Picture;

import java.io.IOException;

@Service
public class PictureService {

    @Autowired
    PictureRepository pictureRepository;



    public String addPicture(String title, MultipartFile file,Integer id) throws IOException {
        Picture picture = new Picture();
        picture.setPictureData(
                new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        picture = pictureRepository.insert(picture);
        return picture.getId();
    }

    public Picture getPicture(String id) {
        return pictureRepository.findById(id).get();
    }
}
