package com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class PhotoAdvertisement$RequestEApiInfo implements Serializable	// class@0009fa
{
    public PhotoAdvertisement$RequestEApiInfo$CardStyleInfo mCardStyleInfo;
    public long mDelayMs;
    public boolean mIsExpire;
    public ReplaceTemplateData mReplaceTemplateData;
    public String mServerExtData;
    public int mType;
    public static final long serialVersionUID = 0xe2967eab4375fe71;

    public void PhotoAdvertisement$RequestEApiInfo(){
       super();
       this.mType = 0;
    }
    public boolean isWaitingForReplaceData(){
       boolean b = true;
       if (this.mType != b || (this.mIsExpire != null || this.mReplaceTemplateData != null)) {
          b = false;
       }
       return b;
    }
    public void setExpireIfDataNullWhenShowed(){
       if (PatchProxy.applyVoid(null, this, PhotoAdvertisement$RequestEApiInfo.class, "1")) {
          return;
       }
       if (this.isWaitingForReplaceData()) {
          this.mIsExpire = true;
       }
       return;
    }
}
