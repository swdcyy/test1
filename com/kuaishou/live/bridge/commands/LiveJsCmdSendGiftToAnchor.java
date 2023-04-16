package com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchor;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchor$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lm1.i;
import lp3.e;
import om1.a;
import lp3.c;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchor$LoggerParams;
import java.lang.StringBuilder;
import o63.m;
import o63.m$a;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import yc1.a;
import h71.o;
import java.util.Map;
import yc1.d;
import csd.b;
import dsd.e;
import java.lang.Integer;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import java.util.List;

public final class LiveJsCmdSendGiftToAnchor extends AbstractLiveJsCommand	// class@000dfb
{

    public void LiveJsCmdSendGiftToAnchor(){
       super();
    }
    public Class a(){
       return LiveJsCmdSendGiftToAnchor$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       i oi;
       Gift gift;
       h this;
       boolean b;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdSendGiftToAnchor.class, "1");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       obj2 = PatchProxy.applyOneRefs(obj1, obj, LiveJsCmdSendGiftToAnchor.class, "3");
       if (obj2 != patchProxyRe) {
          oi = obj2;
       }else {
          obj2 = this.h().a(a.class);
          a.o(obj2, "serviceManager.getServic¡­TraceService::class.java\)");
          i oi1 = new i(obj2.o6());
          LiveSendGiftBaseTraceInfo liveSendGift = oi1.e();
          a.o(liveSendGift, "context.traceInfo");
          liveSendGift.z(1);
          liveSendGift.s(7);
          if (obj1 instanceof LiveJsCmdSendGiftToAnchor$a) {
             LiveJsCmdSendGiftToAnchor$LoggerParams obj4 = obj1;
             LiveJsCmdSendGiftToAnchor$LoggerParams Gift gift1 = a.a(obj4.d());
             if (gift1 != null) {
                liveSendGift.j(gift1);
             }
             liveSendGift.r(obj4.a());
             liveSendGift.p(obj4.c());
             liveSendGift.n(obj4.b());
             gift1 = obj4.e();
             int gift11 = (gift1 != null)? gift1.b(): 0;
             liveSendGift.t(gift11);
             obj4 = obj4.e();
             int i5 = (obj4 != null)? obj4.a(): 0;
             liveSendGift.q(i5);
          }
          oi = oi1;
       }
       obj.m(oi, "CLIENT_CLICK_SEND_GIFT", "[LiveJsCmdSendGiftToAnchor][onExecute]js send gift", 1);
       String str = "invalid params";
       String str1 = "CLIENT_SEND_PRE_CHECK";
       if (!obj1 instanceof LiveJsCmdSendGiftToAnchor$a) {
          obj.m(oi, str1, "[LiveJsCmdSendGiftToAnchor][onExecute]params not request:"+obj1, 0x1871b);
          return m.g.c(str);
       }else {
          Object obj3 = obj1;
          gift = a.a(obj3.d());
          if (gift == null) {
             b.Z(LiveJsBridgeLogTag.COMMON, "can\'t find gift of "+obj3.d());
             obj.m(oi, str1, "[LiveJsCmdSendGiftToAnchor][onExecute]gift cache is null,giftId:"+obj3.d(), 0x18707);
             return m.g.c(str);
          }else {
             h oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p2));
             if (PatchProxy.applyVoidFourRefs(oi, gift, obj3, oh, this, LiveJsCmdSendGiftToAnchor.class, "2")) {
                this = oh;
             }else {
                obj2 = this.h().a(a.class);
                a.o(obj2, "serviceManager.getServic¡­dGiftService::class.java\)");
                c uoc = obj2;
                LiveJsCmdSendGiftToAnchor$a giftToken = obj3.giftToken;
                int i = obj3.c();
                int i1 = obj3.a();
                int i2 = obj3.b();
                LiveJsCmdSendGiftToAnchor$LoggerParams loggerParams = obj3.e();
                int i3 = (loggerParams != null)? loggerParams.b(): 0;
                loggerParams = obj3.e();
                int i4 = (loggerParams != null)? loggerParams.a(): 0;
                LiveJsCmdSendGiftToAnchor$a logExtraInfo = obj3.logExtraInfo;
                b = (obj3.e() != null)? true: false;
                this = oh;
                uoc.tb(oi, gift, giftToken, i, i1, i2, i3, i4, logExtraInfo, b, new o(oh, obj3), obj3.isAsync);
             }
             obj2 = this.b();
             if (obj2 == b.h()) {
                e.c(p2);
             }
             return obj2;
          }
       }
    }
    public final void m(i p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(LiveJsCmdSendGiftToAnchor.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, LiveJsCmdSendGiftToAnchor.class, "4")) {
          return;
       }
       c uoc = this.h().a(a.class);
       a.o(uoc, "serviceManager.getServic¡­TraceService::class.java\)");
       if (!this.h().b()) {
          uoc.yk(p0.e()).d(p1).f("SENDING_GIFT").g(p3).e(p2).a();
       }else {
          b.P(b.a, "[LiveJsCmdSendGiftToAnchor][logTraceInfo]service manager cleared");
       }
       return;
    }
}
