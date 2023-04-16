package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder;
import epc.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public final class TimelineViewHolder$a implements View$OnClickListener	// class@000dda
{
    public final TimelineViewHolder b;
    public final b c;

    public void TimelineViewHolder$a(TimelineViewHolder p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimelineViewHolder$a.class, "1")) {
          return;
       }
       this.c.b(this.b.getAdapterPosition());
       return;
    }
}
