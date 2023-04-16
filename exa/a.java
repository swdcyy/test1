package exa.a;
import nw5.e;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.social.startup.reminder.util.IMConfigUtil;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import zwa.b;
import zwa.a;

public class a implements e	// class@002843
{

    public void a(){
       super();
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean isIMRTCCallBusy(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, IMConfigUtil.class, "18");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          IMConfigInfo iMConfigInfo = IMConfigUtil.i.r();
          iMConfigInfo = (iMConfigInfo != null)? iMConfigInfo.mInvalidPostEntryForbidden: null;
       }
       if (b != null) {
          return false;
       }else {
          return a.a().isIMRTCCallBusy();
       }
    }
}
