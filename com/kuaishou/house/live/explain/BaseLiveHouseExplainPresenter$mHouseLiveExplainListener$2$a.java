package com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter$mHouseLiveExplainListener$2$a;
import vg0.c$a;
import com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter$mHouseLiveExplainListener$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter;
import com.kuaishou.live.house.model.HouseLiveExplainMessage;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import xx5.d;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import fq5.b;
import com.kwai.framework.model.feed.BaseFeed;
import og0.b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import sr5.a;
import ah0.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import fg6.a;
import java.util.HashMap;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import k2b.u1;
import oy.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Integer;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import fh0.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ju5.g;
import java.util.LinkedHashSet;
import lnc.a1;
import java.lang.CharSequence;
import android.content.Context;
import vq5.d;
import xh7.b;
import vg0.a;
import qh7.b;
import qh7.a;
import android.view.View;
import rq5.a;
import pq5.c;

public final class BaseLiveHouseExplainPresenter$mHouseLiveExplainListener$2$a implements c$a	// class@000783
{
    public final BaseLiveHouseExplainPresenter$mHouseLiveExplainListener$2 a;

    public void BaseLiveHouseExplainPresenter$mHouseLiveExplainListener$2$a(BaseLiveHouseExplainPresenter$mHouseLiveExplainListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseLiveHouseExplainPresenter$mHouseLiveExplainListener$2$a.class, "4")) {
          return;
       }
       BaseLiveHouseExplainPresenter$mHouseLiveExplainListener$2 this$0 = this.a.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoid(objArray, this$0, BaseLiveHouseExplainPresenter.class, "14")) {
          this$0.a9();
       }
       return;
    }
    public void b(HouseLiveExplainMessage p0){
       String str1;
       String str2;
       BaseLiveHouseExplainPresenter v;
       LiveStreamFeedWrapper liveStreamFe;
       Integer[] obj3;
       FeedLogCtx uFeedLogCtx4;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, BaseLiveHouseExplainPresenter$mHouseLiveExplainListener$2$a.class, "2")) {
          return;
       }
       String str = "explainMessage";
       a.p(obj1, str);
       BaseLiveHouseExplainPresenter$mHouseLiveExplainListener$2 this$0 = obj.a.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(obj1, this$0, BaseLiveHouseExplainPresenter.class, "8")) {
          a.p(obj1, str);
          BaseLiveHouseExplainPresenter obj2 = PatchProxy.applyOneRefs(obj1, this$0, BaseLiveHouseExplainPresenter.class, "9");
          FeedLogCtx uFeedLogCtx = null;
          if (obj2 != PatchProxyResult.class) {
             str1 = obj2;
          }else {
             String str3 = this$0.h9(obj1);
             d uod = d.a(-734569516);
             v = this$0.v;
             if (v != null) {
                liveStreamFe = v.r5();
                if (liveStreamFe != null) {
                   liveStreamFe = liveStreamFe.mEntity;
                label_0056 :
                   str = uod.tY(str3, liveStreamFe);
                   a.o(str, "routeUrlWithTunaParam");
                   v = this$0.v;
                   if (v != null) {
                      liveStreamFe = v.r5();
                      if (liveStreamFe != null) {
                         liveStreamFe = liveStreamFe.mEntity;
                      label_006d :
                         BaseLiveHouseExplainPresenter v1 = this$0.v;
                         String liveStreamId = (v1 != null)? v1.getLiveStreamId(): uFeedLogCtx;
                         str2 = b.a(str, liveStreamFe, liveStreamId);
                         if (a.g("ANCHOR", this$0.X8())) {
                            LiveLogTag lIVE_HOUSE = LiveLogTag.LIVE_HOUSE;
                            lIVE_HOUSE.appendTag("BaseLiveHouseExplainPresenter");
                            b.U(lIVE_HOUSE, "getExplainJumpUrl", "routeUrl", str3, "routeUrlWithTunaParam", str, "finalUrl", str2);
                         }
                         str1 = str2;
                      }
                   }
                   uFeedLogCtx4 = uFeedLogCtx;
                   goto label_006d ;
                }
             }
             uFeedLogCtx4 = uFeedLogCtx;
             goto label_0056 ;
          }
          obj2 = this$0.v;
          ClientContent$LiveStreamPackage liveStreamPa = (obj2 != null)? obj2.a(): uFeedLogCtx;
          obj2 = this$0.v;
          BaseFragment uBaseFragmen = (obj2 != null)? obj2.b(): uFeedLogCtx;
          if (uBaseFragmen != null && liveStreamPa != null) {
             obj2 = this$0.x;
             if (obj2 != null) {
                uFeedLogCtx = obj2.c0();
             }
             FeedLogCtx uFeedLogCtx1 = uFeedLogCtx;
             FeedLogCtx uFeedLogCtx2 = uFeedLogCtx1;
             FeedLogCtx uFeedLogCtx3 = uFeedLogCtx1;
             if (!PatchProxy.applyVoidFourRefs(p0, liveStreamPa, uBaseFragmen, uFeedLogCtx2, null, c.class, "11")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "HOUSE_EXPLAIN_CARD";
                uElementPack.params = a.a.q(c.b(p0));
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
                tagPackage.params = TextUtils.I(p0.getMExtParams());
                uContentPack.tagPackage = tagPackage;
                u1.B(new ClickMetaData().setType(1).setLogPage(uBaseFragmen).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(uFeedLogCtx3));
             }
          }
       label_0121 :
          a uoa = a.d();
          str2 = (a.g(this$0.X8(), "ANCHOR"))? "anchor": "audience";
          uoa.c0(str2);
          v = this$0.v;
          if (v != null) {
             liveStreamFe = v.r5();
             if (liveStreamFe != null) {
                liveStreamFe = liveStreamFe.mEntity;
                if (liveStreamFe != null) {
                   LiveStreamFeed mTypeViewLis = liveStreamFe.mTypeViewList;
                   if (mTypeViewLis != null) {
                   label_014d :
                      uoa.S(mTypeViewLis);
                      uoa.T("explainCard");
                      v = this$0.v;
                      if (v != null) {
                         str2 = v.getLiveStreamId();
                         if (str2 != null) {
                         label_0162 :
                            uoa.R(str2);
                            uoa.B(c.b(p0));
                            uoa.M(str1);
                            uoa.r();
                            if (a.g(this$0.X8(), "AUDIENCE")) {
                               str = p0.getMBizId();
                               if (!PatchProxy.applyVoidOneRefs(str, this$0, BaseLiveHouseExplainPresenter.class, "31")) {
                                  obj3 = b.a(-404437045);
                                  a.o(obj3, "Singleton.get\(PhoneLevelUtils::class.java\)");
                                  str2 = (obj3.g())? "1": "0";
                                  a.b("house_d_is_low_phone", str2);
                                  a.b("house_d_biz_id", str);
                                  a.b("house_jump_source", "explainCardEntrance");
                                  a.b("house_is_first_enter", "1");
                                  a.a("house_c_explain_card_click");
                               }
                            }
                            if (!PatchProxy.applyVoidOneRefs(str1, this$0, BaseLiveHouseExplainPresenter.class, "10")) {
                               a.p(str1, "jumpUrl");
                               Activity activity = this$0.getActivity();
                               if (activity != null) {
                                  a.o(activity, "activity ?: return");
                                  g og = d.a(0x6ea0c3d0);
                                  if (og != null && og.rM(str1) == true) {
                                     this$0.M.add(str1);
                                  }
                                  if (a1.i(activity) && !TextUtils.x(str1)) {
                                     if (b.d(str1)) {
                                        v = this$0.z;
                                        if (v != null) {
                                           v.r4(str1, activity);
                                        }
                                     }else {
                                        a.b(new b(activity, str1), new a(this$0, str1));
                                     }
                                  }
                               }
                            }
                         label_0216 :
                            this$0.d9(p0.getMProductId(), p0.getMSource());
                         }
                      }
                      str2 = "";
                      goto label_0162 ;
                   }
                }
             }
          }
          obj3 = new Integer[0];
          goto label_014d ;
       }
       return;
    }
    public void c(HouseLiveExplainMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveHouseExplainPresenter$mHouseLiveExplainListener$2$a.class, "3")) {
          return;
       }
       a.p(p0, "explainMessage");
       this.a.this$0.Y8(p0);
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveHouseExplainPresenter$mHouseLiveExplainListener$2$a.class, "1")) {
          return;
       }
       BaseLiveHouseExplainPresenter$mHouseLiveExplainListener$2 this$0 = this.a.this$0;
       if (this$0.J == null) {
          BaseLiveHouseExplainPresenter i = this$0.I;
          if (i != null) {
             i.eo(this$0.U);
          }
       }
       return;
    }
}
