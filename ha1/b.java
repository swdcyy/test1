package ha1.b;
import java.util.HashSet;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Boolean;
import java.util.List;
import android.os.SystemClock;
import ec3.f;
import java.util.Set;
import com.kuaishou.ax2c.PreLoader;
import ha1.b$a;
import com.kuaishou.ax2c.PreLoader$InflateListener;
import android.widget.FrameLayout;
import i2b.a;
import java.lang.RuntimeException;
import java.lang.StringBuilder;

public class b	// class@002662
{
    public static final Set a;
    public static final Set b;
    public static boolean c;
    public static List d;

    static {
       b.a = new HashSet();
       b.b = new HashSet();
    }
    public void b(){
       super();
    }
    public static String a(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uob, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a.b().getResources().getResourceName(p0);
    }
    public static View b(Context p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uob, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.c(p0, p1, null, false);
    }
    public static View c(Context p0,int p1,ViewGroup p2,boolean p3){
       List obj;
       long l;
       FrameLayout uFrameLayout;
       View view;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, Boolean.valueOf(p3), null, b.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       if (b.c) {
          b.d.remove(Integer.valueOf(p1));
          l = SystemClock.uptimeMillis();
       }
       if (!f.j() || !b.b.contains(Integer.valueOf(p1))) {
          if (!p3 && p2 == null) {
             uFrameLayout = new FrameLayout(p0);
          }
          view = a.d(p0, p1, uFrameLayout, p3);
       }else {
          view = PreLoader.getInstance().getOrWait(p0, p1, p2, p3, true, new b$a(p1));
       }
       if (b.c) {
          long l1 = SystemClock.uptimeMillis() - l;
          if (l1 - 5 > 0) {
             new RuntimeException("LiteLayout inflate: "+b.a(p1)+" cost two much time: "+l1+"ms").printStackTrace();
          }
       }
       return view;
    }
    public static View d(ViewGroup p0,int p1,boolean p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), null, b.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.c(p0.getContext(), p1, p0, p2);
    }
    public static View e(Context p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uob, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.c(p0, p1, null, false);
    }
    public static void f(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "2")) {
          return;
       }
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          b.a.add(Integer.valueOf(p0[i]));
       }
       return;
    }
    public static void g(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "3")) {
          return;
       }
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          b.b.add(Integer.valueOf(p0[i]));
       }
       return;
    }
}
