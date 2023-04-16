package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftGridPagerView$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftGridPagerView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import rm1.k;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftGridPagerView$c;

public final class LiveGiftGridPagerView$a extends RecyclerView$r	// class@00121a
{
    public final LiveGiftGridPagerView a;

    public void LiveGiftGridPagerView$a(LiveGiftGridPagerView p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       LiveGiftGridPagerView$a uoa = LiveGiftGridPagerView$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (!p1) {
          List list = k.b.a(this.a);
          Iterator iterator = this.a.f.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(list);
          }
       }
       return;
    }
}
