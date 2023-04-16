package com.kwai.component.payment.response.PaymentConfigResponse$PayProvider;
import java.lang.Enum;
import com.kwai.component.payment.response.PaymentConfigResponse$PayProvider$1;
import java.lang.String;
import com.kwai.component.payment.response.PaymentConfigResponse$PayProvider$2;
import com.kwai.component.payment.response.PaymentConfigResponse$PayProvider$3;
import com.kwai.component.payment.response.PaymentConfigResponse$PayProvider$4;
import com.kwai.component.payment.response.PaymentConfigResponse$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class PaymentConfigResponse$PayProvider extends Enum	// class@000a01
{
    public static final PaymentConfigResponse$PayProvider[] $VALUES;
    public static final PaymentConfigResponse$PayProvider ALIPAY;
    public static final PaymentConfigResponse$PayProvider BAIDU;
    public static final PaymentConfigResponse$PayProvider NONE;
    public static final PaymentConfigResponse$PayProvider WECHAT;

    static {
       PaymentConfigResponse$PayProvider$1 payProvider$ = new PaymentConfigResponse$PayProvider$1("NONE", 0);
       PaymentConfigResponse$PayProvider.NONE = payProvider$;
       PaymentConfigResponse$PayProvider$2 payProvider$1 = new PaymentConfigResponse$PayProvider$2("BAIDU", 1);
       PaymentConfigResponse$PayProvider.BAIDU = payProvider$1;
       PaymentConfigResponse$PayProvider$3 payProvider$2 = new PaymentConfigResponse$PayProvider$3("WECHAT", 2);
       PaymentConfigResponse$PayProvider.WECHAT = payProvider$2;
       PaymentConfigResponse$PayProvider$4 payProvider$3 = new PaymentConfigResponse$PayProvider$4("ALIPAY", 3);
       PaymentConfigResponse$PayProvider.ALIPAY = payProvider$3;
       PaymentConfigResponse$PayProvider[] payProviderA = new PaymentConfigResponse$PayProvider[]{payProvider$,payProvider$1,payProvider$2,payProvider$3};
       PaymentConfigResponse$PayProvider.$VALUES = payProviderA;
    }
    public void PaymentConfigResponse$PayProvider(String p0,int p1){
       super(p0, p1);
    }
    public void PaymentConfigResponse$PayProvider(String p0,int p1,PaymentConfigResponse$a p2){
       super(p0, p1);
    }
    public static PaymentConfigResponse$PayProvider valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PaymentConfigResponse$PayProvider.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PaymentConfigResponse$PayProvider.class, p0);
    }
    public static PaymentConfigResponse$PayProvider[] values(){
       Object obj = PatchProxy.apply(null, null, PaymentConfigResponse$PayProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PaymentConfigResponse$PayProvider.$VALUES.clone();
    }
    public abstract int getIconResId();
    public abstract int getTitleResId();
}
