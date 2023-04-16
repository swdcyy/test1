package gv8.u0;
import android.view.View$OnClickListener;
import com.yxcorp.gateway.pay.activity.GatewayPayOrderActivity;
import java.util.Map;
import java.lang.Object;
import android.view.View;

public final class u0 implements View$OnClickListener	// class@0024fc
{
    public final GatewayPayOrderActivity b;
    public final Map c;

    public void u0(GatewayPayOrderActivity p0,Map p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       GatewayPayOrderActivity.Q2(this.b, this.c, p0);
    }
}
