package ag4.a;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.transaction.detail.self.basic.stock.DetailStockManager;
import java.lang.Object;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.commodityinfo.model.Stock;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.detail.self.basic.stock.DetailStockManager$b;
import crd.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;

public final class a implements Observer	// class@0000bd
{
    public final DetailStockManager b;

    public void a(DetailStockManager p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else if(p0 != null){
          a tb = this.b;
          DetailStockManager c = tb.c;
          if (c != null) {
             c.d = (long)p0.mPollPeriod * 1;
          }
          tb.b(p0);
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (PatchProxy.apply(null, p0, DetailStockManager.class, "9") != PatchProxyResult.class) {
          }else {
             p0.b(null);
          }
       }
       return;
    }
}
