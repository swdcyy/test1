package com.kuaishou.live.common.core.component.gift.domain.giftbox.log.LiveGiftBoxLogger;
import androidx.lifecycle.DefaultLifecycleObserver;
import qi1.b;
import si1.e;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.log.LiveGiftBoxLogger$a;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import xp5.i;
import e93.c;
import om1.e;
import jm1.a;
import z1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.log.LiveGiftBoxLogger$b;
import java.util.Map;
import ok.x;
import qk.e0;
import com.google.common.collect.Multimaps;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fm1.a;
import ni1.c;
import ul1.a;
import android.view.View;
import ul1.d;
import qi1.b$a;
import yg1.f;
import rm1.j;
import rm1.j$a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import java.util.List;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import mm1.e;
import lj1.c;
import java.util.Collection;
import ekd.q;
import ch1.c;
import java.lang.Long;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchMoreInfoPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import ul1.c;
import n2.a;
import java.lang.Number;

public final class LiveGiftBoxLogger implements DefaultLifecycleObserver, b, e	// class@001203
{
    public final e0 b;
    public long c;
    public final LifecycleOwner d;
    public final i e;
    public final c f;
    public final e g;
    public final a h;
    public final k i;
    public static final LiveGiftBoxLogger$a j;

    static {
       LiveGiftBoxLogger.j = new LiveGiftBoxLogger$a(null);
    }
    public void LiveGiftBoxLogger(LifecycleOwner p0,i p1,c p2,e p3,a p4,k p5){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "logPackageProvider");
       a.p(p2, "liteFragmentService");
       a.p(p3, "sendGiftTracer");
       a.p(p4, "giftBoxService");
       a.p(p5, "bizLogParams");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       this.b = Multimaps.a(new HashMap(), LiveGiftBoxLogger$b.b);
       this.c = SystemClock.elapsedRealtime();
       p0.getLifecycle().addObserver(this);
    }
    public static ClientEvent$ElementPackage q(LiveGiftBoxLogger p0,String p1,String p2,HashMap p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = null;
       }
       if (p4 & 0x04) {
          p3 = null;
       }
       ClientEvent$ElementPackage uElementPack = PatchProxy.applyThreeRefs(p1, p2, p3, p0, LiveGiftBoxLogger.class, "16");
       if (uElementPack != PatchProxyResult.class) {
       }else {
          uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = p1;
          if (p2 != null) {
             uElementPack.name = p2;
          }
          if (p3 != null) {
             uElementPack.params = a.a.q(p3);
          }
       }
       return uElementPack;
    }
    public void D0(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxLogger.class, "14")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("if_first", Boolean.FALSE);
       hashMap.putAll(this.i.get());
       u1.C0("", this.f.a(), 1, LiveGiftBoxLogger.q(this, "PAY_DEPOSIT_BUTTON", null, hashMap, 2, null), this.o("LIVE_LITE_ROOM_SEND_GIFT"));
       return;
    }
    public void J0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxLogger.class, "21")) {
          return;
       }
       a.a(this.e.a());
       return;
    }
    public void M(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxLogger.class, "12")) {
          return;
       }
       a.p(p0, "count");
       c uoc = this.h.e();
       a uoa = (uoc != null)? uoc.c(): null;
       if (uoa != null) {
          u1.L("", this.f.a(), 1, LiveGiftBoxLogger.q(this, "SELECT_GIFT_COUNT", p0, null, 4, null), this.p(uoa));
       }
       return;
    }
    public void O1(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxLogger.class, "11")) {
          return;
       }
       a.p(p0, "view");
       c uoc = this.h.e();
       a uoa = (uoc != null)? uoc.c(): null;
       if (uoa != null) {
          u1.L("", this.f.a(), 1, LiveGiftBoxLogger.q(this, "SELECT_GIFT_COUNT_TAB", null, null, 6, null), this.p(uoa));
       }
       return;
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxLogger.class, "22")) {
          return;
       }
       a.b(this.e.a());
       return;
    }
    public void a(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxLogger.class, "24")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "tabInfo");
       b$a.t(this, p0, p1);
       return;
    }
    public void b(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxLogger.class, "31")) {
          return;
       }
       a.p(p0, "result");
       b$a.l(this, p0);
       return;
    }
    public void c(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxLogger.class, "27")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "giftInfo");
       b$a.i(this, p0, p1);
       return;
    }
    public void d(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxLogger.class, "5")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "tabInfo");
       u1.L("", this.f.a(), 1, LiveGiftBoxLogger.q(this, "GIFT_PANEL_TAB", null, null, 6, null), this.o(j.a.a(p1.a())));
       return;
    }
    public void e(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxLogger.class, "29")) {
          return;
       }
       a.p(p0, "source");
       b$a.j(this, p0, p1);
       return;
    }
    public void f(String p0,LiveGiftSortType p1,d p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftBoxLogger.class, "6")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "sortType");
       a.p(p2, "tabInfo");
       this.b.get(p2.a()).clear();
       super();
       this.put("type", Integer.valueOf(this.s(p2.a())));
       u1.L("", this.f.a(), 1, LiveGiftBoxLogger.q(this, "GIFT_PANEL_SORT_BUTTON", null, this, 2, null), this.o(j.a.a(p2.a())));
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxLogger.class, "3")) {
          return;
       }
       this.c = SystemClock.elapsedRealtime();
       return;
    }
    public void g2(int p0,String p1){
       LiveGiftBoxLogger liveGiftBoxL = LiveGiftBoxLogger.class;
       if (PatchProxy.isSupport(liveGiftBoxL) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, liveGiftBoxL, "4")) {
          return;
       }
       a.p(p1, "message");
       this.g.yk(this.g.o6()).f("PRE_SEND_GIFT").d("CLIENT_GIFT_BOX_SHOW").g(p0).e(p1).a();
       return;
    }
    public void h(){
       PatchProxy.applyVoid(null, this, LiveGiftBoxLogger.class, "23");
    }
    public void h2(){
       ClientEvent$ElementPackage this;
       int i1;
       LiveGiftBoxLogger liveGiftBoxL = LiveGiftBoxLogger.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveGiftBoxL, "13")) {
          return;
       }
       c uoc = this.h.e();
       a uoa = (uoc != null)? uoc.c(): objArray;
       if (uoc != null) {
          uoc = uoc.a();
          if (uoc != null) {
             objArray = uoc.b();
          }
       }
       if (uoa != null && (objArray == null || q.f(objArray))) {
          b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxLogger][onHandleClick]selectGift:"+uoa+",receiverList:"+objArray);
          return;
       }else {
          HashMap hashMap = new HashMap();
          hashMap.put("gift_llsid", uoa.b().e());
          hashMap.put("cost_time", Long.valueOf(((SystemClock.elapsedRealtime() - this.c) / (long)1000)));
          hashMap.put("type", Integer.valueOf(this.s(uoa.d())));
          hashMap.putAll(this.i.get());
          BaseFragment uBaseFragmen = this.f.a();
          this = LiveGiftBoxLogger.q(this, "SEND_GIFT", null, hashMap, 2, null);
          UserInfo mId = objArray.get(0).mId;
          ClientContent$ContentPackage uContentPack = PatchProxy.applyTwoRefs(uoa, mId, this, liveGiftBoxL, "19");
          if (uContentPack != PatchProxyResult.class) {
          }else {
             uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = this.e.a();
             ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
             moreInfoPack.index = String.valueOf((uoa.c() + 1));
             moreInfoPack.type = j.a.a(uoa.d());
             Gift gift = uoa.b().b();
             int i = -1;
             gift = (gift != null)? gift.mId: -1;
             moreInfoPack.id = String.valueOf(gift);
             moreInfoPack.identity = mId;
             c uoc1 = this.h.e();
             if (uoc1 != null) {
                i = uoc1.b();
             }
             moreInfoPack.vlaue = String.valueOf(i);
             ClientContent$BatchMoreInfoPackageV2 uBatchMoreIn = new ClientContent$BatchMoreInfoPackageV2();
             ClientContent$MoreInfoPackageV2[] moreInfoPack1 = new ClientContent$MoreInfoPackageV2[]{moreInfoPack};
             uBatchMoreIn.moreInfoPackage = moreInfoPack1;
             uContentPack.batchMoreInfoPackage = uBatchMoreIn;
             uContentPack.giftPackage = this.r(uoa);
             uContentPack.liveVoicePartyPackage = this.e.b4();
          }
          u1.L("", uBaseFragmen, 1, this, uContentPack);
          return;
       }
    }
    public void i(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxLogger.class, "7")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "tabInfo");
       u1.C0("", this.f.a(), 1, LiveGiftBoxLogger.q(this, "GIFT_PANEL_TAB", null, null, 6, null), this.o(j.a.a(p1.a())));
       return;
    }
    public void j(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxLogger.class, "28")) {
          return;
       }
       a.p(p0, "source");
       b$a.g(this, p0, p1);
       return;
    }
    public void k(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxLogger.class, "8")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "giftInfo");
       Gift gift = p1.b().b();
       if (gift != null) {
          gift = gift.mId;
          String str = p1.d();
          if (this.b.get(str).contains(Integer.valueOf(gift))) {
             return;
          }else {
             this.b.get(str).add(Integer.valueOf(gift));
             HashMap hashMap = new HashMap();
             hashMap.put("gift_llsid", p1.b().e());
             hashMap.put("type", Integer.valueOf(this.s(str)));
             u1.C0("", this.f.a(), 1, LiveGiftBoxLogger.q(this, "LIVE_GIFT_ITEM", null, hashMap, 2, null), this.p(p1));
          }
       }
       return;
    }
    public void l(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxLogger.class, "25")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "pagerItemInfo");
       b$a.m(this, p0, p1);
       return;
    }
    public void m(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxLogger.class, "26")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "pagerItemInfo");
       b$a.n(this, p0, p1);
       return;
    }
    public void n(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxLogger.class, "10")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "giftInfo");
       HashMap hashMap = new HashMap();
       hashMap.put("gift_llsid", p1.b().e());
       hashMap.put("type", Integer.valueOf(this.s(p1.d())));
       u1.L("", this.f.a(), 1, LiveGiftBoxLogger.q(this, "SELECT_GIFT", null, hashMap, 2, null), this.p(p1));
       return;
    }
    public final ClientContent$ContentPackage o(String p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, this, LiveGiftBoxLogger.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.liveStreamPackage = this.e.a();
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.type = p0;
       obj.moreInfoPackage = moreInfoPack;
       obj.giftPackage = this.r(null);
       obj.liveVoicePartyPackage = this.e.b4();
       return obj;
    }
    public void onCreate(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxLogger.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       this.h.a(this);
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxLogger.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       this.d.getLifecycle().removeObserver(this);
       this.h.b(this);
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
    public final ClientContent$ContentPackage p(a p0){
       int i1;
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, this, LiveGiftBoxLogger.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.liveStreamPackage = this.e.a();
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.index = String.valueOf((p0.c() + 1));
       moreInfoPack.type = j.a.a(p0.d());
       Gift gift = p0.b().b();
       int i = -1;
       gift = (gift != null)? gift.mId: -1;
       moreInfoPack.id = String.valueOf(gift);
       c uoc = this.h.e();
       if (uoc != null) {
          i = uoc.b();
       }
       moreInfoPack.vlaue = String.valueOf(i);
       obj.moreInfoPackage = moreInfoPack;
       obj.giftPackage = this.r(p0);
       obj.liveVoicePartyPackage = this.e.b4();
       return obj;
    }
    public void p1(Integer p0,int p1){
       LiveGiftBoxLogger liveGiftBoxL = LiveGiftBoxLogger.class;
       if (PatchProxy.isSupport(liveGiftBoxL) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveGiftBoxL, "30")) {
          return;
       }
       b$a.b(this, p0, p1);
       return;
    }
    public final ClientContent$GiftPackage r(a p0){
       c obj = PatchProxy.applyOneRefs(p0, this, LiveGiftBoxLogger.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h.e();
       ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
       int i = (obj != null)? obj.e(): 2;
       giftPackage.sourceType = i;
       if (p0 != null) {
          Gift gift = p0.b().b();
          gift = (gift != null)? gift.mId: -1;
          giftPackage.identity = String.valueOf(gift);
          giftPackage.position = p0.a() + 1;
       }
       return giftPackage;
    }
    public final int s(String p0){
       LiveGiftSortType liveGiftSort;
       c obj = PatchProxy.applyOneRefs(p0, this, LiveGiftBoxLogger.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.h.e();
       Map map = (obj != null)? obj.f(): null;
       if (map != null) {
          liveGiftSort = map.get(p0);
          if (liveGiftSort != null) {
          label_002e :
             return liveGiftSort.getType();
          }
       }
       liveGiftSort = LiveGiftSortType.DEFAULT;
       goto label_002e ;
    }
    public void u0(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxLogger.class, "15")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("if_first", Boolean.FALSE);
       hashMap.putAll(this.i.get());
       u1.L("", this.f.a(), 1, LiveGiftBoxLogger.q(this, "PAY_DEPOSIT_BUTTON", null, hashMap, 2, null), this.o("LIVE_LITE_ROOM_SEND_GIFT"));
       return;
    }
}
