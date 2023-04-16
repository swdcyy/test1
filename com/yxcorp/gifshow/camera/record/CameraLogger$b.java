package com.yxcorp.gifshow.camera.record.CameraLogger$b;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Object;

public class CameraLogger$b	// class@001c8d
{
    public final int mBtnType;
    public String mCameraDirection;
    public final String mCountDownFunction;
    public final boolean mHasZoomed;
    public final String mMagicFaceId;
    public final String mSimilarMainMagicId;

    public void CameraLogger$b(boolean p0,String p1,int p2,Boolean p3,String p4,String p5){
       super();
       this.mHasZoomed = p0;
       this.mCountDownFunction = p1;
       this.mBtnType = p2;
       if (p3 != null) {
          String str = (p3.booleanValue())? "back": "front";
          this.mCameraDirection = str;
       }
       this.mMagicFaceId = p4;
       this.mSimilarMainMagicId = p5;
       return;
    }
}
