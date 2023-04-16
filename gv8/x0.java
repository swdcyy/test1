package gv8.x0;
import erd.a;
import com.yxcorp.gateway.pay.activity.GatewayPayOrderActivity;
import java.lang.Object;

public final class x0 implements a	// class@002502
{
    public final GatewayPayOrderActivity b;
    public final boolean c;

    public void x0(GatewayPayOrderActivity p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       GatewayPayOrderActivity.O2(this.b, this.c);
    }
}
