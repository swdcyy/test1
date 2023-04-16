package h71.n;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import h71.n$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import eu4.a;
import lp3.c;

public final class n extends AbstractLiveJsCommand	// class@002640
{

    public void n(){
       super();
    }
    public Class a(){
       return n$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, n.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof n$a) {
          return m.g.c("invalid params");
       }
       if (TextUtils.x(p0.a())) {
          return m.g.c("invalid params, job id is null");
       }
       p0 = p0.a();
       if (p0 != null) {
          this.g(a.class).Ah(p0);
       }
       return m$a.g(m.g, null, false, 3, null);
    }
}
