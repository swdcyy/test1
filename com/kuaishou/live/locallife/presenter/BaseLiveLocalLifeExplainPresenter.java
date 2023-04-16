package com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter;
import a51.c;
import com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter$a;
import nsd.u;
import rq5.a;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter$c;
import com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter$b;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.LinkedHashSet;
import com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter$d;
import com.kuaishou.live.locallife.stat.LocalLifeStatLogger;
import com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter$f;
import com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter$mLocalLifeLiveExplainListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter$e;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import p91.m;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter$g;
import erd.g;
import com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter$h;
import kotlin.jvm.internal.a;
import tj3.k;
import tj3.e;
import java.lang.System;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import a87.c;
import aq5.d;
import fq5.b;
import java.util.Arrays;
import aq5.b;
import le1.a;
import lp3.c;
import lp3.i;
import le1.a$a;
import hf3.a;
import com.kuaishou.livestream.message.nano.SCLiveLocalLifeExplainCardSignal;
import lf3.g;
import mq5.h;
import mq5.b;
import com.kwai.feature.api.live.base.service.scenetype.LiveSceneType;
import gf3.a;
import java.lang.Integer;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import cf3.a;
import com.kuaishou.live.locallife.model.LocalLifeLiveExplainMessage;
import tkd.b;
import tkd.d;
import ju5.g;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.Boolean;
import ze3.b;
import com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter$mLocalLifeLiveExplainListener$2$a;
import ze3.a$a;
import ze3.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import z12.x;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import xe3.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.HashMap;
import com.kuaishou.live.locallife.model.LiveLocalLifeExplainCardPromotionStageInfo;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import xx5.d;
import java.lang.CharSequence;
import android.net.Uri;
import xkd.b;
import kp.r1;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import va1.s0;
import ekd.x0;
import gf3.b;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import android.content.Context;
import vq5.d;
import xh7.b;
import ff3.a;
import qh7.b;
import qh7.a;
import lr3.f;
import pq5.c;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.yxcorp.gifshow.util.rx.RxBus;
import by5.a;
import com.kuaishou.locallife.log.biz.LocalLifeLiveLogBiz;
import mr3.b;
import java.lang.Throwable;
import lr3.d;

public abstract class BaseLiveLocalLifeExplainPresenter extends c	// class@000c49
{
    public int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public final a[] F;
    public final a$a G;
    public final b H;
    public c I;
    public boolean J;
    public AtomicReference K;
    public ConcurrentLinkedQueue L;
    public LinkedHashSet M;
    public h N;
    public final LocalLifeStatLogger O;
    public a P;
    public boolean Q;
    public final BaseLiveLocalLifeExplainPresenter$f R;
    public final p S;
    public final a T;
    public m v;
    public e w;
    public a0 x;
    public d y;
    public i z;
    public static final BaseLiveLocalLifeExplainPresenter$a U;
    public static String sLivePresenterClassName;

    static {
       BaseLiveLocalLifeExplainPresenter.U = new BaseLiveLocalLifeExplainPresenter$a(null);
    }
    public void BaseLiveLocalLifeExplainPresenter(){
       super();
       this.C = a.g;
       a[] uoaArray = new a[]{AudienceBizRelation.CHAT,AudienceBizRelation.CHAT_AUDIO_STATUS_VIEW,AudienceBizRelation.CHAT_VIDEO_VIEW,AnchorBizRelation.CHAT_WITH_GUEST};
       this.F = uoaArray;
       this.G = new BaseLiveLocalLifeExplainPresenter$c(this);
       this.H = new BaseLiveLocalLifeExplainPresenter$b(this);
       this.K = new AtomicReference();
       this.L = new ConcurrentLinkedQueue();
       this.M = new LinkedHashSet();
       this.N = new BaseLiveLocalLifeExplainPresenter$d(this);
       this.O = new LocalLifeStatLogger();
       this.Q = true;
       this.R = new BaseLiveLocalLifeExplainPresenter$f(this);
       this.S = s.c(new BaseLiveLocalLifeExplainPresenter$mLocalLifeLiveExplainListener$2(this));
       this.T = new BaseLiveLocalLifeExplainPresenter$e(this);
    }
    private final void h9(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseLiveLocalLifeExplainPresenter.class, "16")) {
          return;
       }
       BaseLiveLocalLifeExplainPresenter tv = this.v;
       if (tv != null) {
          LiveStreamFeedWrapper liveStreamFe = tv.r5();
          if (liveStreamFe != null) {
             if (!liveStreamFe.isAd()) {
                liveStreamFe = null;
             }
             if (liveStreamFe != null) {
                j0 oj0 = i0.a().e(308, liveStreamFe.mEntity).d(new BaseLiveLocalLifeExplainPresenter$g(p0, p1));
                if (p1 == null) {
                   p1 = "";
                }
                oj0.q("merchant_item_type", p1).a();
             }
          }
       }
       return;
    }
    private final void j9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseLiveLocalLifeExplainPresenter.class, "15")) {
          return;
       }
       BaseLiveLocalLifeExplainPresenter tv = this.v;
       if (tv != null) {
          LiveStreamFeedWrapper liveStreamFe = tv.r5();
          if (liveStreamFe != null) {
             if (liveStreamFe.isAd()) {
                objArray = liveStreamFe;
             }
             if (objArray != null) {
                i0.a().e(282, objArray.mEntity).d(BaseLiveLocalLifeExplainPresenter$h.b).a();
             }
          }
       }
       return;
    }
    public void E8(){
       BaseLiveLocalLifeExplainPresenter tF;
       a uoa;
       a0 d2;
       LiveStreamFeedWrapper mEntity;
       String liveStreamId;
       long l;
       BaseLiveLocalLifeExplainPresenter uBaseLiveLoc = BaseLiveLocalLifeExplainPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uBaseLiveLoc, "21")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, uBaseLiveLoc, "25")) {
          this.O.role = (a.g(this.Y8(), "ANCHOR"))? "anchor": "audience";
          BaseLiveLocalLifeExplainPresenter tO = this.O;
          tF = this.v;
          if (tF != null) {
             liveStreamId = tF.getLiveStreamId();
             if (liveStreamId != null) {
             label_0040 :
                tO.liveStreamId = liveStreamId;
                tO = this.O;
                tO.messageType = "explainCard";
                tF = this.w;
                if (tF != null) {
                   k ok = tF.x();
                   if (ok != null) {
                      l = ok.M();
                   label_005b :
                      tO.enterLiveTime = l;
                   }
                }
                l = System.currentTimeMillis();
                goto label_005b ;
             }
          }
          liveStreamId = "";
          goto label_0040 ;
       }
       if (!PatchProxy.applyVoid(objArray, this, uBaseLiveLoc, "29")) {
          uBaseLiveLoc = this.x;
          if (uBaseLiveLoc != null) {
             d2 = uBaseLiveLoc.c;
             if (d2 != null) {
                mEntity = d2.mEntity;
             label_0072 :
                this.E = c.b(mEntity);
             }
          }
          mEntity = objArray;
          goto label_0072 ;
       }
       uBaseLiveLoc = this.v;
       if (uBaseLiveLoc != null) {
          d uod = uBaseLiveLoc.A0();
          if (uod != null) {
             tF = this.F;
             uod.u5(this.H, Arrays.copyOf(tF, tF.length));
          }
       }
       uBaseLiveLoc = this.z;
       if (uBaseLiveLoc != null) {
          uoa = uBaseLiveLoc.c(a.class);
          if (uoa != null) {
             uoa.Jc(this.G);
          }
       }
       uBaseLiveLoc = this.v;
       if (uBaseLiveLoc != null) {
          uoa = uBaseLiveLoc.u();
          if (uoa != null) {
             uoa.u0(1005, SCLiveLocalLifeExplainCardSignal.class, this.R);
          }
       }
       uBaseLiveLoc = this.x;
       if (uBaseLiveLoc != null) {
          d2 = uBaseLiveLoc.D2;
          if (d2 != null) {
             d2.Km(this.N);
          }
       }
       uBaseLiveLoc = this.O;
       uBaseLiveLoc.registerSignalTimePeriod = uBaseLiveLoc.calculatePeriodTime();
       uBaseLiveLoc = this.v;
       if (uBaseLiveLoc != null) {
          objArray = uBaseLiveLoc.u5();
       }
       ImmutableMap immutableMap = ImmutableMap.of("scene", Integer.valueOf(a.b(objArray)));
       a.o(immutableMap, "ImmutableMap.of\(\n       \x20\x02ntext?.sceneType\)\n      \)\x00");
       this.k9("ExplainCardLoad", immutableMap);
       return;
    }
    public void J8(){
       a uoa;
       if (PatchProxy.applyVoid(null, this, BaseLiveLocalLifeExplainPresenter.class, "22")) {
          return;
       }
       super.J8();
       this.b9();
       this.e9();
       BaseLiveLocalLifeExplainPresenter tv = this.v;
       if (tv != null) {
          d uod = tv.A0();
          if (uod != null) {
             BaseLiveLocalLifeExplainPresenter tF = this.F;
             uod.G5(this.H, Arrays.copyOf(tF, tF.length));
          }
       }
       tv = this.z;
       if (tv != null) {
          uoa = tv.c(a.class);
          if (uoa != null) {
             uoa.Nm(this.G);
          }
       }
       tv = this.v;
       if (tv != null) {
          uoa = tv.u();
          if (uoa != null) {
             uoa.o(1005, this.R);
          }
       }
       tv = this.x;
       if (tv != null) {
          a0 d2 = tv.D2;
          if (d2 != null) {
             d2.le(this.N);
          }
       }
       tv = this.O;
       tv.leaveLiveTimePeriod = tv.calculatePeriodTime();
       this.O.reportCustomLog();
       return;
    }
    public boolean S8(){
       return false;
    }
    public boolean V8(){
       return true;
    }
    public final void W8(){
       boolean b2;
       a uoa = a.class;
       BaseLiveLocalLifeExplainPresenter uBaseLiveLoc = BaseLiveLocalLifeExplainPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uBaseLiveLoc, "5")) {
          return;
       }
       LocalLifeLiveExplainMessage localLifeLiv = this.X8();
       if (localLifeLiv != null) {
          boolean b = true;
          this.Q = b;
          String str = this.m9(localLifeLiv);
          if (!PatchProxy.applyVoidOneRefs(str, objArray, uoa, "2") && str != null) {
             String str1 = (str.length() > 0)? 1: null;
             if (!str1) {
                str = objArray;
             }
             if (str != null) {
                g og = d.a(0x6ea0c3d0);
                if (og != null && og.rM(str)) {
                   og.t9(str, "TunaButton");
                }
             }
          }
       label_004c :
          if (!PatchProxy.applyVoid(objArray, this, uBaseLiveLoc, "19")) {
             boolean b1 = (this.v != null && a1.i(this.getActivity()))? true: false;
             if (b1 && !this.S8()) {
                LocalLifeLiveExplainMessage localLifeLiv1 = this.X8();
                if (localLifeLiv1 != null) {
                   BaseLiveLocalLifeExplainPresenter obj = PatchProxy.applyOneRefs(localLifeLiv1, objArray, uoa, "1");
                   if (obj != PatchProxyResult.class) {
                      b2 = obj.booleanValue();
                   }else if(!localLifeLiv1.getMSignalType()){
                      b = 0;
                   }
                   b2 = b;
                   if (b2) {
                      this.b9();
                      obj = this.v;
                      if (obj != null) {
                         objArray = obj.u5();
                      }
                      ImmutableMap immutableMap = ImmutableMap.of("scene", Integer.valueOf(a.b(objArray)));
                      a.o(immutableMap, "ImmutableMap.of\(\"scene\",\x20\x02mLiveContext?.sceneType\)\)\x00");
                      this.k9("ExplainCardHide", immutableMap);
                   }else if(this.J == null){
                      b uob = new b();
                      this.P = uob;
                      BaseLiveLocalLifeExplainPresenter tv = this.v;
                      a.m(tv);
                      Activity activity = this.getActivity();
                      a.m(activity);
                      a.o(activity, "activity!!");
                      BaseLiveLocalLifeExplainPresenter$mLocalLifeLiveExplainListener$2$a omLocalLifeL = PatchProxy.apply(objArray, this, uBaseLiveLoc, "6");
                      if (omLocalLifeL == PatchProxyResult.class) {
                         omLocalLifeL = this.S.getValue();
                      }
                      uob.c(tv, localLifeLiv1, activity, omLocalLifeL, this.A);
                   }else {
                      obj = this.P;
                      if (obj != null) {
                         obj.d(localLifeLiv1);
                      }
                   }
                }
             }
          }
       }
    label_00f2 :
       return;
    }
    public final LocalLifeLiveExplainMessage X8(){
       Object obj = PatchProxy.apply(null, this, BaseLiveLocalLifeExplainPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.K.get();
    }
    public abstract String Y8();
    public void Z8(LocalLifeLiveExplainMessage p0){
       LiveStreamFeedWrapper liveStreamFe1;
       BaseFeed obj3;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, BaseLiveLocalLifeExplainPresenter.class, "8")) {
          return;
       }
       String str = "explainMessage";
       a.p(obj1, str);
       BaseLiveLocalLifeExplainPresenter v = obj.v;
       ClientContent$LiveStreamPackage liveStreamPa = (v != null)? v.a(): null;
       e0 uoe0 = x.k(obj.v);
       if (uoe0 != null && liveStreamPa != null) {
          v = obj.x;
          FeedLogCtx uFeedLogCtx = (v != null)? v.c0(): 0;
          FeedLogCtx uFeedLogCtx1 = uFeedLogCtx;
          if (!PatchProxy.applyVoidFourRefs(p0, liveStreamPa, uoe0, uFeedLogCtx, null, d.class, "8")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LOCALLIFE_LIVE_EXPLAIN_CARD";
             HashMap hashMap = new HashMap();
             hashMap.put("business_id", a.a(p0));
             hashMap.put("card_type", a.b(p0));
             hashMap.put("compress_style", "NORMAL");
             hashMap.put("item_id", p0.getMProductId());
             hashMap.put("item_type", p0.getMSource());
             hashMap.put("campaign_type", String.valueOf(p0.getMPromotionTemplateId()));
             hashMap.put("campaign_id", String.valueOf(p0.getMPromotionId()));
             if (p0.getMPromotionStages() != null) {
                hashMap.put("campaign_status", String.valueOf(p0.getMPromotionStages()[(int)p0.getMPromotionStageIdx()].getMPromotionStatus()));
             }
             uElementPack.params = a.a.q(hashMap);
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
             tagPackage.params = TextUtils.I(p0.getMExtParams());
             uContentPack.tagPackage = tagPackage;
             u1.B(new ClickMetaData().setType(1).setLogPage(uoe0).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(uFeedLogCtx1));
          }
       }
    label_00f7 :
       if (!PatchProxy.applyVoidOneRefs(obj1, obj, BaseLiveLocalLifeExplainPresenter.class, "9")) {
          a.p(obj1, str);
          Activity activity = this.getActivity();
          if (activity != null) {
             a.o(activity, "activity ?: return");
             d uod = d.a(-734569516);
             if (uod != null) {
                String str1 = this.m9(p0);
                if (!TextUtils.x(str1)) {
                   BaseLiveLocalLifeExplainPresenter v1 = obj.v;
                   if (v1 != null) {
                      LiveStreamFeedWrapper liveStreamFe = v1.r5();
                      if (liveStreamFe != null) {
                         liveStreamFe = liveStreamFe.mEntity;
                      label_0134 :
                         String str2 = uod.tY(str1, liveStreamFe);
                         a.o(str2, "this");
                         str2 = a.a(str2, "liveGroupBuyJumpChannel", "LOCALLIFE_LIVE_EXPLAIN_CARD");
                         BaseLiveLocalLifeExplainPresenter v2 = obj.v;
                         if (v2 != null) {
                            liveStreamFe1 = v2.r5();
                            if (liveStreamFe1 != null) {
                               liveStreamFe1 = liveStreamFe1.mEntity;
                            label_0151 :
                               v1 = obj.v;
                               String liveStreamId = (v1 != null)? v1.getLiveStreamId(): null;
                               Uri obj2 = PatchProxy.applyThreeRefs(str2, liveStreamFe1, liveStreamId, null, a.class, "2");
                               String str3 = "1";
                               if (obj2 != PatchProxyResult.class) {
                                  str2 = obj2;
                               }else {
                                  a.p(str2, "scheme");
                                  obj2 = b.g(str2);
                                  if (!TextUtils.x(str2) && obj2 != null) {
                                     String queryParamet = obj2.getQueryParameter("url");
                                     if (!TextUtils.x(queryParamet)) {
                                        str1 = (liveStreamFe1 != null)? TextUtils.I(r1.I1(liveStreamFe1)): "";
                                        JsonObject jsonObject = new JsonObject();
                                        jsonObject.c0("clientExpTag", "0");
                                        jsonObject.c0("serverExpTag", str1);
                                        JsonArray jsonArray = new JsonArray();
                                        jsonArray.G(jsonObject);
                                        str1 = a.a.p(jsonArray);
                                        a.m(queryParamet);
                                        String str4 = "live_stream_id";
                                        if (!s0.e(queryParamet, str4) && !TextUtils.x(liveStreamId)) {
                                           a.m(liveStreamId);
                                           queryParamet = a.a(queryParamet, str4, liveStreamId);
                                        }
                                        a.o(str1, "appendJson");
                                        str2 = a.a(str2, "url", a.a(a.a(a.a(queryParamet, "exp_tag", str1), "localLifeJumpSource", "explainCardEntrance"), "localLifeIsFirstEnter", str3));
                                     }
                                  }
                               }
                               g og = d.a(0x6ea0c3d0);
                               if (og != null && og.rM(str2) == true) {
                                  obj.M.add(str2);
                               }else {
                                  str1 = x0.a(b.g(str2), "componentname");
                                  if (str1 != null) {
                                     b.b("local_life_exp_card_landing_type", str1);
                                     if (a.g(this.Y8(), "AUDIENCE")) {
                                        str1 = p0.getMBizId();
                                        if (!PatchProxy.applyVoidOneRefs(str1, obj, BaseLiveLocalLifeExplainPresenter.class, "27")) {
                                           obj3 = b.a(-404437045);
                                           a.o(obj3, "Singleton.get\(PhoneLevelUtils::class.java\)");
                                           if (!obj3.g()) {
                                              str3 = "0";
                                           }
                                           b.b("local_life_d_is_low_phone", str3);
                                           b.b("local_life_d_biz_id", str1);
                                           b.b("local_life_jump_channel", "LOCALLIFE_LIVE_EXPLAIN_CARD");
                                           b.a("local_life_c_explain_card_click");
                                        }
                                     }
                                  }
                               }
                               if (a1.i(activity) && !TextUtils.x(str2)) {
                                  if (c.a(str2)) {
                                     v2 = obj.y;
                                     if (v2 != null) {
                                        v2.r4(str2, activity);
                                     }
                                  }else {
                                     a.b(new b(activity, str2), new a(obj, str2));
                                  }
                                  f.a("BaseLiveLocalLifeExplainPresenter", str2, "explain click");
                               }
                            }
                         }
                         liveStreamFe1 = null;
                         goto label_0151 ;
                      }
                   }
                   obj3 = null;
                   goto label_0134 ;
                }
             }
          }
       }
       obj.h9(p0.getMProductId(), p0.getMSource());
       v = obj.v;
       LiveSceneType liveSceneTyp = (v != null)? v.u5(): null;
       ImmutableMap immutableMap = ImmutableMap.of("scene", Integer.valueOf(a.b(liveSceneTyp)));
       a.o(immutableMap, "ImmutableMap.of\(\"scene\",\x20\x02mLiveContext?.sceneType\)\)\x00");
       obj.k9("ExPlainCardClick", immutableMap);
       return;
    }
    public void a9(LocalLifeLiveExplainMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveLocalLifeExplainPresenter.class, "11")) {
          return;
       }
       a.p(p0, "explainMessage");
       BaseLiveLocalLifeExplainPresenter tv = this.v;
       FeedLogCtx uFeedLogCtx = null;
       ClientContent$LiveStreamPackage liveStreamPa = (tv != null)? tv.a(): uFeedLogCtx;
       e0 uoe0 = x.k(this.v);
       if (uoe0 != null && liveStreamPa != null) {
          BaseLiveLocalLifeExplainPresenter tx = this.x;
          if (tx != null) {
             uFeedLogCtx = tx.c0();
          }
          if (!PatchProxy.applyVoidFourRefs(p0, liveStreamPa, uoe0, uFeedLogCtx, null, d.class, "9")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LOCALLIFE_LIVE_EXPLAIN_CARD_CLOSE_BUTTON";
             HashMap hashMap = new HashMap();
             hashMap.put("business_id", a.a(p0));
             hashMap.put("card_type", a.b(p0));
             hashMap.put("item_id", p0.getMProductId());
             hashMap.put("item_type", p0.getMSource());
             uElementPack.params = a.a.q(hashMap);
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
             tagPackage.params = TextUtils.I(p0.getMExtParams());
             uContentPack.tagPackage = tagPackage;
             u1.B(new ClickMetaData().setType(1).setLogPage(uoe0).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(uFeedLogCtx));
          }
       }
    label_00ac :
       this.b9();
       return;
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, BaseLiveLocalLifeExplainPresenter.class, "24")) {
          return;
       }
       this.J = false;
       BaseLiveLocalLifeExplainPresenter tI = this.I;
       if (tI != null) {
          tI.g9(this.T);
       }
       tI = this.P;
       if (tI != null) {
          tI.destroy();
       }
       this.P = null;
       return;
    }
    public final void c9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseLiveLocalLifeExplainPresenter.class, "14")) {
          return;
       }
       if (this.Q == null) {
          return;
       }
       this.Q = false;
       this.j9();
       BaseLiveLocalLifeExplainPresenter tv = this.v;
       ClientContent$LiveStreamPackage liveStreamPa = (tv != null)? tv.a(): objArray;
       e0 uoe0 = x.k(this.v);
       LocalLifeLiveExplainMessage localLifeLiv = this.X8();
       if (uoe0 != null && liveStreamPa != null) {
          BaseLiveLocalLifeExplainPresenter tx = this.x;
          FeedLogCtx uFeedLogCtx = (tx != null)? tx.c0(): objArray;
          if (!PatchProxy.applyVoidFourRefs(localLifeLiv, liveStreamPa, uoe0, uFeedLogCtx, null, d.class, "7")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LOCALLIFE_LIVE_EXPLAIN_CARD";
             HashMap hashMap = new HashMap();
             hashMap.put("business_id", a.a(localLifeLiv));
             hashMap.put("card_type", a.b(localLifeLiv));
             hashMap.put("compress_style", "NORMAL");
             hashMap.put("item_id", localLifeLiv.getMProductId());
             hashMap.put("item_type", localLifeLiv.getMSource());
             hashMap.put("campaign_type", String.valueOf(localLifeLiv.getMPromotionTemplateId()));
             hashMap.put("campaign_id", String.valueOf(localLifeLiv.getMPromotionId()));
             if (localLifeLiv.getMPromotionStages() != null) {
                hashMap.put("campaign_status", String.valueOf(localLifeLiv.getMPromotionStages()[(int)localLifeLiv.getMPromotionStageIdx()].getMPromotionStatus()));
             }
             uElementPack.params = a.a.q(hashMap);
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
             tagPackage.params = TextUtils.I(localLifeLiv.getMExtParams());
             uContentPack.tagPackage = tagPackage;
             u1.B0(new ShowMetaData().setLogPage(uoe0).setType(10).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(uFeedLogCtx));
          }
          if (localLifeLiv != null && localLifeLiv.getMSignalType() == 1) {
             tv = this.v;
             if (tv != null) {
                objArray = tv.u5();
             }
             ImmutableMap immutableMap = ImmutableMap.of("scene", Integer.valueOf(a.b(objArray)));
             a.o(immutableMap, "ImmutableMap.of\(\"scene\",\x20\x02mLiveContext?.sceneType\)\)\x00");
             this.k9("ExplainCardShow", immutableMap);
          }
       }
    label_0123 :
       return;
    }
    public boolean d9(LocalLifeLiveExplainMessage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseLiveLocalLifeExplainPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "explainMessage");
       return false;
    }
    public final void e9(){
       if (PatchProxy.applyVoid(null, this, BaseLiveLocalLifeExplainPresenter.class, "3")) {
          return;
       }
       while (!this.L.isEmpty()) {
          Integer integer = this.L.poll();
          int i = (integer != null)? integer.intValue(): 0;
          RxBus.f.b(new a(i, 1));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, BaseLiveLocalLifeExplainPresenter.class, "20")) {
          return;
       }
       this.z = this.r8("LIVE_SERVICE_MANAGER");
       this.v = this.t8("LIVE_BASIC_CONTEXT");
       this.x = this.s8(a0.class);
       this.I = this.s8(c.class);
       this.y = this.t8("LIVE_ROUTER_SERVICE");
       this.w = this.t8("LIVE_LOG_REPORTER");
       return;
    }
    public final void k9(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseLiveLocalLifeExplainPresenter.class, "28")) {
          return;
       }
       if (this.E != null) {
          d.a("LOCAL_LIFE_LOG_STAT_EVENT", LocalLifeLiveLogBiz.LIVE_ROOM, "BaseLiveLocalLifeExplainPresenter", p0, p1, null, false, 2);
       }
       return;
    }
    public void l9(){
    }
    public abstract String m9(LocalLifeLiveExplainMessage p0);
    public final void n9(LocalLifeLiveExplainMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveLocalLifeExplainPresenter.class, "4")) {
          return;
       }
       if (p0 != null) {
          this.K.set(p0);
       }
       return;
    }
    public final void o9(boolean p0){
       BaseLiveLocalLifeExplainPresenter uBaseLiveLoc = BaseLiveLocalLifeExplainPresenter.class;
       if (PatchProxy.isSupport(uBaseLiveLoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBaseLiveLoc, "18")) {
          return;
       }
       if (p0) {
          this.C = this.B;
          BaseLiveLocalLifeExplainPresenter tP = this.P;
          if (tP != null && tP != null) {
             tP.a(this.A);
          }
       }else {
          this.C = a.g;
       }
       return;
    }
}
