package k71.o;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.core.show.webview.jsparams.LiveJsFansPriceChangedParams;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import dy1.d;
import lp3.c;
import com.kuaishou.live.core.show.webview.jsparams.LiveJsFansPriceChangedParams$AddFansParams;

public final class o extends AbstractLiveJsCommand	// class@002cc0
{

    public void o(){
       super();
    }
    public Class a(){
       return LiveJsFansPriceChangedParams.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, o.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof LiveJsFansPriceChangedParams) {
          return m.g.c("invalid params");
       }
       if (p0.mAddFansParams == null) {
          return m.g.c("param is required");
       }
       this.g(d.class).gl(p0.mAddFansParams.mAddFansPrice);
       return m$a.g(m.g, null, false, 3, null);
    }
}
