package com.yxcorp.gifshow.NasaFeaturedSearchBubbleIconAnimView;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.NasaFeaturedSearchBubbleIconAnimView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.animation.AnimatorSet;
import java.lang.Float;
import java.lang.Boolean;
import android.view.View;

public final class NasaFeaturedSearchBubbleIconAnimView extends FrameLayout	// class@0012fb
{
    public AnimatorSet b;
    public float c;
    public static final NasaFeaturedSearchBubbleIconAnimView$a d;

    static {
       NasaFeaturedSearchBubbleIconAnimView.d = new NasaFeaturedSearchBubbleIconAnimView$a(null);
    }
    public void NasaFeaturedSearchBubbleIconAnimView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
       this.setAlpha(0x3f19999a);
       this.c = 0x3f19999a;
    }
    public final float getMaxAlpha(){
       return this.c;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, NasaFeaturedSearchBubbleIconAnimView.class, "5")) {
          return;
       }
       super.onDetachedFromWindow();
       NasaFeaturedSearchBubbleIconAnimView tb = this.b;
       if (tb != null) {
          tb.cancel();
       }
       return;
    }
    public final void setMaxAlpha(float p0){
       if (PatchProxy.isSupport(NasaFeaturedSearchBubbleIconAnimView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, NasaFeaturedSearchBubbleIconAnimView.class, "1")) {
          return;
       }
       this.c = p0;
       this.setAlpha(p0);
       return;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(NasaFeaturedSearchBubbleIconAnimView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NasaFeaturedSearchBubbleIconAnimView.class, "6")) {
          return;
       }
       super.setPressed(p0);
       float f = (p0)? this.c * 0x3f000000: this.c;
       this.setAlpha(f);
       return;
    }
}
