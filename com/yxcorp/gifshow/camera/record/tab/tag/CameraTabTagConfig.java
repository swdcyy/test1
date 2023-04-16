package com.yxcorp.gifshow.camera.record.tab.tag.CameraTabTagConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import lnc.a1;
import java.util.concurrent.TimeUnit;
import java.util.TimeZone;

public class CameraTabTagConfig implements Serializable	// class@000f51
{
    public String b;
    public String c;
    public String mBackgroundColor;
    public long mBeginShowTime;
    public int mCameraTabType;
    public long mEndShowTime;
    public String mGuidanceChinese;
    public String mGuidanceIcon;
    public int mGuidanceIconHeight;
    public int mGuidanceIconWidth;
    public boolean mIsRemainShowAfterClick;
    public int mMaxCount;
    public boolean mPermanentHide;
    public int mTabId;
    public int mType;
    public static final long serialVersionUID = 0xbe000c1b5bd2cb7f;

    public void CameraTabTagConfig(){
       super();
    }
    public String getUniqueIdentifier(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, CameraTabTagConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null && this.c == null) {
          return objArray;
       }
       obj = this.b+"+"+this.c;
       if (this.mType == 1) {
          obj = obj+"+"+this.mBeginShowTime;
       }
       return obj;
    }
    public boolean isBirthdayType(){
       boolean b = true;
       if (this.mType == b) {
       }else {
          b = false;
       }
       return b;
    }
    public void setCameraTab(int p0){
       this.mCameraTabType = p0;
    }
    public void setIdentifier(String p0,String p1){
       this.b = p0;
       this.c = p1;
    }
    public void updateConfigTimeStamp(){
       if (PatchProxy.applyVoid(null, this, CameraTabTagConfig.class, "2")) {
          return;
       }
       long l = TimeUnit.MILLISECONDS.toDays(a1.k());
       long l1 = (long)TimeZone.getDefault().getRawOffset();
       TimeUnit dAYS = TimeUnit.DAYS;
       this.mBeginShowTime = dAYS.toMillis(l) - l1;
       this.mEndShowTime = (dAYS.toMillis((l + 1)) - 1) - l1;
       return;
    }
}
