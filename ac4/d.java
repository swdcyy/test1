package ac4.d;
import us3.g;
import com.kuaishou.merchant.support.bridge.MerchantBridgeModuleImpl;
import com.kuaishou.merchant.bridgecenter.params.MerchantRouterParams;
import f55.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.util.Objects;

public final class d implements g	// class@000076
{
    public final MerchantBridgeModuleImpl a;
    public final MerchantRouterParams b;
    public final g c;

    public void d(MerchantBridgeModuleImpl p0,MerchantRouterParams p1,g p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(boolean p0,String p1,Throwable p2){
       d ta = this.a;
       d tc = this.c;
       Objects.requireNonNull(ta);
       if (this.b.mRequestForResult == null && p0) {
          ta.Ua(tc);
       }
       if (!p0) {
          ta.Sa(tc, "start router fail!");
       }
       return;
    }
}
