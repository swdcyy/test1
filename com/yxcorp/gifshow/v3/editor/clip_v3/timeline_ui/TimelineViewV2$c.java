package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;

public final class TimelineViewV2$c implements ViewTreeObserver$OnGlobalLayoutListener	// class@000de7
{
    public final View b;
    public final Runnable c;

    public void TimelineViewV2$c(View p0,Runnable p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, TimelineViewV2$c.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.c.run();
       return;
    }
}
