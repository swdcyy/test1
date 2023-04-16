package kf0.j;
import erd.g;
import kf0.f$b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class j implements g	// class@002d11
{
    public final f$b b;

    public void j(f$b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          this.b.onError(p0);
       }
       return;
    }
}
