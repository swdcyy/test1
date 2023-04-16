package mk1.e;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class e	// class@00319f
{
    public GiftTab a;
    public int b;

    public void e(){
       super();
       this.a = GiftTab.NormalGift;
       this.b = -1;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{ "+" mLastSelectedGiftTab = "+this.a+" mLastSelectedGiftId = "+this.b+" }";
    }
}
