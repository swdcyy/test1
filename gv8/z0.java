package gv8.z0;
import fv8.b;
import com.yxcorp.gateway.pay.activity.GatewayPayOrderV2Activity;
import java.lang.Object;
import java.lang.String;

public final class z0 implements b	// class@002506
{
    public final GatewayPayOrderV2Activity b;

    public void z0(GatewayPayOrderV2Activity p0){
       this.b = p0;
    }
    public final void onPayFinish(int p0,String p1){
       this.b.onPayFinish(p0, p1);
    }
}
