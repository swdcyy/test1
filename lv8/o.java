package lv8.o;
import com.yxcorp.gateway.pay.service.GatewayPayApiService;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.api.PayRetrofitGlobalConfig;
import qv8.a;
import lv8.g;
import lv8.n;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;

public class o	// class@002db9
{
    public static GatewayPayApiService a;

    public static GatewayPayApiService a(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (o.a == null) {
          if (PayManager.getInstance().isEnableSwitchHost()) {
             objArray = PayManager.getInstance().getPayRetrofitGlobalConfig().getPayRetrofitConfig();
             g.d("GatewayPayApiService use enable switch host retrofit config");
          }
          if (objArray == null) {
             objArray = new a(n.b);
             g.d("GatewayPayApiService use disable switch host retrofit config");
          }
          o.a = e.b(objArray, GatewayPayApiService.class);
       }
       return o.a;
    }
}
