package nf0.c$b;
import p80.a;
import nf0.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Boolean;

public final class c$b implements a	// class@0032ff
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public void a(){
    }
    public void b(){
    }
    public void c(){
    }
    public void d(){
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "2")) {
          return;
       }
       a.p(p0, "error");
       return;
    }
    public void onCoreLoadFinished(boolean p0){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       c$b ta = this.a;
       ta.t = true;
       if (ta.s != null) {
          ta.P8();
       }
       return;
    }
}
