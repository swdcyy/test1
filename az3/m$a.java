package az3.m$a;
import erd.g;
import az3.m;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class m$a implements g	// class@0002e5
{
    public final m b;

    public void m$a(m p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       if (!PatchProxy.isSupport2(m$a.class, "1") || !PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(b), this, m$a.class, "1")) {
          this.b.u = b;
          PatchProxy.onMethodExit(m$a.class, "1");
       }
       return;
    }
}
