package h31.l$a;
import ks3.i0$a;
import h31.l;
import java.lang.Object;
import com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import os3.b;
import java.lang.Boolean;
import io.reactivex.subjects.ReplaySubject;

public class l$a implements i0$a	// class@002619
{
    public final l b;

    public void l$a(l p0){
       this.b = p0;
       super();
    }
    public void D2(MerchantLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$a.class, "1")) {
          return;
       }
       l$a tb = this.b;
       tb.S = true;
       if (tb.N.c(p0)) {
          p0.T = true;
       }
       l$a tb1 = this.b;
       tb1.U.onNext(Boolean.valueOf(tb1.S));
       return;
    }
    public void r5(){
       if (PatchProxy.applyVoid(null, this, l$a.class, "2")) {
          return;
       }
       l$a tb = this.b;
       tb.S = true;
       tb.T = false;
       tb.U.onNext(Boolean.valueOf(true));
       return;
    }
}
