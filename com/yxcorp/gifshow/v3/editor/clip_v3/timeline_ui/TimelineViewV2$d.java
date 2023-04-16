package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$d;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer;

public final class TimelineViewV2$d extends RecyclerView$r	// class@000de8
{

    public void TimelineViewV2$d(){
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(TimelineViewV2$d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TimelineViewV2$d.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       p1 = 0;
       p2 = p0.getChildCount();
       while (p1 < p2) {
          View childAt = p0.getChildAt(p1);
          if (childAt != null) {
             childAt = childAt.findViewById(R.id.info_text_container);
             Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer");
             childAt.a();
          }
          p1++;
       }
       return;
    }
}
