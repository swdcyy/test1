package k6a.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.g;
import k17.b;
import lnc.a1;
import k6a.t$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.NasaRecommendUserFeed;
import tl8.d;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.c;
import qvb.q;
import qvb.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import k6a.n;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import g9c.a;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBar;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class t extends PresenterV2	// class@002c01
{
    public final g p;
    public final b q;
    public RecyclerView r;
    public SlidePlayVideoLoadingProgressBar s;
    public c t;
    public PhotoDetailParam u;
    public PublishSubject v;
    public BaseFragment w;
    public final q x;

    public void t(){
       super();
       this.p = new g();
       this.q = new b(1, a1.e(16.00f));
       this.x = new t$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, t.class, "3")) {
          return;
       }
       this.t.W1(this.u.mPhoto.getEntity().a(NasaRecommendUserFeed.class));
       this.t.h(this.x);
       this.r.setLayoutManager(new LinearLayoutManager(this.getContext()));
       this.r.addItemDecoration(this.q);
       n on = new n();
       on.x(300);
       this.r.setItemAnimator(on);
       t tp = this.p;
       tp.w = this.w;
       this.r.setAdapter(tp);
       this.p.W0(this.t.getItems());
       this.p.k0();
       this.v.onNext(Boolean.TRUE);
       PatchProxy.onMethodExit(t.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, t.class, "5")) {
          return;
       }
       this.r.removeItemDecoration(this.q);
       this.t.h(this.x);
       this.t.Z1();
       PatchProxy.onMethodExit(t.class, "5");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, t.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a34da);
       this.s = m1.f(p0, 0x7f0a2911);
       PatchProxy.onMethodExit(t.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, t.class, "1")) {
          return;
       }
       this.t = this.q8(c.class);
       this.u = this.q8(PhotoDetailParam.class);
       this.v = this.r8("FOLLOW_STATUS_CHANGE");
       this.w = this.q8(BaseFragment.class);
       PatchProxy.onMethodExit(t.class, "1");
       return;
    }
}
