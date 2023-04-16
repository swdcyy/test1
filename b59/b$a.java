package b59.b$a;
import erd.g;
import b59.b;
import java.lang.Integer;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vq4.d;

public final class b$a implements g	// class@00036b
{
    public final b b;
    public final Integer c;

    public void b$a(b p0,Integer p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b$a.class, "1")) {
       }else {
          p0 = p0.F;
          b$a tc = this.c;
          int i = (tc != null)? tc.intValue(): 0;
          p0.b = i;
          PatchProxy.onMethodExit(b$a.class, "1");
       }
       return;
    }
}
