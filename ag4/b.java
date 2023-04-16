package ag4.b;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.transaction.detail.self.basic.stock.DetailStockManager;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.transaction.detail.self.basic.stock.DetailStockManager$b;
import java.lang.CharSequence;
import android.text.TextUtils;
import crd.b;

public final class b implements Observer	// class@0000be
{
    public final DetailStockManager b;

    public void b(DetailStockManager p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, DetailStockManager.class, "15")) {
             p0 = tb.c;
             if (p0 != null && (p0.c != null && !TextUtils.isEmpty(p0.b()))) {
                p0 = tb.c;
                if (p0 != null) {
                   p0.d = p0.a;
                }
                tb.d();
             }
          }
       }
       return;
    }
}
