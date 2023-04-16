package eja.k1;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.stagger.data.m;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import xh5.a;
import com.yxcorp.gifshow.follow.stagger.data.i;
import jb5.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import com.yxcorp.gifshow.refresh.RefreshType;
import java.lang.System;
import iia.u1;
import jb5.d;
import qvb.n0;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;

public final class k1 implements g	// class@0026d2
{
    public final HomeFollowRefreshPresenter b;

    public void k1(HomeFollowRefreshPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int i1;
       k1 tb = this.b;
       p0 = PatchProxyResult.class;
       HomeFollowRefreshPresenter homeFollowRe = HomeFollowRefreshPresenter.class;
       tb.K = false;
       m om = tb.p.hi();
       String obj = PatchProxy.apply(null, tb, homeFollowRe, "8");
       int i = 1;
       if (obj != p0) {
          i1 = obj.intValue();
       }else {
          obj = "follow";
          if (a.a(obj)) {
             i1 = 1;
          }else if(a.b(obj)){
             i1 = 2;
          }else {
             i1 = 0;
          }
       }
       om.h3(i1);
       tb.p.hi().i2(i);
       if (tb.z != null) {
          tb.z = false;
          if (!PatchProxy.applyVoid(null, tb, homeFollowRe, "13") && (tb.G.a() && tb.y != null)) {
             c.i(KsLogFollowTag.STAGGER_REFRESH.appendTag("HomeFollowRefreshPresenter"), "checkBackToForegroundRefresh");
             tb.S8(RefreshType.FOLLOW_RETURN_REFRESH);
             tb.y = false;
          }
       }else if(PatchProxy.applyVoid(null, tb, homeFollowRe, "12")){
          if (tb.F != null && (System.currentTimeMillis() - tb.D) - tb.B > 0) {
             c.i(KsLogFollowTag.STAGGER_REFRESH.appendTag("HomeFollowRefreshPresenter"), "followReturnRefresh");
             tb.S8(RefreshType.FOLLOW_RETURN_REFRESH);
          }else if(tb.E != null && (System.currentTimeMillis() - tb.D) - tb.C > 0){
             c.i(KsLogFollowTag.STAGGER_REFRESH.appendTag("HomeFollowRefreshPresenter"), "tabClick");
             tb.S8(RefreshType.FOLLOW_RETURN_REFRESH);
          }else if(tb.E == null && tb.F == null){
             HomeFollowRefreshPresenter i2 = tb.I;
             if (i2 != null && i2.b()) {
                c.i(KsLogFollowTag.STAGGER_REFRESH.appendTag("HomeFollowRefreshPresenter"), "kwai://home/following?recoParam=xxxxx");
                tb.R8();
             }
          }
          Object obj1 = PatchProxy.apply(null, tb, homeFollowRe, "17");
          if (obj1 != p0) {
             i = obj1.booleanValue();
          }else {
             p0 = tb.q;
             if (!p0 instanceof d || (p0.L0() == null || tb.q.L0().mEnableRefreshWhenFollow == null)) {
                i = false;
             }
          }
          if (i && tb.J != null) {
             c.i(KsLogFollowTag.STAGGER_REFRESH.appendTag("HomeFollowRefreshPresenter"), "newFollow");
             tb.R8();
          }
          tb.E = false;
          tb.F = false;
          tb.J = false;
       }
       return;
    }
}
