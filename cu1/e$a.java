package cu1.e$a;
import androidx.lifecycle.Observer;
import cu1.e;
import java.lang.Object;
import hu1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import hu1.a;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkLayoutViewType;
import zs1.b;
import ut1.f;
import trd.u;
import k2b.e0;
import du1.d;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import gu1.a;
import java.lang.Integer;
import gu1.h;
import java.lang.Runnable;
import java.util.concurrent.Future;
import pu1.g;

public final class e$a implements Observer	// class@001e53
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, str)) {
       }else {
          e$a tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          e uoe = e.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uoe, str)) {
             tb.r0(tb.c).setValue(p0);
             p0 = p0.a();
             if (!PatchProxy.applyVoidOneRefs(p0, tb, uoe, "2")) {
                ArrayList uArrayList = new ArrayList();
                p0 = p0.iterator();
                int i = 1;
                while (p0.hasNext()) {
                   Object obj = p0.next();
                   Object obj1 = obj;
                   if (obj1.c() != LiveMultiPkLayoutViewType.MULTI_PK_SCORE_WITH_RANK && obj1.c() != LiveMultiPkLayoutViewType.MULTI_PK_SCORE_ONLY_TEXT) {
                      i = 0;
                   }
                   if (i) {
                      uArrayList.add(obj);
                   }
                }
                if (tb.d == null && (uArrayList.isEmpty() ^ i)) {
                   tb.d = i;
                   p0 = tb.g.l().getValue();
                   if (p0 != null) {
                      ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
                      Iterator iterator = uArrayList.iterator();
                      while (iterator.hasNext()) {
                         uArrayList1.add(iterator.next().b());
                      }
                      int i1 = p0.h();
                      e0 uoe0 = tb.h.i();
                      ClientContent$LiveStreamPackage liveStreamPa = tb.h.a();
                      if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(i1), uoe0, liveStreamPa, uArrayList1, null, a.class, "14")) {
                         a.p(uoe0, "logPage");
                         a.p(liveStreamPa, "liveStreamPackage");
                         a.p(uArrayList1, "userList");
                         g.a(new h(i1, liveStreamPa, uArrayList1, uoe0));
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
