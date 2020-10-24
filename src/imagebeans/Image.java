/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagebeans;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Image implements Serializable{
    private static final long serialVersionUID = 25L;
    private String name;
    private Date creationDate;
    private byte[] content;    
    public Image(){}
    
    public Image(String name, Date creationDate, byte[] content){        
        this.name = name;
        this.creationDate = creationDate;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
