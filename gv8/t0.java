package gv8.t0;
import android.view.View$OnClickListener;
import com.yxcorp.gateway.pay.activity.GatewayPayOrderActivity;
import java.util.Map;
import java.lang.Object;
import android.view.View;

public final class t0 implements View$OnClickListener	// class@0024fa
{
    public final GatewayPayOrderActivity b;
    public final Map c;

    public void t0(GatewayPayOrderActivity p0,Map p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       GatewayPayOrderActivity.N2(this.b, this.c, p0);
    }
}
