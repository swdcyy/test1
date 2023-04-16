package com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListDataBinding$bindViewModel$6$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import yn1.g;
import java.lang.Integer;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListLayoutManager;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListDataBinding;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView;

public final class LiveHotSpotRankListDataBinding$bindViewModel$6$1 extends Lambda implements a	// class@00142e
{
    public final Integer $position;
    public final g this$0;

    public void LiveHotSpotRankListDataBinding$bindViewModel$6$1(g p0,Integer p1){
       this.this$0 = p0;
       this.$position = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotRankListDataBinding$bindViewModel$6$1.class, "1")) {
          return;
       }
       if (this.$position.intValue() > 0) {
          LiveHotSpotRankListDataBinding c = this.this$0.b.c;
          a.o(c, "recyclerView");
          LiveHotSpotRankListDataBinding$bindViewModel$6$1 t$position = this.$position;
          a.o(t$position, "position");
          this.this$0.b.b().smoothScrollToPosition(c, new RecyclerView$y(), t$position.intValue());
       }
       return;
    }
}
