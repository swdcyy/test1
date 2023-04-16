package com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo$ShapesBean$MetaBean;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo$ShapesBean$MetaBean$SizeBean;

public class StickerJsonInfo$ShapesBean$MetaBean implements Serializable	// class@001263
{
    public String format;
    public String image;
    public String scale;
    public StickerJsonInfo$ShapesBean$MetaBean$SizeBean size;
    public String version;

    public void StickerJsonInfo$ShapesBean$MetaBean(){
       super();
    }
    public String getFormat(){
       return this.format;
    }
    public String getImage(){
       return this.image;
    }
    public String getScale(){
       return this.scale;
    }
    public StickerJsonInfo$ShapesBean$MetaBean$SizeBean getSize(){
       return this.size;
    }
    public String getVersion(){
       return this.version;
    }
    public void setFormat(String p0){
       this.format = p0;
    }
    public void setImage(String p0){
       this.image = p0;
    }
    public void setScale(String p0){
       this.scale = p0;
    }
    public void setSize(StickerJsonInfo$ShapesBean$MetaBean$SizeBean p0){
       this.size = p0;
    }
    public void setVersion(String p0){
       this.version = p0;
    }
}
