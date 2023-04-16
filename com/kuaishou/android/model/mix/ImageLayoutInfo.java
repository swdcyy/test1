package com.kuaishou.android.model.mix.ImageLayoutInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Float;

public final class ImageLayoutInfo implements Serializable	// class@000cb9
{
    public String backgroundColor;
    public Float height;
    public Float thumbHeight;
    public Float thumbWidth;
    public Float width;

    public void ImageLayoutInfo(){
       super();
    }
    public final String getBackgroundColor(){
       return this.backgroundColor;
    }
    public final Float getHeight(){
       return this.height;
    }
    public final Float getThumbHeight(){
       return this.thumbHeight;
    }
    public final Float getThumbWidth(){
       return this.thumbWidth;
    }
    public final Float getWidth(){
       return this.width;
    }
    public final void setBackgroundColor(String p0){
       this.backgroundColor = p0;
    }
    public final void setHeight(Float p0){
       this.height = p0;
    }
    public final void setThumbHeight(Float p0){
       this.thumbHeight = p0;
    }
    public final void setThumbWidth(Float p0){
       this.thumbWidth = p0;
    }
    public final void setWidth(Float p0){
       this.width = p0;
    }
}
