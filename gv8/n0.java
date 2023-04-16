package gv8.n0;
import erd.g;
import com.yxcorp.gateway.pay.activity.GatewayPayOrderActivity;
import java.lang.Object;
import com.yxcorp.gateway.pay.response.GatewayPayPrepayResponse;

public final class n0 implements g	// class@0024ee
{
    public final GatewayPayOrderActivity b;

    public void n0(GatewayPayOrderActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       GatewayPayOrderActivity.T2(this.b, p0);
    }
}
