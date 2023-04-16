package i6a.f$f;
import erd.g;
import i6a.f;
import java.lang.Object;
import ve5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class f$f implements g	// class@002795
{
    public final f b;

    public void f$f(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f$f.class, "1")) {
       }else {
          this.b.W8();
          this.b.c9();
          this.b.e9();
          PatchProxy.onMethodExit(f$f.class, "1");
       }
       return;
    }
}
