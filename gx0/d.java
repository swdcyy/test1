package gx0.d;
import oj0.a;
import com.kuaishou.live.audience.component.blessingbag.e;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Double;

public final class d implements a	// class@002599
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void W(Map p0){
       int i;
       d tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.applyOneRefs(p0, tb, e.class, "16");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          p0 = p0.get("state");
          i = (p0 instanceof Double)? p0.intValue(): 0;
       }
       if (i == 1) {
          b = true;
       }
       tb.E = b;
       return;
    }
}
