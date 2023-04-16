package com.kuaishou.live.bridge.commands.pk.LiveJsCmdStartPKInvitation;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.bridge.commands.pk.LiveJsCmdStartPKInvitation$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.bridge.commands.pk.LiveJsCmdStartPKInvitation$PkInviteInfo;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Integer;
import o63.m;
import o63.m$a;
import hd2.f;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import com.kuaishou.live.core.show.pk.pkinvite.g;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.pk.MatchType;
import com.kuaishou.live.core.show.pk.LiveLineSendInviteSource;
import wd2.b;
import java.lang.Number;
import fg6.a;
import com.kuaishou.live.core.show.flowdiversion.pay.model.LivePkFlowDiversionPayInfo;
import com.google.gson.Gson;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import o71.f;
import com.kuaishou.live.core.show.pk.pkinvite.g$b;
import hd2.k0;
import lp3.c;
import csd.b;
import dsd.e;

public final class LiveJsCmdStartPKInvitation extends AbstractLiveJsCommand	// class@000e2a
{

    public void LiveJsCmdStartPKInvitation(){
       super();
    }
    public Class a(){
       return LiveJsCmdStartPKInvitation$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       boolean b;
       LiveJsCmdStartPKInvitation liveJsCmdSta = LiveJsCmdStartPKInvitation.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdStartPKInvitation.class, "1");
       if (p1 != patchProxyRe) {
          return p1;
       }
       String str = null;
       LiveJsCmdStartPKInvitation$a uoa = (!p0 instanceof LiveJsCmdStartPKInvitation$a)? str: p0;
       if (uoa) {
          p0 = p0.a();
          LiveJsCmdStartPKInvitation$PkInviteInfo obj = PatchProxy.applyOneRefs(p0, this, liveJsCmdSta, "4");
          int i = 0;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(p0 != null){
             str = p0.d();
          }
          if (str != null && (p0.a() != null && (p0.b() != null && p0.c() != null))) {
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             return m.g.c("invalid params, isPkInviteInfoParamsValid = false");
          }else {
             b = uoa.a();
             if (b != null) {
                b = b.a();
                if (b != null) {
                   b = String.valueOf(b.intValue());
                   if (b != null) {
                   label_0077 :
                      f.c("bridge", "startPKInvitation", b);
                      b = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p2));
                      if (!PatchProxy.applyVoidTwoRefs(uoa, b, this, liveJsCmdSta, "2")) {
                         g og = new g();
                         obj = uoa.a();
                         a.m(obj);
                         Integer integer = obj.b();
                         LiveJsCmdStartPKInvitation$PkInviteInfo pkInviteInfo = 4;
                         if (integer != null && integer.intValue() == pkInviteInfo) {
                            og.t(MatchType.MATCH_TYPE_HOURLY_RANK);
                         }else {
                            og.t(MatchType.MATCH_TYPE_PK_PANEL_INVITE);
                         }
                         og.o(uoa.extraInfo);
                         integer = uoa.a().a();
                         a.m(integer);
                         og.r(LiveLineSendInviteSource.parseFromInt(integer.intValue()));
                         UserInfo userInfo = uoa.a().d();
                         a.m(userInfo);
                         String str1 = uoa.a().c();
                         Integer integer1 = uoa.a().b();
                         String obj1 = PatchProxy.applyOneRefs(integer1, this, liveJsCmdSta, "3");
                         if (obj1 != patchProxyRe) {
                            i = obj1.intValue();
                         }else if(integer1 != null && integer1.intValue() == 1){
                            i = 1;
                         }else if(integer1 != null && integer1.intValue() == 3){
                            i = 2;
                         }else if(integer1 != null && integer1.intValue() == 2){
                            i = 3;
                         }else {
                            obj1 = 5;
                            if (integer1 != null && integer1.intValue() == obj1) {
                               i = 7;
                            }
                         }
                         b uob = new b(userInfo, str1, i);
                         try{
                            og.a(uob);
                            integer1 = a.a.h(og.c(), LivePkFlowDiversionPayInfo.class);
                            a.o(integer1, "Gsons.KWAI_GSON.fromJson¡­yInfo::class.java\n      \)");
                            og.s(integer1);
                         }catch(java.lang.Exception e12){
                            b.c0(LiveLogTag.LIVE_FLOW_DIVERSION, "[LiveJsCmdStartPKInvitation] [sendInvite]: para json error", "e", e12);
                         }
                         og.q(new f(b));
                         this.g(k0.class).J5(og);
                      }
                      b = b.b();
                      if (b == b.h()) {
                         e.c(p2);
                      }
                      return b;
                   }
                }
             }
             b = "";
             goto label_0077 ;
          }
       }else {
          return m.g.c("invalid params");
       }
    }
}
