package com.kuaishou.live.basic.widget.LiveLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import android.content.Context;
import android.util.AttributeSet;
import android.os.Build$VERSION;
import com.airbnb.lottie.RenderMode;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import java.lang.Throwable;
import qp.b;

public class LiveLottieAnimationView extends LottieAnimationView	// class@000d31
{

    public void LiveLottieAnimationView(Context p0){
       super(p0, null);
    }
    public void LiveLottieAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveLottieAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (Build$VERSION.SDK_INT <= 22) {
          this.setRenderMode(RenderMode.SOFTWARE);
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLottieAnimationView.class, "1")) {
          return;
       }
       try{
          super.onDraw(p0);
       }catch(java.lang.Exception e3){
          b.a("LiveLottieAnimationView", "onDraw exception", e3);
       }
       return;
    }
    public void setRenderMode(RenderMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLottieAnimationView.class, "2")) {
          return;
       }
       if (Build$VERSION.SDK_INT <= 22) {
          super.setRenderMode(RenderMode.SOFTWARE);
       }
       return;
    }
}
