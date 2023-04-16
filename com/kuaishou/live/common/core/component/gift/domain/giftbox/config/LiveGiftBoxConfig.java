package com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$a;
import nsd.u;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.SelectMode;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$ScrollMode;
import z1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import oi1.b;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$panelConfig$1;
import msd.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBottomBarConfig;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$bottomBarConfig$1;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$giftBoxHeight$2;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;

public final class LiveGiftBoxConfig	// class@0011d7
{
    public final b a;
    public final LiveGiftPanelConfig b;
    public final LiveGiftBottomBarConfig c;
    public final boolean d;
    public final String e;
    public final int f;
    public final int g;
    public final p h;
    public final LiveGiftBoxConfig$ScrollMode i;
    public final boolean j;
    public final k k;
    public static final SelectMode l;
    public static final LiveGiftBoxConfig$a m;

    static {
       LiveGiftBoxConfig.m = new LiveGiftBoxConfig$a(null);
       LiveGiftBoxConfig.l = SelectMode.DEFAULT;
    }
    public void LiveGiftBoxConfig(LiveGiftBoxConfig$ScrollMode p0,boolean p1,k p2){
       a.p(p0, "scrollMode");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.a = new b();
       this.b = new LiveGiftPanelConfig(p2, new LiveGiftBoxConfig$panelConfig$1(this));
       this.c = new LiveGiftBottomBarConfig(new LiveGiftBoxConfig$bottomBarConfig$1(this));
       this.d = true;
       this.e = "live_lite_gift_click_frequency_control";
       this.f = 3000;
       this.g = 250;
       this.h = s.c(new LiveGiftBoxConfig$giftBoxHeight$2(this));
    }
    public final boolean a(boolean p0){
       LiveGiftBoxConfig liveGiftBoxC = LiveGiftBoxConfig.class;
       if (PatchProxy.isSupport(liveGiftBoxC)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, liveGiftBoxC, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p0 = (this.f(p0) && this.j != null)? true: false;
       return p0;
    }
    public final LiveGiftBottomBarConfig b(){
       return this.c;
    }
    public final LiveGiftPanelConfig c(){
       return this.b;
    }
    public final LiveGiftBoxConfig$ScrollMode d(boolean p0){
       LiveGiftBoxConfig$ScrollMode pAGER_HORIZO = (p0)? LiveGiftBoxConfig$ScrollMode.PAGER_HORIZONTAL: this.i;
       return pAGER_HORIZO;
    }
    public final b e(){
       return this.a;
    }
    public final boolean f(boolean p0){
       LiveGiftBoxConfig liveGiftBoxC = LiveGiftBoxConfig.class;
       if (PatchProxy.isSupport(liveGiftBoxC)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, liveGiftBoxC, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p0 = (this.d(p0) == LiveGiftBoxConfig$ScrollMode.LIST_VERTICAL)? true: false;
       return p0;
    }
}
