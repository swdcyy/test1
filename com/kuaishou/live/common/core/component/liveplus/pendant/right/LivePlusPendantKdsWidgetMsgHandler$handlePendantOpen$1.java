package com.kuaishou.live.common.core.component.liveplus.pendant.right.LivePlusPendantKdsWidgetMsgHandler$handlePendantOpen$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import uo1.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLivePlusActivityPendant;
import java.lang.Object;
import z51.c;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.feature.api.live.merchant.miniwidget.LiveMiniWidgetPositionType;
import com.kuaishou.live.common.core.component.pendant.miniwidget.item.kds.LiveMiniWidgetKdsItem;
import uo1.f;
import com.kwai.robust.PatchProxyResult;
import qv1.a;
import cs5.g;
import nsd.u;
import z51.g;
import android.content.Context;
import p91.m;
import cs5.h;
import z51.a;
import java.util.ArrayList;
import cs5.f;
import cs5.d;

public final class LivePlusPendantKdsWidgetMsgHandler$handlePendantOpen$1 extends Lambda implements l	// class@001499
{
    public final LiveStreamMessages$SCLivePlusActivityPendant $message;
    public final a this$0;

    public void LivePlusPendantKdsWidgetMsgHandler$handlePendantOpen$1(a p0,LiveStreamMessages$SCLivePlusActivityPendant p1){
       this.this$0 = p0;
       this.$message = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(c p0){
       f a;
       a uoa;
       LiveStreamMessages$SCLivePlusActivityPendant pendantId;
       Object obj = this;
       Object obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LivePlusPendantKdsWidgetMsgHandler$handlePendantOpen$1.class, str)) {
          return;
       }
       a.p(obj1, "it");
       LivePlusPendantKdsWidgetMsgHandler$handlePendantOpen$1 this$0 = obj.this$0;
       LivePlusPendantKdsWidgetMsgHandler$handlePendantOpen$1 $message = obj.$message;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidTwoRefs($message, obj1, this$0, a.class, "4")) {
          b.c0(LiveCommonLogTag.LIVE_PLUS, "doHandleWidgetUpdateSignal", "pendantId", $message.pendantId);
          LiveMiniWidgetPositionType rIGHT_BOTTOM = LiveMiniWidgetPositionType.RIGHT_BOTTOM_LIVE_PLUS;
          a c = this$0.c;
          a d = this$0.d;
          a = f.a;
          Objects.requireNonNull(a);
          Object obj2 = PatchProxy.applyOneRefs($message, a, f.class, str);
          if (obj2 != PatchProxyResult.class) {
             uoa = obj2;
          }else {
             a.p($message, "scWidget");
             pendantId = $message.pendantId;
             LiveStreamMessages$SCLivePlusActivityPendant sCLivePlusAc = pendantId;
             a.o(pendantId, "scWidget.pendantId");
             g og = new g(sCLivePlusAc, 0, 0, false, 0, false, 0, 0, false, false, null, null, null, 8190, null);
             LiveStreamMessages$SCLivePlusActivityPendant logParams = $message.logParams;
             a.o(logParams, "scWidget.logParams");
             obj2.i(logParams);
             obj2.e($message.displayDurationMs);
             obj2.c(true);
             obj2.f($message.endTime);
             uoa = new a(obj2, a.a($message));
          }
          LiveMiniWidgetKdsItem liveMiniWidg = new LiveMiniWidgetKdsItem(c, d, uoa, p0, rIGHT_BOTTOM, null);
          v9.A0(this$0.f);
          this$0.b.add(v9);
          this$0.e.J1(v9);
       }
       return;
    }
}
