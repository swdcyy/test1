package gv8.x;
import erd.g;
import com.yxcorp.gateway.pay.activity.GatewayPayActivity;
import java.lang.Object;
import com.yxcorp.gateway.pay.response.GatewayPayConfigResponse;

public final class x implements g	// class@002503
{
    public final GatewayPayActivity b;

    public void x(GatewayPayActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       GatewayPayActivity.M2(this.b, p0);
    }
}
