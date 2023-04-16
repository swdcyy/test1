package bk0.j;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.c;
import com.google.gson.Gson;
import bk0.j$a;
import java.lang.Runnable;
import crd.b;
import bk0.j$b;
import java.lang.Boolean;
import com.kuaishou.krn.KrnInternalManager;
import java.lang.StringBuilder;
import ek0.d;
import dk0.a;
import jk0.b;
import jk0.c;
import kj0.l;

public final class j	// class@0003a8
{
    public static final z a;
    public static final j b;

    static {
       j.b = new j();
       z oz = b.b(c.f("kds-log"));
       a.o(oz, "Schedulers.from\(Async.ne¡­hreadExecutor\(\"kds-log\"\)\)");
       j.a = oz;
    }
    public void j(){
       super();
    }
    public final String a(Object p0){
       c obj = PatchProxy.applyOneRefs(p0, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
       }else {
          obj = c.b();
          a.o(obj, "KrnManager.get\(\)");
          p0 = obj.e().q(p0);
          a.o(p0, "KrnManager.get\(\).gson.toJson\(value\)");
       }
       return p0;
    }
    public final void b(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "1")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       j.a.d(new j$a(p0, p1));
       return;
    }
    public final void c(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "2")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       j.a.d(new j$b(p0, p1));
       return;
    }
    public final void d(String p0,Object p1,boolean p2){
       c uoc;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, j.class, "3")) {
          return;
       }
       if (KrnInternalManager.c.d()) {
          d.e("log event intercepted: key="+p0+", value="+this.a(p1));
          return;
       }else if(!a.b.a(p0, p1)){
          d.e("log event not hit sample: key="+p0+", value="+this.a(p1));
          return;
       }else {
          String str = PatchProxy.applyOneRefs(p0, this, oj, "5");
          if (str != PatchProxyResult.class) {
          }else if(c.a().P()){
             str = p0+"_for_daily_test";
          }else {
             str = p0;
          }
          p1 = this.a(p1);
          d.e("log event: key="+p0+", value="+p1);
          p0 = "KrnManager.get\(\)";
          if (p2) {
             uoc = c.b();
             a.o(uoc, p0);
             uoc.g().O(str, p1);
          }else {
             uoc = c.b();
             a.o(uoc, p0);
             uoc.g().J(str, p1);
          }
          return;
       }
    }
}
