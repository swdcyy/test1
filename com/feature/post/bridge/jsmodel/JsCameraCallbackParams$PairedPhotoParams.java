package com.feature.post.bridge.jsmodel.JsCameraCallbackParams$PairedPhotoParams;
import java.lang.Object;
import java.lang.String;

public class JsCameraCallbackParams$PairedPhotoParams	// class@001486
{
    public String mPhotoId;
    public String mType;

    public void JsCameraCallbackParams$PairedPhotoParams(){
       super();
    }
    public String toString(){
       Object[] objArray = new Object[]{this.mPhotoId,this.mType};
       return String.format("photoId=%s, type=%s", objArray);
    }
}
