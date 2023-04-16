package com.kuaishou.merchant.live.bottombar.view.LiveMerchantLottieAnimationView;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.reflect.Field;
import w4.h;
import w04.a;
import q87.c;
import android.widget.ImageView;
import java.lang.Throwable;

public class LiveMerchantLottieAnimationView extends LiveLottieAnimationView	// class@0018e1
{
    public boolean u;
    public h v;

    public void LiveMerchantLottieAnimationView(Context p0){
       super(p0, null);
    }
    public void LiveMerchantLottieAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveMerchantLottieAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.u = false;
    }
    public void onVisibilityChanged(View p0,int p1){
       if (PatchProxy.isSupport(LiveMerchantLottieAnimationView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveMerchantLottieAnimationView.class, "1")) {
          return;
       }
       int i = 0;
       try{
          if (this.v == null) {
             Field declaredFiel = LottieAnimationView.class.getDeclaredField("g");
             declaredFiel.setAccessible(true);
             this.v = declaredFiel.get(this);
          }
          if (this.v == null) {
             Object[] objArray1 = new Object[i];
             a.C().w("MerchantLottieAnimationView", "lottieDrawable == null", objArray1);
             return;
          }else if(this.isShown()){
             if (this.u != null) {
                this.y();
             }
             this.u = i;
          }else if(this.p()){
             this.r();
             this.u = true;
          }
          return;
       }catch(java.lang.Exception e2){
          Object[] objArray = new Object[i];
          a.C().u("MerchantLottieAnimationView", e2, objArray);
          this.v = null;
          super.onVisibilityChanged(p0, p1);
          return;
       }
    }
}
