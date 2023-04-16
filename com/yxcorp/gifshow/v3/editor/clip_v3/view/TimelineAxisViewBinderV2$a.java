package com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinderV2$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinderV2;
import bpc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2;
import bpc.f;

public final class TimelineAxisViewBinderV2$a implements Runnable	// class@000e1b
{
    public final int b;
    public final TimelineAxisViewBinderV2 c;
    public final c d;

    public void TimelineAxisViewBinderV2$a(int p0,TimelineAxisViewBinderV2 p1,c p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, TimelineAxisViewBinderV2$a.class, "1")) {
          return;
       }
       TimelineAxisViewBinderV2$a tc = this.c;
       tc.d.W(this.b, tc.h);
       tc = this.c;
       if (tc.j != null) {
          tc.d.V(this.d.e().c());
          this.c.j = false;
       }
       PatchProxy.onMethodExit(TimelineAxisViewBinderV2$a.class, "1");
       return;
    }
}
