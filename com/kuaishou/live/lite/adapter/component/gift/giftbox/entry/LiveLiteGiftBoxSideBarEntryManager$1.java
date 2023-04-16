package com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import o73.c;

public final class LiveLiteGiftBoxSideBarEntryManager$1 implements Model$a	// class@001dbe
{
    public final LiveLiteGiftBoxSideBarEntryManager b;

    public void LiveLiteGiftBoxSideBarEntryManager$1(LiveLiteGiftBoxSideBarEntryManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLiteGiftBoxSideBarEntryManager$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLiteGiftBoxSideBarEntryManager$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (a.g(p2, Boolean.TRUE)) {
             b.P(LiveLogTag.GIFT.appendTag("LiveGiftSideBarManager"), "disableGiftPanel, hideGiftSideBar");
             this.b.e();
             this.b.c().b(0x30e6d, "[LiveGiftSideBarManager][giftPanelDisableModel]");
          }
       }
       return;
    }
}
