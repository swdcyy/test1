package com.kwai.feature.component.photofeatures.reward.widget.RewardCountContainerView$a;
import com.kwai.feature.component.photofeatures.reward.widget.ShadowRoundedHelper$a;
import com.kwai.feature.component.photofeatures.reward.widget.RewardCountContainerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class RewardCountContainerView$a implements ShadowRoundedHelper$a	// class@001268
{
    public final RewardCountContainerView a;

    public void RewardCountContainerView$a(RewardCountContainerView p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, RewardCountContainerView$a.class, "1")) {
          return;
       }
       this.a.invalidate();
       return;
    }
    public float getHeight(){
       Object obj = PatchProxy.apply(null, this, RewardCountContainerView$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.a.getHeight();
    }
    public float getPaddingBottom(){
       Object obj = PatchProxy.apply(null, this, RewardCountContainerView$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.a.getPaddingBottom();
    }
    public float getPaddingEnd(){
       Object obj = PatchProxy.apply(null, this, RewardCountContainerView$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.a.getPaddingEnd();
    }
    public float getPaddingStart(){
       Object obj = PatchProxy.apply(null, this, RewardCountContainerView$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.a.getPaddingStart();
    }
    public float getPaddingTop(){
       Object obj = PatchProxy.apply(null, this, RewardCountContainerView$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.a.getPaddingTop();
    }
    public float getWidth(){
       Object obj = PatchProxy.apply(null, this, RewardCountContainerView$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.a.getWidth();
    }
}
