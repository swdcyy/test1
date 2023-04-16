package com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2$a;
import java.lang.Runnable;
import com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.pendant.coin.task.double.PendantDoubleExpHelper;

public final class SectionPendantV2$a implements Runnable	// class@00061f
{
    public final SectionPendantV2 b;

    public void SectionPendantV2$a(SectionPendantV2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SectionPendantV2$a.class, "1")) {
          return;
       }
       SectionPendantV2 y = this.b.y;
       if (y != null) {
          y.b();
       }
       SectionPendantV2$a tb = this.b;
       tb.L = null;
       tb.v();
       return;
    }
}
