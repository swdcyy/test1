package com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelEventHub$6;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelEventHub;
import java.lang.Object;
import java.lang.String;
import ul1.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Set;
import xg1.a;
import java.util.Iterator;
import java.lang.Iterable;
import tl1.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveGiftPanelEventHub$6 implements Model$a	// class@0012cc
{
    public final LiveGiftPanelEventHub b;

    public void LiveGiftPanelEventHub$6(LiveGiftPanelEventHub p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelEventHub$6.class, "1")) {
       }else {
          a.p(p0, "source");
          Iterator iterator = this.b.a().iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (p1 != null) {
                uoa.m(p0, p1);
             }
             if (p2 != null) {
                uoa.l(p0, p2);
             }
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelEventHub$6.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
