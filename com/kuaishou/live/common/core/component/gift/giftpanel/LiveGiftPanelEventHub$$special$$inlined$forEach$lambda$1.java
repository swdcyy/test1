package com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelEventHub$$special$$inlined$forEach$lambda$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelEventHub;
import wl1.j;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ul1.d;
import java.util.Set;
import xg1.a;
import java.util.Iterator;
import java.lang.Iterable;
import tl1.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveGiftPanelEventHub$$special$$inlined$forEach$lambda$1 implements Model$a	// class@0012c7
{
    public final String b;
    public final LiveGiftPanelEventHub c;
    public final j d;

    public void LiveGiftPanelEventHub$$special$$inlined$forEach$lambda$1(String p0,LiveGiftPanelEventHub p1,j p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, LiveGiftPanelEventHub$$special$$inlined$forEach$lambda$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (p2 != null) {
             d uod = this.d.i(this.b);
             if (uod != null) {
                Iterator iterator = this.c.a().iterator();
                while (iterator.hasNext()) {
                   iterator.next().f(p0, p2, uod);
                }
                PatchProxy.onMethodExit(LiveGiftPanelEventHub$$special$$inlined$forEach$lambda$1.class, "1");
             }else {
                PatchProxy.onMethodExit(LiveGiftPanelEventHub$$special$$inlined$forEach$lambda$1.class, "1");
             }
          }else {
             PatchProxy.onMethodExit(LiveGiftPanelEventHub$$special$$inlined$forEach$lambda$1.class, "1");
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, LiveGiftPanelEventHub$$special$$inlined$forEach$lambda$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
          PatchProxy.onMethodExit(LiveGiftPanelEventHub$$special$$inlined$forEach$lambda$1.class, "2");
       }
       return;
    }
}
