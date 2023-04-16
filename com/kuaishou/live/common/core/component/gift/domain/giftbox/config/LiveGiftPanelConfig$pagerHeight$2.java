package com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig$pagerHeight$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import lnc.a1;
import java.lang.Integer;

public final class LiveGiftPanelConfig$pagerHeight$2 extends Lambda implements a	// class@0011db
{
    public final a $verticalScrollModeCallback;

    public void LiveGiftPanelConfig$pagerHeight$2(a p0){
       this.$verticalScrollModeCallback = p0;
       super(0);
    }
    public final int invoke(){
       LiveGiftPanelConfig$pagerHeight$2 obj = PatchProxy.apply(null, this, LiveGiftPanelConfig$pagerHeight$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.$verticalScrollModeCallback;
       int i = (obj != null && obj.invoke().booleanValue() == true)? a1.e(290.00f): a1.e(260.00f);
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
