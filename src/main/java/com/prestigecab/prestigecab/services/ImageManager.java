package com.prestigecab.prestigecab.services;

import com.prestigecab.prestigecab.Model.Vehicules;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ImageManager {
    @Value("${prestige.img.path}")
    String path;

    public int saveImage1(Vehicules v, InputStream fi) {
        v.setImage1(save("v", "image1", fi));
        return 0;
    }

    public int saveImage2(Vehicules v, InputStream fi) {
        v.setImage1(save("v", "image2", fi));
        return 0;
    }

    public int saveImage3(Vehicules v, InputStream fi) {
        v.setImage1(save("v", "image3", fi));
        return 0;
    }

    private String save(String prefix, String subPath, InputStream fi) {
        String fileName = "";
        try (DirectoryStream<Path> dir = Files.newDirectoryStream(Paths.get(path + "/" + subPath), prefix + "*")) {

            for (Path file : dir
            ) {
                if (fileName.compareTo(file.getFileName().toString()) < 0) {
                    fileName = file.getFileName().toString();
                }
            }
            String numStr = fileName.substring(1, fileName.indexOf(".jpg"));

            Integer num = Integer.parseInt(numStr);

            numStr = String.format("%04d", num + 1);

            fileName = prefix + numStr + ".jpg";

            String filePath = path + "/" + subPath + "/" + fileName;

            Files.copy(fi, new File(filePath).toPath());

        } catch (IOException ioe) {
            System.out.println("Erreur sur nom d'image : " + ioe.getMessage());
        }
        return fileName;
    }
    public InputStream retreiveImage1(String fileName){
        return retreiveImage("image1", fileName);
    }

    public InputStream retreiveImage2(String fileName){
        return retreiveImage("image2", fileName);
    }

    public InputStream retreiveImage3(String fileName){
        return retreiveImage("image3", fileName);
    }

    private InputStream retreiveImage(String subPath, String fileName){
        InputStream is = null;
        try {
            is = new FileInputStream(path+"/"+subPath+"/"+fileName);
        } catch (FileNotFoundException fnfe) {
            System.out.println("Erreur récupération de l'image "+fileName+" : "+fnfe.getMessage());
        }
        return is;
    }
}