package org.system.fonon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.multipart.MultipartFile;
import org.system.fonon.dao.UserRepository;
import org.system.fonon.entities.Picture;
import org.system.fonon.entities.User;
import org.system.fonon.services.PictureService;
import org.system.fonon.services.UserService;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class FononApplication implements CommandLineRunner {
@Autowired
    UserService userService;
    @Autowired
    private PictureService pictureService;

    public static void main(String[] args) {
        SpringApplication.run(FononApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    /*User user = new User();
    user.setUsername("admin");
    user.setPassword("admin");
    user.setEmail("admin@admin.com");
    user.setFirstName("admin");
    user.setLastName("admin");
    user.setPassword("admin");
    user.setRole("user");
    userService.save(user);
*/
/*
        // Path to the picture file
        String filePath = "C:\\Users\\ahmed\\OneDrive\\Desktop\\Python-Software-Foundation-Emblem.png";

        // Read the picture file
        try {
            byte[] fileBytes = Files.readAllBytes(Paths.get(filePath));

            // Create a MultipartFile from the file bytes
            MultipartFile multipartFile = new MultipartFile() {
                @Override
                public String getName() {
                    return "file";
                }

                @Override
                public String getOriginalFilename() {
                    return "Python-Software-Foundation-Emblem.png";
                }

                @Override
                public String getContentType() {
                    return "image/png";
                }

                @Override
                public boolean isEmpty() {
                    return fileBytes.length == 0;
                }

                @Override
                public long getSize() {
                    return fileBytes.length;
                }

                @Override
                public byte[] getBytes() throws IOException {
                    return fileBytes;
                }

                @Override
                public InputStream getInputStream() throws IOException {
                    return new ByteArrayInputStream(fileBytes);
                }

                @Override
                public void transferTo(File dest) throws IOException, IllegalStateException {
                    Files.write(dest.toPath(), fileBytes);
                }
            };

            // Add the picture using the PictureService
            pictureService.addPicture("Python Logo", multipartFile);

            System.out.println("Picture added successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error adding picture: " + e.getMessage());
        }
*/
    }




}
