package com.yxcorp.gifshow.upload.SegmentInfo;
import java.io.Serializable;
import java.lang.String;
import com.kwai.video.editorsdk2.EncodedSegmentInfo;
import com.yxcorp.gifshow.upload.SegmentGuard;
import java.lang.Object;

public class SegmentInfo implements Serializable	// class@001e4f
{
    public final String mAudioOutputPath;
    public final EncodedSegmentInfo mEncodedSegmentInfo;
    public final int mFd;
    public final boolean mIsWholeFileUpload;
    public final String mOutputPath;
    public final SegmentGuard mSegmentGuard;

    public void SegmentInfo(String p0,String p1,int p2,EncodedSegmentInfo p3,SegmentGuard p4,boolean p5){
       super();
       this.mOutputPath = p0;
       this.mFd = p2;
       this.mEncodedSegmentInfo = p3;
       this.mSegmentGuard = p4;
       this.mAudioOutputPath = p1;
       this.mIsWholeFileUpload = p5;
    }
}
