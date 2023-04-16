package gv8.r;
import erd.g;
import iv8.c;
import java.lang.Object;
import com.yxcorp.gateway.pay.response.QueryPayResponse;
import com.yxcorp.gateway.pay.activity.FrontCashierOneStepActivity;

public final class r implements g	// class@0024f7
{
    public final c b;

    public void r(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       FrontCashierOneStepActivity.lambda$queryPayResult$0(this.b, p0);
    }
}
