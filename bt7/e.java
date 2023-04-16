package bt7.e;
import java.lang.Object;
import qp7.t0;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.content.Context;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.slide.play.detail.utils.ExperimentUtils;
import java.lang.Number;
import java.lang.Math;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.Display;
import java.lang.NullPointerException;

public final class e	// class@00046e
{
    public static int a;
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void a(t0 p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       a.p(p0, "config");
       a.p(p1, "view");
       Log.g("RightActionBarAdaptUtil", "adapt: enableRedesign true, "+"enableRightActionBarAdapt "+p0.h());
       if (!p0.h()) {
          return;
       }
       Context context = p1.getContext();
       a.o(context, "view.context");
       Context context1 = p1.getContext();
       a.o(context1, "view.context");
       float f = this.e(context1);
       p1.getLayoutParams().height = a1.e(f);
       Log.g("RightActionBarAdaptUtil", "adapt screen width "+this.h(context)+", height "+f+", view "+p1);
       return;
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ExperimentUtils.f();
    }
    public final float c(Context p0,boolean p1){
       StringBuilder obj;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "2");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       a.p(p0, "context");
       if (ExperimentUtils.f()) {
          return 0;
       }else {
          float f = 3.00f;
          if (!p1) {
             return f;
          }else {
             int i = this.h(p0);
             float f1 = (((float)Math.max(360, Math.min(i, 390)) - 360.00f) / 0x41f00000) * f;
             obj = "getAvatarBottomMargin screen adapt "+p1+" width "+i;
             Log.g("RightActionBarAdaptUtil", obj+", bottomMargin "+f1);
             return f1;
          }
       }
    }
    public final int d(){
       Object obj = PatchProxy.apply(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (ExperimentUtils.f())? a1.e(3.00f): 0;
       return i;
    }
    public final float e(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       a.p(p0, "context");
       return (((((float)Math.max(360, Math.min(this.h(p0), 390)) - 360.00f) / 0x41f00000) * (float)5) + (float)65);
    }
    public final int f(){
       Object obj = PatchProxy.apply(null, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (ExperimentUtils.i)? a1.e(6.00f): 0;
       return i;
    }
    public final int g(){
       Object obj = PatchProxy.apply(null, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f();
    }
    public final int h(Context p0){
       int i;
       DisplayMetrics obj = PatchProxy.applyOneRefs(p0, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (e.a <= 0) {
          try{
             obj = new DisplayMetrics();
             p0 = p0.getSystemService("window");
             if (p0 != null) {
                p0.getDefaultDisplay().getMetrics(obj);
                i = (int)((float)Math.min(obj.widthPixels, obj.heightPixels) / obj.density);
             }else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
             }
          }catch(java.lang.Exception e0){
             i = 0;
          }
          e.a = i;
       }
       return e.a;
    }
}
