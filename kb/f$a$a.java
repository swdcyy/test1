package kb.f$a$a;
import kb.e;
import kb.f$a;
import java.lang.Object;
import kb.c;
import java.util.Objects;
import java.util.Map;
import com.facebook.datasource.AbstractDataSource;
import java.lang.Math;

public class f$a$a implements e	// class@00249b
{
    public final f$a a;

    public void f$a$a(f$a p0){
       this.a = p0;
       super();
    }
    public void onCancellation(c p0){
    }
    public void onFailure(c p0){
       this.a.r(p0);
    }
    public void onNewResult(c p0){
       if (p0.hasResult()) {
          f$a$a ta = this.a;
          Objects.requireNonNull(ta);
          boolean b = p0.a();
          _monitor_enter(ta);
          if (p0 == ta.j) {
             f$a k = ta.k;
             if (p0 != k) {
                if (k == null || b) {
                   ta.k = p0;
                }else {
                   k = null;
                }
                _monitor_exit(ta);
                ta.p(k);
             label_0029 :
                if (p0 == ta.q()) {
                   ta.n(null, p0.a(), p0.getExtras());
                }
             }
          }
          _monitor_exit(ta);
          goto label_0029 ;
       }else if(p0.a()){
          this.a.r(p0);
       }
       return;
    }
    public void onProgressUpdate(c p0){
       this.a.m(Math.max(this.a.getProgress(), p0.getProgress()));
    }
}
