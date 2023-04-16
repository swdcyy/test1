package com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinder$totalTime$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinder;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.view.ViewGroup;

public final class TimelineAxisViewBinder$totalTime$2 extends Lambda implements a	// class@000e19
{
    public final TimelineAxisViewBinder this$0;

    public void TimelineAxisViewBinder$totalTime$2(TimelineAxisViewBinder p0){
       this.this$0 = p0;
       super(0);
    }
    public final TextView invoke(){
       Object obj = PatchProxy.apply(null, this, TimelineAxisViewBinder$totalTime$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.d.findViewById(0x7f0a4029);
    }
    public Object invoke(){
       return this.invoke();
    }
}
