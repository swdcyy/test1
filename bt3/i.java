package bt3.i;
import android.view.View$OnTouchListener;
import com.kuaishou.merchant.basic.MerchantYodaWebViewFragment;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import android.widget.AbsoluteLayout;

public class i implements View$OnTouchListener	// class@000442
{
    public final CoordinatorLayout b;
    public final MerchantYodaWebViewFragment c;

    public void i(MerchantYodaWebViewFragment p0,CoordinatorLayout p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, i.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (this.b == null) {
          return false;
       }
       if (!this.c.Ch().canScrollVertically(-1)) {
          this.b.requestDisallowInterceptTouchEvent(false);
       }else {
          this.b.requestDisallowInterceptTouchEvent(true);
       }
       return false;
    }
}
