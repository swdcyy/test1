package com.yxcorp.gifshow.commercial.model.SplashMaterialInfo;
import java.io.Serializable;
import java.lang.Object;

public class SplashMaterialInfo implements Serializable	// class@001151
{
    public String[] mBackupImageUrls;
    public String[] mImageUrls;
    public int mMaterialHeight;
    public int mMaterialWidth;
    public SplashMaterialInfo$PlayableMaterialInfo mPlayableMaterialInfo;
    public int mSplashAdMaterialType;
    public CDNUrl[] mVideoUrls;
    public static final long serialVersionUID = 0x10907d9b8c86f77f;

    public void SplashMaterialInfo(){
       super();
    }
}
