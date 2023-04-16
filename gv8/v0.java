package gv8.v0;
import fv8.b;
import com.yxcorp.gateway.pay.activity.GatewayPayOrderActivity;
import java.lang.Object;
import java.lang.String;

public final class v0 implements b	// class@0024fe
{
    public final GatewayPayOrderActivity b;

    public void v0(GatewayPayOrderActivity p0){
       super();
       this.b = p0;
    }
    public final void onPayFinish(int p0,String p1){
       this.b.onPayFinish(p0, p1);
    }
}
