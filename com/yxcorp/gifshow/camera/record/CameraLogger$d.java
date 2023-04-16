package com.yxcorp.gifshow.camera.record.CameraLogger$d;
import com.yxcorp.gifshow.camera.record.CameraLogger$a;
import java.lang.String;
import java.lang.Boolean;

public class CameraLogger$d extends CameraLogger$a	// class@001c8f
{
    public String mAiFuncType;
    public String mAiRecordId;
    public int mAiRecordIndex;
    public String mAiRecordName;
    public String mAiRecordType;
    public Boolean mIsFollowShoot;
    public Boolean mIsOpenPlatform;
    public final String mStabilityMode;
    public final String mWideMode;

    public void CameraLogger$d(String p0,String p1,String p2,int p3,Boolean p4,String p5,String p6,String p7,String p8,int p9,String p10,boolean p11,boolean p12,String p13){
       int i = this;
       super(p2, p3, p4, p5, p13);
       i.mWideMode = p0;
       i.mStabilityMode = p1;
       i.mAiRecordType = p6;
       i.mAiRecordId = p7;
       i.mAiRecordIndex = p9;
       i.mAiRecordName = p8;
       i.mAiFuncType = p10;
       if (p11) {
          i.mIsFollowShoot = Boolean.TRUE;
       }
       if (p12) {
          i.mIsOpenPlatform = Boolean.TRUE;
       }
       return;
    }
}
