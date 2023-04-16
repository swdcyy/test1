package com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2$b;
import java.lang.Runnable;
import com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dd0.b;
import ld0.d;
import ld0.c;
import android.view.View;
import android.app.Activity;
import com.yxcorp.utility.n;

public final class SectionPendantV2$b implements Runnable	// class@000620
{
    public final SectionPendantV2 b;

    public void SectionPendantV2$b(SectionPendantV2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SectionPendantV2$b.class, "1")) {
          return;
       }
       if (d.a().JF()) {
          c.c("bindTimeScheduleAuto2Absorb return in absorb");
          return;
       }else {
          c.c("bindTimeScheduleAuto2Absorb start");
          Activity uActivity = n.d(this.b);
          if (uActivity != null) {
             d.a().EA(uActivity);
          }
          this.b.K = null;
          return;
       }
    }
}
