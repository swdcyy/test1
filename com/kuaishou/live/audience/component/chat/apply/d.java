package com.kuaishou.live.audience.component.chat.apply.d;
import vb1.b$a;
import lp3.e;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import t02.a0;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import xp5.g;
import lp3.i;
import java.lang.Class;
import lp3.c;
import xp5.i;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z61.e;
import z61.b;
import java.lang.Boolean;
import z61.l;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import z61.a$a;
import android.content.Context;
import lnc.a1;
import zyc.f;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import z61.a;
import x61.c;
import vb1.b;
import androidx.lifecycle.LiveData;
import px0.d;
import o63.d;
import com.kwai.library.widget.popup.common.c;
import com.kwai.framework.model.user.User;
import erd.g;
import java.lang.Integer;
import zd1.g;
import com.kuaishou.live.audience.component.chat.apply.a;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupConfig;
import java.lang.reflect.Type;
import wg3.a;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import p91.m;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import w91.a;
import java.util.Map;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.common.core.component.recharge.d;
import com.kuaishou.live.audience.component.chat.apply.d$a;
import kg1.f$a;
import kg1.e;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import ry1.b;
import brd.t;
import px0.j;
import px0.h;
import crd.b;
import d61.g;
import com.kuaishou.live.audience.component.chat.apply.k;
import com.kwai.framework.model.user.UserProfile;
import lu7.f;
import com.kwai.framework.model.user.QCurrentUser;
import qa6.b;
import com.kwai.framework.model.user.UserInfo;
import px0.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.chat.apply.d$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.live.gzone.widget.e;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$State;
import java.lang.StringBuilder;
import java.lang.Enum;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import rd1.c0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.Objects;
import java.lang.CharSequence;
import android.widget.TextView;
import d61.c0;
import com.airbnb.lottie.LottieAnimationView;
import px0.z;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.audience.component.chat.apply.b;

public class d implements b$a	// class@000a69
{
    public final String b;
    public final e c;
    public final Activity d;
    public final g e;
    public final i f;
    public final e g;
    public final MutableLiveData h;
    public final b i;
    public final a0 j;
    public final Fragment k;
    public final LiveAudienceApplyChatService l;
    public String m;
    public String n;
    public boolean o;
    public k p;
    public h q;
    public i r;
    public b s;
    public d t;

    public void d(e p0,Activity p1,Fragment p2,a0 p3){
       super();
       this.b = "LiveAudienceApplyChatBottomBarWidget";
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.h = mutableLiveD;
       this.m = "";
       this.c = p0;
       this.d = p1;
       this.k = p2;
       this.i = p3.b3;
       this.j = p3;
       this.e = p0.a(g.class);
       this.f = p0.a(i.class);
       this.l = p0.a(LiveAudienceApplyChatService.class);
       e uoe = PatchProxy.apply(null, this, d.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e();
          uoe.mFeatureId = 1025;
          uoe.mIsVisible = Boolean.FALSE;
          uoe.mIsSelected = false;
          uoe.mIconRes = 0x7f081128;
          uoe.mSelectedIconRes = 0x7f081127;
          a$a uoa = new a$a();
          uoa.a = 1001;
          uoa.d = e0.h(f.f(a1.c(), "icon", 0x7f1027b9));
          uoa.b = a1.p(0x7f101f0c);
          uoe.a = uoa;
       }
       this.g = uoe;
       mutableLiveD.setValue(uoe);
       p0.a(c.class).v1(mutableLiveD);
       p0.a(b.class).mh(this);
       return;
    }
    public void S2(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "22")) {
          return;
       }
       if (this.h.getValue() != null) {
          b value = this.h.getValue();
          value.mClickLogParamsSupplier = new d(p0);
          this.h.setValue(value);
       }
       this.o = p0;
       if (p0) {
          this.c();
       }
       return;
    }
    public void a(){
       this.n = null;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "20")) {
          return;
       }
       d tt = this.t;
       if (tt != null) {
          tt.L();
          this.t = null;
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "15")) {
          return;
       }
       d tq = this.q;
       if (tq != null && tq.K()) {
          this.q.o();
       }
       return;
    }
    public final void d(User p0,int p1,g p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, d.class, "10")) {
          return;
       }
       this.c.a(g.class).Sn(p0, p2, a.b, p1);
       return;
    }
    public final void e(){
       int b1;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "7")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(objArray, this, uod, "8");
       boolean b = true;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          LiveConfigStartupResponse$LiveFansGroupConfig obj1 = PatchProxy.apply(objArray, this, uod, "9");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             obj1 = a.o(LiveConfigStartupResponse$LiveFansGroupConfig.class);
             obj1 = (obj1 != null)? obj1.mJoinCoinCount: null;
             if (obj1 <= null) {
                b1 = 6;
             }
             if (d.a(0x630bc993).d1().q() - (long)b1 < 0) {
                b1 = true;
             }else {
                b1 = false;
             }
          }
          if (b1) {
             uod = this.j;
             d.f("LIVE_ROOM_AUTHOR_CHAT_JOIN_FANS", this.d, this.e.getLiveStreamId(), this.j.Z2.I().mId, uod.p, uod.c.getExpTag(), this.j.Z2.t5().a(a.class).d6());
          }else {
             b = false;
          }
       }
       if (b) {
          return;
       }else {
          this.j.r1.pf("AUTHOR_CHAT_APPLY_FANS", new d$a(this), false, false);
          return;
       }
    }
    public void f(String p0){
       boolean b;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "12")) {
          return;
       }
       if (this.o != null) {
          Object obj = PatchProxy.apply(null, this, uod, "13");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(this.i.D1() != null && this.i.D1().mEnableBlindDateGiftGuide != null){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             this.t = this.j.Z2.t5().a(b.class).Je(1, p0);
          }else {
             this.g();
          }
       }else {
          this.s = this.i.T3().subscribe(new j(this), new h(this));
       }
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, d.class, "18")) {
          return;
       }
       d tp = this.p;
       if (tp != null && tp.K()) {
          return;
       }
       if (g.h(this.d)) {
          return;
       }
       e uoe = new k(this.d, f.o(this.e.I()).mProfile, UserInfo.convertFromQUser(b.a(QCurrentUser.me())), new c(this)).i0(new d$b(this));
       uoe.Z();
       this.p = uoe;
       return;
    }
    public void h(boolean p0,LiveAudienceApplyChatService$State p1,boolean p2){
       d tg;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, Boolean.valueOf(p2), this, d.class, "2")) {
          return;
       }
       String str = p0+p1.name()+p2;
       if (!str.equals(this.m)) {
          this.m = str;
          Object obj = null;
          if (p0) {
             ClientContent$LiveStreamPackage liveStreamPa = this.f.a();
             e0 page = this.f.getPage();
             if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, page, obj, c0.class, "24") && !PatchProxy.applyVoidFourRefs("SHOW_LIVE_AUDIENCE_CHAT", "", page, liveStreamPa, null, c0.class, "22")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "SHOW_LIVE_AUDIENCE_CHAT";
                uElementPack.params = "";
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                u1.C0("", page, 9, uElementPack, uContentPack);
             }
             boolean b = false;
             if (p1 == LiveAudienceApplyChatService$State.CHATTING && !PatchProxy.applyVoid(obj, this, uod, "19")) {
                tg = this.p;
                if (tg != null && tg.K()) {
                   tg = this.p;
                   Objects.requireNonNull(tg);
                   if (!PatchProxy.applyVoid(obj, tg, k.class, "5")) {
                      tg.A.setText(a1.p(R.string.arg_RES_7f101ded));
                      tg.B.setEnabled(b);
                      tg.C.setAnimationFromUrl(c0.a.b("/udata/pkg/kwai-client-image/live_chat/live_chat_apply_success.json"));
                      tg.C.setRepeatCount(b);
                      tg.C.a(new z(tg));
                      tg.C.s();
                   }
                }
             }
             tg = this.g;
             tg.mIsVisible = Boolean.TRUE;
             tg.mClickCallback = new b(this, p2);
             if (p1 != LiveAudienceApplyChatService$State.IDLE) {
                b = true;
             }
             tg.mIsSelected = b;
             tg.c = b;
          }else {
             tg = this.g;
             tg.mIsVisible = Boolean.FALSE;
             tg.mClickCallback = obj;
          }
          this.h.setValue(this.g);
       }
       return;
    }
}
