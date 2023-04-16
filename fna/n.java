package fna.n;
import erd.g;
import msd.p;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.lang.Boolean;

public final class n implements g	// class@00298f
{
    public final p b;

    public void n(p p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
       }else {
          this.b.invoke(new ArrayList(), Boolean.TRUE);
       }
       return;
    }
}
