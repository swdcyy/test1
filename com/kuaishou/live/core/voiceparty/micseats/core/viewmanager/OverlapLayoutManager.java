package com.kuaishou.live.core.voiceparty.micseats.core.viewmanager.OverlapLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import kotlin.jvm.internal.a;
import android.view.View;

public final class OverlapLayoutManager extends RecyclerView$LayoutManager	// class@001590
{

    public void OverlapLayoutManager(){
       super();
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, OverlapLayoutManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RecyclerView$LayoutParams(-1, -1);
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OverlapLayoutManager.class, "2")) {
          return;
       }
       a.p(p0, "recycler");
       a.p(p1, "state");
       if (!p1.c()) {
          this.removeAndRecycleAllViews(p0);
          return;
       }else {
          this.detachAndScrapAttachedViews(p0);
          int i = p1.c();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             View view = p0.o(i1);
             a.o(view, "recycler.getViewForPosition\(it\)");
             this.addView(view);
             this.measureChild(view, 0, 0);
             this.layoutDecorated(view, 0, 0, this.getDecoratedMeasuredWidth(view), this.getDecoratedMeasuredHeight(view));
          }
          return;
       }
    }
}
