package bo3.d;
import on3.g;
import eo3.w;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse$CurrentExtraInfo;
import bo3.c;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;

public class d extends g	// class@000401
{

    public void d(w p0){
       super(p0);
    }
    public String E0(RedPacketConditionRedPackInfoWrapper p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = p0.g();
       String str = k0.a(p0.d(), c.a).or("");
       if (TextUtils.x(str)) {
          return super.E0(p0);
       }
       Object[] objArray = new Object[]{a1.q(0x7f1025f3, i),str};
       return String.format("%s£¬%s", objArray);
    }
}
