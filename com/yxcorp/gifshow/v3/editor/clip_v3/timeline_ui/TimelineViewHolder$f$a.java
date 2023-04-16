package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$f$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import epc.b;

public final class TimelineViewHolder$f$a implements Runnable	// class@000de0
{
    public final TimelineViewHolder$f b;

    public void TimelineViewHolder$f$a(TimelineViewHolder$f p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TimelineViewHolder$f$a.class, "1")) {
          return;
       }
       TimelineViewHolder$f$a tb = this.b;
       tb.c.a(tb.b.getAdapterPosition());
       return;
    }
}
