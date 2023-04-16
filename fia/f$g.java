package fia.f$g;
import erd.g;
import fia.f;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class f$g implements g	// class@002902
{
    public final f b;

    public void f$g(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$g.class, "1")) {
       }else {
          a.p(p0, "data");
          this.b.I = p0;
       }
       return;
    }
}
