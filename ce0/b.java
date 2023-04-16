package ce0.b;
import f66.i;
import java.lang.String;
import ce0.b$a;
import ce0.b$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import q87.c;
import java.lang.Throwable;
import ce0.d;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.core.config.PendantCoreConfig;
import kotlin.Result;
import ke0.a;
import ke0.b$a;
import ke0.b;
import io.reactivex.subjects.ReplaySubject;
import qrd.l1;
import qrd.j0;

public final class b extends i	// class@00049f
{

    public void b(){
       super("ActivityPendant", false);
    }
    public void b(b$a p0){
       super("ActivityPendant", false);
    }
    public static b C(){
       return b$b.a;
    }
    public void D(String p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       super.w("KemPendantV2", p0, p1);
       return;
    }
    public void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "4")) {
          return;
       }
       super.e(p0, p1, p2);
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "3")) {
          a.p(p0, "tag");
          a.p(p1, "msg");
          if (PendantCoreConfig.i.d()) {
             d.a.onNext(new a(p0, p1, b$a.b, p2));
             Result.constructor-impl(l1.a);
          }
       }
       return;
    }
    public void v(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "2")) {
          return;
       }
       super.v(p0, p1, p2);
       d.a(p0, p1, p2);
       return;
    }
    public void w(String p0,String p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "3")) {
          return;
       }
       super.w(p0, p1, p2);
       d.a(p0, p1, null);
       return;
    }
}
