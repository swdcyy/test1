package bca.a$f;
import erd.g;
import brd.v;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;

public final class a$f implements g	// class@00044f
{
    public final v b;

    public void a$f(v p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "1")) {
       }else {
          this.b.onNext(p0);
       }
       return;
    }
}
