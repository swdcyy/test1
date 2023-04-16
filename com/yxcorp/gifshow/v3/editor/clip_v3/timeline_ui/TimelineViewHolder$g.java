package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$g;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder;
import epc.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public final class TimelineViewHolder$g implements View$OnClickListener	// class@000de2
{
    public final TimelineViewHolder b;
    public final b c;

    public void TimelineViewHolder$g(TimelineViewHolder p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimelineViewHolder$g.class, "1")) {
          return;
       }
       this.c.d(this.b.getAdapterPosition());
       return;
    }
}
