package com.kuaishou.live.common.core.component.gift.giftpanel.giftitem.LiveGiftPanelNormalItemVM$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.gift.giftpanel.giftitem.LiveGiftPanelNormalItemVM;
import java.lang.Object;
import ul1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ah1.c;

public final class LiveGiftPanelNormalItemVM$b implements Observer	// class@0012d3
{
    public final LiveGiftPanelNormalItemVM b;

    public void LiveGiftPanelNormalItemVM$b(LiveGiftPanelNormalItemVM p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftPanelNormalItemVM$b.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.z0(p0);
          this.b.q.e("[LiveGiftPanelNormalItemVM]observer", p0);
       }
       return;
    }
}
