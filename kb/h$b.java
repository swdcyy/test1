package kb.h$b;
import com.facebook.datasource.AbstractDataSource;
import kb.h$a;
import kb.c;
import java.lang.Object;
import ab.h;
import kb.h$b$a;
import ya.a;
import kb.e;
import java.util.concurrent.Executor;

public class h$b extends AbstractDataSource	// class@0024a3
{
    public c i;

    public void h$b(){
       super();
       this.i = null;
    }
    public void h$b(h$a p0){
       super();
       this.i = null;
    }
    public static void p(c p0){
       if (p0 != null) {
          p0.close();
       }
       return;
    }
    public boolean close(){
       _monitor_enter(this);
       if (!super.close()) {
          _monitor_exit(this);
          return false;
       }else {
          h$b ti = this.i;
          this.i = null;
          _monitor_exit(this);
          h$b.p(ti);
          return true;
       }
    }
    public synchronized Object getResult(){
       h$b ti = this.i;
       Object result = (ti != null)? ti.getResult(): null;
       return result;
    }
    public synchronized boolean hasResult(){
       h$b ti = this.i;
       boolean b = (ti != null && ti.hasResult())? true: false;
       return b;
    }
    public void q(h p0){
       if (this.isClosed()) {
          return;
       }
       c uoc = (p0 != null)? p0.get(): null;
       _monitor_enter(this);
       if (this.isClosed()) {
          h$b.p(uoc);
          _monitor_exit(this);
          return;
       }else {
          h$b ti = this.i;
          this.i = uoc;
          _monitor_exit(this);
          if (uoc != null) {
             uoc.f(new h$b$a(this), a.a());
          }
          h$b.p(ti);
          return;
       }
    }
}
