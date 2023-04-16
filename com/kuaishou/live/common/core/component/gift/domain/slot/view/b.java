package com.kuaishou.live.common.core.component.gift.domain.slot.view.b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotItemView;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotItemView$b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b extends m	// class@00127e
{
    public final LiveGiftSlotItemView$b c;
    public final LiveGiftSlotItemView d;

    public void b(LiveGiftSlotItemView p0,LiveGiftSlotItemView$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.c.a();
       return;
    }
}
