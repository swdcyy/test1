package am1.a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.gift.giftpanel.tablist.LiveGiftPanelTabListAdapter;
import am1.c;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.h$b;
import msd.a;
import am1.c$a;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Boolean;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import vh3.a;
import u2.f;
import java.lang.Runnable;
import android.os.Handler;

public final class a implements Observer	// class@0000d9
{
    public final LiveGiftPanelTabListAdapter b;
    public final c c;

    public void a(LiveGiftPanelTabListAdapter p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       c$a uoa;
       List list;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, str)) {
       }else {
          a tb = this.b;
          a.o(p0, "it");
          a tc = this.c;
          Objects.requireNonNull(tc);
          c obj = PatchProxy.applyOneRefs(p0, tc, c.class, str);
          if (obj != PatchProxyResult.class) {
             uoa = obj;
          }else {
             a.p(p0, "newDataList");
             obj = tc.a;
             if (obj == null) {
                list = tc.b.invoke();
             }
             tc.a = p0;
             uoa = new c$a(tc, obj, p0);
          }
          b uob = new b(tb);
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(LifecycleRecyclerAdapter.class) || !PatchProxy.applyVoidFourRefs(p0, uoa, uob, Boolean.TRUE, tb, LifecycleRecyclerAdapter.class, "2")) {
             a.p(p0, "list");
             a.p(uoa, "diffCallback");
             a.p(uob, "updateCallback");
             h$e uoe = h.c(uoa, true);
             a.o(uoe, "DiffUtil.calculateDiff\(diffCallback, detectMoves\)");
             tb.f.post(new a(tb, p0, uoe, uob));
          }
       }
       return;
    }
}
