package com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2$a;
import qp3.a$a;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.tuna.model.TunaLiveExplainMessage;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import k2b.e0;
import z12.x;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import op3.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.HashMap;
import java.util.Map;
import tp3.a;
import tkd.b;
import tkd.d;
import xx5.d;
import com.kwai.framework.model.feed.BaseFeed;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import nl9.r;
import android.app.Activity;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import java.util.List;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$handleRoute$1;
import msd.a;
import c15.b;
import ju5.g;
import java.util.LinkedHashSet;
import lnc.a1;
import java.lang.CharSequence;
import vq5.d;
import com.kuaishou.live.tuna.util.LiveTunaUtils;
import xh7.b;
import aq3.a;
import qh7.b;
import qh7.a;
import xx5.a;
import java.lang.Integer;
import java.util.concurrent.ConcurrentLinkedQueue;
import android.view.View;
import rq5.a;
import pq5.c;

public final class BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2$a implements a$a	// class@000fca
{
    public final BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2 a;

    public void BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2$a(BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2$a.class, "4")) {
          return;
       }
       BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2 this$0 = this.a.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoid(objArray, this$0, BaseLiveTunaExplainPresenter.class, "11")) {
          this$0.Z8();
       }
       this.a.this$0.getContext();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2$a.class, "6")) {
          return;
       }
       this.a.this$0.X8(null, false, false);
       return;
    }
    public void c(TunaLiveExplainMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2$a.class, "3")) {
          return;
       }
       a.p(p0, "explainMessage");
       this.a.this$0.X8(p0, true, true);
       return;
    }
    public void d(TunaLiveExplainMessage p0){
       LiveStreamFeedWrapper liveStreamFe;
       LiveStreamFeedWrapper liveStreamFe1;
       LiveStreamFeedWrapper liveStreamFe2;
       LiveStreamFeedWrapper liveStreamFe3;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2$a.class, "2")) {
          return;
       }
       a.p(obj1, "explainMessage");
       BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2 this$0 = obj.a.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(obj1, this$0, BaseLiveTunaExplainPresenter.class, "6")) {
          a.p(obj1, "explainMessage");
          BaseLiveTunaExplainPresenter v = this$0.v;
          ClientContent$LiveStreamPackage liveStreamPa = (v != null)? v.a(): null;
          e0 uoe0 = x.k(this$0.v);
          if (uoe0 != null && liveStreamPa != null) {
             v = this$0.v;
             if (v != null) {
                liveStreamFe = v.r5();
                if (liveStreamFe != null) {
                   liveStreamFe1 = liveStreamFe.mEntity;
                label_0051 :
                   liveStreamFe2 = liveStreamFe1;
                   if (!PatchProxy.applyVoidFourRefs(p0, liveStreamPa, liveStreamFe1, uoe0, null, a.class, "9")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "LIVE_EXPLAIN_CARD";
                      HashMap hashMap = new HashMap();
                      a.a(hashMap, obj1);
                      d.a(-734569516).hb(hashMap, liveStreamFe2);
                      uElementPack.params = a.a.q(hashMap);
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.liveStreamPackage = liveStreamPa;
                      ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
                      if (obj1 != null) {
                         tagPackage.params = TextUtils.I(p0.getMExtParams());
                      }
                      uContentPack.tagPackage = tagPackage;
                      ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
                      uClickEvent.contentPackage = uContentPack;
                      uClickEvent.elementPackage = uElementPack;
                      h oh = b.a(0x4b316083);
                      if (oh != null) {
                         oh.B("3732372", uClickEvent, uoe0);
                      }
                   }
                }
             }
             liveStreamFe1 = 0;
             goto label_0051 ;
          }
       label_00ba :
          v = this$0.v;
          if (v != null) {
             liveStreamFe = v.r5();
             if (liveStreamFe != null) {
                liveStreamFe = liveStreamFe.mEntity;
             label_00c8 :
                if (liveStreamFe != null) {
                   b uob = d.a(0x691527a8);
                   v = this$0.v;
                   if (v != null) {
                      liveStreamFe = v.r5();
                      if (liveStreamFe != null) {
                         liveStreamFe3 = liveStreamFe.mEntity;
                      label_00e3 :
                         uob.ck(liveStreamFe3, 1, 0, 3, 1);
                      }
                   }
                   liveStreamFe3 = null;
                   goto label_00e3 ;
                }
                if (!PatchProxy.applyVoidOneRefs(obj1, this$0, BaseLiveTunaExplainPresenter.class, "7")) {
                   a.p(obj1, "explainMessage");
                   Activity activity = this$0.getActivity();
                   if (activity != null) {
                      a.o(activity, "activity ?: return");
                      d uod = d.a(-734569516);
                      if (uod != null) {
                         String mActionUrl = p0.getMActionUrl();
                         BaseLiveTunaExplainPresenter v1 = this$0.v;
                         if (v1 != null) {
                            LiveStreamFeedWrapper liveStreamFe4 = v1.r5();
                            if (liveStreamFe4 != null) {
                               liveStreamFe2 = liveStreamFe4.mEntity;
                            label_011c :
                               String str = uod.tY(mActionUrl, liveStreamFe2);
                               b.f(KsgLogTunaLiveTag.EXPLAIN_CARD.appendTag("BaseLiveTunaExplainPresenter"), new BaseLiveTunaExplainPresenter$handleRoute$1(this$0, str));
                               g og = d.a(0x6ea0c3d0);
                               if (og != null && og.rM(str) == true) {
                                  this$0.D.add(str);
                               }
                               if (a1.i(activity) && !TextUtils.x(str)) {
                                  a.o(str, "scheme");
                                  if (LiveTunaUtils.c(str, activity, this$0.y, KsgLogTunaLiveTag.ANCHOR_TASK_BUTTON) ^ 1) {
                                     a.b(new b(activity, str), new a(this$0, str));
                                  }
                               }
                            }
                         }
                         BaseFeed uBaseFeed = null;
                         goto label_011c ;
                      }
                   }
                }
             }
          }
          liveStreamFe = null;
          goto label_00c8 ;
       }
    label_0170 :
       return;
    }
    public void e(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2$a.class, "5")) {
          return;
       }
       a.p(p0, "scheme");
       g og = d.a(0x6ea0c3d0);
       int i = 1;
       if (og != null && og.rM(p0) == i) {
          this.a.this$0.D.add(p0);
       }else {
          a uoa = d.a(0x17b84847);
          if (p1 != null && !p1.isEmpty()) {
             i = 0;
          }
          if (!i) {
             int i1 = (int)uoa.t20(p1);
             if (uoa.IU(i1)) {
                this.a.this$0.C.offer(Integer.valueOf(i1));
             }
          }
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2$a.class, "7")) {
          return;
       }
       this.a.this$0.X8(null, false, true);
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2$a.class, "1")) {
          return;
       }
       BaseLiveTunaExplainPresenter$mTunaLiveExplainListener$2 this$0 = this.a.this$0;
       if (this$0.A == null) {
          BaseLiveTunaExplainPresenter z = this$0.z;
          if (z != null) {
             z.eo(this$0.J);
          }
          this.a.this$0.getContext();
          BaseLiveTunaExplainPresenter f = this.a.this$0.F;
       }
       return;
    }
}
