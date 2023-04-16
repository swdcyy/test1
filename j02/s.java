package j02.s;
import erd.a;
import j02.o;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j02.v;
import z1.k;
import com.kuaishou.livestream.message.nano.SCLiveEncourageTreasureBoxWidget;
import kotlin.jvm.internal.a;
import java.lang.Runnable;
import e93.f;

public final class s implements a	// class@002a2f
{
    public final o b;
    public final String c;

    public void s(o p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, s.class, "1")) {
          return;
       }
       this.b.i = false;
       v.a().d("ENCOURAGE_TREASURE_BOX_BIZ", this.c, "ENCOURAGE_TREASURE_BOX_SOURCE", this.b.v.get());
       s tc = this.c;
       SCLiveEncourageTreasureBoxWidget sCLiveEncour = this.b.v0();
       if (sCLiveEncour != null) {
          objArray = sCLiveEncour.timerTaskStageId;
       }
       if (a.g(tc, objArray)) {
          f.f(this.b.l);
       }
       return;
    }
}
