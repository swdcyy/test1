package b8a.n;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.g;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slidev2.presenter.e;
import android.view.ViewTreeObserver;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.util.Map;

public final class n implements g	// class@0003ce
{
    public final g b;

    public void n(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       if (tb.a9()) {
          tb.I.getViewTreeObserver().removeOnGlobalLayoutListener(tb.U0);
          tb.I.getViewTreeObserver().addOnGlobalLayoutListener(tb.U0);
       }else if(!tb.z){
          p0 = 1;
       }else {
          p0 = null;
       }
       if (p0) {
          tb.B.clear();
          tb.A.clear();
       }
       return;
    }
}
