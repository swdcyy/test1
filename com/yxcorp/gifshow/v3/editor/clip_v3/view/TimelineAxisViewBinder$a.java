package com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinder$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinder;
import bpc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2;
import bpc.f;

public final class TimelineAxisViewBinder$a implements Runnable	// class@000e14
{
    public final int b;
    public final TimelineAxisViewBinder c;
    public final c d;

    public void TimelineAxisViewBinder$a(int p0,TimelineAxisViewBinder p1,c p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, TimelineAxisViewBinder$a.class, "1")) {
          return;
       }
       TimelineAxisViewBinder$a tc = this.c;
       tc.d.W(this.b, tc.h);
       tc = this.c;
       if (tc.j != null) {
          tc.d.V(this.d.e().c());
          this.c.j = false;
       }
       PatchProxy.onMethodExit(TimelineAxisViewBinder$a.class, "1");
       return;
    }
}
