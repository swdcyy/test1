package a1b.b;
import a1b.b$b;
import a1b.b$a;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import y0b.i;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import y0b.e;
import java.lang.Runnable;

public class b	// class@000016
{
    public i a;
    public boolean b;
    public List c;
    public List d;
    public int e;
    public static final Executor f;
    public static final ExecutorService g;

    static {
       b.f = new b$b(null);
       b.g = c.f("KsRecyclerAdapter");
    }
    public void b(i p0){
       super();
       this.d = Collections.emptyList();
       this.a = p0;
    }
    public List a(){
       return this.d;
    }
    public void b(List p0,boolean p1){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       e uoe = new e(this.a, p1);
       if (p0 == this.c) {
          return;
       }
       if (p0 != null && !p0.size()) {
          uob = this.c;
          if (uob != null && !uob.size()) {
             return;
          }
       }
       b = true;
       int i = this.e + 1;
       this.e = i;
       int i1 = 0;
       if (p0 == null) {
          int i2 = - this.c.size();
          this.c = null;
          this.d = Collections.emptyList();
          if (this.c != null) {
             uoe.g(i2);
             uoe.a(i1, this.c.size());
             uoe.e();
          }
          return;
       }else if(this.c == null){
          this.c = p0;
          this.d = Collections.unmodifiableList(p0);
          uoe.g(p0.size());
          uoe.c(i1, p0.size());
          uoe.e();
          return;
       }else {
          this.b = b;
          b$a uoa = new b$a(this, this.c, p0, i, p1, uoe);
          b.g.execute(v8);
          return;
       }
    }
}
