package aj4.b$b;
import mu4.d;
import aj4.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.transaction.base.sku.SkuInfo;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup$LayoutParams;
import mu4.c;

public final class b$b implements d	// class@000087
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       b$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, b.class, "7")) {
          SkuInfo skuInfo = SkuInfo.parse(p0);
          if (skuInfo == null || skuInfo.isValidSku() != true) {
             ta.m8().setVisibility(8);
             skuInfo.height = 0;
             skuInfo.width = 0;
          }
       }
       return;
    }
    public void destroy(){
       c.a(this);
    }
}
