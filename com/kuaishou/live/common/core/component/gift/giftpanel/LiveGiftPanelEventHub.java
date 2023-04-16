package com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelEventHub;
import xg1.a;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import wl1.j;
import wl1.h;
import ah1.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelEventHub$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelEventHub$2;
import com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelEventHub$3;
import com.kuaishou.live.common.core.component.gift.giftpanel.model.SelectGiftModelWrapper;
import com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelEventHub$4;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelEventHub$$special$$inlined$forEach$lambda$1;
import com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelEventHub$6;

public final class LiveGiftPanelEventHub extends a	// class@0012cd
{
    public final LifecycleOwner b;

    public void LiveGiftPanelEventHub(LifecycleOwner p0,List p1,j p2,h p3,c p4,c p5,c p6){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "supportTabIds");
       a.p(p2, "tabListModel");
       a.p(p3, "selectTabModel");
       a.p(p4, "showTabModel");
       a.p(p5, "showGiftModel");
       a.p(p6, "showPagerItemModel");
       super();
       this.b = p0;
       p4.b(p0, new LiveGiftPanelEventHub$1(this));
       p3.b(p0, new LiveGiftPanelEventHub$2(this, p2));
       p5.b(p0, new LiveGiftPanelEventHub$3(this));
       p2.h().b(p0, new LiveGiftPanelEventHub$4(this));
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          c uoc = p2.j(str);
          if (uoc != null) {
             uoc.b(this.b, new LiveGiftPanelEventHub$$special$$inlined$forEach$lambda$1(str, this, p2));
          }
       }
       p6.b(this.b, new LiveGiftPanelEventHub$6(this));
       return;
    }
}
