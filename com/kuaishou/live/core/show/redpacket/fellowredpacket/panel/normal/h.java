package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.h;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment$g;
import p91.m;
import t02.a0;
import android.app.Activity;
import zg2.g;
import hg2.e;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveGiftPackage;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.live.core.show.conditionredpacket.sender.LiveConditionRedPacketSendLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RedPackPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;
import com.kuaishou.live.core.show.redpacket.LiveFellowRedPacketLogger;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchMoreInfoPackageV2;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.core.show.redpacket.e;
import ok.h;
import java.util.ArrayList;
import java.util.Collection;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.LiveFellowRedPacketLogTag;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import m62.e;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.conditionredpacket.sender.LiveConditionRedPacketSendLogger$ShowPanelSource;
import java.lang.Enum;
import kotlin.jvm.internal.a;
import lp3.e;
import w91.a;
import lp3.c;
import java.util.Map;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.common.core.component.recharge.d;
import lnc.a1;
import android.os.SystemClock;
import xg2.o;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import java.util.List;
import java.lang.Throwable;
import ug2.a;
import o02.e;
import brd.t;
import xg2.p;
import erd.g;
import xg2.q;
import xg2.r;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import qj1.h;
import erd.o;
import cjd.e;
import xg2.s;
import crd.b;
import xg2.l;
import xg2.m;
import xg2.n;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.g;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionStatus;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import h62.d;
import java.lang.Long;
import sg2.a;
import pm8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import java.lang.CharSequence;
import e17.i;

public abstract class h implements LiveFellowRedPacketPanelFragment$g	// class@000eb1
{
    public boolean a;
    public m b;
    public a0 c;
    public Activity d;
    public e e;
    public int f;
    public String g;
    public JsonElement h;
    public h$a i;
    public g j;

    public void h(m p0,a0 p1,Activity p2,g p3,e p4,int p5){
       super();
       this.a = true;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.j = p3;
       this.e = p4;
       this.f = p5;
       this.g = "";
    }
    public void a(LiveFellowRedPacketPanelFragment p0,int p1,LiveGiftPackage p2,boolean p3,String p4,int p5){
       String str2;
       h oh1;
       String str3;
       h d;
       h g;
       String str6;
       String str7;
       FeedLogCtx uFeedLogCtx;
       BaseFragment uBaseFragmen1;
       ClientContent$LiveStreamPackage liveStreamPa;
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar;
       int this;
       Object obj2;
       ClientEvent$ElementPackage uElementPack1;
       ClientContent$ContentPackage uContentPack;
       ArrayList uArrayList;
       ClientContent$MoreInfoPackageV2[] moreInfoPack;
       Object obj = this;
       object oobject = p2;
       object oobject1 = p4;
       h oh = h.class;
       String str = "1";
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       int i3 = 2;
       int i4 = 0;
       Integer integer = Integer.valueOf(i4);
       int i5 = 6;
       int i6 = 1;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[i5];
          objArray[i4] = p0;
          objArray[i6] = Integer.valueOf(p1);
          objArray[i3] = oobject;
          objArray[i2] = Boolean.valueOf(p3);
          objArray[i1] = oobject1;
          objArray[i] = Integer.valueOf(p5);
          if (PatchProxy.applyVoid(objArray, obj, oh, str)) {
             return;
          }
       }
       if (oobject == null) {
          return;
       }else {
          h f = obj.f;
          String str1 = "";
          if (PatchProxy.isSupport(oh)) {
             str2 = str1;
             oh1 = f;
             i1 = 1;
             if (PatchProxy.applyVoidThreeRefs(Integer.valueOf(p1), p2, Integer.valueOf(f), this, h.class, "6")) {
                str3 = str2;
                i1 = 0;
             }else if(oh1 == i1){
                uBaseFragmen1 = obj.b.b();
                liveStreamPa = obj.b.a();
                liveVoicePar = obj.b.y();
                this = 10;
                d = obj.g;
                LiveGiftPackage mTotalKsCoin1 = oobject.mTotalKsCoin;
                LiveConditionRedPacketSendLogger liveConditio = LiveConditionRedPacketSendLogger.class;
                if (PatchProxy.isSupport(liveConditio)) {
                   Object[] objArray1 = new Object[]{uBaseFragmen1,liveStreamPa,liveVoicePar,Integer.valueOf(this),d,integer,integer,Integer.valueOf(mTotalKsCoin1)};
                   obj2 = null;
                   if (PatchProxy.applyVoid(objArray1, obj2, liveConditio, "2")) {
                      str3 = str2;
                   }
                }else {
                   obj2 = 0;
                }
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "RED_PACK_SET_FINISH_CLICK";
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("source", d);
                jsonObject.a0("red_count", Integer.valueOf(mTotalKsCoin1));
                uElementPack.params = jsonObject.toString();
                ClientContent$RedPackPackage redPackPacka = new ClientContent$RedPackPackage();
                redPackPacka.redPackType = this;
                redPackPacka.redPackTime = (long)i4;
                redPackPacka.redPackCount = i4;
                super();
                this.liveStreamPackage = liveStreamPa;
                this.redPackage = redPackPacka;
                this.liveVoicePartyPackage = liveVoicePar;
                str3 = str2;
                u1.L(str3, uBaseFragmen1, 1, uElementPack, this);
             }else {
                str3 = str2;
                obj2 = null;
                uBaseFragmen1 = obj.b.b();
                liveStreamPa = obj.b.a();
                liveVoicePar = obj.b.y();
                this = p1 + 1;
                LiveFellowRedPacketLogger liveFellowRe = LiveFellowRedPacketLogger.class;
                if (PatchProxy.isSupport(liveFellowRe)) {
                   Object[] objArray2 = new Object[]{uBaseFragmen1,liveStreamPa,liveVoicePar,oobject,Integer.valueOf(this)};
                   if (!PatchProxy.applyVoid(objArray2, obj2, liveFellowRe, "7")) {
                   }
                }else {
                }
             }
          }else {
             str2 = str1;
             oh1 = f;
             i1 = 1;
             int i7 = 6;
             goto label_0077 ;
          }
          LiveFellowRedPacketLogTag lIVE_FELLOW_ = LiveFellowRedPacketLogTag.LIVE_FELLOW_RED_PACKET;
          str2 = str3;
          o obj1 = i1;
          b.a0(lIVE_FELLOW_, "onFellowRedPacketSendButtonClick", c.m("selectItemIndex", Integer.valueOf(p1), "liveGiftPackage", p2, "isAppendGift", Boolean.valueOf(p3), "currentRedPackId", TextUtils.k(p4)));
          LiveGiftPackage mTotalKsCoin = oobject.mTotalKsCoin;
          if (d.a(0x630bc993).d1().q() - (long)mTotalKsCoin < 0) {
             String liveStreamId = obj.b.getLiveStreamId();
             str1 = obj.b.d();
             String str4 = obj.b.i();
             d = obj.d;
             g = obj.g;
             String str5 = PatchProxy.applyOneRefs(g, obj1, e.class, str);
             if (str5 != PatchProxyResult.class) {
             }else if(a.g(g, LiveConditionRedPacketSendLogger$ShowPanelSource.APPEND_RED_PACKET.name())){
                str6 = "LIVE_ROOM_SEND_PACKET_ADD";
             }else if(a.g(g, LiveConditionRedPacketSendLogger$ShowPanelSource.MORE_SEND_RED_PACKET_ICON.name())){
                str6 = "LIVE_ROOM_SEND_PACKET_NORMAL";
             }else {
                str6 = "LIVE_ROOM_SEND_GIFT";
             }
             str5 = str6;
             g = obj.c;
             a0 uoa0 = (g != null)? g.p: obj1;
             d.g(liveStreamId, str1, str4, d, str5, uoa0, obj.b.t5().a(a.class).d6());
             obj.h(a1.p(R.string.arg_RES_7f101c45));
             g = obj.j;
             if (g != null) {
                g.Y();
             }
             b.B(lIVE_FELLOW_, "onFellowRedPacketSendButtonClick InsufficientKwaiCoins");
             return;
          }else {
             g = obj.e;
             if (g != null) {
                g.Nh((long)mTotalKsCoin);
             }
             long l = SystemClock.elapsedRealtime();
             o oo = str;
             obj1 = str;
             oo = new o(this, p1, p2, l, p5, p0, p3);
             BaseFragment uBaseFragmen = obj.b.b();
             if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidFourRefs(uBaseFragmen, Integer.valueOf(p1), p2, Integer.valueOf(p5), this, h.class, "8")) {
                if (obj.c == null && obj.b.e()) {
                   str7 = "RED_PACK_SET_FINISH_TASK";
                }else if(obj.c != null && !obj.b.e()){
                   uFeedLogCtx = obj.c.c0();
                   str7 = "DRAW_PRIZE_ROLL_SEND_AUDIENCE";
                label_02b3 :
                   LiveConditionRedPacketSendLogger.a(uBaseFragmen, p1, obj.b.a(), 10, LiveConditionRedPacketSendLogger$ShowPanelSource.MORE_SEND_RED_PACKET_ICON.name(), 0, 0, oobject.mTotalKsCoin, String.valueOf(oobject.mGiftPackageId), 0, 1, oobject.mGiftInfos, null, p5, null, str7, uFeedLogCtx);
                }else {
                   str7 = str2;
                }
                uFeedLogCtx = null;
                goto label_02b3 ;
             }
             if (p3) {
                s os = new s(this, p3, p2, p1, l, p5);
                e.h().e(obj.b.getLiveStreamId(), String.valueOf(oobject.mGiftPackageId), oobject1).doOnSubscribe(new p(obj, oobject1)).doOnNext(new q(obj, oobject1)).doOnError(new r(obj, oobject1)).compose(p0.ge()).retryWhen(new h()).map(new e()).subscribe(oobject1, obj1);
             }else {
                g og = new g(this, p3, p0, p2, p1, l, p5);
                e.h().h(obj.b.getLiveStreamId(), String.valueOf(oobject.mGiftPackageId)).doOnSubscribe(new l(obj)).doOnNext(new m(obj)).doOnError(new n(obj)).compose(p0.ge()).retryWhen(new h()).map(new e()).subscribe(oh, obj1);
             }
             return;
          }
       }
    }
    public abstract void b();
    public final void c(String p0,ActionStatus p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "3")) {
          return;
       }
       d.d(LiveRedPacketAction.RED_PACK_APPEND, p1, p2, RedPacketType.RED_PACKET_TYPE_ACTIVITY, 0, p0);
       return;
    }
    public final void d(e0 p0,int p1,LiveGiftPackage p2,boolean p3,Throwable p4,long p5,int p6,JsonElement p7){
       int i;
       String str;
       Object obj = this;
       object oobject = p2;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),oobject,Boolean.valueOf(p3),p4,Long.valueOf(p5),Integer.valueOf(p6),p7};
          if (PatchProxy.applyVoid(objArray, obj, oh, "7")) {
             return;
          }
       }
       if (oobject == null) {
          return;
       }else if(p3){
          i = 7;
       }else {
          i = 8;
       }
       oh = null;
       if (obj.c == null && obj.b.e()) {
          str = "RED_PACK_SET_FINISH_TASK";
       }else if(obj.c != null && !obj.b.e()){
          FeedLogCtx uFeedLogCtx = obj.c.c0();
          str = "DRAW_PRIZE_ROLL_SEND_AUDIENCE";
       }else {
          str = "";
       }
       LiveConditionRedPacketSendLogger.a(p0, p1, obj.b.a(), 10, LiveConditionRedPacketSendLogger$ShowPanelSource.MORE_SEND_RED_PACKET_ICON.name(), 0, 0, oobject.mTotalKsCoin, String.valueOf(oobject.mGiftPackageId), p5, i, oobject.mGiftInfos, p4, p6, p7, str, oh);
       return;
    }
    public final void e(ActionStatus p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "2")) {
          return;
       }
       LiveRedPacketAction rED_PACK_SEN = LiveRedPacketAction.RED_PACK_SEND;
       RedPacketType rED_PACKET_T = RedPacketType.RED_PACKET_TYPE_ACTIVITY;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{rED_PACK_SEN,p0,p1,rED_PACKET_T,Integer.valueOf(0)};
          if (PatchProxy.applyVoid(objArray, null, uod, "5")) {
          label_003f :
             return;
          }
       }
       d.d(rED_PACK_SEN, p0, p1, rED_PACKET_T, 0, "");
       goto label_003f ;
    }
    public final void f(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "5")) {
          return;
       }
       if (a.a(this.f)) {
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uoa, "1")) {
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putInt(b.d("user")+"liveFellowRedPacketLastSendGiftPackageId", p0);
             g.a(uEditor);
          }
       }
       return;
    }
    public boolean g(boolean p0){
       return true;
    }
    public final void h(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "4")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          i.d(R.style.arg_RES_7f11066a, p0);
       }
       return;
    }
}
