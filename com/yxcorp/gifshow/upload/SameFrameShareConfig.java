package com.yxcorp.gifshow.upload.SameFrameShareConfig;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class SameFrameShareConfig implements Serializable	// class@001e4d
{
    public final boolean mAllowSameFrame;
    public final int mAvailableDepth;
    public final boolean mHasLrc;
    public final String mOriginSameFramePhotoId;
    public final String mOriginSameFrameUserName;
    public static final long serialVersionUID = 0x5efb5228a0ba4f99;

    public void SameFrameShareConfig(String p0,String p1,boolean p2,boolean p3,int p4){
       super();
       this.mOriginSameFrameUserName = p0;
       this.mOriginSameFramePhotoId = p1;
       this.mAllowSameFrame = p2;
       this.mHasLrc = p3;
       this.mAvailableDepth = p4;
    }
}
