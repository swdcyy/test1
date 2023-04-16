package com.yxcorp.gifshow.model.config.AuditFrameUploadParam;
import java.io.Serializable;
import java.lang.Object;

public class AuditFrameUploadParam implements Serializable	// class@001eb4
{
    public int mFlashFrameInterval;
    public int mMaxCount;
    public float mQuality;
    public int mShortSideLength;

    public void AuditFrameUploadParam(){
       super();
       this.mMaxCount = 10;
       this.mQuality = 0x3f333333;
       this.mShortSideLength = 600;
       this.mFlashFrameInterval = 1000;
    }
}
