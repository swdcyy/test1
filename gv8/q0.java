package gv8.q0;
import android.view.View$OnClickListener;
import com.yxcorp.gateway.pay.activity.GatewayPayOrderActivity;
import java.lang.Object;
import android.view.View;

public final class q0 implements View$OnClickListener	// class@0024f4
{
    public final GatewayPayOrderActivity b;

    public void q0(GatewayPayOrderActivity p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       GatewayPayOrderActivity.L2(this.b, p0);
    }
}
