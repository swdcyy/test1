package l71.h;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lp3.e;
import gq1.l;
import lp3.c;
import com.kuaishou.live.common.core.component.multiline.endline.EndLineSource;
import o63.m;
import o63.m$a;

public final class h extends AbstractLiveJsCommand	// class@002e99
{

    public void h(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, h.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       b.Z(LiveLogTag.LIVE_LINE_PUZZLE, "puzzleShowClosePanel from js");
       this.h().a(l.class).Ob(EndLineSource.OPERATION_PANEL);
       return m$a.g(m.g, null, false, 3, null);
    }
}
