package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$layoutManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.OffsetLinearLayoutManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.ViewGroup;

public final class TimelineViewV2$layoutManager$2 extends Lambda implements a	// class@000def
{
    public final TimelineViewV2 this$0;

    public void TimelineViewV2$layoutManager$2(TimelineViewV2 p0){
       this.this$0 = p0;
       super(0);
    }
    public final OffsetLinearLayoutManager invoke(){
       Object obj = PatchProxy.apply(null, this, TimelineViewV2$layoutManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new OffsetLinearLayoutManager(this.this$0.getContext(), 0, 0);
    }
    public Object invoke(){
       return this.invoke();
    }
}
