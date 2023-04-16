package gv8.i0;
import fv8.b;
import com.yxcorp.gateway.pay.activity.GatewayPayActivity;
import java.lang.Object;
import java.lang.String;

public final class i0 implements b	// class@0024e2
{
    public final GatewayPayActivity b;

    public void i0(GatewayPayActivity p0){
       this.b = p0;
    }
    public final void onPayFinish(int p0,String p1){
       this.b.onPayFinish(p0, p1);
    }
}
