package kf0.m;
import erd.g;
import kf0.f$b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class m implements g	// class@002d14
{
    public final f$b b;

    public void m(f$b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
       }else {
          a.p(p0, "data");
          this.b.onSuccess(p0);
       }
       return;
    }
}
