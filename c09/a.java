package c09.a;
import a59.e;
import a59.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import org.json.JSONObject;
import a59.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a59.j;
import java.util.concurrent.atomic.AtomicBoolean;
import a09.c;

public final class a extends e	// class@0004b2
{
    public f b;

    public void a(f p0){
       a.p(p0, "mTkBridgeContext");
       super();
       this.b = p0;
    }
    public String a(){
       return "clickReplay";
    }
    public Object c(JSONObject p0,a p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "data");
       j oj = this.b.g();
       if (oj != null) {
          AtomicBoolean uAtomicBoole = oj.c();
          if (uAtomicBoole != null) {
             uAtomicBoole.set(false);
          }
          c uoc = oj.b();
          if (uoc != null) {
             uoc.a(p0.optInt("itemPlayType"));
             AtomicBoolean uAtomicBoole1 = oj.a();
             if (uAtomicBoole1 != null) {
                uAtomicBoole1.set(true);
             }
          }
       }
    label_003d :
       return this.e();
    }
}
