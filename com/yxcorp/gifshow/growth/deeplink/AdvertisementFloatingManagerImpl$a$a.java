package com.yxcorp.gifshow.growth.deeplink.AdvertisementFloatingManagerImpl$a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.growth.deeplink.AdvertisementFloatingManagerImpl$a;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.WindowManager$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.WindowManager;
import com.yxcorp.gifshow.growth.deeplink.AdvertisementFloatingManagerImpl;

public class AdvertisementFloatingManagerImpl$a$a implements ValueAnimator$AnimatorUpdateListener	// class@001359
{
    public final View a;
    public final AdvertisementFloatingManagerImpl$a b;

    public void AdvertisementFloatingManagerImpl$a$a(AdvertisementFloatingManagerImpl$a p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdvertisementFloatingManagerImpl$a$a.class, "1")) {
          return;
       }
       AdvertisementFloatingManagerImpl$a h = this.b.h;
       int i = p0.getAnimatedValue().intValue();
       try{
          h.x = i;
          AdvertisementFloatingManagerImpl$a$a tb = this.b;
          tb.g.updateViewLayout(this.a, tb.h);
          tb = this.b;
          tb.i.b = tb.h.x;
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
