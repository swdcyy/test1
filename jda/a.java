package jda.a;
import java.lang.Object;
import java.util.ArrayList;
import lea.b;
import java.lang.String;
import java.util.List;
import jda.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public abstract class a	// class@0030ca
{
    public boolean a;
    public final List b;

    public void a(){
       super();
       this.a = false;
       this.b = new ArrayList();
    }
    public abstract void a(b p0);
    public abstract void b();
    public abstract void c(String p0);
    public abstract void d(List p0);
    public abstract void e();
    public abstract List f();
    public abstract int g();
    public abstract int h();
    public void i(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (this.a != null) {
          if (p0 != null) {
             p0.a();
          }
          return;
       }else {
          a tb = this.b;
          _monitor_enter(tb);
          if (this.a != null) {
             if (p0 != null) {
                p0.a();
             }
             _monitor_exit(tb);
             return;
          }else {
             this.e();
             this.a = true;
             if (p0 != null) {
                p0.a();
             }
             _monitor_exit(tb);
             return;
          }
       }
    }
    public boolean j(){
       return this.a;
    }
    public abstract List k();
    public abstract void l();
}
