package gv8.d0;
import android.view.View$OnClickListener;
import com.yxcorp.gateway.pay.activity.GatewayPayActivity;
import java.lang.Object;
import android.view.View;

public final class d0 implements View$OnClickListener	// class@0024d3
{
    public final GatewayPayActivity b;

    public void d0(GatewayPayActivity p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       GatewayPayActivity.O2(this.b, p0);
    }
}
