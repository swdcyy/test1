package com.kuaishou.live.widget.LiveOptLottieAnimationView;
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
import android.widget.ImageView;

public class LiveOptLottieAnimationView extends LiveLottieAnimationView	// class@00101c
{
    public boolean u;
    public h v;

    public void LiveOptLottieAnimationView(Context p0){
       super(p0, null);
    }
    public void LiveOptLottieAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveOptLottieAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.u = false;
    }
    public void onVisibilityChanged(View p0,int p1){
       if (PatchProxy.isSupport(LiveOptLottieAnimationView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveOptLottieAnimationView.class, "1")) {
          return;
       }
       try{
          if (this.v == null) {
             Field declaredFiel = LottieAnimationView.class.getDeclaredField("g");
             declaredFiel.setAccessible(true);
             this.v = declaredFiel.get(this);
          }
          if (this.v == null) {
             return;
          }else if(this.isShown()){
             if (this.u != null) {
                this.y();
             }
             this.u = false;
          }else if(this.p()){
             this.r();
             this.u = true;
          }
          return;
       }catch(java.lang.Exception e0){
          this.v = null;
          super.onVisibilityChanged(p0, p1);
          return;
       }
    }
}
