package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$b;
import android.view.View$OnTouchListener;
import epc.b;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class TimelineViewHolder$b implements View$OnTouchListener	// class@000ddb
{
    public final b b;

    public void TimelineViewHolder$b(b p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, TimelineViewHolder$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.o(p1, "event");
       if (!p1.getAction()) {
          this.b.c();
       }
       return false;
    }
}
