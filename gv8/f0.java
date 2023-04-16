package gv8.f0;
import android.view.View$OnClickListener;
import com.yxcorp.gateway.pay.activity.GatewayPayActivity;
import java.lang.Object;
import android.view.View;

public final class f0 implements View$OnClickListener	// class@0024d9
{
    public final GatewayPayActivity b;

    public void f0(GatewayPayActivity p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       GatewayPayActivity.V2(this.b, p0);
    }
}
