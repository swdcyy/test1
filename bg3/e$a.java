package bg3.e$a;
import ks3.i0$a;
import bg3.e;
import java.lang.Object;
import com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ks3.h0;

public class e$a implements i0$a	// class@0003a0
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void D2(MerchantLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       this.b.V8();
       return;
    }
    public void r5(){
       h0.a(this);
    }
}
