package p75.b;
import com.kwai.chat.kwailink.b$a;
import java.util.concurrent.ScheduledExecutorService;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g85.a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.lang.Integer;
import com.kwai.chat.kwailink.base.b;
import com.kwai.chat.kwailink.client.d0;
import java.util.Iterator;
import java.util.Set;
import o75.b0;
import p75.a;
import java.lang.Runnable;

public class b extends b$a	// class@002171
{
    public static ScheduledExecutorService a;

    public void b(){
       super();
    }
    public static ScheduledExecutorService M1(){
       b obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.a == null) {
          obj = b.class;
          _monitor_enter(obj);
          if (b.a == null) {
             b.a = Executors.newSingleThreadScheduledExecutor(new a("ClientLinkEventCallback"));
          }
          _monitor_exit(obj);
       }
       return b.a;
    }
    public void A(int p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, b.class, "8")) {
          return;
       }
       b.k(p0);
       d0.a(p0);
       return;
    }
    public void B(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "9")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, d0.class, "10")) {
          Iterator iterator = d0.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().B();
          }
       }
       return;
    }
    public void C(int p0,int p1){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, b.class, "4")) {
          return;
       }
       b.M1().execute(new a(p1, p0));
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       d0.e();
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       d0.c();
       return;
    }
    public void i(int p0,String p1){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, b.class, "6")) {
          return;
       }
       d0.f(p0, p1);
       return;
    }
    public void k(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, d0.class, "8")) {
          Iterator iterator = d0.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().k();
          }
       }
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       d0.d();
       return;
    }
}
