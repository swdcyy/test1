package com.kuaishou.merchant.basic.widget.MerchantProgressBar$a;
import android.widget.ViewFlipper;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Interpolator;

public class MerchantProgressBar$a	// class@0015f7
{
    public final ViewFlipper a;

    public void MerchantProgressBar$a(ViewFlipper p0){
       TranslateAnimation translateAni2;
       ViewFlipper viewFlipper = this;
       ViewFlipper viewFlipper1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MerchantProgressBar$a uoa = MerchantProgressBar$a.class;
       super();
       viewFlipper.a = viewFlipper1;
       viewFlipper1.setFlipInterval(2000);
       TranslateAnimation translateAni = PatchProxy.apply(null, viewFlipper, uoa, "3");
       if (translateAni != patchProxyRe) {
       }else {
          translateAni2 = new TranslateAnimation(1, 0, 1, 0, 1, 0, 1, 0xbf800000);
          translateAni.setInterpolator(new LinearInterpolator());
          translateAni.setDuration(200);
       }
       viewFlipper1.setOutAnimation(translateAni);
       TranslateAnimation translateAni1 = PatchProxy.apply(null, viewFlipper, uoa, "4");
       if (translateAni1 != patchProxyRe) {
       }else {
          translateAni2 = new TranslateAnimation(1, 0, 1, 0, 1, 0x3f800000, 1, 0);
          translateAni1.setInterpolator(new LinearInterpolator());
          translateAni1.setDuration(200);
       }
       viewFlipper1.setInAnimation(translateAni1);
       return;
    }
}
