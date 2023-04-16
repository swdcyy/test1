package ez0.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import tkd.b;
import tkd.d;
import ym5.a;
import lnc.l1;

public final class g	// class@002249
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public static final int a(){
       Object obj = PatchProxy.apply(null, null, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0x7f0811d9;
       if (d.a(0x4c5dd1b8).f2()) {
          return i;
       }
       if (l1.a()) {
          i = 0x7f0811da;
       }
       return i;
    }
}
