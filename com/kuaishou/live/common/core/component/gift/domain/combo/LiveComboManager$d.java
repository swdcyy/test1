package com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$d;
import erd.g;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager;
import java.lang.Object;
import zca.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;

public final class LiveComboManager$d implements g	// class@00116f
{
    public final LiveComboManager b;

    public void LiveComboManager$d(LiveComboManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveComboManager$d.class, "1")) {
       }else {
          a.p(p0, "event");
          LiveComboManager$d tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveComboManager.class, "6") && p0.a != null) {
             tb.a("SlidingPanelOpen");
          }
       }
       return;
    }
}
