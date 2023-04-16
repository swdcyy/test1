package cd5.b;
import f55.c;
import p55.a;
import android.app.Activity;
import com.kwai.component.payment.bridge.params.JSAuthThirdAccountParams;
import java.lang.String;
import f55.g;
import com.kwai.component.payment.bridge.params.KsCoinHalfScreenRechargeParams;
import com.yxcorp.gateway.pay.params.webview.JsWithDrawBindParams;
import com.kwai.component.payment.bridge.params.JsKspayOrderParams;
import com.yxcorp.gifshow.webview.jsmodel.JsCallbackParams;
import com.yxcorp.gifshow.webview.jsmodel.system.JsAppIdentifierParams;
import com.yxcorp.gifshow.model.response.WalletResponse;
import com.yxcorp.gateway.pay.params.GatewayPayInputParams;
import com.yxcorp.gateway.pay.params.webview.JsWithdrawParams;
import com.kwai.component.payment.bridge.params.JsKwaiCoinDepositParams;
import com.kwai.component.payment.bridge.params.JSWithdrawParams;
import com.kwai.component.payment.bridge.params.JsVoucherPayParams;
import com.kwai.component.payment.bridge.params.JsContractParams;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsNewPageConfigParams;
import com.kwai.component.payment.bridge.params.JsOneStepPayParams;
import com.kwai.component.payment.bridge.params.JSStartGatewayWithdrawParams;

public interface abstract b implements c	// class@00069d
{

    void C4(a p0,Activity p1,JSAuthThirdAccountParams p2,String p3,g p4);
    void F9(a p0,Activity p1,KsCoinHalfScreenRechargeParams p2,g p3);
    void I4(a p0,Activity p1,JsWithDrawBindParams p2,g p3);
    void L(a p0,Activity p1,JsKspayOrderParams p2,g p3);
    void N6(a p0,Activity p1,JsCallbackParams p2);
    void Q4(a p0,Activity p1,JsAppIdentifierParams p2,g p3);
    void S0(a p0,WalletResponse p1,String p2);
    void V7(a p0,Activity p1,GatewayPayInputParams p2,g p3);
    void a5(a p0,Activity p1,JsWithdrawParams p2);
    void b8(a p0,Activity p1,GatewayPayInputParams p2,g p3);
    void c2(a p0,Activity p1,JsKwaiCoinDepositParams p2,g p3);
    String getNameSpace();
    void h7(a p0,Activity p1,JSWithdrawParams p2,g p3);
    void l1(a p0,Activity p1,JsVoucherPayParams p2,g p3);
    void n2(a p0,JsContractParams p1,g p2);
    void v0(a p0,Activity p1,JsNewPageConfigParams p2,g p3);
    void v9(a p0,Activity p1,JsOneStepPayParams p2,g p3);
    void x5(a p0,Activity p1,JSStartGatewayWithdrawParams p2,g p3);
}
