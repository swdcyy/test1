package com.kuaishou.live.common.core.component.gift.domain.slot.view.a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotItemView;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotItemView$b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a extends m	// class@00127d
{
    public final LiveGiftSlotItemView$b c;
    public final LiveGiftSlotItemView d;

    public void a(LiveGiftSlotItemView p0,LiveGiftSlotItemView$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.c.b();
       return;
    }
}
