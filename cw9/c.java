package cw9.c;
import java.lang.Object;
import android.content.res.Resources;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import cw9.b;
import android.app.Application;
import o56.a;
import android.util.DisplayMetrics;
import android.view.Display;

public class c	// class@00144c
{

    public void c(){
       super();
    }
    public static int a(Resources p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (b.g() && (a.b().getResources() == p0 && p0.getDisplayMetrics().densityDpi != (int)(b.e() * 160.00f))) {
          b.i(p0);
       }
    label_0042 :
       return p0.getDimensionPixelOffset(p1);
    }
    public static int b(Resources p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (b.g() && (a.b().getResources() == p0 && p0.getDisplayMetrics().densityDpi != (int)(b.e() * 160.00f))) {
          b.i(p0);
       }
    label_0042 :
       return p0.getDimensionPixelSize(p1);
    }
    public static DisplayMetrics c(Resources p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.g() && (a.b().getResources() == p0 && p0.getDisplayMetrics().densityDpi != (int)(b.e() * 160.00f))) {
          b.i(p0);
       }
    label_0034 :
       return p0.getDisplayMetrics();
    }
    public static void d(Display p0,DisplayMetrics p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "5")) {
          return;
       }
       p0.getRealMetrics(p1);
       if (b.g()) {
          p1.density = b.e();
          p1.densityDpi = (int)(b.e() * 160.00f);
       }
       return;
    }
}
