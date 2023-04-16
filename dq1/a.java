package dq1.a;
import dq1.c;
import zp1.i;
import zp1.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import yp1.c;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import xp1.b;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import nh3.c;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.component.multichat.render.LiveMultiChatRenderViewType;
import java.lang.StringBuilder;
import dq1.e;

public abstract class a implements c	// class@001fe5
{
    public final i a;
    public final l b;

    public void a(i p0,l p1){
       a.p(p0, "chatCellBaseDelegate");
       a.p(p1, "chatCellRendDelegate");
       super();
       this.a = p0;
       this.b = p1;
    }
    public Map a(c p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "layoutData");
       obj = new HashMap();
       List value = this.b.a().e().getValue();
       if (value != null) {
          Iterator iterator = value.iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             UserInfo mId = uoc.c().mId;
             if (p0.b().containsKey(mId)) {
                String str = LiveMultiChatRenderViewType.CELL.getType()+mId;
                boolean b = (uoc.a() == 2)? true: false;
                a.o(mId, "userId");
                e uoe = this.b(b, mId);
                if (uoe != null) {
                   obj.put(str, uoe);
                }
             }
          }
       }
       return obj;
    }
    public abstract e b(boolean p0,String p1);
}
