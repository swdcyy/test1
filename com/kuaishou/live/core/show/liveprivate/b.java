package com.kuaishou.live.core.show.liveprivate.b;
import k51.c;
import com.kuaishou.live.core.show.liveprivate.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.live.log.b;
import ds5.c;
import ds5.a;
import xa2.i;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import android.view.ViewGroup;
import va1.n0;
import crd.b;
import lnc.b9;
import android.view.Window;
import brd.t;
import ry1.b;
import xa2.h;
import erd.g;
import io.reactivex.internal.functions.Functions;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class b extends c	// class@000c89
{
    public ViewGroup p;
    public LiveAudienceParam q;
    public BaseFragment r;
    public c s;
    public b t;
    public a0 u;
    public c v;
    public static String sLivePresenterClassName = "LiveAudiencePrivatePresenter";

    public void b(){
       super();
       this.v = new b$a(this);
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (SystemUtil.I()) {
          b.S(LiveLogTag.PRIVATE_LIVE.appendTag("LiveAudiencePrivatePresenter"), "onBind", "name", this.u.c.getUserName());
       }
       this.u.J.gd(this.v);
       if (this.u.h != null) {
          if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
             i oi = new i(this);
             this.s = oi;
             this.u.y2.P4(oi);
          }
       }else {
          this.P8();
       }
       if (this.q.mShouldAttachFragmentForLivePrivate != null && this.getActivity() instanceof GifshowActivity) {
          this.q.mShouldAttachFragmentForLivePrivate = false;
          this.getActivity().S2(this.r);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       if (SystemUtil.I()) {
          b.S(LiveLogTag.PRIVATE_LIVE.appendTag("LiveAudiencePrivatePresenter"), "onUnbind", "name", this.u.c.getUserName());
       }
       this.u.J.fo(this.v);
       b tu = this.u;
       if (tu.h != null) {
          tu.y2.d5(this.s);
       }
       n0.l(this.p);
       b9.a(this.t);
       this.getActivity().getWindow().clearFlags(8192);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       this.t = this.u.b3.T3().subscribe(new h(this), Functions.d());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a22df);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.u = this.q8(a0.class);
       this.q = this.r8("LIVE_AUDIENCE_PARAM");
       this.r = this.r8("LIVE_FRAGMENT");
       return;
    }
}
