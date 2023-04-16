package com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchorV2;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchorV2$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import lp3.e;
import yc1.a;
import lp3.c;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import rh1.b;
import java.lang.Boolean;
import lm1.i;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchorV2$LoggerParams;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import o63.m;
import o63.m$a;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import h71.p;
import java.util.Map;
import yc1.d;
import csd.b;
import dsd.e;
import om1.a;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import java.util.List;

public final class LiveJsCmdSendGiftToAnchorV2 extends AbstractLiveJsCommand	// class@000dff
{

    public void LiveJsCmdSendGiftToAnchorV2(){
       super();
    }
    public Class a(){
       return LiveJsCmdSendGiftToAnchorV2$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       b uob1;
       c uoc1;
       Gift gift;
       int i6;
       int i7;
       LiveJsCmdSendGiftToAnchorV2 liveJsCmdSen = this;
       c obj = p0;
       LiveJsCmdSendGiftToAnchorV2 liveJsCmdSen1 = LiveJsCmdSendGiftToAnchorV2.class;
       i obj1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdSendGiftToAnchorV2.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (obj instanceof LiveJsCmdSendGiftToAnchorV2$a) {
          LiveJsCmdSendGiftToAnchorV2$a uoa = obj;
          if (uoa.b() != null && uoa.a() != null) {
             c uoc = this.h().a(a.class);
             a.o(uoc, "serviceManager.getServic¡­dGiftService::class.java\)");
             obj = uoc;
             if (TextUtils.isEmpty(uoa.d())) {
                uoa.scene = "JS_BRIDGE";
             }
             String str = uoa.d();
             a.m(str);
             b uob = obj.P1(str);
             int i = uoa.b().intValue();
             int i1 = uoa.a().intValue();
             LiveJsCmdSendGiftToAnchorV2$a isCombo = uoa.isCombo;
             int i2 = 0;
             int b = (isCombo != null)? isCombo.booleanValue(): false;
             boolean b1 = uob.a(i, i1, b);
             if (PatchProxy.isSupport(liveJsCmdSen1)) {
                uob1 = uob;
                uoc1 = obj;
                obj1 = PatchProxy.applyFourRefs(uoa, uob, obj, Boolean.valueOf(b1), this, LiveJsCmdSendGiftToAnchorV2.class, "3");
                if (obj1 != PatchProxyResult.class) {
                label_011f :
                   liveJsCmdSen.n(obj1, "CLIENT_CLICK_SEND_GIFT", "[LiveJsCmdSendGiftToAnchorV2][onExecute]js send gift", 1);
                   gift = a.a(uoa.b().intValue());
                   if (gift == null) {
                      b.Z(LiveJsBridgeLogTag.COMMON, "can\'t find gift of "+uoa.b());
                      liveJsCmdSen.n(obj1, "CLIENT_SEND_PRE_CHECK", "[LiveJsCmdSendGiftToAnchorV2][onExecute]gift cache is null,giftId:"+uoa.b(), 0x18707);
                      return m.g.c("invalid params");
                   }else {
                      h oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p2));
                      if (PatchProxy.isSupport(liveJsCmdSen1)) {
                         Object[] objArray = new Object[]{obj1,gift,uoa,Boolean.valueOf(b1),uob1,uoc1,oh};
                         if (PatchProxy.applyVoid(objArray, liveJsCmdSen, liveJsCmdSen1, "2")) {
                         label_0210 :
                            Object obj2 = oh.b();
                            if (obj2 == b.h()) {
                               e.c(p2);
                            }
                            return obj2;
                         }
                      }
                      int i3 = uoc1.H4(uob1.c()) + 1;
                      LiveJsCmdSendGiftToAnchorV2$a objArray1 = uoa.giftToken;
                      int i4 = uob1.b();
                      int i5 = uob1.c();
                      LiveJsCmdSendGiftToAnchorV2$LoggerParams loggerParams = uoa.c();
                      if (loggerParams != null) {
                         Integer integer = loggerParams.b();
                         if (integer != null) {
                            i6 = integer.intValue();
                         label_01cb :
                            loggerParams = uoa.c();
                            if (loggerParams != null) {
                               integer = loggerParams.a();
                               if (integer != null) {
                                  i7 = integer.intValue();
                               label_01e0 :
                                  LiveJsCmdSendGiftToAnchorV2$a logExtraInfo = uoa.logExtraInfo;
                                  boolean b2 = (uoa.c() != null)? true: false;
                                  p op = new p(liveJsCmdSen, oh, gift, uoa);
                                  LiveJsCmdSendGiftToAnchorV2$a isAsync = uoa.isAsync;
                                  boolean b3 = (isAsync != null)? isAsync.booleanValue(): false;
                                  uoc1.tb(obj1, gift, objArray1, i4, i3, i5, i6, i7, logExtraInfo, b2, op, b3);
                                  goto label_0210 ;
                               }
                            }
                            i7 = 0;
                            goto label_01e0 ;
                         }
                      }
                      i6 = 0;
                      goto label_01cb ;
                   }
                }
             }else {
                uob1 = uob;
                uoc1 = obj;
             }
             obj1 = this.m();
             LiveSendGiftBaseTraceInfo liveSendGift = obj1.e();
             a.o(liveSendGift, "context.traceInfo");
             Integer integer1 = uoa.b();
             b = (integer1 != null)? integer1.intValue(): -1;
             Gift gift1 = a.a(b);
             if (gift1 != null) {
                liveSendGift.j(gift1);
             }
             liveSendGift.r((uoc1.H4(uob1.c()) + 1));
             liveSendGift.p(uob1.b());
             liveSendGift.n(uob1.c());
             LiveJsCmdSendGiftToAnchorV2$LoggerParams loggerParams1 = uoa.c();
             if (loggerParams1 != null) {
                integer1 = loggerParams1.b();
                if (integer1 != null) {
                   b = integer1.intValue();
                label_00f9 :
                   liveSendGift.t(b);
                   loggerParams1 = uoa.c();
                   if (loggerParams1 != null) {
                      integer1 = loggerParams1.a();
                      if (integer1 != null) {
                         b = integer1.intValue();
                      label_010e :
                         liveSendGift.q(b);
                         obj1.i(uoa.e());
                         liveSendGift.B(uoa.e());
                         goto label_011f ;
                      }
                   }
                   b = 0;
                   goto label_010e ;
                }
             }
             b = 0;
             goto label_00f9 ;
          }
       }
       obj1 = this.m();
       liveJsCmdSen.n(obj1, "CLIENT_CLICK_SEND_GIFT", "[LiveJsCmdSendGiftToAnchorV2][onExecute]js send gift", 1);
       liveJsCmdSen.n(obj1, "CLIENT_SEND_PRE_CHECK", "[LiveJsCmdSendGiftToAnchorV2][onExecute]params not request:"+obj, 0x1871b);
       return m.g.c("invalid params");
    }
    public final i m(){
       c obj = PatchProxy.apply(null, this, LiveJsCmdSendGiftToAnchorV2.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h().a(a.class);
       a.o(obj, "serviceManager.getServic¡­TraceService::class.java\)");
       i oi = new i(obj.o6());
       LiveSendGiftBaseTraceInfo liveSendGift = oi.e();
       a.o(liveSendGift, "context.traceInfo");
       liveSendGift.z(1);
       liveSendGift.s(7);
       return oi;
    }
    public final void n(i p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(LiveJsCmdSendGiftToAnchorV2.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, LiveJsCmdSendGiftToAnchorV2.class, "5")) {
          return;
       }
       c uoc = this.h().a(a.class);
       a.o(uoc, "serviceManager.getServic¡­TraceService::class.java\)");
       if (!this.h().b()) {
          uoc.yk(p0.e()).d(p1).f("SENDING_GIFT").g(p3).e(p2).a();
       }else {
          b.P(b.a, "[LiveJsCmdSendGiftToAnchorV2][logTraceInfo]service manager cleared");
       }
       return;
    }
}
