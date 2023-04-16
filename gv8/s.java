package gv8.s;
import fv8.a;
import com.yxcorp.gateway.pay.activity.GatewayOrderPrepayActivity;
import java.lang.Object;
import android.content.Intent;

public final class s implements a	// class@0024f9
{
    public final GatewayOrderPrepayActivity a;

    public void s(GatewayOrderPrepayActivity p0){
       this.a = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       GatewayOrderPrepayActivity.E2(this.a, p0, p1, p2);
    }
}
