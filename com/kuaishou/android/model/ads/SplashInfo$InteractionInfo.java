package com.kuaishou.android.model.ads.SplashInfo$InteractionInfo;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class SplashInfo$InteractionInfo implements Serializable, Cloneable	// class@000a92
{
    public boolean mCanClickSplash;
    public int mInteractiveStyle;
    public String mPreloadControl;
    public String mRealtimeControl;
    public SplashInfo$RotationInfo mRotationInfo;
    public SplashInfo$ShakeInfo mShakeInfo;
    public SplashInfo$SlideInfo mSlideInfo;
    public static final long serialVersionUID = 0x3a1aee2e81b4b328;

    public void SplashInfo$InteractionInfo(){
       super();
    }
    public boolean hasInteraction(){
       Object obj = PatchProxy.apply(null, this, SplashInfo$InteractionInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.hasShakeInteraction() && (this.hasSlideInteraction() || this.hasRotateInteraction()))? true: false;
       return b;
    }
    public boolean hasRotateInteraction(){
       boolean b = true;
       if (this.mRotationInfo != null) {
          SplashInfo$InteractionInfo tmInteractiv = this.mInteractiveStyle;
          if (tmInteractiv != b && (tmInteractiv != 5 && (tmInteractiv == 6 || tmInteractiv == 7))) {
          label_0014 :
             return b;
          }
       }
       b = false;
       goto label_0014 ;
    }
    public boolean hasShakeInteraction(){
       boolean b = (this.mShakeInfo != null && this.mInteractiveStyle == 2)? true: false;
       return b;
    }
    public boolean hasSlideInteraction(){
       boolean b;
       if (this.mSlideInfo != null) {
          SplashInfo$InteractionInfo tmInteractiv = this.mInteractiveStyle;
          if (tmInteractiv == 3 || tmInteractiv == 8) {
             b = true;
          label_0010 :
             return b;
          }
       }
       b = false;
       goto label_0010 ;
    }
}
