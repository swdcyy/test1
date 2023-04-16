package as1.g;
import erd.g;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel;
import java.lang.Object;
import nh3.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import nh3.c;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.UserInfo;
import as1.d;

public final class g implements g	// class@00029d
{
    public final LiveMultiLinePuzzleModel b;

    public void g(LiveMultiLinePuzzleModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       ArrayList uArrayList;
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          b.P(this.b.a, "roomInfoUpdate");
          LiveMultiLinePuzzleModel e = this.b.e;
          if (p0 != null) {
             p0 = p0.f();
             if (p0 != null) {
                uArrayList = new ArrayList(u.Y(p0, 10));
                p0 = p0.iterator();
                while (p0.hasNext()) {
                   c uoc = p0.next();
                   a.o(uoc, "it");
                   UserInfo userInfo = uoc.c();
                   a.o(userInfo, "it.userInfo");
                   uArrayList.add(userInfo);
                }
                e.g(uArrayList);
             }
          }
          uArrayList = null;
          goto label_0050 ;
       }
       return;
    }
}
