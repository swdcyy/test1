package com.yxcorp.gifshow.model.config.PartUploadConfig;
import java.io.Serializable;
import java.lang.Object;

public class PartUploadConfig implements Serializable	// class@001ed9
{
    public boolean mDataNetOn;
    public int mMaxThread;
    public boolean mPartFileUploadFirst;
    public boolean mPartFileUploadOn;
    public long mThreshold;
    public int mWholeUploadMaxSize;
    public static final long serialVersionUID = 0x92863a71e91ca5bc;

    public void PartUploadConfig(){
       super();
       this.mPartFileUploadFirst = true;
       this.mWholeUploadMaxSize = 0x3c00000;
    }
}
