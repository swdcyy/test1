package bh0.a$c;
import erd.g;
import bh0.a;
import java.lang.Object;
import com.kuaishou.house.live.lottery.HouseLotteryPendantResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import bh0.a$a;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import com.kuaishou.house.live.lottery.HouseLotteryPendantData;

public final class a$c implements g	// class@000382
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          b.P(a.G.a(), "request data is : "+p0);
          this.b.V8(p0.getMData());
       }
       return;
    }
}
