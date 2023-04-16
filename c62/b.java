package c62.b;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.i;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import com.kwai.framework.model.user.User;
import p91.m;
import java.util.Map;

public class b extends i	// class@0004d5
{
    public static String sLivePresenterClassName = "LiveConditionRedPacketFansGroupCurrentInfoTopLayoutPresenter";

    public void b(){
       super();
    }
    public String R8(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.p(0x7f101fc2);
    }
    public int S8(){
       return 126;
    }
    public User V8(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C.I();
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(b.class, null);
       return objectsByTag;
    }
}
