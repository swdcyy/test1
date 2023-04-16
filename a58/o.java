package a58.o;
import nh8.b;
import com.mini.app.installer.f;
import java.lang.String;
import java.lang.Object;
import nh8.a;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.mini.app.runtime.f;
import m68.r;
import java.lang.Integer;
import r58.b;
import com.mini.d;

public class o implements b	// class@00003b
{
    public final b a;
    public final String b;
    public final f c;

    public void o(f p0,b p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(boolean p0){
       a.c(this, p0);
    }
    public void b(){
       a.b(this);
    }
    public void c(MiniAppInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       this.c.k.j.w();
       this.a.c(p0);
       return;
    }
    public void d(int p0,String p1,MiniAppInfo p2){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, o.class, "3")) {
          return;
       }
       this.c.k.y.l(p2);
       this.c.k.y.o.l(this.b, p2);
       this.c.f();
       this.a.d(p0, p1, p2);
       if (!p0) {
          this.c.k.j.D();
          if (d.f()) {
             d.a(this.c.b, "MainPkgInstallerProxy.installImpl\(\) B");
          }
       }else if(d.f()){
          d.a(this.c.b, "MainPkgInstallerProxy.installImpl\(\) Ê§°Ü");
       }
       return;
    }
    public void e(MiniAppInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       this.c.k.y.l(p0);
       this.a.e(p0);
       this.c.k.j.w();
       return;
    }
}
