package gv8.w;
import erd.g;
import com.yxcorp.gateway.pay.activity.GatewayPayActivity;
import java.lang.Object;
import com.yxcorp.gateway.pay.response.DepositQueryResponse;

public final class w implements g	// class@002501
{
    public final GatewayPayActivity b;

    public void w(GatewayPayActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       GatewayPayActivity.L2(this.b, p0);
    }
}
