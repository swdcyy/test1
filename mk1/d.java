package mk1.d;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class d	// class@00319e
{
    public int a;
    public int b;
    public final GiftTab c;

    public void d(GiftTab p0){
       super();
       this.a = -1;
       this.b = 1;
       this.c = p0;
    }
    public void a(){
       this.a = -1;
       this.b = -1;
    }
    public void b(int p0,int p1){
       this.a = p0;
       this.b = p1;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{ "+" mGiftTab = "+this.c+" mLastSelectedGiftId = "+this.a+" mLastSelectedGiftBatchCount =  "+this.b+" }";
    }
}
