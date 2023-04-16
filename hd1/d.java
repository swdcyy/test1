package hd1.d;
import bq5.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.recharge.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import aq5.d;
import lp3.c;
import lp3.e;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import bq5.c;

public class d implements d	// class@002672
{
    public final a a;

    public void d(a p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.e.a(d.class).r2(AudienceBizRelation.ALIPAY_RECHARGE_ACTIVITY);
    }
    public void b(){
       c.b(this);
    }
    public void onDismiss(){
       c.a(this);
    }
    public void onShow(){
       c.c(this);
    }
}
