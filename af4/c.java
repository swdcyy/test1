package af4.c;
import ac4.s;
import java.lang.Object;
import java.util.HashMap;
import vc4.a;
import java.util.Map;
import com.kuaishou.merchant.transaction.base.bridge.RequestMerchantLocationInfoBridge;
import com.kuaishou.merchant.transaction.detail.skupanel.StartSkuPanelBridge;
import lc4.d;
import fe4.b;
import java.lang.String;
import f55.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class c implements s	// class@0000b3
{
    public Map b;

    public void c(){
       super();
       HashMap hashMap = new HashMap();
       this.b = hashMap;
       hashMap.put("dismissBottomSheetRNDialogWithCloseType", new a());
       this.b.put("requestMerchantLocationInfo", new RequestMerchantLocationInfoBridge());
       this.b.put("startSkuPanel", new StartSkuPanelBridge());
       this.b.put("openMerchantAddressPage", new d());
       this.b.put("createOrderAndPay", new b());
    }
    public a e(String p0,String p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return this.b.get(p1);
    }
    public boolean isAvailable(){
       return true;
    }
}
