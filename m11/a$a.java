package m11.a$a;
import w12.a$b;
import m11.a;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import w12.a;
import l11.j$a;

public class a$a extends a$b	// class@0030f8
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public boolean d(Message p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.what != 2) {
          return false;
       }
       a$a ta = this.a;
       ta.t(ta.f);
       this.a.h.b();
       return true;
    }
}
