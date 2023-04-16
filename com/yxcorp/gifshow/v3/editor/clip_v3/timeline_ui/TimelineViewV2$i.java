package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$i;
import epc.a;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2;
import java.lang.Object;
import fpc.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineStatus;

public final class TimelineViewV2$i implements a	// class@000ded
{
    public final TimelineViewV2 a;
    public final a b;

    public void TimelineViewV2$i(TimelineViewV2 p0,a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(int p0,a p1,boolean p2,float p3){
       if (PatchProxy.isSupport(TimelineViewV2$i.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), Float.valueOf(p3), this, TimelineViewV2$i.class, "3")) {
          return;
       }
       a.p(p1, "segment");
       this.a.X();
       return;
    }
    public void b(int p0,a p1,boolean p2,float p3){
       if (PatchProxy.isSupport(TimelineViewV2$i.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), Float.valueOf(p3), this, TimelineViewV2$i.class, "2")) {
          return;
       }
       a.p(p1, "segment");
       if (this.a.getStatus() != TimelineStatus.DRAGGING) {
          return;
       }
       this.b.b(p0, p1, p2, p3);
       return;
    }
    public void c(int p0,a p1,boolean p2){
       if (PatchProxy.isSupport(TimelineViewV2$i.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, TimelineViewV2$i.class, "1")) {
          return;
       }
       a.p(p1, "segment");
       this.a.setStatus(TimelineStatus.DRAGGING);
       this.a.setDraggingIndex(p0);
       this.a.setDraggingLeft(p2);
       this.b.c(p0, p1, p2);
       return;
    }
}
