package al0.a;
import java.util.ArrayList;
import java.lang.Runtime;
import java.lang.Math;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import ob6.u;
import ob6.t;
import pxa.d;
import com.yxcorp.gifshow.init.g;
import com.yxcorp.gifshow.init.e;
import com.yxcorp.gifshow.init.f;
import com.yxcorp.gifshow.init.h;
import com.yxcorp.gifshow.init.c;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.lang.Exception;

public final class a	// class@0000f1
{
    public static final List a;
    public static final List b;
    public static final List c;
    public static final int d;
    public static final int e;
    public static SharedPreferences f;
    public static final ExecutorService g;
    public static int h;

    static {
       a.a = new ArrayList();
       a.b = new ArrayList();
       a.c = new ArrayList();
       int i = Runtime.getRuntime().availableProcessors();
       a.d = i;
       i = Math.max(2, (i - 1));
       a.e = i;
       a.g = Executors.newFixedThreadPool(i);
       a.h = -1;
    }
    public void a(){
       super();
    }
    public static void a(int p0,Runnable p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uoa, "1")) {
          return;
       }
       int i = 1;
       if (p0 != i) {
          i = 2;
          if (p0 != i) {
             if (p0 == 3) {
                if (a.b() == -1 || a.b() < 3) {
                   a.c.add(p1);
                }else {
                   a.h(p1);
                }
             }
          }else if(a.b() == -1 || a.b() < i){
             a.b.add(p1);
          }else {
             a.h(p1);
          }
       }else if(a.b() == -1 || a.b() < i){
          a.a.add(p1);
       }else {
          a.h(p1);
       }
       return;
    }
    public static int b(){
       return a.h;
    }
    public static boolean c(){
       boolean b = (a.d <= 4)? true: false;
       return b;
    }
    public static void d(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, uoa, "5")) {
          return;
       }
       if (!a.a.isEmpty() || (!a.b.isEmpty() || (a.c.isEmpty() && !PatchProxy.applyVoid(objArray, objArray, uoa, "7")))) {
          if (!PatchProxy.applyVoid(objArray, objArray, u.class, "12")) {
             a.a(2, t.b);
          }
          if (!PatchProxy.applyVoidWithListener(objArray, objArray, d.class, "2")) {
             a.a(3, g.b);
             a.a(3, e.b);
             a.a(3, f.b);
             a.a(3, h.b);
             a.a(3, c.b);
             PatchProxy.onMethodExit(d.class, "2");
          }
       }
    label_0066 :
       return;
    }
    public static void e(){
       if (PatchProxy.applyVoid(null, null, a.class, "3")) {
          return;
       }
       a.d();
       a.h = 2;
       Iterator iterator = a.b.iterator();
       while (iterator.hasNext()) {
          a.h(iterator.next());
       }
       return;
    }
    public static void f(){
       if (PatchProxy.applyVoid(null, null, a.class, "4")) {
          return;
       }
       a.d();
       a.h = 3;
       Iterator iterator = a.c.iterator();
       while (iterator.hasNext()) {
          a.h(iterator.next());
       }
       a.g.shutdown();
       return;
    }
    public static void g(){
       if (PatchProxy.applyVoid(null, null, a.class, "2")) {
          return;
       }
       a.d();
       a.h = 1;
       Iterator iterator = a.a.iterator();
       while (iterator.hasNext()) {
          a.h(iterator.next());
       }
       return;
    }
    public static void h(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "6")) {
          return;
       }
       try{
          a.g.submit(p0);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
}
