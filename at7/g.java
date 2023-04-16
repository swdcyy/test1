package at7.g;
import qp7.x0;
import pp7.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

public final class g extends x0	// class@00036c
{
    public final b d;
    public final b e;

    public void g(){
       super();
       this.d = new b();
       this.e = new b();
    }
    public final void g(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "3")) {
          return;
       }
       this.e.f(Boolean.valueOf(p0));
       return;
    }
}
