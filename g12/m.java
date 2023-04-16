package g12.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import g12.m$a;
import java.lang.String;
import sc5.f;
import tc5.b;
import tc5.b$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.core.basic.liveslide.a;
import g12.n;
import com.kuaishou.live.core.basic.liveslide.a$a;
import c51.b;
import com.kuaishou.live.core.basic.liveslide.b$a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import androidx.fragment.app.Fragment;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import g12.l;
import erd.g;
import crd.b;
import g12.k;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import d61.g;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Iterable;
import qk.m;
import g12.j;
import ok.o;
import g12.g;
import ok.h;
import com.google.common.collect.ImmutableList;
import com.kuaishou.live.core.basic.liveslide.LiveSlideDetailContainerFragment;
import io.reactivex.subjects.PublishSubject;

public class m extends PresenterV2	// class@002a32
{
    public final List p;
    public a q;
    public LiveSlideDetailContainerFragment r;
    public PublishSubject s;
    public b t;
    public final f u;
    public final b v;
    public static String sLivePresenterClassName = "LiveSlideNewDetailFilterPresenter";

    public void m(){
       super();
       this.p = new ArrayList();
       m$a uoa = new m$a(this);
       this.u = uoa;
       this.v = b$a.a(false, 1, "liveSlide", uoa);
    }
    public void E8(){
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "2")) {
          return;
       }
       this.q = a.n(this.getActivity());
       if (!PatchProxy.applyVoid(objArray, this, om, "3")) {
          if (!PatchProxy.applyVoid(objArray, this, om, "4")) {
             if (this.t == null) {
                this.t = new n(this);
             }
             this.q.j().e(this.t);
          }
          if (!q.f(this.q.j().a())) {
             this.P8();
          }
          if (!PatchProxy.applyVoid(objArray, this, om, "5")) {
             this.v.F(this.r.isResumed());
             this.X7(this.r.m().subscribe(new l(this)));
          }
          if (!PatchProxy.applyVoid(objArray, this, om, "6")) {
             this.X7(this.s.subscribe(new k(this)));
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, m.class, "7")) {
          return;
       }
       this.v.release();
       if (this.t != null) {
          this.q.j().g(this.t);
       }
       return;
    }
    public void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m.class, "8")) {
          return;
       }
       if (q.f(this.q.j().a())) {
          return;
       }
       this.p.clear();
       a$a uoa = this.q.j();
       Objects.requireNonNull(uoa);
       List list = PatchProxy.apply(objArray, uoa, a$a.class, "1");
       if (list != PatchProxyResult.class) {
       }else {
          list = g.k(uoa.a());
       }
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          QPhoto qPhoto = iterator.next();
          if (!qPhoto.mEntity instanceof LiveStreamFeed) {
             continue ;
          }
          this.p.add(qPhoto);
       }
       if (q.f(this.p)) {
          return;
       }else {
          b.a0(LiveLogTag.LIVE_END_FILTER, "startMonitorLiveStatusIfNecessary", c.j("liveStreamFeedList: ", this.p.toString()));
          this.v.a(m.s(this.p).p(j.b).F(g.b).B());
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.r = this.q8(LiveSlideDetailContainerFragment.class);
       this.s = this.r8("LIVE_SQUARE_REPLACE_PAGE_LIST_PUBLISHER");
       return;
    }
}
