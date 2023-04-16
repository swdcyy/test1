package com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBottomBarConfig$bottomBarHeight$2;
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

public final class LiveGiftBottomBarConfig$bottomBarHeight$2 extends Lambda implements a	// class@0011ce
{
    public final a $verticalScrollModeCallback;

    public void LiveGiftBottomBarConfig$bottomBarHeight$2(a p0){
       this.$verticalScrollModeCallback = p0;
       super(0);
    }
    public final int invoke(){
       LiveGiftBottomBarConfig$bottomBarHeight$2 obj = PatchProxy.apply(null, this, LiveGiftBottomBarConfig$bottomBarHeight$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.$verticalScrollModeCallback;
       int i = (obj != null && obj.invoke().booleanValue() == true)? a1.e(44.00f): a1.e(49.00f);
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
