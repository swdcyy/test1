package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$h;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dpc.f;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class TimelineViewV2$h implements Runnable	// class@000dec
{
    public final TimelineViewV2 b;
    public final int c;
    public final int d;

    public void TimelineViewV2$h(TimelineViewV2 p0,int p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TimelineViewV2$h.class, "1")) {
          return;
       }
       TimelineViewV2$h tc = this.c;
       this.b.getSegmentAdapter().p0(tc, ((this.d - tc) + 1));
       return;
    }
}
