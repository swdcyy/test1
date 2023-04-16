package gv8.c1;
import erd.g;
import com.yxcorp.gateway.pay.activity.WechatSSOActivity;
import java.lang.Object;
import com.yxcorp.gateway.pay.response.PayAuthParamResponse;

public final class c1 implements g	// class@0024d1
{
    public final WechatSSOActivity b;

    public void c1(WechatSSOActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       WechatSSOActivity.E2(this.b, p0);
    }
}
