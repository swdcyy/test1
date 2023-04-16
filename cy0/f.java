package cy0.f;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import cy0.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.PopupWindow;
import lnc.a1;
import android.view.ViewTreeObserver;

public class f implements ViewTreeObserver$OnGlobalLayoutListener	// class@001ea6
{
    public final View b;
    public final int c;
    public final int d;
    public final g e;

    public void f(g p0,View p1,int p2,int p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       int i = 2;
       int[] ointArray = new int[i];
       this.b.getLocationInWindow(ointArray);
       if (this.e.isShowing()) {
          this.e.dismiss();
       }
       this.e.showAtLocation(this.b, 0, ((ointArray[0] - (this.c / i)) + a1.d(R.dimen.arg_RES_7f0702d2)), ((ointArray[1] - this.d) - a1.d(R.dimen.arg_RES_7f07025d)));
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       return;
    }
}
