package aj4.b$e;
import mu4.d;
import aj4.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fg6.a;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import kotlin.jvm.internal.a;
import md4.h;
import androidx.fragment.app.Fragment;
import rk0.b;
import md4.h$a;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import com.kuaishou.merchant.transaction.base.dynamic.component.payment.CashierView;
import mu4.c;

public final class b$e implements d	// class@00008a
{
    public final b a;

    public void b$e(b p0){
       this.a = p0;
       super();
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e.class, "1")) {
          return;
       }
       if (p0 != null && a.g(this.a.B, a.a.h(p0, JsonObject.class).e0("callbackId").w())) {
          PaymentMethodInfo paymentMetho = h.b.a(this.a.R8()).o0();
          if (paymentMetho != null) {
             this.a.u9(paymentMetho);
             b z = this.a.z;
             if (z != null) {
                z.l(paymentMetho);
             }
             this.a.s9();
          }
       }
       return;
    }
    public void destroy(){
       c.a(this);
    }
}
