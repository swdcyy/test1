package gv8.p0;
import erd.g;
import com.yxcorp.gateway.pay.activity.GatewayPayOrderActivity;
import java.lang.Object;
import java.lang.Throwable;

public final class p0 implements g	// class@0024f2
{
    public final GatewayPayOrderActivity b;

    public void p0(GatewayPayOrderActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       GatewayPayOrderActivity.H2(this.b, p0);
    }
}
