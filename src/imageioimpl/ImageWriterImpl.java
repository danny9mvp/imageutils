/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageioimpl;

import imageio.ImageWriter;
import imagebeans.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class ImageWriterImpl implements ImageWriter{

    @Override
    public void writeImageFile(Image image, String path) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(path+File.separator+image.getName());
        fileOutputStream.write(image.getContent());
        fileOutputStream.close();
    }
    
}
