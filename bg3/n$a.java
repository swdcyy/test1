package bg3.n$a;
import ks3.i0$a;
import bg3.n;
import java.lang.Object;
import com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ks3.h0;

public class n$a implements i0$a	// class@0003ae
{
    public final n b;

    public void n$a(n p0){
       this.b = p0;
       super();
    }
    public void D2(MerchantLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$a.class, "1")) {
          return;
       }
       this.b.V8();
       return;
    }
    public void r5(){
       h0.a(this);
    }
}
