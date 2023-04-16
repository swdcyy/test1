package gv8.h0;
import android.view.View$OnClickListener;
import com.yxcorp.gateway.pay.activity.GatewayPayActivity;
import java.lang.Object;
import android.view.View;

public final class h0 implements View$OnClickListener	// class@0024df
{
    public final GatewayPayActivity b;

    public void h0(GatewayPayActivity p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       GatewayPayActivity.Z2(this.b, p0);
    }
}
