package com.kuaishou.live.core.show.share.f;
import im8.g;
import a51.c;
import pj2.u;
import vj2.a;
import java.util.HashSet;
import com.kuaishou.live.core.show.share.f$a;
import qj2.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qj2.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vj2.e;
import com.kuaishou.live.common.core.component.share.LiveShareSubBiz$AudienceSubBiz;
import vj2.d;
import com.kuaishou.live.common.core.component.share.LiveShareSubBiz;
import sx1.i;
import vj2.c;
import x61.c;
import lp3.c;
import lp3.i;
import qj2.y;
import p91.m;
import android.view.View$OnClickListener;
import u32.h;
import pj2.v;
import vq5.b;
import vq5.d;
import ry1.b;
import brd.t;
import brd.x;
import pj2.w;
import erd.g;
import crd.b;
import com.kuaishou.live.core.show.share.e;
import ekd.k1;
import java.util.Objects;
import u32.h$a;
import java.lang.Integer;
import java.lang.Boolean;
import com.google.gson.JsonObject;
import java.lang.Number;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import wd3.a;
import k2b.e0;
import z12.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RedPackPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveSharePackage;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import pj2.c0;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.utility.TextUtils;
import k2b.u1;
import gw1.a;
import jv1.b;
import d61.y;
import oq5.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.lang.CharSequence;
import co2.f2;
import co2.i0;
import op2.f;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import com.yxcorp.gifshow.share.OperationModel;
import com.kuaishou.live.core.show.share.d;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import msd.l;
import com.yxcorp.gifshow.share.OperationModel$d;
import com.yxcorp.gifshow.share.KwaiOperator;
import com.yxcorp.gifshow.share.KwaiOperator$Style;
import java.util.List;
import java.util.Collections;
import mhc.o0;
import pj2.t;
import com.kwai.framework.model.feed.BaseFeed;
import zic.a;
import com.kwai.sharelib.a;
import sx1.h;
import tj2.a;
import sj2.s;
import java.util.Collection;
import com.yxcorp.gifshow.util.o;
import com.kuaishou.live.core.show.share.f$b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import pj2.d0;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import pj2.r;
import msd.a;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$Companion;
import djc.y0;
import gic.l;
import pj2.n;
import gic.o;
import gic.f;
import mhc.n1;
import gic.n;
import com.yxcorp.gifshow.share.KsShareBuilder;
import com.kwai.feature.api.social.login.model.LoginParams;
import mhc.o2;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import pj2.p;
import lnc.c3$a;
import lnc.c3;
import com.kwai.feature.api.social.message.imshare.model.SharePosInfo;
import pj2.o;
import uo7.l;
import d61.e0;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.gson.JsonElement;
import uo7.q;
import com.kuaishou.live.core.show.share.e$a;
import mhc.p;
import uo7.b0;
import uo7.d;
import brd.a0;
import pj2.q;
import io.reactivex.i;
import uo7.k;
import uo7.u;
import uo7.h;
import com.yxcorp.gifshow.share.operation.b;
import uo7.f0;
import oic.q;
import mhc.c0;
import pj2.e0;
import y92.f;
import gq5.f;
import com.kuaishou.live.core.show.share.h;

public class f extends c implements g	// class@001014
{
    public d A;
    public h B;
    public Map C;
    public final View$OnClickListener D;
    public final a E;
    public final Set F;
    public f$b G;
    public e v;
    public y w;
    public i x;
    public a0 y;
    public m z;
    public static String sLivePresenterClassName = "LiveAudienceSharePresenter";

    public void f(){
       super();
       this.D = new u(this);
       this.E = new a();
       this.F = new HashSet();
       this.G = new f$a(this);
       this.U7(new j());
       this.U7(new s());
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "2")) {
          return;
       }
       super.E8();
       f tE = this.E;
       if (!PatchProxy.applyVoidTwoRefs(tE, this.y, objArray, e.class, "1")) {
          tE.d(LiveShareSubBiz$AudienceSubBiz.NORMAL_LIVE, d.a);
          tE.d(LiveShareSubBiz$AudienceSubBiz.MUSIC_STATION_LIVE, c.a);
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "5")) {
          this.w = new y(this.x.a(c.class), this.D, this.B, this.z.d());
       }
       this.A.t5("sharepanel", new v(this));
       this.x.a(b.class).T3().compose(this.P8()).subscribe(new w(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, f.class, "12")) {
          return;
       }
       super.H8();
       f tv = this.v;
       if (tv != null) {
          tv.g = null;
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "11")) {
          return;
       }
       super.J8();
       this.E.a();
       k1.n(this);
       this.A.Z4("sharepanel");
       f tw = this.w;
       if (tw != null) {
          Objects.requireNonNull(tw);
          if (!PatchProxy.applyVoid(objArray, tw, y.class, "7")) {
             tw.g = 0;
             if (tw.e != null) {
                tw.e = false;
                tw.a();
             }
             if (tw.f != null) {
                tw.f = false;
                tw.b();
             }
             tw.a.O0(1013);
             tw.i.a(tw.k);
             tw.h = false;
          }
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, f.class, "9")) {
          return;
       }
       this.V8(0, 0);
       return;
    }
    public final void V8(int p0,boolean p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uof, "10")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       if (p0) {
          jsonObject.a0("share_button_location", Integer.valueOf(p0));
       }
       if (p1) {
          f tw = this.w;
          if (tw != null) {
             jsonObject.a0("guide_type", Integer.valueOf(tw.g));
          }
       }
       a0 a1 = this.y.a1;
       ClientContentWrapper$LiveVoicePartyPackage liveVoicePar = (a1 != null)? a1.B(): null;
       this.y.B.onShareLive(x.k(this.z), this.y.Z2.a(), jsonObject, null, liveVoicePar, null);
       return;
    }
    public void W8(c0 p0){
       e a;
       LiveStreamFeedWrapper obj2;
       String str2;
       Map$Entry uEntry;
       e e;
       String obj = this;
       c0 uoc0 = p0;
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(uoc0, obj, uof, "8")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       Object[] objArray = null;
       Object[] objArray1 = 1;
       if (!PatchProxy.applyVoid(objArray, obj, uof, "13")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 1567;
          uElementPack.name = obj.y.c.getLiveStreamId();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$LiveStreamPackage liveStreamPa = obj.z.a();
          uContentPack.liveStreamPackage = liveStreamPa;
          liveStreamPa.identity = TextUtils.k(obj.z.getLiveStreamId());
          uContentPack.liveStreamPackage.name = TextUtils.k(obj.z.d());
          u1.u(objArray1, uElementPack, uContentPack);
       }
       int b = (a.c())? obj.y.x.H2(): y.d(this.getActivity());
       if (b) {
          a0 p1 = obj.y.p1;
          if (p1 != null && !p1.d()) {
             return;
          }
       }
       Activity uActivity = this.getActivity();
       if (uActivity == null) {
          return;
       }else if(uoc0 == null){
          uoc0 = new c0();
       }
       String obj1 = uoc0;
       LiveUserStatusResponse liveUserStat = obj.y.b3.D1();
       if (liveUserStat != null && !TextUtils.x(liveUserStat.mSpecifiedSubBiz)) {
          obj1.r(liveUserStat.mSpecifiedSubBiz);
       }
       String str = "14";
       Object[] objArray2 = PatchProxy.apply(objArray, obj, uof, str);
       b = false;
       if (objArray2 != PatchProxyResult.class) {
       }else {
          a0 a1 = obj.y.a1;
          if (a1 != null) {
             f2 uof2 = a1.r0();
             if (uof2 != null && uof2.h() == 4) {
                uof = uof2.k();
                if (uof != null) {
                   String str5 = uof.f();
                   if (!TextUtils.x(str5)) {
                      Context context = this.getContext();
                      if (context != null) {
                         Object[] objArray4 = new Object[objArray1];
                         objArray4[b] = str5;
                         str5 = context.getString(R.string.arg_RES_7f104c9f, objArray4);
                      }
                   }
                }
             }
          }
          objArray2 = objArray;
       }
       obj1.j(objArray2);
       HashMap hashMap = new HashMap();
       hashMap.put("shareScene", "share_button");
       obj1.n(hashMap);
       e uoe = new e(uActivity, obj.y, obj1, obj.E, obj.F);
       obj.v = hashMap;
       Objects.requireNonNull(hashMap);
       if (!PatchProxy.applyVoid(objArray, hashMap, e.class, "1")) {
          LiveStreamFeedWrapper mEntity = hashMap.b.c.mEntity;
          OperationModel operationMod = PatchProxy.applyOneRefs(mEntity, hashMap, e.class, "7");
          if (operationMod != PatchProxyResult.class) {
          }else {
             operationMod = OperationModel.C.a(new d(hashMap, mEntity));
          }
          a = hashMap.a;
          obj1 = "9";
          KwaiOperator kwaiOperator = PatchProxy.applyTwoRefsWithListener(a, operationMod, hashMap, e.class, obj1);
          if (kwaiOperator != PatchProxyResult.class) {
          }else {
             kwaiOperator = new KwaiOperator(a, operationMod, KwaiOperator$Style.SECTION_LIGHT_REFACTOR, Collections.emptyList());
             PatchProxy.onMethodExit(e.class, obj1);
          }
          mEntity = hashMap.b.c.mEntity;
          o0 oo0 = PatchProxy.applyOneRefs(mEntity, hashMap, e.class, "10");
          if (oo0 != PatchProxyResult.class) {
          }else {
             oo0 = a.b(mEntity, new t(hashMap, objArray));
          }
          kwaiOperator.m(oo0);
          a uoa = PatchProxy.applyTwoRefs(operationMod, kwaiOperator, hashMap, e.class, "2");
          if (uoa != PatchProxyResult.class) {
             objArray1 = objArray;
          }else {
             h oh = new h(objArray1, kwaiOperator, hashMap.b.c.isWishLive());
             Map map = new a(hashMap.b, operationMod).a();
             hashMap.g = new s(hashMap.b, hashMap.d, hashMap.f);
             Collection uCollection = o.c(map, b);
             if (!TextUtils.x(hashMap.d.g())) {
                str2 = hashMap.d.g();
             }else {
                e = hashMap.e;
                Objects.requireNonNull(e);
                LiveShareSubBiz$AudienceSubBiz[] obj3 = PatchProxy.apply(objArray, e, a.class, "4");
                if (obj3 != PatchProxyResult.class) {
                   str2 = obj3;
                }else {
                   obj3 = LiveShareSubBiz$AudienceSubBiz.values();
                   int len = obj3.length;
                   while (true) {
                      if (b < len) {
                         object oobject = obj3[b];
                         if (e.c(oobject)) {
                            e.f();
                            str2 = oobject.getValue();
                         }else {
                            b = b + 1;
                            oobject = 1;
                         }
                      }else {
                         e.f();
                         str2 = LiveShareSubBiz$AudienceSubBiz.NORMAL_LIVE.getValue();
                      }
                   }
                }
             }
             String str3 = hashMap.b.o1.z4(str2);
             String str4 = TextUtils.i(str3, str2);
             b.e0(LiveLogTag.LIVE_SHARE, "getShareSubBiz", "subBiz", str4, "serverSubBiz", str3, "localSubBiz", str2);
             Object[] objArray3 = (hashMap.c(str4))? objArray: d0.c(hashMap.b);
             objArray1 = (hashMap.c(str4))? objArray: d0.c(hashMap.b);
             JsonObject jsonObject = hashMap.b(objArray3);
             ForwardGridSectionFragment uForwardGrid = ForwardGridSectionFragment.W0.c(hashMap.a, new r(new ForwardGridSectionWithImPanelFragment()));
             ForwardGridSectionFragment uForwardGrid1 = (uForwardGrid instanceof y0)? uForwardGrid: null;
             Map map1 = map;
             h oh1 = oh;
             l ol = new l(new n(hashMap), hashMap.g, new o(), uForwardGrid1);
             ol.k(hashMap.d.b());
             KsShareBuilder ksShareBuild = new KsShareBuilder(hashMap.a, str4, hashMap.b.c.mEntity.getId(), o2.d(operationMod.i(), 37), uForwardGrid);
             KsShareBuilder ksShareBuild1 = uForwardGrid1.s(uCollection);
             ArrayList uArrayList = PatchProxy.apply(null, hashMap, e.class, "16");
             if (uArrayList != PatchProxyResult.class) {
             }else {
                uArrayList = Lists.b();
             }
             ksShareBuild1 = ksShareBuild1.u(uArrayList);
             Objects.requireNonNull(ksShareBuild1);
             c3.c(kwaiOperator.f(), new p(ksShareBuild1));
             c3.c(kwaiOperator.k(), new o(ksShareBuild1));
             KsShareBuilder ksShareBuild2 = ksShareBuild1.o("LIVESTREAM_OTHER").l(jsonObject);
             jsonObject = PatchProxy.applyOneRefs(objArray1, hashMap, e.class, "12");
             if (jsonObject != PatchProxyResult.class) {
             }else {
                jsonObject = hashMap.b(objArray1);
                if (jsonObject == null) {
                   jsonObject = new JsonObject();
                }
                JsonObject jsonObject1 = new JsonObject();
                jsonObject1.c0("serverExpTag", x.q(hashMap.b));
                jsonObject1.c0("expTagList", e0.b());
                map = hashMap.d.d();
                if (map != null) {
                   Iterator iterator1 = map.entrySet().iterator();
                   while (iterator1.hasNext()) {
                      Map$Entry uEntry1 = iterator1.next();
                      String key = uEntry1.getKey();
                      jsonObject1.c0(key, uEntry1.getValue());
                   }
                }
                jsonObject.G("logExt", jsonObject1);
                c0 h = hashMap.d.h;
                if (h != null) {
                   Iterator iterator2 = h.entrySet().iterator();
                   while (iterator2.hasNext()) {
                      uEntry = iterator2.next();
                      obj1 = uEntry.getKey();
                      jsonObject.c0(obj1, uEntry.getValue());
                   }
                }
             }
             ksShareBuild2 = ksShareBuild2.e(jsonObject);
             objArray1 = null;
             jsonObject = PatchProxy.apply(objArray1, hashMap, e.class, "6");
             if (jsonObject != PatchProxyResult.class) {
             }else {
                jsonObject = new JsonObject();
                hashMap.a(jsonObject);
                if (!PatchProxy.applyVoidOneRefs(jsonObject, hashMap, e.class, str)) {
                   uoc0 = hashMap.d.i;
                   if (uoc0 != null) {
                      Iterator iterator = uoc0.entrySet().iterator();
                      while (iterator.hasNext()) {
                         uEntry = iterator.next();
                         obj1 = uEntry.getKey();
                         jsonObject.c0(obj1, uEntry.getValue());
                      }
                   }
                }
             }
             ksShareBuild2.h(jsonObject);
             obj2 = hashMap.b.c.mEntity;
             e$a uoa1 = PatchProxy.applyTwoRefs(obj2, str4, hashMap, e.class, "18");
             if (uoa1 != PatchProxyResult.class) {
             }else {
                uoa1 = new e$a(obj2, str4, hashMap.g);
             }
             ksShareBuild2.n(uoa1).g(new p(operationMod.i())).f(oh1).p("LIVE_STREAM");
             a0 uoa0 = PatchProxy.applyOneRefs(ol, hashMap, e.class, "3");
             if (uoa0 != PatchProxyResult.class) {
             }else {
                uoa0 = a0.k(new q(hashMap, ol));
             }
             ksShareBuild1.x(uoa0);
             uoa = new a(ksShareBuild1.a(), hashMap.g).j(ol).f("save", new b(hashMap.a)).f("im", ol).f("copyLink", new q()).f("h5", new c0()).f("launchWechatMiniProgram", new e0(hashMap.b, hashMap.d)).g(map1);
          }
          obj = hashMap.d.a();
          if (!TextUtils.x(obj)) {
             obj2 = PatchProxy.applyOneRefs(obj, hashMap, e.class, "17");
             if (obj2 != PatchProxyResult.class) {
                objArray = obj2;
             }else if(TextUtils.x(obj)){
                objArray = objArray1;
             }else {
                String str1 = o2.a(true, obj);
             }
             Objects.requireNonNull(uoa);
             c3.c(objArray, new f(uoa));
          }else {
             uoa.l();
          }
       }
       this.y.g2.t();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new h());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.y = this.q8(a0.class);
       this.z = this.r8("LIVE_BASIC_CONTEXT");
       this.A = this.r8("LIVE_ROUTER_SERVICE");
       this.x = this.r8("LIVE_SERVICE_MANAGER");
       this.B = this.q8(h.class);
       return;
    }
}
