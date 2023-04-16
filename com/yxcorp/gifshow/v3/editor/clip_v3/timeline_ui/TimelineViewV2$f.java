package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$f;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import dpc.f;

public final class TimelineViewV2$f extends RecyclerView$n	// class@000dea
{
    public final TimelineViewV2 a;

    public void TimelineViewV2$f(TimelineViewV2 p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, TimelineViewV2$f.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       super.c(p0, p1, p2, p3);
       if (p2.getChildAdapterPosition(p1) != (this.a.getSegmentAdapter().getItemCount() - 1)) {
          p0.right = - TimelineViewV2.N;
       }
       return;
    }
}
