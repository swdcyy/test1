package dlc.o0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dlc.l0;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.util.rx.RxBus;
import d0a.h;
import t45.d;
import brd.z;
import dlc.n0;
import dlc.m0;
import im8.f;
import com.yxcorp.gifshow.entity.TrendingInfo;
import com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingTopLayout$a;
import com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingTopLayout;
import android.view.View;
import ekd.m1;
import io.reactivex.subjects.PublishSubject;

public class o0 extends PresenterV2	// class@00225f
{
    public View p;
    public SlidePlayTrendingTopLayout q;
    public f r;
    public t s;
    public PublishSubject t;

    public void o0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o0.class, "3")) {
          return;
       }
       g e = Functions.e;
       this.X7(this.s.subscribe(new l0(this), e));
       this.X7(RxBus.f.f(h.class).observeOn(d.a).subscribe(new n0(this)));
       this.P8();
       this.X7(this.t.subscribe(new m0(this), e));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, o0.class, "4");
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, o0.class, "6")) {
          return;
       }
       this.q.getAdapter().l(this.r.get());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a407c);
       this.p = m1.f(p0, 0x7f0a407e);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o0.class, "1")) {
          return;
       }
       this.r = this.x8("CURRENT_PLAY_HOT_TRENDING_INFO");
       this.s = this.r8("PLAY_HOT_TRENDING_INFO_CHANGE_OBSERVABLE");
       this.t = this.r8("CURRENT_PLAY_FEED_INDEX_IN_TRENDING_INFO");
       return;
    }
}
