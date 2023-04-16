package com.kwai.feature.post.api.feature.bridge.JsVideoUploadStatusResult$StatusResultData;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class JsVideoUploadStatusResult$StatusResultData implements Serializable	// class@00138b
{
    public String mCoverUrl;
    public String mFileSize;
    public String mFileType;
    public String mPhotoId;
    public String mProgress;
    public int mRemainingTime;
    public int mStatus;
    public String mTaskId;
    public String mThumbnail;
    public static final long serialVersionUID = 0x11881821e1ec8961;

    public void JsVideoUploadStatusResult$StatusResultData(String p0,String p1,String p2,int p3,int p4,String p5,String p6){
       super();
       this.mTaskId = p0;
       this.mThumbnail = p1;
       this.mProgress = p2;
       this.mStatus = p3;
       this.mRemainingTime = p4;
       this.mFileSize = p6;
       this.mFileType = p5;
    }
}
