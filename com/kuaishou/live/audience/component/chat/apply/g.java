package com.kuaishou.live.audience.component.chat.apply.g;
import aq5.b;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$b;
import im8.g;
import k51.c;
import px0.n;
import com.kuaishou.live.audience.component.chat.apply.g$a;
import com.kuaishou.live.audience.component.chat.apply.g$b;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.i;
import xp5.i;
import lp3.c;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import e3a.a;
import com.kuaishou.live.audience.component.chat.apply.d;
import lp3.e;
import androidx.fragment.app.Fragment;
import t02.a0;
import aq5.d;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$State;
import oq5.c;
import oq5.a;
import vb1.b;
import vb1.b$a;
import px0.o;
import vq5.b;
import vq5.d;
import java.util.Objects;
import com.kwai.library.widget.popup.common.c;
import va1.m;
import crd.b;
import lnc.b9;
import x61.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.retrofit.model.KwaiException;
import brd.t;
import ry1.b;
import px0.p;
import px0.q;
import erd.g;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.Integer;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import rd1.c0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveChatPackage;
import k2b.u1;
import px0.t;
import java.util.Map;
import java.util.HashMap;
import e17.i;
import com.kuaishou.live.common.core.component.chat.LiveChatWithGuestApplyMessage;
import java.util.Random;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.System;
import com.kwai.framework.model.user.UserInfo;
import lu7.f;

public class g extends c implements b, LiveAudienceApplyChatService$b, g	// class@000a6e
{
    public i p;
    public a q;
    public a0 r;
    public Fragment s;
    public i t;
    public d u;
    public b v;
    public d w;
    public final c x;
    public a y;
    public b$a z;
    public static String sLivePresenterClassName = "LiveAudienceApplyChatPresenter";

    public void g(){
       super();
       this.x = new n(this);
       this.y = new g$a(this);
       this.z = new g$b(this);
    }
    public void E8(){
       LiveAudienceApplyChatService liveAudience = LiveAudienceApplyChatService.class;
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.t = this.P8().a(i.class);
       this.u = new d(this.P8(), a.b(this.getContext()), this.s, this.r);
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY,AudienceBizRelation.PK,AudienceBizRelation.LIVE_LINE,AudienceBizRelation.LIVE_MULTI_LINE,AudienceBizRelation.LIVE_MULTI_PK,AudienceBizRelation.SPECIAL_ROLE,AudienceBizRelation.GAME_INTERACTIVE,AudienceBizRelation.RECRUIT_EXPLAIN_PANEL};
       this.P8().a(d.class).u5(this, uoaArray);
       this.P8().a(liveAudience).Od(this);
       this.u.h(this.R8(this.P8().a(liveAudience).isEnabled()), this.P8().a(liveAudience).jh(), this.S8());
       this.q.W0(this.x, 1);
       this.P8().a(b.class).mh(this.z);
       this.w.t5("showchatapplydialog", new o(this));
       return;
    }
    public void J8(){
       boolean b;
       b uob = b.class;
       LiveAudienceApplyChatService liveAudience = LiveAudienceApplyChatService.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "8")) {
          return;
       }
       b = false;
       this.P8().a(liveAudience).Jb(b);
       g tu = this.u;
       Objects.requireNonNull(tu);
       if (!PatchProxy.applyVoid(objArray, tu, d.class, "3")) {
          m.c(tu.p);
          m.c(tu.q);
          m.c(tu.r);
          tu.b();
          b9.a(tu.s);
          tu.c.a(c.class).O0(1025);
          tu.n = objArray;
          tu.c.a(uob).Eo(tu);
       }
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY,AudienceBizRelation.PK,AudienceBizRelation.LIVE_LINE,AudienceBizRelation.LIVE_MULTI_LINE,AudienceBizRelation.LIVE_MULTI_PK,AudienceBizRelation.SPECIAL_ROLE,AudienceBizRelation.GAME_INTERACTIVE,AudienceBizRelation.RECRUIT_EXPLAIN_PANEL};
       this.P8().a(d.class).G5(this, uoaArray);
       this.P8().a(liveAudience).eb(this);
       this.P8().a(uob).Eo(this.z);
       this.q.Q0(this.x);
       b9.a(this.v);
       this.w.Z4("showchatapplydialog");
       return;
    }
    public void M4(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "5")) {
          return;
       }
       b.c0(LiveLogTag.CHAT, "applyChat", "onApplyRequestFailed", p0);
       if (p0 instanceof KwaiException) {
          int errorCode = p0.getErrorCode();
          this.v = this.r.b3.T3().subscribe(new p(this, errorCode, p0), new q(this, p0, errorCode));
       }
       return;
    }
    public i P8(){
       return this.p;
    }
    public boolean R8(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, og, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p0 = (p0 && this.P8().a(d.class).ck(AudienceBizRelation.CHAT_APPLY_BOTTOM_BAR))? true: false;
       return p0;
    }
    public boolean S8(){
       Object obj = PatchProxy.apply(null, this, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       int i1 = (this.P8().a(b.class).M4())? a.t().u("SOURCE_LIVE").d("disableLiveVideoApplyChatForceShow", false) ^ i: 0;
       if (this.P8().a(d.class).r2(AudienceBizRelation.RECRUIT_EXPLAIN_PANEL)) {
          i1 = 0;
       }
       if (!this.P8().a(LiveAudienceApplyChatService.class).Ai() && !i1) {
          i = false;
       }
       return i;
    }
    public final void V8(Throwable p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og, "6")) {
          return;
       }
       if (p1 != 0x15cde && p1 != 622) {
          ExceptionHandler.handleException(a.a().a(), p0);
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.t.a();
       c0 uoc0 = c0.class;
       if (!PatchProxy.isSupport(uoc0) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), liveStreamPa, null, uoc0, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "AUDIENCE_CHAT_APPLY_FAILED";
          JsonObject jsonObject = new JsonObject();
          jsonObject.a0("code", Integer.valueOf(p1));
          uElementPack.params = jsonObject.toString();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
          uContentWrap.liveChatPackage = c0.b(QCurrentUser.me().getId(), liveStreamPa.liveStreamId);
          u1.v0(9, uElementPack, uContentPack, uContentWrap);
       }
       return;
    }
    public void b6(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "4")) {
          return;
       }
       this.u.h(this.R8(p0), this.P8().a(LiveAudienceApplyChatService.class).jh(), this.S8());
       return;
    }
    public void e6(a p0,boolean p1){
       LiveAudienceApplyChatService liveAudience = LiveAudienceApplyChatService.class;
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, og, "11")) {
          return;
       }
       this.u.h(this.R8(this.P8().a(liveAudience).isEnabled()), this.P8().a(liveAudience).jh(), this.S8());
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g.class, new t());
       }else {
          obj.put(g.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_SERVICE_MANAGER");
       this.q = this.r8("LIVE_CONFIGURATION_SERVICE");
       this.r = this.r8("LIVE_PLAY_CALLER_CONTEXT");
       this.s = this.r8("LIVE_FRAGMENT");
       this.w = this.r8("LIVE_ROUTER_SERVICE");
       return;
    }
    public void v7(LiveAudienceApplyChatService$State p0,int p1){
       LiveAudienceApplyChatService liveAudience = LiveAudienceApplyChatService.class;
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og, "3")) {
          return;
       }
       Object[] objArray = null;
       if (p0 == LiveAudienceApplyChatService$State.APPLYING) {
          if (!PatchProxy.applyVoid(objArray, this, og, "7")) {
             ClientContent$LiveStreamPackage liveStreamPa = this.t.a();
             if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, c0.class, "9")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "AUDIENCE_CHAT_SCUCCESS_APPLY";
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
                uContentWrap.liveChatPackage = c0.b(QCurrentUser.me().getId(), liveStreamPa.liveStreamId);
                u1.v0(9, uElementPack, uContentPack, uContentWrap);
             }
             i.a(R.style.arg_RES_7f11066a, 0x7f101f6f);
             LiveChatWithGuestApplyMessage liveChatWith = new LiveChatWithGuestApplyMessage().setId(String.valueOf(new Random().nextLong())).setTime(System.currentTimeMillis()).setSortRank(0).setUser(f.p(QCurrentUser.me())).cast();
          }
       }else if(p0 == LiveAudienceApplyChatService$State.IDLE){
          if (p1 == 1) {
             i.a(R.style.arg_RES_7f110668, 0x7f101d99);
          }else if(p1 == 2){
             i.a(R.style.arg_RES_7f11066a, 0x7f101de5);
          }
          this.u.a();
       }else if(p0 == LiveAudienceApplyChatService$State.CHATTING){
          this.u.a();
          this.u.c();
          g tu = this.u;
          Objects.requireNonNull(tu);
          if (!PatchProxy.applyVoid(objArray, tu, d.class, "16")) {
             d p = tu.p;
             if (p != null && p.K()) {
                tu.p.o();
             }
          }
          this.u.b();
          c0.H(this.t.a(), this.p.a(liveAudience).G3(QCurrentUser.me().getId()), objArray);
       }
       this.u.h(this.R8(this.P8().a(liveAudience).isEnabled()), p0, this.S8());
       return;
    }
}
