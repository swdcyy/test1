package d61.a;
import pp.c;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.b;
import ok.n;

public class a	// class@001f0f
{
    public final List a;
    public final boolean[] b;
    public final Runnable c;
    public final boolean d;
    public final c e;

    public void a(c p0,Runnable p1,boolean p2,String[] p3){
       super();
       this.e = p0;
       this.c = p1;
       this.d = p2;
       this.a = Arrays.asList(p3);
       boolean[] uobooleanArr = new boolean[p3.length];
       this.b = uobooleanArr;
       this.d("Initial status");
    }
    public final List a(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.appendTag("ConditionBarrier");
    }
    public final boolean b(){
       a tb = this.b;
       int len = tb.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return true;
          }
          if (!tb[i]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       b.S(this.a(), "notifyConditionSatisfied", "cond", p0);
       if (this.b()) {
          return;
       }
       n.b(this.a.contains(p0));
       this.b[this.a.indexOf(p0)] = true;
       if (this.b()) {
          b.P(this.a(), "notifyConditionSatisfied, all conditions satisfied");
          if (this.d != null) {
             this.d("autoResetAfterAllConditionsSatisfied");
          }
          this.c.run();
       }
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       b.S(this.a(), "reset conditions", "reason", p0);
       Arrays.fill(this.b, false);
       return;
    }
}
