package bb2.g;
import k51.c;
import java.util.ArrayList;
import bb2.g$a;
import java.lang.String;
import sc5.f;
import tc5.b;
import tc5.b$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import bb2.d;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qvb.q;
import bb2.h;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.trello.rxlifecycle3.components.support.RxFragment;
import bb2.f;
import bb2.e;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Iterable;
import qk.m;
import bb2.c;
import ok.o;
import bb2.a;
import ok.h;
import com.google.common.collect.ImmutableList;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;

public class g extends c	// class@0003c9
{
    public final List p;
    public q q;
    public BaseFragment r;
    public LiveBizParam s;
    public PublishSubject t;
    public PublishSubject u;
    public SlidePlayViewModel v;
    public final f w;
    public final b x;
    public static String sLivePresenterClassName = "LiveGrootSlideDetailFilterPresenter";

    public void g(){
       super();
       this.p = new ArrayList();
       g$a uoa = new g$a(this);
       this.w = uoa;
       this.x = b$a.a(false, 1, "grootLiveSlide", uoa);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.v = SlidePlayViewModel.B0(this.r);
       g tt = this.t;
       if (tt == null && this.s.mSlidePlayId == null) {
          return;
       }
       if (this.s.mSlidePlayId == null) {
          this.X7(tt.subscribe(new d(this)));
       }else {
          this.P8();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "7")) {
          return;
       }
       g tq = this.q;
       if (tq != null) {
          this.v.b(tq);
       }
       this.x.release();
       this.r = null;
       return;
    }
    public final void P8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "4")) {
          if (this.q == null) {
             this.q = new h(this);
          }
          this.v.e(this.q);
       }
       if (!q.f(this.v.I0())) {
          this.R8();
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "5")) {
          this.x.F(this.r.isResumed());
          this.X7(this.r.m().subscribe(new f(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "6")) {
          og = this.u;
          if (og != null) {
             this.X7(og.subscribe(new e(this)));
          }
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, g.class, "8")) {
          return;
       }
       if (q.f(this.v.e0())) {
          return;
       }
       this.p.clear();
       Iterator iterator = this.v.e0().iterator();
       while (iterator.hasNext()) {
          QPhoto qPhoto = iterator.next();
          if (!qPhoto.mEntity instanceof LiveStreamFeed) {
             continue ;
          }else {
             this.p.add(qPhoto);
          }
       }
       if (q.f(this.p)) {
          return;
       }
       b.a0(LiveLogTag.LIVE_END_FILTER, "startMonitorLiveStatusIfNecessary", c.j("liveStreamFeedList: ", this.p.toString()));
       this.x.a(m.s(this.p).p(c.b).F(a.b).B());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       this.s = this.q8(LiveBizParam.class);
       this.t = this.t8("LIVE_SLIDE_PLAY_ID_PUBLISHER");
       this.u = this.t8("LIVE_SQUARE_REPLACE_PAGE_LIST_PUBLISHER");
       return;
    }
}
