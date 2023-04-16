package com.kuaishou.live.core.show.statistics.a;
import k51.c;
import com.kuaishou.live.core.show.statistics.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import t02.g;
import com.kuaishou.live.core.basic.activity.x$a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.framework.model.feed.BaseFeed;
import tj3.e;
import com.kuaishou.android.live.model.i;
import kp.r1;
import f12.d;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import f12.c;
import java.lang.Integer;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.k2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import java.util.Map;
import ekd.q;
import lnc.i3;
import java.util.Set;
import java.util.Iterator;
import com.yxcorp.gifshow.log.c0;
import com.yxcorp.gifshow.log.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import com.kuaishou.live.core.basic.utils.e;
import com.yxcorp.gifshow.log.d0;

public class a extends c	// class@001095
{
    public boolean p;
    public LiveAudienceParam q;
    public LiveBizParam r;
    public g s;
    public e t;
    public BaseFragment u;
    public int v;
    public final c w;
    public static String sLivePresenterClassName = "LiveAudienceRealShowPresenter";

    public void a(){
       super();
       this.p = false;
       this.v = 1;
       this.w = new a$a(this);
    }
    public void E8(){
       int i;
       LiveAudienceParam mLiveSourceU;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "5") && this.q != null) {
          boolean b = true;
          if (this.r.mIsAutoEnter != null && this.s.E.a()) {
             this.R8(this.q.mPhoto, 8);
             this.t.o(8);
             this.p = b;
          }else if(i.j(this.q.mPhoto)){
             this.R8(this.q.mPhoto, 6);
             this.t.o(6);
             this.p = b;
          }else {
             i = 5;
             if (this.s.A == null) {
                mLiveSourceU = this.q.mLiveSourceUrl;
                if (mLiveSourceU != null && mLiveSourceU.startsWith("kwai://live/play/")) {
                   if (!r1.u3(this.q.mPhoto)) {
                      this.R8(this.q.mPhoto, i);
                   }
                   this.t.o(7);
                }
                this.p = b;
             }else {
                mLiveSourceU = this.q.mLiveSourceUrl;
                if (mLiveSourceU != null && (mLiveSourceU.startsWith("kwai://liveaggregatesquare") && (this.q.mIndexInAdapter == null && this.P8().c() != 2))) {
                   this.t.o(i);
                   this.v = i;
                   this.p = b;
                }
             }
          }
       }
       uoa = this.s;
       if (uoa.A != null) {
          uoa.l.P4(this.w);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a ts = this.s;
       if (ts.A != null) {
          ts.l.d5(this.w);
       }
       return;
    }
    public d P8(){
       Activity obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getActivity();
       Objects.requireNonNull(obj);
       return c.b(obj);
    }
    public void R8(BaseFeed p0,int p1){
       String str3;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4")) {
          return;
       }
       k2 ok2 = b.a(0x4b316083).Q();
       String str = null;
       if (ok2 != null) {
          ClientEvent$UrlPackage urlPackage = ok2.e(true);
          if (!TextUtils.x(urlPackage.entryPageSource)) {
             str = TextUtils.I(urlPackage.entryPageSource);
          }
       }
       String str1 = str;
       r1.n5(p0);
       LiveBizParam mExtraInfo = this.r.mExtraInfo;
       if (mExtraInfo != null && !q.h(mExtraInfo.mFollowExtraInfo)) {
          LivePassThruParamExtraInfo mFollowExtra = this.r.mExtraInfo.mFollowExtraInfo;
          i3 oi3 = i3.f();
          Iterator iterator = mFollowExtra.keySet().iterator();
          while (iterator.hasNext()) {
             String str2 = iterator.next();
             oi3.d(str2, mFollowExtra.get(str2));
          }
          str3 = oi3.e();
       }else {
          str3 = "";
       }
       d0 uod0 = d0.g(p0, p1, str1, b.a(0xe0ff4fb).c(this.u), true, e.s(this.getActivity()), 2);
       uod0.c(str3);
       c0.q().n(uod0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.s = this.q8(g.class);
       this.q = this.t8("LIVE_AUDIENCE_PARAM");
       this.r = this.q8(LiveBizParam.class);
       this.t = this.r8("LIVE_LOG_REPORTER");
       this.u = this.r8("LIVE_FRAGMENT");
       return;
    }
}
