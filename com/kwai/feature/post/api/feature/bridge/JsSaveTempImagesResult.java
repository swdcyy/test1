package com.kwai.feature.post.api.feature.bridge.JsSaveTempImagesResult;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;

public class JsSaveTempImagesResult implements Serializable	// class@001369
{
    public final List mImagePaths;
    public final int mResult;
    public static final long serialVersionUID = 0xdb818fa751de429e;

    public void JsSaveTempImagesResult(int p0,List p1){
       super();
       this.mResult = p0;
       this.mImagePaths = p1;
    }
}
