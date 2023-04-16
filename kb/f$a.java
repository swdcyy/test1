package kb.f$a;
import com.facebook.datasource.AbstractDataSource;
import kb.f;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import kb.c;
import java.lang.Object;
import java.util.Map;
import java.util.List;
import ab.h;
import kb.f$a$a;
import ya.a;
import kb.e;
import java.util.concurrent.Executor;

public class f$a extends AbstractDataSource	// class@00249c
{
    public int i;
    public c j;
    public c k;
    public final f l;

    public void f$a(f p0){
       this.l = p0;
       super();
       this.i = 0;
       this.j = null;
       this.k = null;
       if (!this.s()) {
          this.k(new RuntimeException("No data source supplier or supplier returned null."));
       }
       return;
    }
    public boolean close(){
       _monitor_enter(this);
       if (!super.close()) {
          _monitor_exit(this);
          return false;
       }else {
          f$a tj = this.j;
          this.j = null;
          f$a tk = this.k;
          this.k = null;
          _monitor_exit(this);
          this.p(tk);
          this.p(tj);
          return true;
       }
    }
    public synchronized Object getResult(){
       c uoc = this.q();
       Object result = (uoc != null)? uoc.getResult(): null;
       return result;
    }
    public synchronized boolean hasResult(){
       c uoc = this.q();
       boolean b = (uoc != null && uoc.hasResult())? true: false;
       return b;
    }
    public final void p(c p0){
       if (p0 != null) {
          p0.close();
       }
       return;
    }
    public synchronized final c q(){
       return this.k;
    }
    public void r(c p0){
       c uoc;
       _monitor_enter(this);
       if (this.isClosed() || p0 != this.j) {
          uoc = null;
          _monitor_exit(this);
       }else {
          this.j = null;
          uoc = 1;
          _monitor_exit(this);
       }
       if (!uoc) {
          return;
       }else if(p0 != this.q()){
          this.p(p0);
       }
       if (!this.s()) {
          this.l(p0.e(), p0.getExtras());
       }
       return;
    }
    public final boolean s(){
       h oh;
       f$a$a uoa$a;
       _monitor_enter(this);
       c uoc = null;
       if (!this.isClosed() && this.i < this.l.a.size()) {
          f$a ti = this.i;
          this.i = ti + 1;
          oh = this.l.a.get(ti);
          _monitor_exit(this);
       }else {
          _monitor_exit(this);
          oh = uoc;
       }
       if (oh != null) {
          uoc = oh.get();
       }
       _monitor_enter(this);
       a uoa = null;
       if (this.isClosed()) {
          _monitor_exit(this);
          uoa$a = null;
       }else {
          this.j = uoc;
          _monitor_exit(this);
          uoa$a = 1;
       }
       if (uoa$a && uoc != null) {
          uoc.f(new f$a$a(this), a.a());
          return true;
       }else {
          this.p(uoc);
          return uoa;
       }
    }
}
