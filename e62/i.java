package e62.i;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.i;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import com.kwai.framework.model.user.User;
import p91.m;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketPanelValueInfoView;
import java.util.Map;

public class i extends i	// class@00263b
{
    public static String sLivePresenterClassName = "LiveConditionRedPacketNormalCurrentInfoTopLayoutPresenter";

    public void i(){
       super();
    }
    public String R8(){
       Object obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.p(0x7f101fc5);
    }
    public int S8(){
       return 6;
    }
    public User V8(){
       Object obj = PatchProxy.apply(null, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C.I();
    }
    public void b9(LiveConditionRedPacketInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "3")) {
          return;
       }
       if (p0.w.getValue() == null) {
          return;
       }
       this.x.L(p0.w.getValue().intValue());
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(i.class, null);
       return objectsByTag;
    }
}
