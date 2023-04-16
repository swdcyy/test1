package com.kuaishou.merchant.live.g;
import fs3.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import m24.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import o24.f;
import o24.a;
import java.lang.Integer;
import w04.i;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import c24.a0;
import com.kuaishou.merchant.live.basic.sharetoken.b;
import v14.l;
import v14.h;
import l14.h;
import com.kuaishou.merchant.live.basic.container.a;
import h14.a;
import t14.a;
import e24.c;
import m14.a;
import c24.x;
import h24.b0;
import x04.f;
import v24.k;
import v24.d;
import com.kuaishou.merchant.live.pendant.rightsguarantee.v2.LiveDynamicRightsGuaranteePendantPresenter;
import com.kuaishou.merchant.live.pendant.rightsguarantee.v2.LiveDynamicRightsGuaranteePendantPresenter$a;
import f74.e;
import d74.l;
import y14.c;
import y64.n;
import m74.a;
import h24.d;
import m24.f2;
import m24.v;
import m24.l0;
import m24.o1;
import brd.t;
import com.kuaishou.merchant.live.marketing.sandeago.o;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.merchant.api.live.sandeabiz.model.SandeagoDynamicSwitchConfig;
import java.lang.reflect.Type;
import java.util.List;
import java.util.ArrayList;
import w64.d;
import o24.s;
import com.kuaishou.merchant.api.live.sandeabiz.SandeaBizType;
import tkd.b;
import tkd.d;
import ss3.a;
import ts3.b;
import m64.b;
import ps3.b;
import q14.s;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.api.core.model.Commodity;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import erd.g;
import us3.f;
import crd.b;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import n3d.a;
import ot3.b0;
import crd.c;
import com.kuaishou.merchant.api.core.model.Commodity$ExtraInfo;
import android.content.DialogInterface$OnShowListener;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.fragment.app.c;
import android.app.Activity;
import com.kuaishou.merchant.basic.util.f;
import w04.g;
import m64.g;
import v14.a0;
import v14.w;
import e74.d;
import r64.a;
import com.kuaishou.merchant.live.basic.router.c;
import w14.f;
import qv3.f;
import java.util.Collection;
import qs3.a;
import rs3.a;
import android.view.View;
import ekd.m1;
import com.kuaishou.merchant.live.bottombar.view.LiveMerchantAudienceBottomBarView;
import y04.d;
import y04.c;
import com.kuaishou.merchant.live.e;
import com.kuaishou.merchant.live.f;
import o24.w;
import g24.a;
import m64.e;
import qv3.a;
import s64.a;
import s64.a$a;
import fs3.a;
import z54.a;
import e74.a;
import c64.a;
import r14.j;
import r14.j$a;
import android.os.SystemClock;
import com.kwai.framework.model.user.UserInfo;
import m64.a;
import java.util.Map;
import hs3.c;
import com.kuaishou.merchant.api.core.model.MerchantInfo;
import android.net.Uri;
import xkd.b;
import com.kwai.framework.model.user.QCurrentUser;
import android.net.Uri$Builder;
import com.kuaishou.merchant.live.g$a;
import com.kuaishou.merchant.router.RouterConfig;
import com.kuaishou.merchant.router.b;
import com.kuaishou.merchant.live.subscribe.LiveSubscribePresenter;
import java.util.HashMap;
import android.util.Pair;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$ScatterPriority;
import com.kuaishou.merchant.live.lite.LiveMerchantLiteRouterPresenter;
import com.kuaishou.merchant.live.lite.LiveMerchantLiteSignalPresenter;
import com.kuaishou.merchant.live.lite.sidebar.LiveMerchantLiteSideBarPresenter;
import com.kuaishou.merchant.live.lite.bottombar.LiveMerchantLiteBottomBarPresenter;
import com.kuaishou.merchant.live.lite.interpretation.LiveMerchantLiteInterpretationPresenter;
import com.kuaishou.merchant.cover.lite.LiteMerchantCoverPresenter;
import com.kuaishou.merchant.api.live.dac.DACScene;
import androidx.fragment.app.KwaiDialogFragment;
import gt3.e;
import y54.a;
import ps3.a;
import n74.a;
import h24.s;
import h24.o;
import java.lang.Long;
import o63.j;
import g14.b;
import com.kuaishou.merchant.live.p;
import com.kuaishou.merchant.live.q;
import com.kuaishou.merchant.live.r;
import com.kuaishou.merchant.live.s;
import com.kuaishou.merchant.live.t;
import com.kuaishou.merchant.live.u;
import com.kuaishou.merchant.live.v;
import com.kuaishou.merchant.live.w;
import com.kuaishou.merchant.live.x;
import com.kuaishou.merchant.live.h;
import com.kuaishou.merchant.live.i;
import w04.f;
import com.kuaishou.merchant.live.j;
import com.kuaishou.merchant.live.k;
import com.kuaishou.merchant.live.l;
import com.kuaishou.merchant.live.m;
import com.kuaishou.merchant.live.n;
import com.kuaishou.merchant.live.o;
import java.lang.Number;
import ixc.c;
import lnc.pa;
import lnc.qa;
import c24.l;
import com.kuaishou.merchant.live.entry.OOMConfig;
import com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter;
import com.kuaishou.merchant.live.marketing.sandeago.f;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.live.bottombar.view.LiveMerchantAudienceBottomBarView$b;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import java.lang.Throwable;
import y90.a;
import com.kuaishou.merchant.live.bubble.trust.model.ConsumerAnswerItem;
import fg6.a;
import com.google.gson.Gson;
import o64.r;
import q64.b;
import is3.b;

public class g implements g	// class@001a21
{

    public void g(){
       super();
    }
    public boolean BQ(){
       Object obj = PatchProxy.apply(null, this, g.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a();
    }
    public PresenterV2 BW(boolean p0){
       if (PatchProxy.isSupport2(g.class, "8")) {
          Object obj = PatchProxy.applyOneRefsWithListener(Boolean.valueOf(p0), this, g.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          PatchProxy.onMethodExit(g.class, "8");
          return new f();
       }else {
          PatchProxy.onMethodExit(g.class, "8");
          return new a();
       }
    }
    public PresenterV2 D(int p0){
       i obj;
       a0 uoa0;
       o1 oo1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport2(g.class, "14")) {
          obj = PatchProxy.applyOneRefsWithListener(Integer.valueOf(p0), this, g.class, "14");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = i.a;
       Objects.requireNonNull(obj);
       if (PatchProxy.isSupport2(i.class, "1")) {
          uoa0 = PatchProxy.applyOneRefsWithListener(Integer.valueOf(p0), obj, i.class, "1");
          if (uoa0 != patchProxyRe) {
          label_00ef :
             PatchProxy.onMethodExit(g.class, "14");
             return uoa0;
          }
       }
       switch (p0){
           case 1:
             oo1 = new o1();
             break;
           case 2:
             oo1 = new l0();
             break;
           case 3:
             oo1 = new v();
             break;
           case 4:
             oo1 = new f2();
             break;
           case 5:
             oo1 = new d();
             break;
           case 7:
             oo1 = new a();
             break;
           case 8:
             oo1 = new n();
             break;
           case 9:
             oo1 = new c();
             break;
           case 10:
             oo1 = new l();
             break;
           case 11:
             oo1 = new e();
             break;
           case 12:
             oo1 = LiveDynamicRightsGuaranteePendantPresenter.t.a(1);
             break;
           case 13:
             oo1 = new d();
             break;
           case 14:
             oo1 = new k();
             break;
           case 15:
             oo1 = new f();
             break;
           case 16:
             oo1 = new b0();
             break;
           case 17:
             oo1 = new x();
             break;
           case 18:
             oo1 = new a();
             break;
           case 19:
             oo1 = new c();
             break;
           case 21:
             oo1 = new a();
             break;
           case 22:
             oo1 = new a();
             break;
           case 25:
             oo1 = new a();
             break;
           case 26:
             oo1 = new h();
             break;
           case 27:
             oo1 = new h();
             break;
           case 28:
             oo1 = new l();
             break;
           case 29:
             oo1 = new b();
             break;
           case 32:
             oo1 = new a0();
             break;
           default:
          label_0039 :
             PatchProxy.onMethodExit(i.class, "1");
             throw new IllegalArgumentException("this type is invalid ");
       }
       uoa0 = oo1;
       PatchProxy.onMethodExit(i.class, "1");
       goto label_00ef ;
    }
    public t FF(String p0,String p1,String p2,String p3,int p4){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, og, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return o.H().G(p0, p1, p2, p3, p4);
    }
    public boolean GQ(){
       Object obj = PatchProxy.apply(null, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().getValue("merchantAnchorRecycleEntrance", SandeagoDynamicSwitchConfig.class, new SandeagoDynamicSwitchConfig()).mEnable;
    }
    public List Ib(){
       ArrayList obj = PatchProxy.apply(null, this, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(new d());
       obj.add(new s());
       return obj;
    }
    public void Ix(SandeaBizType p0,String p1,boolean p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, g.class, "17")) {
          return;
       }
       if (p0 == SandeaBizType.AUCTION) {
          d.a(0x50a4ea96).no().c(p1, p2);
          if (p2) {
             b.a(p0, p1, p2);
          }
       }else {
          b.a(p0, p1, p2);
       }
       return;
    }
    public b J9(){
       Object obj = PatchProxy.apply(null, this, g.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return s.d();
    }
    public b Kd(Fragment p0,Commodity p1,LiveMerchantBaseContext p2,int p3,g p4,f p5){
       Object obj1;
       Object obj = this;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p4;
       object oobject3 = p5;
       g og = g.class;
       int i = 2;
       int i1 = 0;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,oobject,oobject1,Integer.valueOf(p3),oobject2,oobject3};
          obj1 = PatchProxy.apply(objArray, obj, og, "32");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (!b0.a(p0.getActivity(), null)) {
          obj.n(oobject2, 1);
          return c.b();
       }else if(p1.getExtraInfo().mSaleType == i){
          return d.a(-1695065466).la(p0.getActivity(), p1, p2, p3, null, p4);
       }else {
          Commodity mJumpUrl = oobject.mJumpUrl;
          obj1 = PatchProxy.applyFourRefs(p0, p2, mJumpUrl, p5, this, g.class, "35");
          if (obj1 != PatchProxyResult.class) {
             i1 = obj1.booleanValue();
          }else if(!TextUtils.isEmpty(mJumpUrl) && (p0.getActivity() == null || p0.getActivity().getSupportFragmentManager() == null)){
             f.d(p0.getActivity(), oobject1, mJumpUrl, p0.getActivity().getSupportFragmentManager(), oobject3);
             i1 = true;
          }
          if (!i1) {
             f.m(p0.getActivity(), oobject.mJumpUrl, oobject1, oobject3);
          }
          obj.n(oobject2, 1);
          return c.b();
       }
    }
    public List Na(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, g.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       ArrayList uArrayList = PatchProxy.apply(objArray, objArray, g.class, "5");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          uArrayList.add(new g());
          uArrayList.add(new a0());
          uArrayList.add(new w());
          uArrayList.add(new d());
          if (!g.a()) {
             uArrayList.add(new a());
          }
          uArrayList.add(new c());
          uArrayList.add(new f());
          uArrayList.add(new f());
       }
       obj.addAll(uArrayList);
       obj.addAll(d.a(-1323649930).v());
       obj.addAll(d.a(0x50a4ea96).v());
       obj.addAll(d.a(-1085770).v());
       return obj;
    }
    public void O7(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "11")) {
          return;
       }
       LiveMerchantAudienceBottomBarView liveMerchant = m1.f(p0, R.id.live_shop);
       if (liveMerchant != null) {
          liveMerchant.b();
       }
       return;
    }
    public b OC(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.a().g(p0, 2, 4, "view", p1).subscribe(e.b, f.b);
    }
    public PresenterV2 OL(){
       Object obj = PatchProxy.applyWithListener(null, this, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(g.class, "9");
       return new w();
    }
    public List Qs(){
       PresenterV2 presenterV2;
       a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, g.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       ArrayList uArrayList = PatchProxy.apply(objArray, objArray, g.class, "4");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          uArrayList.add(new c());
          uArrayList.add(new a());
          uArrayList.add(new e());
          uArrayList.add(new d());
          if (!g.a()) {
             uArrayList.add(new a());
          }
          LiveDynamicRightsGuaranteePendantPresenter liveDynamicR = LiveDynamicRightsGuaranteePendantPresenter.class;
          String str = "5";
          if (PatchProxy.isSupport2(liveDynamicR, str)) {
             presenterV2 = PatchProxy.applyOneRefsWithListener(Integer.valueOf(2), objArray, liveDynamicR, str);
             if (presenterV2 != patchProxyRe) {
             label_0079 :
                uArrayList.add(presenterV2);
                uArrayList.add(new a0());
                uArrayList.add(new w());
                uArrayList.add(new a());
                a$a obj1 = PatchProxy.applyWithListener(objArray, objArray, a.class, "7");
                if (obj1 != patchProxyRe) {
                }else {
                   obj1 = a.u;
                   Objects.requireNonNull(obj1);
                   Object obj2 = PatchProxy.applyWithListener(objArray, obj1, a$a.class, "1");
                   if (obj2 != patchProxyRe) {
                      obj1 = obj2;
                   }else if(d.a(-1432266865).Gd(2, "VoteChallengePendant")){
                      uoa = new a();
                   }else {
                      uoa = new PresenterV2();
                   }
                   PatchProxy.onMethodExit(a$a.class, "1");
                   obj1 = uoa;
                   PatchProxy.onMethodExit(a.class, "7");
                }
                uArrayList.add(obj1);
                uArrayList.add(new a());
                uArrayList.add(new f());
                uArrayList.add(new a());
                uArrayList.add(new a());
             }
          }
          presenterV2 = LiveDynamicRightsGuaranteePendantPresenter.t.a(2);
          PatchProxy.onMethodExit(liveDynamicR, str);
          goto label_0079 ;
       }
       obj.addAll(uArrayList);
       obj.addAll(d.a(-1323649930).C());
       obj.addAll(d.a(0x50a4ea96).C());
       obj.addAll(d.a(-1085770).C());
       return obj;
    }
    public void T50(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "34")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, j.class, "9")) {
          p0.q = SystemClock.elapsedRealtime();
       }
       return;
    }
    public void W(String p0,UserInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "19")) {
          return;
       }
       if (this.gc(p0)) {
          o oo = o.H();
          _monitor_enter(oo);
          if (PatchProxy.applyVoidTwoRefs(p0, p1, oo, o.class, "12")) {
             _monitor_exit(oo);
          }else {
             c uoc = oo.d.get(p0);
             if (uoc != null) {
                uoc.K5(p0, p1);
             }
             _monitor_exit(oo);
          }
       }
       return;
    }
    public void WN(MerchantInfo p0,String p1,Activity p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "39")) {
          return;
       }
       Uri uri = b.g(p1);
       if (uri == null) {
          return;
       }
       String id = (QCurrentUser.ME != null)? QCurrentUser.ME.getId(): "";
       b.m(p2, uri.buildUpon().appendQueryParameter("fromPage", "1").appendQueryParameter("anchorId", id).appendQueryParameter("token", p0.mToken).appendQueryParameter("planId", String.valueOf(p0.mLivePlanId)).appendQueryParameter("planStatus", String.valueOf(p0.mLivePlanBindStatus)).build().toString(), null, new g$a(this, p0));
       return;
    }
    public t Xp(String p0,UserInfo p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o.H().F(p0, p1);
    }
    public PresenterV2 ZT(){
       Object obj = PatchProxy.applyWithListener(null, this, g.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(g.class, "40");
       return new LiveSubscribePresenter();
    }
    public Map a0(){
       HashMap obj = PatchProxy.apply(null, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       LiveLiteAdapterPlugin$ScatterPriority bottomBarIte = LiveLiteAdapterPlugin$ScatterPriority.BottomBarItem;
       obj.put("LiveMerchantLiteRouterPresenter", new Pair(bottomBarIte, new LiveMerchantLiteRouterPresenter()));
       obj.put("LiveMerchantLiteSignalPresenter", new Pair(bottomBarIte, new LiveMerchantLiteSignalPresenter()));
       String str = "LiteMerchantCoverPresenter";
       if (a.t().d("enableLiteYellowCart", false)) {
          if (a.t().d("enableLiteSidebarCartEntry", false)) {
             obj.put("LiveMerchantLiteSideBarPresenter", new Pair(bottomBarIte, new LiveMerchantLiteSideBarPresenter()));
          }else {
             obj.put("LiveMerchantLiteBottomBarPresenter", new Pair(bottomBarIte, new LiveMerchantLiteBottomBarPresenter()));
          }
          if (a.t().d("enableLiteLiveCommodityCard", false)) {
             obj.put("liveMerchantLiteInterpretationPresenter", new Pair(bottomBarIte, new LiveMerchantLiteInterpretationPresenter()));
          }
          if (a.t().d("enableLiteLiveSPB", false)) {
             obj.put(str, new Pair(bottomBarIte, new LiteMerchantCoverPresenter()));
          }
       }
       if (a.t().d("enableLiteLiveDAC", false)) {
          if (!obj.containsKey(str)) {
             obj.put(str, new Pair(bottomBarIte, new LiteMerchantCoverPresenter()));
          }
          obj.put("liveLiteDACPresenter", new Pair(LiveLiteAdapterPlugin$ScatterPriority.Default, d.a(-1432266865).pj(1, false, DACScene.LITE_LIVE)));
       }
       return new HashMap(obj);
    }
    public void aa(Activity p0,c p1,KwaiDialogFragment p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, g.class, "30")) {
          return;
       }
       if (p2 instanceof e) {
          p2.rc(p0, p1, p3);
       }else {
          p2.show(p1, p3);
       }
       return;
    }
    public List af(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, g.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       ArrayList uArrayList = PatchProxy.apply(objArray, objArray, g.class, "2");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          uArrayList.add(new a());
       }
       obj.addAll(uArrayList);
       return obj;
    }
    public a bW(){
       Object obj = PatchProxy.apply(null, this, g.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(a.c);
       return a.b;
    }
    public List bv(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayList obj = PatchProxy.apply(null, this, g.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, g.class, "3");
       if (obj != patchProxyRe) {
       }else {
          obj = new ArrayList();
          obj.add(new b0());
          obj.add(new s());
          obj.add(new o());
       }
       return obj;
    }
    public b c00(Fragment p0,Commodity p1,LiveMerchantBaseContext p2,int p3,g p4){
       Object[] objArray;
       b uob;
       Object obj = this;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p4;
       g og = g.class;
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       int i3 = 0;
       int i4 = 2;
       if (PatchProxy.isSupport(og)) {
          objArray = new Object[i];
          objArray[i3] = p0;
          objArray[1] = oobject;
          objArray[i4] = oobject1;
          objArray[i2] = Integer.valueOf(p3);
          objArray[i1] = oobject2;
          Object obj1 = PatchProxy.apply(objArray, obj, og, "31");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (PatchProxy.isSupport(og)) {
          objArray = new Object[]{p0,oobject,oobject1,Integer.valueOf(p3),oobject2,null};
          uob = PatchProxy.apply(objArray, obj, og, "32");
          if (uob != PatchProxyResult.class) {
          }else if(!b0.a(p0.getActivity(), null)){
             obj.n(oobject2, 1);
             uob = c.b();
          }else if(p1.getExtraInfo().mSaleType == i4){
             uob = d.a(-1695065466).la(p0.getActivity(), p1, p2, p3, null, p4);
          }else {
             Commodity mJumpUrl = oobject.mJumpUrl;
             Object obj2 = PatchProxy.applyFourRefs(p0, p2, mJumpUrl, null, this, g.class, "35");
             if (obj2 != PatchProxyResult.class) {
                i3 = obj2.booleanValue();
             }else if(!TextUtils.isEmpty(mJumpUrl) && (p0.getActivity() == null || p0.getActivity().getSupportFragmentManager() == null)){
                f.d(p0.getActivity(), oobject1, mJumpUrl, p0.getActivity().getSupportFragmentManager(), null);
                i3 = true;
             }
             if (!i3) {
                f.m(p0.getActivity(), oobject.mJumpUrl, oobject1, null);
             }
             obj.n(oobject2, 1);
             uob = c.b();
          }
       }else {
          goto label_0059 ;
       }
       return uob;
    }
    public void dm(String p0,long p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, og, "33")) {
          return;
       }
       j oj = j.class;
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, oj, "4")) {
          j$a uoa = j.b(p0);
          uoa.e = p1;
          uoa.l = SystemClock.elapsedRealtime();
       }
       return;
    }
    public j gb(){
       Object obj = PatchProxy.apply(null, this, g.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b();
    }
    public boolean gc(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return o.H().x(p0);
    }
    public List gz(boolean p0,boolean p1){
       ArrayList obj;
       ArrayList uArrayList;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       String str = "1";
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, og, str);
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = new ArrayList();
       g og1 = g.class;
       if (PatchProxy.isSupport(og1)) {
          uArrayList = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), null, og1, str);
          if (uArrayList != patchProxyRe) {
          label_00bb :
             obj.addAll(uArrayList);
             obj.addAll(d.a(-1323649930).t(p0));
             obj.addAll(d.a(0x50a4ea96).t(p0));
             obj.addAll(d.a(-1085770).t(p0));
             return obj;
          }
       }
       uArrayList = new ArrayList();
       uArrayList.add(p.a);
       uArrayList.add(q.a);
       uArrayList.add(r.a);
       uArrayList.add(s.a);
       uArrayList.add(t.a);
       uArrayList.add(u.a);
       uArrayList.add(v.a);
       uArrayList.add(w.a);
       uArrayList.add(x.a);
       uArrayList.add(h.a);
       if (a.t().d("enableMerchantLiveExitPopup", false)) {
          uArrayList.add(i.a);
       }
       uArrayList.add(new f(p0));
       uArrayList.add(j.a);
       uArrayList.add(k.a);
       if (!p1) {
          uArrayList.add(l.a);
       }
       if (a.t().d("enableMerchantAvatarPendantsMigrate", false)) {
          uArrayList.add(m.a);
       }else {
          uArrayList.add(n.a);
       }
       uArrayList.add(o.a);
       goto label_00bb ;
    }
    public int i1(){
       c obj = PatchProxy.apply(null, this, g.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = qa.r(c.class);
       int i = (obj != null)? obj.i1(): 0;
       return i;
    }
    public boolean isAvailable(){
       return true;
    }
    public List iv(){
       ArrayList obj = PatchProxy.apply(null, this, g.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(new l());
       if (OOMConfig.get().mIsEnabled != null) {
          obj.add(new LiveMerchantEntryInterceptPresenter());
       }
       return obj;
    }
    public b la(FragmentActivity p0,Commodity p1,LiveMerchantBaseContext p2,int p3,DialogInterface$OnShowListener p4,g p5){
       Object[] objArray;
       f obj;
       b uob;
       object oobject = p5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       int i = 5;
       int i1 = 4;
       int i2 = 2;
       if (PatchProxy.isSupport(og)) {
          objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,oobject};
          obj = PatchProxy.apply(objArray, this, og, "22");
          if (obj != patchProxyRe) {
             return obj;
          }
       }else {
          int i3 = this;
       }
       obj = f.class;
       if (PatchProxy.isSupport(obj)) {
          objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,oobject};
          uob = PatchProxy.apply(objArray, null, obj, "1");
          if (uob != patchProxyRe) {
          }else if(p0 == null || p0.isFinishing()){
             a.g(MerchantLiveLogBiz.LIVE_SANDEAGO, "SandeagoJumpHelper", "activity is null or activity is finishing");
             f.a(oobject, 0);
             uob = c.b();
          }else {
             uob = f.b(p0, p1, p2, p3, p4, p5);
          }
       }else {
          goto label_0058 ;
       }
       return uob;
    }
    public void mO(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "12")) {
          return;
       }
       LiveMerchantAudienceBottomBarView$b uob = new LiveMerchantAudienceBottomBarView$b();
       uob.c(R.raw.arg_RES_7f0f003b);
       if (p0 instanceof LiveMerchantAudienceBottomBarView) {
          p0.a(uob, false, false);
       }
       return;
    }
    public final void n(g p0,boolean p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, og, "36")) {
          return;
       }
       try{
          p0.accept(Boolean.valueOf(p1));
       }catch(java.lang.Exception e4){
          a.l(MerchantCommonLogBiz.LOG_DYEING, "LogDyeing", "acceptsValueError", e4);
       }
       return;
    }
    public String nG(){
       Object obj = PatchProxy.apply(null, this, g.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a();
    }
    public String p3(){
       c obj = PatchProxy.apply(null, this, g.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = qa.r(c.class);
       String str = (obj != null)? obj.p3(): "0";
       return str;
    }
    public String qn(int p0,int p1){
       ConsumerAnswerItem obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, og, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ConsumerAnswerItem();
       obj.questionId = p0;
       int[] ointArray = new int[]{p1};
       obj.answerIds = ointArray;
       ConsumerAnswerItem[] uConsumerAns = new ConsumerAnswerItem[]{obj};
       return a.a.q(uConsumerAns);
    }
    public PresenterV2 qy(boolean p0){
       PresenterV2 obj;
       if (PatchProxy.isSupport2(g.class, "15")) {
          obj = PatchProxy.applyOneRefsWithListener(Boolean.valueOf(p0), this, g.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new r());
       obj.U7(new b());
       PatchProxy.onMethodExit(g.class, "15");
       return obj;
    }
    public void tf(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "13")) {
          return;
       }
       if (p0 instanceof LiveMerchantAudienceBottomBarView) {
          p0.d();
       }
       return;
    }
    public b x30(){
       Object obj = PatchProxy.apply(null, this, g.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o.H();
    }
}
