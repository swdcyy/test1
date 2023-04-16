package gv8.v;
import erd.g;
import com.yxcorp.gateway.pay.activity.GatewayPayActivity;
import java.lang.Object;
import com.yxcorp.gateway.pay.response.DepositPrepayResponse;

public final class v implements g	// class@0024ff
{
    public final GatewayPayActivity b;

    public void v(GatewayPayActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       GatewayPayActivity.N2(this.b, p0);
    }
}
