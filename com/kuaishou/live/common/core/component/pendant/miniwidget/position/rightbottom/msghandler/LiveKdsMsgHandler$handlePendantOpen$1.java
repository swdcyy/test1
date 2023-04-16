package com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.msghandler.LiveKdsMsgHandler$handlePendantOpen$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import bw1.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveNewActivityPendant;
import java.lang.Object;
import z51.c;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kwai.feature.api.live.merchant.miniwidget.LiveMiniWidgetPositionType;
import yv1.a;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveAnimationInfo;
import com.kuaishou.live.common.core.component.pendant.miniwidget.item.kds.LiveMiniWidgetKdsItem;
import yv1.r;
import com.kwai.robust.PatchProxyResult;
import qv1.a;
import cs5.g;
import nsd.u;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityNewPendantDisplayStyle;
import z51.g;
import android.content.Context;
import p91.m;
import cs5.h;
import cs5.f;
import aw1.a;
import pv1.a;
import yv1.b;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.msghandler.LiveKdsMsgHandler$doHandleWidgetUpdateSignal$1;
import z51.a;
import cs5.d;

public final class LiveKdsMsgHandler$handlePendantOpen$1 extends Lambda implements l	// class@00170f
{
    public final LiveStreamMessages$SCLiveNewActivityPendant $message;
    public final a this$0;

    public void LiveKdsMsgHandler$handlePendantOpen$1(a p0,LiveStreamMessages$SCLiveNewActivityPendant p1){
       this.this$0 = p0;
       this.$message = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(c p0){
       LiveMiniWidgetPositionType rIGHT_BOTTOM;
       LiveStreamMessages$SCLiveNewActivityPendant pendantId;
       a b;
       r a;
       a uoa1;
       Object obj = this;
       Object obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveKdsMsgHandler$handlePendantOpen$1.class, str)) {
          return;
       }
       a.p(obj1, "it");
       LiveKdsMsgHandler$handlePendantOpen$1 this$0 = obj.this$0;
       LiveKdsMsgHandler$handlePendantOpen$1 $message = obj.$message;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidTwoRefs($message, obj1, this$0, a.class, "4")) {
          List e = a.e;
          String str1 = "pendantId";
          b.S(e, "doHandleWidgetUpdateSignal", str1, $message.pendantId);
          if (obj1 == null) {
             b.S(e, "doHandleWidgetUpdateSignal, tkItem == null", str1, $message.pendantId);
          }else if($message.largePendant != null){
             rIGHT_BOTTOM = LiveMiniWidgetPositionType.RIGHT_BOTTOM_LARGE_STYLE;
          }else {
             rIGHT_BOTTOM = LiveMiniWidgetPositionType.RIGHT_BOTTOM_NORMAL;
          }
          LiveMiniWidgetPositionType liveMiniWidg = rIGHT_BOTTOM;
          pendantId = $message.pendantId;
          a.o(pendantId, "message.pendantId");
          LiveStreamMessages$SCLiveNewActivityPendant shrinkBarTit = $message.shrinkBarTitle;
          a.o(shrinkBarTit, "message.shrinkBarTitle");
          LiveStreamMessages$SCLiveNewActivityPendant shrinkBarBac = $message.shrinkBarBackgroundColor;
          a.o(shrinkBarBac, "message.shrinkBarBackgroundColor");
          LiveStreamMessages$SCLiveNewActivityPendant shrinkBarImg = $message.shrinkBarImg;
          LiveStreamMessages$SCLiveNewActivityPendant shrinkBarImg1 = $message.shrinkBarImgTitle;
          LiveStreamMessages$SCLiveNewActivityPendant logMessage = $message.logMessage;
          LiveStreamMessages$SCLiveNewActivityPendant animationInf = ($message.showAnimationInfo != null && $message.largePendant != null)? $message.animationInfo: null;
          a uoa = new a(pendantId, shrinkBarTit, shrinkBarBac, shrinkBarImg, shrinkBarImg1, logMessage, liveMiniWidg, animationInf);
          b = this$0.b;
          a c = this$0.c;
          a = r.a;
          Objects.requireNonNull(a);
          Object obj2 = PatchProxy.applyOneRefs($message, a, r.class, str);
          if (obj2 != PatchProxyResult.class) {
             uoa1 = obj2;
          }else {
             a.p($message, "scWidget");
             shrinkBarBac = $message.pendantId;
             shrinkBarTit = shrinkBarBac;
             a.o(shrinkBarBac, "scWidget.pendantId");
             g og = new g(shrinkBarTit, 0, 0, false, 0, false, 0, 0, false, false, null, null, null, 8190, null);
             obj2.j($message.pendantPriority);
             pendantId = $message.logMessage;
             a.o(pendantId, "scWidget.logMessage");
             obj2.i(pendantId);
             obj2.e($message.displayDurationMs);
             pendantId = $message.displayStyle;
             if (pendantId != null) {
                obj2.d(pendantId.startShowTime);
                obj2.c(pendantId.canAutoClose);
                obj2.f(pendantId.endShowTime);
             }
             uoa1 = new a(obj2, a.a($message));
          }
          LiveMiniWidgetKdsItem liveMiniWidg1 = new LiveMiniWidgetKdsItem(b, c, uoa1, p0, liveMiniWidg, v7);
          uoa.s0(p0.c().d());
          uoa.y0(new a(uoa));
          uoa.A0(new b(new LiveKdsMsgHandler$doHandleWidgetUpdateSignal$1(uoa)));
          this$0.d.J1(uoa);
       }
       return;
    }
}
