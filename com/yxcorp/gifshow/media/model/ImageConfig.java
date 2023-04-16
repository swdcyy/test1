package com.yxcorp.gifshow.media.model.ImageConfig;
import java.io.Serializable;
import java.lang.Object;

public class ImageConfig implements Serializable	// class@001d0f
{
    public int mAtlasLongSide;
    public int mAtlasQuality;
    public int mSingleImageLongSide;
    public int mSingleImageQuality;
    public static final long serialVersionUID = 0x59294e7dd12267a8;

    public void ImageConfig(){
       super();
       this.mSingleImageLongSide = 1920;
       this.mSingleImageQuality = 85;
       this.mAtlasLongSide = 1920;
       this.mAtlasQuality = 85;
    }
    public int getAtlasLongSide(){
       return this.mAtlasLongSide;
    }
    public int getAtlasQuality(){
       return this.mAtlasQuality;
    }
    public int getSingleImageLongSide(){
       return this.mSingleImageLongSide;
    }
    public int getSingleImageQuality(){
       return this.mSingleImageQuality;
    }
}
