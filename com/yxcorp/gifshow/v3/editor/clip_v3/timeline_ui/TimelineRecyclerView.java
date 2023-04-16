package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineRecyclerView;
import com.yxcorp.gifshow.widget.UserTouchRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineRecyclerView$a;
import androidx.recyclerview.widget.RecyclerView$j;
import androidx.recyclerview.widget.RecyclerView;

public final class TimelineRecyclerView extends UserTouchRecyclerView	// class@000dd8
{
    public HashMap i;

    public void TimelineRecyclerView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void TimelineRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void TimelineRecyclerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void TimelineRecyclerView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void y(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimelineRecyclerView.class, "1")) {
          return;
       }
       a.p(p0, "context");
       super.y(p0);
       this.setChildrenDrawingOrderEnabled(true);
       this.setChildDrawingOrderCallback(new TimelineRecyclerView$a(this));
       return;
    }
}
