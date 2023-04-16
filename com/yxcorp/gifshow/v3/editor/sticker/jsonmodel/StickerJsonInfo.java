package com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;

public class StickerJsonInfo implements Serializable	// class@001265
{
    public String disableTextInput;
    public String scale;
    public List shapes;
    public static final long serialVersionUID = 0x15b502b617d96af0;

    public void StickerJsonInfo(){
       super();
    }
    public String getDisableTextInput(){
       return this.disableTextInput;
    }
    public String getScale(){
       return this.scale;
    }
    public List getShapes(){
       return this.shapes;
    }
    public void setDisableTextInput(String p0){
       this.disableTextInput = p0;
    }
    public void setScale(String p0){
       this.scale = p0;
    }
    public void setShapes(List p0){
       this.shapes = p0;
    }
}
