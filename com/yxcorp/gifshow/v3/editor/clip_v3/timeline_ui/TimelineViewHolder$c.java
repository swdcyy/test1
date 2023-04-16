package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$c;
import android.view.View$OnLongClickListener;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder;
import epc.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$c$a;
import java.lang.Runnable;
import ekd.k1;

public final class TimelineViewHolder$c implements View$OnLongClickListener	// class@000ddd
{
    public final TimelineViewHolder b;
    public final b c;

    public void TimelineViewHolder$c(TimelineViewHolder p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final boolean onLongClick(View p0){
       p0 = PatchProxy.applyOneRefs(p0, this, TimelineViewHolder$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       k1.r(new TimelineViewHolder$c$a(this), 300);
       return true;
    }
}
