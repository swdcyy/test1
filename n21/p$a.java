package n21.p$a;
import ks5.m;
import n21.p;
import android.view.View;
import java.lang.Object;
import android.view.ViewGroup;
import ks5.l;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder;
import java.lang.Enum;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority;

public class p$a implements m	// class@003298
{
    public final View a;
    public final p b;

    public void p$a(p p0,View p1){
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
       l.e(this, p0);
    }
    public void e(ViewGroup p0){
       l.f(this, p0);
    }
    public String getId(){
       return "liveCommonActivityPendant";
    }
    public int getLayoutOrder(){
       Object obj = PatchProxy.apply(null, this, p$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder.LIVE_COMMON_ACTIVITY_PENDANT.ordinal();
    }
    public String h(){
       return l.c(this);
    }
    public int l(){
       return l.b(this);
    }
    public int m(){
       return 2;
    }
    public int n(){
       return 2;
    }
    public int o(){
       Object obj = PatchProxy.apply(null, this, p$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority.LIVE_COMMON_ACTIVITY_PENDANT.ordinal();
    }
    public int[] q(){
       return l.a(this);
    }
}
