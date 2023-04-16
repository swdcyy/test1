package com.kuaishou.live.rerank.f;
import k51.c;
import java.util.HashSet;
import bp3.h;
import com.kuaishou.live.rerank.f$a;
import com.kuaishou.live.rerank.f$b;
import com.kuaishou.live.rerank.f$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.rerank.LiveRerankLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import jta.c;
import rf5.u;
import com.kuaishou.live.rerank.d;
import com.kuaishou.live.rerank.f$d;
import bp3.c;
import androidx.viewpager.widget.ViewPager$i;
import qvb.q;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import bp3.i;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.entity.QPhoto;
import ekd.k1;
import java.util.Set;
import com.google.common.base.a;
import java.lang.Iterable;
import com.kwai.framework.model.feed.BaseFeed;
import yp.x;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.rerank.e;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Integer;

public class f extends c	// class@000f6c
{
    public BaseFragment p;
    public u q;
    public SlidePlayViewModel r;
    public d s;
    public final Set t;
    public final LifecycleObserver u;
    public final c v;
    public final ViewPager$i w;
    public final q x;

    public void f(){
       super();
       this.t = new HashSet();
       this.u = new h(this);
       this.v = new f$a(this);
       this.w = new f$b(this);
       this.x = new f$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       b.P(LiveRerankLogTag.LIVE_RERANK.appendTag("LiveRerankPresenter"), "onBind");
       this.r = SlidePlayViewModel.B0(this.p);
       this.q.j(this.v);
       this.s = new d(new f$d(this));
       this.r.i(this.w);
       this.r.e(this.x);
       this.X7(this.p.Vg().j().subscribe(new i(this)));
       this.p.getLifecycle().addObserver(this.u);
       QPhoto currentPhoto = this.r.getCurrentPhoto();
       if (currentPhoto != null) {
          this.P8(currentPhoto);
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "3")) {
          return;
       }
       b.P(LiveRerankLogTag.LIVE_RERANK.appendTag("LiveRerankPresenter"), "onUnbind");
       this.r.b(this.x);
       k1.n(this);
       this.s.c();
       this.s = objArray;
       this.p.getLifecycle().removeObserver(this.u);
       this.r.g(this.w);
       this.q.B(this.v);
       return;
    }
    public void P8(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "6")) {
          return;
       }
       if (p0 != null && p0.isLiveStream()) {
          this.t.add(p0.getLiveStreamId());
          LiveRerankLogTag lIVE_RERANK = LiveRerankLogTag.LIVE_RERANK;
          lIVE_RERANK.appendTag("LiveRerankPresenter");
          LiveRerankLogTag liveRerankLo = lIVE_RERANK;
          b.T(liveRerankLo, "feed exposed", "current feed liveStreamId", p0.getLiveStreamId(), "exposed feed list", a.g(",").c(this.t));
          if (!p0.getPosition()) {
             x.z(p0.mEntity, 1);
          }else if(this.s.a()){
             x.z(p0.mEntity, 3);
          }
       }
       return;
    }
    public final boolean R8(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && (!p0.mEntity instanceof LiveStreamFeed || this.t.contains(p0.getLiveStreamId()))) {
          return false;
       }
       return k0.a(p0.mEntity.mLiveStreamModel, e.a).or(Boolean.FALSE).booleanValue();
    }
    public boolean S8(){
       Object obj = PatchProxy.apply(null, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.q.w()) {
          return b;
       }
       int i = this.r.a0();
       if (i < (this.r.Y0() - 1) && i >= 0) {
          QPhoto qPhoto = this.r.T0((i + 1));
          boolean b1 = this.R8(qPhoto);
          if (b1) {
             LiveRerankLogTag lIVE_RERANK = LiveRerankLogTag.LIVE_RERANK;
             lIVE_RERANK.appendTag("LiveRerankPresenter");
             b.T(lIVE_RERANK, "nextFeedIsUnexposedLive", "currentPosition", Integer.valueOf(i), "liveStreamId", qPhoto.getLiveStreamId());
          }
          b = b1;
       }
       return b;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.q8(u.class);
       return;
    }
}
