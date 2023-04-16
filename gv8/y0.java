package gv8.y0;
import erd.g;
import com.yxcorp.gateway.pay.activity.GatewayPayOrderActivity;
import java.lang.Object;
import com.yxcorp.gateway.pay.response.GatewayOrderCashierResponse;

public final class y0 implements g	// class@002504
{
    public final GatewayPayOrderActivity b;

    public void y0(GatewayPayOrderActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       GatewayPayOrderActivity.E2(this.b, p0);
    }
}
