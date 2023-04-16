package gv8.g0;
import android.view.View$OnClickListener;
import com.yxcorp.gateway.pay.activity.GatewayPayActivity;
import java.lang.Object;
import android.view.View;

public final class g0 implements View$OnClickListener	// class@0024dc
{
    public final GatewayPayActivity b;

    public void g0(GatewayPayActivity p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       GatewayPayActivity.X2(this.b, p0);
    }
}
