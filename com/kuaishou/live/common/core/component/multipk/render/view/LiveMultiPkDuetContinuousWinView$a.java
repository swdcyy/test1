package com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkDuetContinuousWinView$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkDuetContinuousWinView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkDuetContinuousWinView$c;

public class LiveMultiPkDuetContinuousWinView$a extends m	// class@001676
{
    public final LiveMultiPkDuetContinuousWinView c;

    public void LiveMultiPkDuetContinuousWinView$a(LiveMultiPkDuetContinuousWinView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkDuetContinuousWinView$a.class, "1")) {
          return;
       }
       LiveMultiPkDuetContinuousWinView l = this.c.L;
       if (l != null) {
          l.onClick();
       }
       return;
    }
}