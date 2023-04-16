package bo3.h;
import pn3.e;
import eo3.w;
import androidx.lifecycle.MutableLiveData;
import java.lang.Object;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lo3.c;
import lo3.a;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse$LiveConditionRedPacketCurrentInfo;

public class h extends e	// class@000407
{
    public final MutableLiveData o;

    public void h(w p0){
       super(p0);
       this.o = new MutableLiveData("");
    }
    public void G0(LiveConditionRedPacketCurrentInfoResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       if (p0 != null && p0.mCurrentInfo != null) {
          c uoc = new c(1);
          p0 = p0.mCurrentInfo;
          a uoa = new a(p0.mRedPacketUnitValue);
          uoa.e = p0.mRedPacketCount;
          uoc.b = uoa;
          this.k.setValue(uoc);
       }
       return;
    }
}
