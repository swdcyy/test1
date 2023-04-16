package gv8.r0;
import android.view.View$OnClickListener;
import com.yxcorp.gateway.pay.activity.GatewayPayOrderActivity;
import java.lang.Object;
import android.view.View;

public final class r0 implements View$OnClickListener	// class@0024f6
{
    public final GatewayPayOrderActivity b;

    public void r0(GatewayPayOrderActivity p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       GatewayPayOrderActivity.P2(this.b, p0);
    }
}
