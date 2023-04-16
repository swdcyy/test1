package ba4.b$a;
import java.lang.Runnable;
import ba4.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder;
import com.kuaishou.merchant.marketing.base.widget.LiveMerchantScaleRecyclerView;
import androidx.recyclerview.widget.RecyclerView;

public final class b$a implements Runnable	// class@00034d
{
    public final b b;
    public final View c;

    public void b$a(b p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       if (this.c.getScaleX() - (float)1 < 0) {
          LiveMerchantContainerAnimViewBinder.S8(this.b.b).x(LiveMerchantContainerAnimViewBinder.S8(this.b.b));
       }
       this.b.b.e9();
       return;
    }
}
