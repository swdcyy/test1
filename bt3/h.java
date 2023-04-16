package bt3.h;
import a30.b;
import com.kuaishou.merchant.basic.MerchantYodaWebViewFragment;
import java.lang.Object;
import a30.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import d30.c;

public class h implements b	// class@000441
{
    public final MerchantYodaWebViewFragment a;

    public void h(MerchantYodaWebViewFragment p0){
       this.a = p0;
       super();
    }
    public void a(long p0){
       a.b(this, p0);
    }
    public void b(boolean p0){
       a.a(this, p0);
    }
    public void onDismiss(){
    }
    public boolean onFailed(){
       Object obj = PatchProxy.apply(null, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       c.d("MerchanrYodaWebViewFragment handleCover load onFailed");
       return false;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       c.d("MerchanrYodaWebViewFragment handleCover load success");
       return;
    }
}
