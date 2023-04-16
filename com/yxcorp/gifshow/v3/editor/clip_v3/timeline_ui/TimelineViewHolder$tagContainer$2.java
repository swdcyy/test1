package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewHolder$tagContainer$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TimelineViewHolder$tagContainer$2 extends Lambda implements a	// class@000de3
{
    public final View $itemView;

    public void TimelineViewHolder$tagContainer$2(View p0){
       this.$itemView = p0;
       super(0);
    }
    public final TimeLineTagContainer invoke(){
       Object obj = PatchProxy.apply(null, this, TimelineViewHolder$tagContainer$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.$itemView.findViewById(0x7f0a13ed);
    }
    public Object invoke(){
       return this.invoke();
    }
}
