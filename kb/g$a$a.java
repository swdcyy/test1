package kb.g$a$a;
import kb.e;
import kb.g$a;
import java.lang.Object;
import kb.c;
import java.util.Objects;
import java.util.Map;
import com.facebook.datasource.AbstractDataSource;

public class g$a$a implements e	// class@00249e
{
    public int a;
    public final g$a b;

    public void g$a$a(g$a p0,int p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public void onCancellation(c p0){
    }
    public void onFailure(c p0){
       this.b.v(this.a, p0);
    }
    public void onNewResult(c p0){
       g$a$a uoa$a;
       if (p0.hasResult()) {
          g$a$a tb = this.b;
          g$a$a ta = this.a;
          Objects.requireNonNull(tb);
          boolean b = p0.a();
          _monitor_enter(tb);
          g$a j = tb.j;
          if (p0 != tb.s(ta) || ta == tb.j) {
             _monitor_exit(tb);
          }else if(tb.t() == null || (b && ta < tb.j)){
             tb.j = ta;
             uoa$a = ta;
          }else {
             uoa$a = j;
          }
          _monitor_exit(tb);
          while (j > uoa$a) {
             tb.p(tb.r(j));
             j = j - 1;
          }
          if (p0 == tb.t()) {
             boolean b1 = (ta == null && p0.a())? true: false;
             tb.n(null, b1, p0.getExtras());
          }
          tb.u();
       }else if(p0.a()){
          this.b.v(this.a, p0);
       }
       return;
    }
    public void onProgressUpdate(c p0){
       if (this.a == null) {
          this.b.m(p0.getProgress());
       }
       return;
    }
}
