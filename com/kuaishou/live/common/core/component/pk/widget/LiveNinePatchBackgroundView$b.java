package com.kuaishou.live.common.core.component.pk.widget.LiveNinePatchBackgroundView$b;
import erd.o;
import com.kuaishou.live.common.core.component.pk.widget.LiveNinePatchBackgroundView;
import lw1.a;
import java.lang.Object;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.graphics.drawable.NinePatchDrawable;
import android.view.ViewGroup;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.lang.Integer;
import java.lang.Float;
import android.content.res.Resources;
import java.lang.Number;
import ya1.y;

public final class LiveNinePatchBackgroundView$b implements o	// class@00173e
{
    public final LiveNinePatchBackgroundView b;
    public final a c;

    public void LiveNinePatchBackgroundView$b(LiveNinePatchBackgroundView p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       float f;
       float f1;
       float f2;
       float f3;
       float f4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveNinePatchBackgroundView$b obj = PatchProxy.applyOneRefs(p0, this, LiveNinePatchBackgroundView$b.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "it");
          obj = this.b;
          LiveNinePatchBackgroundView$b tc = this.c;
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.applyTwoRefs(p0, tc, obj, LiveNinePatchBackgroundView.class, "2");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             obj1 = 0x3f800000;
             if (tc.b() && !tc.a()) {
                f = (float)obj.getHeight() / (float)p0.getHeight();
                f1 = (float)tc.b * f;
                f2 = (float)tc.c * f;
             }else if(tc.a() && !tc.b()){
                f = (float)obj.getWidth() / (float)p0.getWidth();
                f4 = (float)tc.d * f;
                f1 = (float)tc.e * f;
                f2 = 0;
             label_007f :
                if (f - obj1) {
                   p0 = BitmapUtil.W(p0, f);
                   a.o(p0, "BitmapUtil.scaleBitmap\(bitmap, scaleRatio\)");
                }
                Bitmap uBitmap = p0;
                p0 = (!f3)? Integer.valueOf(uBitmap.getWidth()): Float.valueOf(f2);
                Integer integer = (!f4)? Integer.valueOf(uBitmap.getHeight()): Float.valueOf(f1);
                p0 = y.a(obj.getResources(), uBitmap, (int)f4, (int)f3, integer.intValue(), p0.intValue());
                a.o(p0, "LiveNinePatchDrawableCre¡­      right.toInt\(\)\n    \)");
                obj = p0;
             }else {
                f = 0x3f800000;
                f2 = 0;
                f1 = 0;
             }
             f3 = f1;
             f1 = 0;
             f4 = 0;
             goto label_007f ;
          }
       }
       return obj;
    }
}
