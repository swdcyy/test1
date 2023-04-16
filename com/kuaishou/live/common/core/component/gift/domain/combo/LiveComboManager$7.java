package com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$7;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager;
import java.lang.Object;
import java.lang.String;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveComboManager$7 implements Model$a	// class@00116b
{
    public final LiveComboManager b;

    public void LiveComboManager$7(LiveComboManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveComboManager$7.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveComboManager$7.class, "1")) {
       }else {
          a.p(p0, "source");
          if (p2 == null || p2.b() != 1) {
             this.b.a("sendGiftFailed");
          }
       }
       return;
    }
}
