package com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM$d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelNormalPagerVM;
import java.lang.Object;
import ul1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import msd.l;
import ah1.c;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveGiftPanelNormalPagerVM$d implements Observer	// class@0012f6
{
    public final LiveGiftPanelNormalPagerVM b;

    public void LiveGiftPanelNormalPagerVM$d(LiveGiftPanelNormalPagerVM p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftPanelNormalPagerVM$d.class, "1")) {
       }else {
          LiveGiftPanelNormalPagerVM$d tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          int i = 1;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveGiftPanelNormalPagerVM.class, "3") && tb.f == null) {
             tb.f = i;
             c uoc = tb.t.invoke(p0.a());
             tb.g = uoc;
             if (uoc != null) {
                uoc.b(tb.j, tb.e);
             }
          }
          int i1 = this.b.v0().e(p0.a());
          b.d0(LiveLogTag.GIFT, "[GiftOpt][LiveGiftPanelNormalPagerVM] observer", "refreshMode", Integer.valueOf(i1), "tabId", p0.a());
          int i2 = (a.g(p0.a(), "NormalGift") ^ i)? 0: i1;
          if (i2 != i) {
             if (i2 != 2) {
                LiveGiftPanelNormalPagerVM.z0(this.b, p0, false, false, 0, 14, null);
             }else {
                this.b.y0(p0, false, i, i2);
             }
          }else {
             LiveGiftPanelNormalPagerVM.z0(this.b, p0, false, false, 0, 14, null);
             this.b.y0(p0, false, false, i2);
          }
       }
       return;
    }
}
