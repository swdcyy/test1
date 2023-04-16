package gv8.c0;
import erd.g;
import com.yxcorp.gateway.pay.activity.GatewayPayActivity;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gateway.pay.response.GatewayPayPrepayResponse;

public final class c0 implements g	// class@0024d0
{
    public final GatewayPayActivity b;
    public final String c;

    public void c0(GatewayPayActivity p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       GatewayPayActivity.W2(this.b, this.c, p0);
    }
}
