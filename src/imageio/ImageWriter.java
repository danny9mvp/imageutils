/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageio;

import imagebeans.Image;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public interface ImageWriter {
    void writeImageFile(Image image, String path) throws IOException;
}
