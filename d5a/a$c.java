package d5a.a$c;
import d5a.t;
import d5a.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import bm5.e;
import bm5.e$a;
import mrd.c;
import brd.y;

public final class a$c implements t	// class@001e74
{
    public final a a;

    public void a$c(a p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       a$c uoc = a$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (e.a.a()) {
          a.P8(this.a).onNext(Integer.valueOf(p0));
       }
       return;
    }
}
