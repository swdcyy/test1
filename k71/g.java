package k71.g;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import k71.g$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.watchtimer.b;
import lp3.e;
import gg1.b;
import lp3.c;
import com.kuaishou.livestream.message.nano.SCLiveEncourageTreasureBoxWidget;
import k71.g$b;

public final class g extends AbstractLiveJsCommand	// class@002cb1
{

    public void g(){
       super();
    }
    public Class a(){
       return g$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, g.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof g$a) {
          return m.g.c("invalid params");
       }
       String str = p0.a();
       String str1 = 1;
       str = (str == null || !str.length())? 1: null;
       if (!str) {
          str = p0.c();
          str = (str == null || !str.length())? 1: null;
          if (!str) {
             str = p0.b();
             if (str != null && str.length()) {
                str1 = null;
             }
             if (!str1) {
                long l = b.e().i(p0.a(), p0.c(), p0.b());
                if (l - null < 0) {
                   l = m.g.a(501, "task does not exist");
                }else {
                   SCLiveEncourageTreasureBoxWidget sCLiveEncour = this.h().a(b.class).y9();
                   if (sCLiveEncour == null) {
                      l = m.g.c("currentTreasureBoxWidgetInfo is null");
                   }else {
                      g$b uob = new g$b(sCLiveEncour.isTimerTaskProcessing, ((long)(sCLiveEncour.timerTaskStageSeconds * 1000) - l), sCLiveEncour.timerTaskStageStatus, sCLiveEncour.widgetStatus);
                      l = m$a.g(m.g, v7, false, 2, null);
                   }
                }
                return l;
             }
          }
       }
    label_00b2 :
       return m.g.c("param: biz & token & source required");
    }
}
