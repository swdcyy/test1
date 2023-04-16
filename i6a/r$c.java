package i6a.r$c;
import erd.g;
import i6a.r;
import java.lang.Object;
import d0a.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class r$c implements g	// class@0027ae
{
    public final r b;

    public void r$c(r p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, r$c.class, "1")) {
       }else if(p0.a == 1){
          this.b.V8();
       }
       PatchProxy.onMethodExit(r$c.class, "1");
       return;
    }
}
