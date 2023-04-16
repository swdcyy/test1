package j80.c;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import j80.c$a;

public abstract class c	// class@0019ba
{

    public void c(){
       super();
    }
    public abstract File a();
    public abstract File b();
    public abstract File c(String p0);
    public final File d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "subPath");
       return this.e(p0, true);
    }
    public abstract File e(String p0,boolean p1);
    public final File f(String p0){
       File obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "subPath");
       obj = new File(this.l(), p0);
       obj.mkdirs();
       return obj;
    }
    public final File g(String p0){
       File obj = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "subPath");
       obj = new File(this.m(), p0);
       obj.mkdirs();
       return obj;
    }
    public final File h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "subPath");
       return this.i(p0, true);
    }
    public abstract File i(String p0,boolean p1);
    public abstract File j(String p0);
    public abstract File k();
    public abstract File l();
    public abstract File m();
    public abstract File n();
    public abstract File o();
    public abstract void p(c$a p0);
    public abstract void q();
    public abstract void r(c$a p0);
}
