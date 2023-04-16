package f5b.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.widget.AnimTranslationDrawableView;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.widget.AnimTranslationDrawableView$b;
import ekd.f$j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import android.view.View;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.lang.Math;
import java.lang.NullPointerException;

public final class a implements ValueAnimator$AnimatorUpdateListener	// class@0028a3
{
    public final ValueAnimator a;
    public final AnimTranslationDrawableView b;
    public final AnimTranslationDrawableView$b c;
    public final f$j d;

    public void a(ValueAnimator p0,AnimTranslationDrawableView p1,AnimTranslationDrawableView$b p2,f$j p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          a tb = this.b;
          AnimTranslationDrawableView m = tb.m;
          AnimTranslationDrawableView c = this.b.c;
          a.m(c);
          tb.m = (float)tb.getWidth() - (((float)this.b.getWidth() + (float)c.getWidth()) * p0.floatValue());
          a tb1 = this.b;
          float f = tb1.m - m;
          tb1.d.postTranslate(f, 0);
          int i = 255;
          tb1.j = i;
          long l = 4000;
          if (this.a.getCurrentPlayTime() - 3600 >= 0 && this.a.getCurrentPlayTime() - l < 0) {
             this.b.j = (int)(float)Math.floor((double)(((float)(this.c.a() - i) * ((float)1 - (((float)(l - this.a.getCurrentPlayTime()) * 0x3f800000) / (float)400))) + (float)i));
          }else if(this.a.getCurrentPlayTime() - l > 0){
             this.b.j = this.c.a();
          }
          tb1 = this.b;
          tb1.k = i - tb1.j;
          tb1.invalidate();
          PatchProxy.onMethodExit(a.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(a.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}
