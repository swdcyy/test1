package bo3.b;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackInfo;
import om3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fg6.a;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo$SignalExtraInfo;
import com.google.gson.Gson;

public class b	// class@0003ff
{

    public void b(){
       super();
    }
    public static void a(SCLiveConditionRedPackInfo p0,a p1){
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, b.class, "1")) {
          return;
       }
       p1.D0();
       p0 = p0.extraInfo;
       if (p0 != null) {
          obj = a.a.h(p0, LiveConditionRedPacketInfo$SignalExtraInfo.class);
       }
       p1.G0(obj);
       return;
    }
}
