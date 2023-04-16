package gv8.t;
import android.view.View$OnClickListener;
import com.yxcorp.gateway.pay.activity.GatewayPayActivity;
import java.lang.Object;
import android.view.View;

public final class t implements View$OnClickListener	// class@0024fb
{
    public final GatewayPayActivity b;

    public void t(GatewayPayActivity p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       GatewayPayActivity.G2(this.b, p0);
    }
}
