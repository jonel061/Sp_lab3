package com.company;

public class ImageProxi  implements Element{
    String ImgName;
     Imagine realImage;

    @Override
    public void render() {
        if (realImage == null){
            realImage =new Imagine(ImgName);
        }
        realImage.render();

    }
    public ImageProxi(String Imgname){
        this.ImgName=ImgName;
        this.realImage=null;
    }

}
