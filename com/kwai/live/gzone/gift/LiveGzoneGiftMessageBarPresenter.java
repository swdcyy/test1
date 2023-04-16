package com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter$a;
import nsd.u;
import trd.j;
import com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter$mLoopHandler$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter$b;
import com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter$c;
import j47.c;
import java.lang.String;
import kotlin.jvm.internal.a;
import k67.h;
import oq5.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import fq5.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import android.view.View;
import ekd.m1;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneSpreadGold;
import lf3.g;
import hf3.a;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import mrd.c;
import x67.j;
import com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter$d;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter$a$a;
import android.os.Handler;
import java.util.Iterator;
import java.lang.Iterable;
import k57.d;
import oq5.c;
import com.kwai.robust.PatchProxyResult;
import m67.v;

public final class LiveGzoneGiftMessageBarPresenter extends PresenterV2	// class@000d0e
{
    public final p A;
    public final g B;
    public final LiveGzoneGiftMessageBarPresenter$c C;
    public a p;
    public View q;
    public h r;
    public v s;
    public c t;
    public a u;
    public b v;
    public LiveSlidePlayService w;
    public j x;
    public final j y;
    public SCGzoneSpreadGold z;
    public static final LiveGzoneGiftMessageBarPresenter$a D;

    static {
       LiveGzoneGiftMessageBarPresenter.D = new LiveGzoneGiftMessageBarPresenter$a(null);
    }
    public void LiveGzoneGiftMessageBarPresenter(){
       super();
       this.y = new j();
       this.A = s.c(new LiveGzoneGiftMessageBarPresenter$mLoopHandler$2(this));
       this.B = new LiveGzoneGiftMessageBarPresenter$b(this);
       this.C = new LiveGzoneGiftMessageBarPresenter$c(this);
    }
    public static final c P8(LiveGzoneGiftMessageBarPresenter p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mComponentBridgeService");
       }
       return p0;
    }
    public static final h R8(LiveGzoneGiftMessageBarPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mGiftPendantService");
       }
       return p0;
    }
    public static final a S8(LiveGzoneGiftMessageBarPresenter p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mILiveConfigurationService");
       }
       return p0;
    }
    public void E8(){
       View view;
       if (PatchProxy.applyVoid(null, this, LiveGzoneGiftMessageBarPresenter.class, "3")) {
          return;
       }
       LiveGzoneGiftMessageBarPresenter tv = this.v;
       if (tv == null) {
          a.S("mILiveBasicContext");
       }
       LiveStreamFeedWrapper liveStreamFe = tv.r5();
       a.o(liveStreamFe, "mILiveBasicContext.liveStreamFeedWrapper");
       QLivePlayConfig livePlayConf = liveStreamFe.getLivePlayConfig();
       if (livePlayConf != null && !livePlayConf.isLandscape()) {
          view = m1.f(this.m8(), R.id.live_right_pendant_group_container_view);
          a.o(view, "ViewBindUtils.bindWidget¡­ant_group_container_view\)");
       }else {
          view = m1.f(this.m8(), R.id.play_view_wrapper);
          a.o(view, "ViewBindUtils.bindWidget¡­, R.id.play_view_wrapper\)");
       }
       this.q = view;
       tv = this.p;
       if (tv == null) {
          a.S("mLiveLongConnection");
       }
       tv.u0(886, SCGzoneSpreadGold.class, this.B);
       tv = this.w;
       if (tv == null) {
          a.S("mSlidePlayService");
       }
       tv.P4(this.C);
       tv = this.x;
       if (tv != null) {
          c uoc = tv.Ye();
          if (uoc != null) {
             b uob = uoc.subscribe(new LiveGzoneGiftMessageBarPresenter$d(this));
             if (uob != null) {
                this.X7(uob);
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneGiftMessageBarPresenter.class, "4")) {
          return;
       }
       LiveGzoneGiftMessageBarPresenter tp = this.p;
       if (tp == null) {
          a.S("mLiveLongConnection");
       }
       tp.o(886, this.B);
       this.V8().sendEmptyMessage(2);
       Iterator iterator = this.y.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          LiveGzoneGiftMessageBarPresenter tu = this.u;
          if (tu == null) {
             a.S("mILiveConfigurationService");
          }
          tu.Q0(uod);
          uod.e();
       }
       this.y.clear();
       tp = this.w;
       if (tp == null) {
          a.S("mSlidePlayService");
       }
       tp.d5(this.C);
       this.z = null;
       return;
    }
    public final LiveGzoneGiftMessageBarPresenter$a$a V8(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneGiftMessageBarPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.A.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneGiftMessageBarPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("LIVE_LONG_CONNECTION");
       a.o(obj, "inject\(LiveAccessIds.LIVE_LONG_CONNECTION\)");
       this.p = obj;
       obj = this.q8(h.class);
       a.o(obj, "inject\(LiveGzoneGiftPendantService::class.java\)");
       this.r = obj;
       obj = this.q8(v.class);
       a.o(obj, "inject\(LiveGzoneCommonPo¡­pShowService::class.java\)");
       this.s = obj;
       obj = this.q8(c.class);
       a.o(obj, "inject\(LiveGzoneComponen¡­ridgeService::class.java\)");
       this.t = obj;
       obj = this.r8("LIVE_CONFIGURATION_SERVICE");
       a.o(obj, "inject\(LiveAccessIds.LIVE_CONFIGURATION_SERVICE\)");
       this.u = obj;
       obj = this.r8("LIVE_BASIC_CONTEXT");
       a.o(obj, "inject\(LiveAccessIds.LIVE_BASIC_CONTEXT\)");
       this.v = obj;
       obj = this.r8("LIVE_SLIDE_PLAY_SERVICE");
       a.o(obj, "inject\(AccessIds.LIVE_SLIDE_PLAY_SERVICE\)");
       this.w = obj;
       this.x = this.s8(j.class);
       return;
    }
}
