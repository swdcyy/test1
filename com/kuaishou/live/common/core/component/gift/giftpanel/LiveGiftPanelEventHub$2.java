package com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelEventHub$2;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelEventHub;
import wl1.j;
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
import wl1.g;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import ul1.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveGiftPanelEventHub$2 implements Model$a	// class@0012c9
{
    public final LiveGiftPanelEventHub b;
    public final j c;

    public void LiveGiftPanelEventHub$2(LiveGiftPanelEventHub p0,j p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       g og;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelEventHub$2.class, "1")) {
       }else {
          a.p(p0, "source");
          Iterator iterator = this.b.a().iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             a uoa1 = null;
             if (p1 != null) {
                uoa.a(p0, p1);
                og = this.c.g(p1.a());
                a og1 = (og != null)? og.a(): uoa1;
                uoa.e(p0, og1);
             }
             if (p2 != null) {
                uoa.d(p0, p2);
                og = this.c.g(p2.a());
                if (og != null) {
                   uoa1 = og.a();
                }
                uoa.j(p0, uoa1);
             }
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftPanelEventHub$2.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
