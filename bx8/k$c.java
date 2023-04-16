package bx8.k$c;
import erd.g;
import bx8.k;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mrd.a;

public final class k$c implements g	// class@00047b
{
    public final k b;

    public void k$c(k p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$c.class, "1")) {
       }else {
          this.b.c.onNext(p0);
       }
       return;
    }
}
