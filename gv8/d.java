package gv8.d;
import erd.g;
import iv8.c;
import java.lang.Object;
import com.yxcorp.gateway.pay.response.QueryPayResponse;
import com.yxcorp.gateway.pay.activity.FrontCashierActivity;

public final class d implements g	// class@0024d5
{
    public final c b;

    public void d(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       FrontCashierActivity.lambda$queryPayResult$5(this.b, p0);
    }
}
