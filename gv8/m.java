package gv8.m;
import erd.g;
import com.yxcorp.gateway.pay.activity.FrontCashierActivity;
import com.yxcorp.gateway.pay.params.PaymentInfo;
import java.lang.Object;
import com.yxcorp.gateway.pay.response.CreatePayOrderResponse;

public final class m implements g	// class@0024ed
{
    public final FrontCashierActivity b;
    public final PaymentInfo c;

    public void m(FrontCashierActivity p0,PaymentInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       FrontCashierActivity.P2(this.b, this.c, p0);
    }
}
