package c04.a;
import java.lang.Object;
import android.content.Context;
import com.google.gson.JsonObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import java.lang.Boolean;
import com.yxcorp.gateway.pay.api.PayManager;
import go7.f;

public final class a	// class@000462
{
    public static JsonObject a;
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final JsonObject a(Context p0){
       JsonObject obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a;
       if (obj != null) {
          return obj;
       }
       obj = new JsonObject();
       if (p0 != null) {
          obj.H("installWechat", Boolean.valueOf(SystemUtil.U(p0)));
          obj.H("installAlipay", Boolean.valueOf(SystemUtil.M(p0, "com.eg.android.AlipayGphone")));
          f unionPay = PayManager.getInstance().getUnionPay();
          boolean b = (unionPay != null && unionPay.b(p0))? true: false;
          obj.H("installUnionPay", Boolean.valueOf(b));
       }
       obj.H("installWechatSdk", Boolean.valueOf(PayManager.getInstance().isSupportWechatPay()));
       obj.H("installAlipaySdk", Boolean.valueOf(PayManager.getInstance().isSupportAlipay()));
       obj.H("installUnionPaySdk", Boolean.valueOf(PayManager.getInstance().isSupportUnionPay()));
       a.a = obj;
       return obj;
    }
}
