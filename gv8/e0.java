package gv8.e0;
import android.view.View$OnClickListener;
import com.yxcorp.gateway.pay.activity.GatewayPayActivity;
import java.lang.Object;
import android.view.View;

public final class e0 implements View$OnClickListener	// class@0024d6
{
    public final GatewayPayActivity b;

    public void e0(GatewayPayActivity p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       GatewayPayActivity.U2(this.b, p0);
    }
}
