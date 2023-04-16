package gp2.a$a;
import erd.g;
import gp2.a;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrd.a;

public final class a$a implements g	// class@002b71
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          this.b.b.onNext(Long.valueOf(0));
       }
       return;
    }
}
