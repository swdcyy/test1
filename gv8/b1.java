package gv8.b1;
import erd.g;
import com.yxcorp.gateway.pay.activity.WechatSSOActivity;
import java.lang.Object;
import com.yxcorp.gateway.pay.response.BindResult;

public final class b1 implements g	// class@0024ce
{
    public final WechatSSOActivity b;

    public void b1(WechatSSOActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       WechatSSOActivity.H2(this.b, p0);
    }
}
