package com.yxcorp.gifshow.pendant.response.EntranceParams$PendantConfig;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.CloneNotSupportedException;
import java.lang.Throwable;

public class EntranceParams$PendantConfig implements Serializable, Cloneable	// class@001272
{
    public int mAnimationCirculateTimes;
    public int mAnimationFramePMs;
    public double mAnimationIntervalSeconds;
    public String mAnimationResourceUrl;
    public List mBubbleConfigList;
    public String mBubbleMsg;
    public int mClickXMarkPolicy;
    public boolean mHasXMark;
    public List mIconCdnUrls;
    public String mIconUrl;
    public int mRemindAfterSecond;
    public boolean mSuspensionNextColdLaunch;
    public int mSuspensionSeconds;
    public UIParams mUIParams;
    public PendantLocationParam mWidgetInitialPosition;
    public static final long serialVersionUID = 0x8763c9348bf152a3;

    public void EntranceParams$PendantConfig(){
       super();
    }
    public EntranceParams$PendantConfig clone(){
       Object obj = PatchProxy.apply(null, this, EntranceParams$PendantConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          Log.g("PendantConfig", "pendant data clone : "+this.mIconUrl);
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e1){
          e1.printStackTrace();
          Log.e(v0, "PendantConfig clone error", e1);
          return this;
       }
    }
    public Object clone(){
       return this.clone();
    }
}
