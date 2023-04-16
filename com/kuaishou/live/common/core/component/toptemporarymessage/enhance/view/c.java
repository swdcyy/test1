package com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.c;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.LiveTempEnhanceView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.b;
import yb7.p;

public final class c implements Runnable	// class@0017b1
{
    public final LiveTempEnhanceView b;

    public void c(LiveTempEnhanceView p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       tb.d();
       if (PatchProxy.applyVoid(null, tb, LiveTempEnhanceView.class, "10")) {
       }else {
          p.f(new b(tb), tb, (tb.g - 1000));
       }
       return;
    }
}
