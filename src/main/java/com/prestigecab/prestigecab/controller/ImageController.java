package com.prestigecab.prestigecab.controller;


import com.prestigecab.prestigecab.dao.TypeRepository;
import com.prestigecab.prestigecab.dao.VehiculesRepository;
import com.prestigecab.prestigecab.services.ImageManager;
import org.apache.maven.surefire.shade.org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;

@Controller
@RequestMapping(value = "/img")
public class ImageController {
   VehiculesRepository vehiculeDao;
   ImageManager imageManager;

   @Autowired
   ImageController(VehiculesRepository vehiculesRepository,ImageManager imageManager){
      this.vehiculeDao=vehiculesRepository;
      this.imageManager=imageManager;
   }
   @GetMapping(value = "/admin/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
   public @ResponseBody
   byte[]
   image1(@PathVariable("id") Long id) {
      String imageName = vehiculeDao.findById(id).get().getImage1();
      InputStream is = imageManager.retreiveImage1(imageName);
      byte[] image = null;
      try {
         image = IOUtils.toByteArray(is);
      } catch (IOException e) {
         e.printStackTrace();
      }
      return image;
   }
//   @GetMapping(value = "/admin/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
//   public @ResponseBody
//   byte[]
//   image2(@PathVariable("id") Long id) {
//      String imageName = vehiculeDao.findById(id).get().getImage2();
//      InputStream is = imageManager.retreiveImage2(imageName);
//      byte[] image = null;
//      try {
//         image = IOUtils.toByteArray(is);
//      } catch (IOException e) {
//         e.printStackTrace();
//      }
//      return image;
//   }
//   @GetMapping(value = "/admin/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
//   public @ResponseBody
//   byte[]
//   image3(@PathVariable("id") Long id) {
//      String imageName = vehiculeDao.findById(id).get().getImage3();
//      InputStream is = imageManager.retreiveImage3(imageName);
//      byte[] image = null;
//      try {
//         image = IOUtils.toByteArray(is);
//      } catch (IOException e) {
//         e.printStackTrace();
//      }
//      return image;
//   }
}
