package g59.n;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.core.content.ContextCompat;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import java.lang.Boolean;
import lnc.a1;
import java.lang.StringBuilder;
import k2b.u1;
import androidx.core.graphics.drawable.a;

public final class n	// class@00240f
{

    public static final GradientDrawable a(Context p0,int p1,float p2){
       GradientDrawable gradientDraw;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(n.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), null, n.class, "5");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p0, "context");
       int color = ContextCompat.getColor(p0, p1);
       if (PatchProxy.isSupport(n.class)) {
          gradientDraw = PatchProxy.applyTwoRefs(Integer.valueOf(color), Float.valueOf(p2), null, n.class, "6");
          if (gradientDraw != patchProxyRe) {
          }else {
          label_0044 :
             gradientDraw = new GradientDrawable();
             gradientDraw.setShape(0);
             gradientDraw.setColor(color);
             if (p2 - (float)0 > 0) {
                gradientDraw.setCornerRadius(p2);
             }
          }
       }else {
          goto label_0044 ;
       }
       return gradientDraw;
    }
    public static final Drawable b(int p0,int p1){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, on, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return n.e(p0, p1, false, 4, null);
    }
    public static final Drawable c(int p0,ColorStateList p1){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, on, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return n.d(p0, p1, true);
    }
    public static final Drawable d(int p0,ColorStateList p1,boolean p2){
       Drawable obj;
       if (PatchProxy.isSupport(n.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), null, n.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "colorStateList");
       obj = a1.f(p0);
       if (obj == null) {
          u1.R("NightMode", "drawable null "+p0, 6);
          return null;
       }else {
          Drawable uDrawable = a.r(obj);
          if (p2) {
             uDrawable.mutate();
          }
          a.o(uDrawable, p1);
          return uDrawable;
       }
    }
    public static Drawable e(int p0,int p1,boolean p2,int p3,Object p4){
       Drawable uDrawable;
       if (p3 & 0x04) {
          p2 = true;
       }
       if (PatchProxy.isSupport(n.class)) {
          uDrawable = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), null, n.class, "3");
          if (uDrawable != PatchProxyResult.class) {
          label_003a :
             return uDrawable;
          }
       }
       ColorStateList uColorStateL = ColorStateList.valueOf(a1.a(p1));
       a.o(uColorStateL, "ColorStateList.valueOf\(C¡­onUtil.color\(colorResId\)\)");
       uDrawable = n.d(p0, uColorStateL, p2);
       goto label_003a ;
    }
}
