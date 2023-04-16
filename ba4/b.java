package ba4.b;
import java.lang.Runnable;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.p;
import android.view.View;
import com.kuaishou.merchant.marketing.base.widget.LiveMerchantScaleRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import ba4.b$a;
import android.view.ViewGroup;

public final class b implements Runnable	// class@00034e
{
    public final LiveMerchantContainerAnimViewBinder b;
    public final RecyclerView$LayoutManager c;
    public final Ref$BooleanRef d;

    public void b(LiveMerchantContainerAnimViewBinder p0,RecyclerView$LayoutManager p1,Ref$BooleanRef p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       p op = new p();
       View view = op.h(this.c);
       b tc = this.c;
       if (tc != null && view != null) {
          int[] ointArray = op.c(tc, view);
          int i = 0;
          if (ointArray[i] || ointArray[1]) {
             LiveMerchantContainerAnimViewBinder.S8(this.b).scrollBy(ointArray[i], ointArray[1]);
             LiveMerchantContainerAnimViewBinder.S8(this.b).post(new b$a(this, view));
             this.d.element = true;
          }
       }
       if (this.d.element == null) {
          this.b.e9();
       }
       return;
    }
}
