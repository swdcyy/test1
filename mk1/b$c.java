package mk1.b$c;
import java.lang.Object;
import com.kwai.framework.model.user.UserInfo;
import mk1.b$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import com.kuaishou.live.common.core.component.gift.gift.audience.UiMode;

public class b$c	// class@003197
{

    public void b$c(){
       super();
    }
    public static b$b a(UserInfo p0,int p1){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b$c.b(p0, p1, GiftTab.NormalGift);
    }
    public static b$b b(UserInfo p0,int p1,GiftTab p2){
       b$b obj;
       if (PatchProxy.isSupport(b$c.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, b$c.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new b$b(p0, p0);
       obj.b(false);
       obj.g(p1);
       obj.d(p2);
       obj.i(UiMode.NormalMode);
       return obj;
    }
}
