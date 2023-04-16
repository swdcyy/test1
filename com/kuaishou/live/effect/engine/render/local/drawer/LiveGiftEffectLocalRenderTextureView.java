package com.kuaishou.live.effect.engine.render.local.drawer.LiveGiftEffectLocalRenderTextureView;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGiftEffectLocalRenderTextureView$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$c;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$f;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGiftEffectLocalRenderTextureView$b;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$o;
import android.view.TextureView;
import com.kuaishou.live.effect.engine.render.local.drawer.a;
import android.view.View;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.effect.engine.render.local.drawer.a$a;

public class LiveGiftEffectLocalRenderTextureView extends LiveGLTextureView	// class@001b17
{
    public LiveGiftEffectLocalRenderTextureView$b q;
    public int r;
    public int s;
    public a t;
    public LiveGiftEffectLocalRenderTextureView$a u;
    public static final boolean v;

    static {
       LiveGiftEffectLocalRenderTextureView.v = a.t().u("SOURCE_LIVE").d("enableGLClearColorOpt", false);
    }
    public void LiveGiftEffectLocalRenderTextureView(Context p0){
       super(p0, null);
    }
    public void LiveGiftEffectLocalRenderTextureView(Context p0,AttributeSet p1){
       Object[] objArray;
       super(p0, p1);
       this.u = new LiveGiftEffectLocalRenderTextureView$a();
       if (PatchProxy.applyVoid(null, this, LiveGiftEffectLocalRenderTextureView.class, "1")) {
       }else {
          int i = 2;
          this.setEGLContextClientVersion(i);
          int i1 = 16;
          if (PatchProxy.isSupport(LiveGLTextureView.class)) {
             objArray = new Object[]{Integer.valueOf(8),Integer.valueOf(8),Integer.valueOf(8),Integer.valueOf(8),Integer.valueOf(i1),Integer.valueOf(0)};
             if (PatchProxy.applyVoid(objArray, this, LiveGLTextureView.class, "8")) {
             label_0072 :
                LiveGiftEffectLocalRenderTextureView$b uob = new LiveGiftEffectLocalRenderTextureView$b(this);
                this.q = uob;
                this.setRenderer(uob);
                this.setRenderMode(0);
                this.setOpaque(0);
                this.t = new a();
             }
          }
          LiveGLTextureView$c uoc = new LiveGLTextureView$c(this, 8, 8, 8, 8, 16, 0);
          this.setEGLConfigChooser(PatchProxy.applyVoid(objArray, this, LiveGLTextureView.class, "8"));
          goto label_0072 ;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveGiftEffectLocalRenderTextureView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveGiftEffectLocalRenderTextureView.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       p0 = this.getMeasuredWidth();
       p1 = this.getMeasuredHeight();
       if (p0 && p1) {
          float f = (float)p1;
          float f1 = (float)p0;
          float f2 = f / f1;
          if (f2 - 0x3fe38e39 > 0) {
             p0 = (int)(f / 0x3fe38e39);
          }else if(f2 - 0x3fe38e39 < 0){
             p1 = (int)(f1 * 0x3fe38e39);
          }
          this.setMeasuredDimension(p0, p1);
       }
       return;
    }
    public void setBackgroundDrawable(Drawable p0){
    }
    public void setGiftEffectDrawCallback(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftEffectLocalRenderTextureView.class, "3")) {
          return;
       }
       this.t.c = p0;
       return;
    }
}
