package g12.d;
import erd.g;
import g12.e;
import java.lang.Object;
import g12.e$a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import e12.c;
import java.util.Collection;
import ekd.q;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.core.basic.liveslide.a;
import com.kuaishou.live.core.basic.liveslide.a$a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.core.basic.liveslide.b$a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.live.core.basic.utils.e;
import com.kuaishou.live.core.basic.liveslide.b$b;
import com.kuaishou.live.core.basic.liveslide.b;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import e12.p;
import z12.x;
import com.kuaishou.live.basic.liveslide.datasource.b;
import e12.o;
import c51.e;
import b51.d;
import c51.h;
import wg3.b;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class d implements g	// class@002a25
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       e$a a = p0.a;
       p0 = p0.b;
       if (PatchProxy.applyVoidTwoRefs(a, p0, tb, e.class, "5")) {
       }else if(q.f(a.n0())){
          a uoa = a.n(tb.getActivity());
          boolean i = uoa.j().c(p0.mEntity);
          e.d(p0.getLivePlayConfig(), tb.getActivity());
          if (tb.v != null && (i >= 0 && i == a.n0().indexOf(p0))) {
             uoa.h().d(i, false);
          }else {
             e t = tb.t;
             i = (a.n0().size() == 1 && !a.hasMore())? true: false;
             t.mIsSoloLiveStream = i;
             if (tb.v != null) {
                tb.P8();
             }
             p op = new p(a);
             op.b(x.J(a.n0()));
             tb.p = new o(op, a);
             tb.r.s(false);
             tb.p.setEnableLoadMore(true);
             tb.q = op;
             tb.r.r(tb.p, p0.mEntity);
             tb.v = true;
             p0 = tb.s;
             if (p0 != null) {
                p0.onNext(Boolean.TRUE);
             }
          }
       }
       return;
    }
}
