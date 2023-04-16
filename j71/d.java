package j71.d;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import v82.a;
import lp3.c;
import o63.m;
import o63.m$a;

public final class d extends AbstractLiveJsCommand	// class@002a57
{

    public void d(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       this.g(a.class).Og(true);
       return m$a.g(m.g, null, false, 3, null);
    }
}
