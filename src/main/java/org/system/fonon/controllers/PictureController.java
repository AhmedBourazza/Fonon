package org.system.fonon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.system.fonon.entities.Picture;
import org.system.fonon.services.PictureService;

@Controller
@RequestMapping("/")
public class PictureController {
    private final PictureService pictureService;

    public PictureController(PictureService pictureService) {
        this.pictureService = pictureService;
    }

    @GetMapping("/test")
    public String test(Model model) {
      /* Picture picture = pictureService.getPicture(155); // Adjust this method according to your service
        String base64Image = java.util.Base64.getEncoder().encodeToString(picture.getPictureData().getData());

        model.addAttribute("base64Image", base64Image);*/
        return "test";
    }
}
