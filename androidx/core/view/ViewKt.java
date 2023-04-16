package androidx.core.view.ViewKt;
import android.view.View;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import a2.i0;
import androidx.core.view.ViewKt$a;
import android.view.View$OnAttachStateChangeListener;
import androidx.core.view.ViewKt$b;
import android.view.View$OnLayoutChangeListener;
import a2.c0;
import androidx.core.view.ViewKt$c;
import java.lang.Runnable;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.lang.IllegalStateException;
import wsd.m;
import androidx.core.view.ViewKt$allViews$1;
import asd.c;
import msd.p;
import wsd.q;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;

public final class ViewKt	// class@000725
{

    public static final void a(View p0,l p1){
       a.p(p0, "$this$doOnDetach");
       a.p(p1, "action");
       if (!i0.X(p0)) {
          p1.invoke(p0);
       }else {
          p0.addOnAttachStateChangeListener(new ViewKt$a(p0, p1));
       }
       return;
    }
    public static final void b(View p0,l p1){
       a.p(p0, "$this$doOnNextLayout");
       a.p(p1, "action");
       p0.addOnLayoutChangeListener(new ViewKt$b(p1));
    }
    public static final c0 c(View p0,l p1){
       a.p(p0, "$this$doOnPreDraw");
       a.p(p1, "action");
       c0 uoc0 = c0.a(p0, new ViewKt$c(p0, p1));
       a.o(uoc0, "OneShotPreDrawListener.add\(this\) { action\(this\) }");
       return uoc0;
    }
    public static final Bitmap d(View p0,Bitmap$Config p1){
       a.p(p0, "$this$drawToBitmap");
       a.p(p1, "config");
       if (!i0.Y(p0)) {
          throw new IllegalStateException("View needs to be laid out before calling drawToBitmap\(\)");
       }
       Bitmap uBitmap = Bitmap.createBitmap(p0.getWidth(), p0.getHeight(), p1);
       a.o(uBitmap, "Bitmap.createBitmap\(width, height, config\)");
       Canvas uCanvas = new Canvas(uBitmap);
       uCanvas.translate((- (float)p0.getScrollX()), (- (float)p0.getScrollY()));
       p0.draw(uCanvas);
       return uBitmap;
    }
    public static Bitmap e(View p0,Bitmap$Config p1,int p2,Object p3){
       p1 = (p2 & 0x01)? Bitmap$Config.ARGB_8888: null;
       return ViewKt.d(p0, p1);
    }
    public static final m f(View p0){
       a.p(p0, "$this$allViews");
       return q.e(new ViewKt$allViews$1(p0, null));
    }
    public static final void g(View p0,boolean p1){
       a.p(p0, "$this$isVisible");
       int i = (p1)? 0: 8;
       p0.setVisibility(i);
       return;
    }
    public static final void h(View p0,l p1){
       a.p(p0, "$this$updateLayoutParams");
       a.p(p1, "block");
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
       p1.invoke(layoutParams);
       p0.setLayoutParams(layoutParams);
    }
}
