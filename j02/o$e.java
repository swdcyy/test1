package j02.o$e;
import java.lang.Runnable;
import j02.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.SCLiveEncourageTreasureBoxWidget;
import j02.v;
import java.lang.System;
import j02.u;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.util.List;
import com.kuaishou.android.live.log.b;
import x51.a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import k02.c;
import e93.f;

public final class o$e implements Runnable	// class@002a2a
{
    public final o b;

    public void o$e(o p0){
       this.b = p0;
       super();
    }
    public void run(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o$e.class, "1")) {
          return;
       }
       SCLiveEncourageTreasureBoxWidget sCLiveEncour = this.b.v0();
       if (sCLiveEncour != null) {
          sCLiveEncour = sCLiveEncour.timerTaskStageSeconds;
          o$e tb = this.b;
          if (tb.D0(tb.v0()) && sCLiveEncour > null) {
             sCLiveEncour = this.b.v0();
             if (sCLiveEncour != null) {
                sCLiveEncour = sCLiveEncour.timerTaskStageId;
                if (sCLiveEncour != null) {
                   long l = v.a().e("ENCOURAGE_TREASURE_BOX_BIZ", sCLiveEncour, "ENCOURAGE_TREASURE_BOX_SOURCE");
                   if ((System.currentTimeMillis() - this.b.h) - 5000 > 0) {
                      List a = u.a;
                      StringBuilder str = "updateTaskInfoRunnable, "+"watchTimeDurationMs:"+l+", total: ";
                      SCLiveEncourageTreasureBoxWidget sCLiveEncour1 = this.b.v0();
                      Integer integer = (sCLiveEncour1 != null)? Integer.valueOf(sCLiveEncour1.timerTaskStageSeconds): objArray;
                      tb = this.b;
                      b.P(a, str+integer+", "+" progress: "+tb.y0(tb.v0()));
                      this.b.h = a.a.a();
                   }
                   o$e tb1 = this.b;
                   MutableLiveData mutableLiveD = tb1.r0(tb1.x0());
                   SCLiveEncourageTreasureBoxWidget sCLiveEncour2 = this.b.v0();
                   if (sCLiveEncour2 != null) {
                      objArray = sCLiveEncour2.timerTaskStageId;
                   }
                   o$e tb2 = this.b;
                   int i = tb2.y0(tb2.v0());
                   SCLiveEncourageTreasureBoxWidget sCLiveEncour3 = this.b.v0();
                   b = (sCLiveEncour3 == null || sCLiveEncour3.timerTaskStageStatus != 3)? true: false;
                   mutableLiveD.setValue(new c(true, objArray, i, b));
                   f.j("LiveAudienceTreasureBoxViewModel updateTaskInfoRunnable", this, 50);
                }
             }
          }
       }
       return;
    }
}
