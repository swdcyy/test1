package gv8.c;
import fv8.b;
import com.yxcorp.gateway.pay.activity.FrontCashierActivity;
import java.lang.Object;
import java.lang.String;

public final class c implements b	// class@0024d2
{
    public final FrontCashierActivity b;

    public void c(FrontCashierActivity p0){
       this.b = p0;
    }
    public final void onPayFinish(int p0,String p1){
       this.b.onPayFinish(p0, p1);
    }
}
