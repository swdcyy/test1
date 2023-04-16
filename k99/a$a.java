package k99.a$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import k99.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import tyc.v1;

public class a$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@002b65
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       this.b.p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       int i = n.j(this.b.getActivity());
       int i1 = i - this.b.p.getMeasuredHeight();
       if (i1 > 0 && i1 <= (a.t * 2)) {
          RelativeLayout$LayoutParams layoutParams = this.b.p.getLayoutParams();
          a$a tb = this.b;
          layoutParams.width = (int)((float)i * tb.q.c(tb.s));
          layoutParams.height = i;
          this.b.p.setLayoutParams(layoutParams);
       }
       return;
    }
}
