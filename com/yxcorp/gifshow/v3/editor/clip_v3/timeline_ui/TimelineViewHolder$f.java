package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$f;
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
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$f$a;
import java.lang.Runnable;
import ekd.k1;

public final class TimelineViewHolder$f implements View$OnLongClickListener	// class@000de1
{
    public final TimelineViewHolder b;
    public final b c;

    public void TimelineViewHolder$f(TimelineViewHolder p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final boolean onLongClick(View p0){
       p0 = PatchProxy.applyOneRefs(p0, this, TimelineViewHolder$f.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       k1.r(new TimelineViewHolder$f$a(this), 300);
       return true;
    }
}
