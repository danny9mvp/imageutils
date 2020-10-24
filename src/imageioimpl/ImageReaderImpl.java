/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageioimpl;

import imageio.ImageReader;
import imagebeans.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class ImageReaderImpl implements ImageReader{

    @Override
    public Image readAsImage(File imageFile) throws IOException{        
        FileInputStream fileInputStream = new FileInputStream(imageFile);
        byte[] imageByteArray = new byte[(int)imageFile.length()];
        fileInputStream.read(imageByteArray);        
        Image image = new Image(imageFile.getName(), new Date(imageFile.lastModified()), imageByteArray);
        fileInputStream.close();
        return image;
    }
    
}
