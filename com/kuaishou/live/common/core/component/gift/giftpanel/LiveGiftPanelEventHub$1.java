package com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelEventHub$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelEventHub;
import java.lang.Object;
import java.lang.String;
import ul1.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Set;
import xg1.a;
import java.util.Iterator;
import java.lang.Iterable;
import tl1.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveGiftPanelEventHub$1 implements Model$a	// class@0012c8
{
    public final LiveGiftPanelEventHub b;

    public void LiveGiftPanelEventHub$1(LiveGiftPanelEventHub p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelEventHub$1.class, "1")) {
       }else {
          a.p(p0, "source");
          p1 = this.b.a().iterator();
          while (p1.hasNext()) {
             a uoa = p1.next();
             if (p2 != null) {
                uoa.i(p0, p2);
             }
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelEventHub$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
