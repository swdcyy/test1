package com.yxcorp.gifshow.detail.view.RewardBannerContainerView$a;
import com.kwai.feature.component.photofeatures.reward.widget.ShadowRoundedHelper$a;
import com.yxcorp.gifshow.detail.view.RewardBannerContainerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class RewardBannerContainerView$a implements ShadowRoundedHelper$a	// class@001a56
{
    public final RewardBannerContainerView a;

    public void RewardBannerContainerView$a(RewardBannerContainerView p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, RewardBannerContainerView$a.class, "1")) {
          return;
       }
       this.a.invalidate();
       return;
    }
    public float getHeight(){
       Object obj = PatchProxy.apply(null, this, RewardBannerContainerView$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.a.getHeight();
    }
    public float getPaddingBottom(){
       Object obj = PatchProxy.apply(null, this, RewardBannerContainerView$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.a.getPaddingBottom();
    }
    public float getPaddingEnd(){
       Object obj = PatchProxy.apply(null, this, RewardBannerContainerView$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.a.getPaddingEnd();
    }
    public float getPaddingStart(){
       Object obj = PatchProxy.apply(null, this, RewardBannerContainerView$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.a.getPaddingStart();
    }
    public float getPaddingTop(){
       Object obj = PatchProxy.apply(null, this, RewardBannerContainerView$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.a.getPaddingTop();
    }
    public float getWidth(){
       Object obj = PatchProxy.apply(null, this, RewardBannerContainerView$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.a.getWidth();
    }
}
