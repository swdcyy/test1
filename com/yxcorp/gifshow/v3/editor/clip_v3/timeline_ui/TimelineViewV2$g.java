package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$g;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dpc.f;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class TimelineViewV2$g implements Runnable	// class@000deb
{
    public final TimelineViewV2 b;

    public void TimelineViewV2$g(TimelineViewV2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TimelineViewV2$g.class, "1")) {
          return;
       }
       this.b.getSegmentAdapter().p0(0, this.b.getSegmentAdapter().getItemCount());
       return;
    }
}
