package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer$mCurrentSpeedUnselectView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.widget.LinearLayout;

public final class TimeLineTagContainer$mCurrentSpeedUnselectView$2 extends Lambda implements a	// class@000dd3
{
    public final TimeLineTagContainer this$0;

    public void TimeLineTagContainer$mCurrentSpeedUnselectView$2(TimeLineTagContainer p0){
       this.this$0 = p0;
       super(0);
    }
    public final TextView invoke(){
       Object obj = PatchProxy.apply(null, this, TimeLineTagContainer$mCurrentSpeedUnselectView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.findViewById(0x7f0a0a2d);
    }
    public Object invoke(){
       return this.invoke();
    }
}