package com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.msghandler.LiveKdsMsgHandler$doHandleWidgetUpdateSignal$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.pendant.miniwidget.item.kds.LiveMiniWidgetKdsItem;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import cs5.b;
import cs5.f;

public final class LiveKdsMsgHandler$doHandleWidgetUpdateSignal$1 extends Lambda implements l	// class@00170e
{
    public final LiveMiniWidgetKdsItem $kdsItem;

    public void LiveKdsMsgHandler$doHandleWidgetUpdateSignal$1(LiveMiniWidgetKdsItem p0){
       this.$kdsItem = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(LiveKdsMsgHandler$doHandleWidgetUpdateSignal$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveKdsMsgHandler$doHandleWidgetUpdateSignal$1.class, "1")) {
          return;
       }
       b uob = this.$kdsItem.k();
       if (uob != null) {
          uob.l(p0, "LiveRightBottomRevenueNativeInvoker");
       }
       return;
    }
}
