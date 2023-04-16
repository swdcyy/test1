package h52.d;
import erd.g;
import h52.e;
import java.lang.Object;
import com.kuaishou.live.core.show.closepage.audience.feed.recommand.LivePlayClosedV2RecommendLiveResponse;
import java.util.Objects;
import java.util.List;
import java.util.Collection;
import ekd.q;
import h52.c;
import t02.a0;
import m52.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;

public final class d implements g	// class@002c50
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null && !q.f(p0.getItems())) {
          tb.w = p0;
          p0 = tb.P8(p0, tb.p);
          c uoc = new c(tb.q, tb.r, tb.v);
          tb.t = uoc;
          uoc.W0(p0);
          tb.s.setAdapter(tb.t);
       }
       return;
    }
}
