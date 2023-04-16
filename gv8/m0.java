package gv8.m0;
import android.view.View$OnClickListener;
import com.yxcorp.gateway.pay.activity.GatewayPayOrderActivity;
import java.lang.Object;
import android.view.View;

public final class m0 implements View$OnClickListener	// class@0024ec
{
    public final GatewayPayOrderActivity b;

    public void m0(GatewayPayOrderActivity p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       GatewayPayOrderActivity.G2(this.b, p0);
    }
}
