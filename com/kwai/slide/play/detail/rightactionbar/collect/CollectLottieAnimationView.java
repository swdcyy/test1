package com.kwai.slide.play.detail.rightactionbar.collect.CollectLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.reflect.Field;
import w4.h;
import android.widget.ImageView;

public class CollectLottieAnimationView extends LottieAnimationView	// class@001848
{
    public boolean r;
    public h s;

    public void CollectLottieAnimationView(Context p0){
       super(p0, null);
    }
    public void CollectLottieAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CollectLottieAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.r = false;
    }
    public void onVisibilityChanged(View p0,int p1){
       if (PatchProxy.isSupport(CollectLottieAnimationView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, CollectLottieAnimationView.class, "1")) {
          return;
       }
       try{
          if (this.s == null) {
             Class superclass = this.getClass().getSuperclass();
             Objects.requireNonNull(superclass);
             Field declaredFiel = superclass.getDeclaredField("lottieDrawable");
             declaredFiel.setAccessible(true);
             this.s = declaredFiel.get(this);
          }
          if (this.s == null) {
             return;
          }else if(this.isShown()){
             if (this.r != null) {
                this.y();
             }
             this.r = false;
          }else if(this.p()){
             this.r();
             this.r = true;
          }
          return;
       }catch(java.lang.Exception e0){
          this.s = null;
          super.onVisibilityChanged(p0, p1);
          return;
       }
    }
}
