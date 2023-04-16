package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineRecyclerView;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;

public final class TimelineViewV2$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@000de6
{
    public final TimelineViewV2 b;
    public final Runnable c;

    public void TimelineViewV2$b(TimelineViewV2 p0,Runnable p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, TimelineViewV2$b.class, "1")) {
          return;
       }
       this.b.getSegmentRecyclerView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.N(this.c);
       return;
    }
}
