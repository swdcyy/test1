package com.yxcorp.gifshow.follow.stagger.c;
import qb5.e;
import iia.t1;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import fja.p;
import eja.m1;
import com.yxcorp.gifshow.follow.stagger.presenter.a;
import com.yxcorp.gifshow.follow.stagger.presenter.i;
import q99.a;
import xia.f;
import eja.o0;
import com.yxcorp.gifshow.follow.stagger.presenter.x;
import tia.g;
import tia.c;
import qja.a;
import eja.f1;
import eja.a;
import com.yxcorp.gifshow.follow.stagger.presenter.g;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import eja.m0;
import java.lang.Throwable;
import java.lang.Boolean;
import iia.d;
import dha.f;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import im8.c;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import qb5.b;
import com.kwai.component.fpsrecorder.PageFpsRecorder;
import na5.d$a;
import com.kwai.component.fpsrecorder.biz.FpsSocialBizType;
import na5.a;
import na5.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.component.fpsrecorder.ListScrollFpsRecorder;
import iia.r1;
import na5.b;
import com.kwai.component.feedsmonitor.FeedMonitor$b;
import com.kwai.component.feedsmonitor.FeedMonitor;
import com.kwai.component.feedsmonitor.f;
import com.kwai.component.feedsmonitor.pool.FeedPoolLifecycle;
import com.kwai.component.feedsmonitor.report.FeedReportRefreshLifecycle;
import jb5.d;
import qvb.i;
import com.kwai.component.feedsmonitor.report.FeedReportLifecycle;
import androidx.lifecycle.LifecycleOwner;

public class c implements e, t1	// class@00114a
{
    public final HomeFollowFragment b;

    public void c(HomeFollowFragment p0){
       super();
       this.b = p0;
    }
    public PresenterV2 Bd(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "createLazyPresenter");
       obj = new PresenterV2();
       obj.U7(new p());
       obj.U7(new m1());
       obj.U7(new a());
       obj.U7(new i());
       if (this.b.U0.n != null) {
          obj.U7(new f());
          obj.U7(new o0());
       }
       obj.U7(new x());
       obj.U7(new g());
       obj.U7(new c());
       obj.U7(new a());
       obj.U7(new f1());
       obj.U7(new a());
       obj.U7(new g());
       if (FollowConfigUtil.b()) {
          obj.U7(new m0());
       }
       PatchProxy.onMethodExit(c.class, "3");
       return obj;
    }
    public void Jc(boolean p0,boolean p1,Throwable p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, c.class, "1")) {
          return;
       }
       this.b.bi().O.onNext(new f(p0, p1, p2));
       return;
    }
    public RecyclerFragment a1(){
       return this.b;
    }
    public List h(){
       c tb;
       Object[] obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{tb.H,tb,new c("FRAGMENT", tb)};
       tb = this.b;
       return Lists.e(obj);
    }
    public void l8(){
    }
    public void load(){
       d$a uoa;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          return;
       }
       new b(this).b();
       if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          uoa = new d$a(FpsSocialBizType.FOLLOW, "FOLLOW_PAGE");
          uoa.c(false);
          new PageFpsRecorder(this.b, uoa.a()).a();
       }
       RecyclerView recyclerView = this.b.h0();
       if (!PatchProxy.applyVoidOneRefs(recyclerView, this, uoc, "6")) {
          uoa = new d$a(FpsSocialBizType.FOLLOW, "FOLLOW_SCROLL");
          uoa.c(true);
          uoa.b(new r1(this));
          new ListScrollFpsRecorder(this.b, recyclerView, uoa.a()).a();
       }
       FeedMonitor$b uob = FeedMonitor.b("Follow");
       uob.b(this.b.V0);
       uob.c(this.b.W0);
       uob.d(new FeedReportRefreshLifecycle(this.b.Qh(), this.b));
       uob.a().d(this.b);
       return;
    }
}
