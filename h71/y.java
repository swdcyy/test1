package h71.y;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.common.core.component.watchtimer.LiveWatchTimerStartConfig;
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

public final class y extends AbstractLiveJsCommand	// class@002651
{

    public void y(){
       super();
    }
    public Class a(){
       return LiveWatchTimerStartConfig.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, y.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof LiveWatchTimerStartConfig) {
          return m.g.c("invalid params");
       }
       LiveWatchTimerStartConfig mBiz = p0.mBiz;
       int i = 1;
       mBiz = (mBiz == null || !mBiz.length())? 1: null;
       if (!mBiz) {
          mBiz = p0.mToken;
          if (mBiz != null && mBiz.length()) {
             i = 0;
          }
          if (!i) {
             b.e().j(p0);
             return m$a.g(m.g, null, false, 3, null);
          }
       }
       return m.g.c("param: biz & token  required");
    }
}
