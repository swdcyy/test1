package k71.x;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import k71.x$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import hm2.a$b;
import lp3.c;
import java.lang.Integer;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import hx1.a;
import java.util.List;

public final class x extends AbstractLiveJsCommand	// class@002ccf
{

    public void x(){
       super();
    }
    public Class a(){
       return x$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       x ox = x.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, x.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof x$a) {
          return m.g.c("invalid params");
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, ox, "3")) {
          a$b uob = this.g(a$b.class);
          x$a visible = p0.visible;
          boolean b = (visible != null && !visible.intValue())? true: false;
          LiveWealthGradeInfo liveWealthGr = uob.yb();
          if (liveWealthGr != null) {
             liveWealthGr.mIsGradeHidden = b;
             uob.ek(liveWealthGr);
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, ox, "2")) {
          this.g(a.class).Dl(p0.roleInfos);
       }
       return m$a.g(m.g, null, false, 3, null);
    }
}
