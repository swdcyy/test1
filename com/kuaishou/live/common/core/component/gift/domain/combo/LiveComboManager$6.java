package com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$6;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveComboManager$6 implements Model$a	// class@00116a
{
    public final LiveComboManager b;

    public void LiveComboManager$6(LiveComboManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveComboManager$6.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveComboManager$6.class, "1")) {
       }else {
          a.p(p0, "source");
          if (a.g(p2, Boolean.TRUE)) {
             b.Z(LiveGiftTag.COMBO, "[LiveComboManager]disableComboSend");
             this.b.a("disableComboSend");
          }
       }
       return;
    }
}
