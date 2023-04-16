package com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager$2;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager;
import java.lang.Object;
import java.lang.String;
import ni1.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.LiveGiftBoxDialogVC;
import com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelVC;
import ah1.c;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import ih1.o;
import ih1.f;
import yg1.e;
import eh1.c;
import z1.k;
import nsd.u;
import ni1.e;
import yg1.a;

public final class LiveGiftBoxManager$2 implements Model$a	// class@0011c5
{
    public final LiveGiftBoxManager b;

    public void LiveGiftBoxManager$2(LiveGiftBoxManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftBoxManager$2.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       b a;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftBoxManager$2.class, "1")) {
       }else {
          a.p(p0, "source");
          if (p2 != null) {
             LiveGiftBoxManager$2 tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(p2, tb, LiveGiftBoxManager.class, "13")) {
                a.p(p2, "refreshParam");
                p1 = tb.c;
                if (p1 == null || p2.b == null) {
                   b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxManager][refresh]fetchLatest,param:"+p2);
                   c obj = tb.x.get();
                   a.o(obj, "liveStreamId.get\(\)");
                   Object obj1 = obj;
                   tb = tb.y.get();
                   a.o(tb, "giftApiRequestPathSuffix.get\(\)");
                   obj = new c(obj1, tb, 0, false, 12, null);
                   tb.d.c().b("[LiveGiftBoxManager][refresh]", new e(v7), new e());
                }else {
                   a = p2.a;
                   if (!PatchProxy.applyVoidOneRefs(a, p1, LiveGiftBoxDialogVC.class, "14")) {
                      p2 = "tabId";
                      a.p(a, p2);
                      p1 = p1.m;
                      if (p1 != null && !PatchProxy.applyVoidOneRefs(a, p1, LiveGiftPanelVC.class, "4")) {
                         a.p(a, p2);
                         p1.o.e("[LiveGiftPanelVC][refresh]", a);
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
