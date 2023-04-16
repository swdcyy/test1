package dm2.m;
import ks5.m;
import com.kuaishou.live.core.show.vote.presenter.c;
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

public class m implements m	// class@00254b
{
    public final View a;
    public final c b;

    public void m(c p0,View p1){
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
       return "liveVote";
    }
    public int getLayoutOrder(){
       Object obj = PatchProxy.apply(null, this, m.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder.VOTE.ordinal();
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
       Object obj = PatchProxy.apply(null, this, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority.VOTE.ordinal();
    }
    public int[] q(){
       return l.a(this);
    }
}
