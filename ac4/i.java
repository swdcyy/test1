package ac4.i;
import j74.f$a;
import com.kuaishou.merchant.support.bridge.MerchantBridgeModuleImpl;
import f55.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import com.kuaishou.merchant.support.bridge.params.BlankCheckParams$a;
import yz7.e;
import android.os.Bundle;

public class i implements f$a	// class@00007b
{
    public final g a;
    public final MerchantBridgeModuleImpl b;

    public void i(MerchantBridgeModuleImpl p0,g p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(boolean p0,double p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Double.valueOf(p1), this, oi, "1")) {
          return;
       }
       this.a.onSuccess(e.f(new BlankCheckParams$a(p0, p1)));
       return;
    }
    public void onError(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.a.a(-1, "bitmap is null", null);
       return;
    }
}
