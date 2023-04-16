package d53.b;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lp3.e;
import w37.b;
import lp3.c;
import o63.m;
import com.kuaishou.live.gzone.bridge.JsWebViewDisplayModeResult;
import o63.m$a;

public final class b extends AbstractLiveJsCommand	// class@00244f
{

    public void b(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return m$a.g(m.g, new JsWebViewDisplayModeResult(this.h().a(b.class).d3(), 1), false, 2, null);
    }
}
