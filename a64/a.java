package a64.a;
import ks3.r$b;
import a64.g;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import ks3.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a implements r$b	// class@00002b
{
    public final g a;

    public void a(g p0){
       this.a = p0;
    }
    public final void a(int p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       g og = g.class;
       if (!p0 && ta.r == null) {
          ta.r = true;
          MerchantAudienceParams merchantAudi = ta.p.d();
          if (!PatchProxy.applyVoidOneRefs(merchantAudi, ta, og, "5") && merchantAudi != null) {
             MerchantAudienceParams mShowActionB = merchantAudi.mShowActionByServer;
             if (mShowActionB != true) {
                if (mShowActionB != 2) {
                   ta.R8(merchantAudi);
                }else {
                   ta.V8(merchantAudi);
                }
             }else {
                ta.S8(merchantAudi);
             }
          }
          if (!PatchProxy.applyVoid(null, ta, og, "4")) {
             MerchantAudienceParams merchantAudi1 = ta.p.d();
             if (merchantAudi1 != null && (merchantAudi1.mMerchantSource == 9 && ta.s == null)) {
                ta.p.f();
                ta.s = true;
             }
          }
       }
    label_0057 :
       return;
    }
}
