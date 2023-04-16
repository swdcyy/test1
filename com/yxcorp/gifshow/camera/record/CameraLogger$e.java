package com.yxcorp.gifshow.camera.record.CameraLogger$e;
import com.yxcorp.gifshow.camera.record.CameraLogger$d;
import java.lang.String;
import java.lang.Boolean;

public class CameraLogger$e extends CameraLogger$d	// class@001c90
{
    public final String mUhdMode;

    public void CameraLogger$e(String p0,String p1,String p2,String p3,int p4,Boolean p5,String p6,String p7,String p8,String p9,int p10,String p11,boolean p12,String p13){
       int i = this;
       super(p1, null, p3, p4, null, p6, null, null, null, 0, "", false, false, p13);
       i.mAiRecordType = p7;
       i.mAiRecordId = p8;
       i.mAiRecordIndex = p10;
       i.mAiRecordName = p9;
       i.mAiFuncType = p11;
       if (p12) {
          i.mIsFollowShoot = Boolean.TRUE;
       }
       i.mUhdMode = p0;
       return;
    }
}
