package com.kwai.feature.post.api.feature.bridge.JsSaveTempImagesParams;
import java.io.Serializable;
import java.lang.Object;

public class JsSaveTempImagesParams implements Serializable	// class@001368
{
    public List imageData;
    public boolean isPng;
    public String mCallback;
    public static final long serialVersionUID = 0xadee796722d6f5dd;

    public void JsSaveTempImagesParams(){
       super();
       this.isPng = false;
    }
}
