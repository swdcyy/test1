package com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveGiftBoxManager$1 implements Model$a	// class@0011c4
{
    public final LiveGiftBoxManager b;

    public void LiveGiftBoxManager$1(LiveGiftBoxManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftBoxManager$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftBoxManager$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (a.g(p2, Boolean.TRUE)) {
             this.b.b();
          }
       }
       return;
    }
}
