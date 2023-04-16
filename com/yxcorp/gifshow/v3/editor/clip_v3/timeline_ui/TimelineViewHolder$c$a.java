package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$c$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import epc.b;

public final class TimelineViewHolder$c$a implements Runnable	// class@000ddc
{
    public final TimelineViewHolder$c b;

    public void TimelineViewHolder$c$a(TimelineViewHolder$c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TimelineViewHolder$c$a.class, "1")) {
          return;
       }
       TimelineViewHolder$c$a tb = this.b;
       tb.c.a(tb.b.getAdapterPosition());
       return;
    }
}
