package d62.a;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.e;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;

public class a extends e	// class@002473
{
    public static String sLivePresenterClassName = "LiveConditionRedPacketGiftCurrentInfoBottomLayoutPresenter";

    public void a(){
       super();
    }
    public String R8(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.p(0x7f101fe1);
    }
}
