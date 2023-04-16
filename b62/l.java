package b62.l;
import erd.g;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.i;
import java.lang.Object;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import brd.y;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import mkc.b;
import mkc.c;

public final class l implements g	// class@000348
{
    public final i b;

    public void l(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       tb.D = p0;
       tb.r.onNext(p0);
       if (PatchProxy.applyVoid(null, tb, i.class, "13")) {
       }else {
          tb.a9(true);
          tb.A.setVisibility(8);
          b[] uobArray = new b[true];
          uobArray[0] = b.d;
          c.d(tb.z, uobArray);
       }
       tb.b9(p0);
       return;
    }
}
