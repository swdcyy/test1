package ab1.c;
import ks5.m;
import ab1.b;
import android.view.View;
import java.lang.Object;
import android.view.ViewGroup;
import ks5.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Map;
import ab1.g$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder;
import java.lang.Enum;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority;

public class c implements m	// class@000057
{
    public final View a;
    public final b b;

    public void c(b p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public View b(ViewGroup p0){
       return this.a;
    }
    public boolean c(){
       return l.d(this);
    }
    public void d(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       c tb = this.b;
       if (tb.z != null && tb.t.containsKey(Integer.valueOf(0))) {
          this.b.z.a();
       }
       return;
    }
    public void e(ViewGroup p0){
       l.f(this, p0);
    }
    public String getId(){
       return "leftPendants";
    }
    public int getLayoutOrder(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveTopPendantTempPlayService$LiveTempPlayLeftPendantLayoutOrder.WISH_LIST_AND_LIVE_GIFT_RAMPAGE.ordinal();
    }
    public String h(){
       return l.c(this);
    }
    public int l(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getMeasuredWidth();
    }
    public int m(){
       return 1;
    }
    public int n(){
       return 2;
    }
    public int o(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority.WISH_LIST_AND_LIVE_GIFT_RAMPAGE.ordinal();
    }
    public int[] q(){
       return l.a(this);
    }
}
