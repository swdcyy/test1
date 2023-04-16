package com.yxcorp.gifshow.camera.record.CameraLogger$a;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Object;

public class CameraLogger$a	// class@001c8c
{
    public final int mBtnType;
    public String mCameraDirection;
    public final String mCountDownFunction;
    public final String mMagicFaceId;
    public final String mSimilarMainMagicId;

    public void CameraLogger$a(String p0,int p1,Boolean p2,String p3,String p4){
       super();
       this.mCountDownFunction = p0;
       this.mBtnType = p1;
       if (p2 != null) {
          p0 = (p2.booleanValue())? "back": "front";
          this.mCameraDirection = p0;
       }
       this.mMagicFaceId = p3;
       this.mSimilarMainMagicId = p4;
       return;
    }
}
