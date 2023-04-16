package d53.a;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.gzone.bridge.JsWebViewDisplayModeParams;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import lp3.e;
import w37.b;
import lp3.c;

public final class a extends AbstractLiveJsCommand	// class@00244e
{

    public void a(){
       super();
    }
    public Class a(){
       return JsWebViewDisplayModeParams.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof JsWebViewDisplayModeParams) {
          return m.g.c("invalid params");
       }
       this.h().a(b.class).h5(p0.mDisplayMode);
       return m$a.g(m.g, null, false, 3, null);
    }
}
