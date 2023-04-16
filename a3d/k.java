package a3d.k;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.login.userlogin.widget.QrCodeActionBar;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;

public class k implements ViewTreeObserver$OnGlobalLayoutListener	// class@000080
{
    public final QrCodeActionBar b;

    public void k(QrCodeActionBar p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.b.e.getViewTreeObserver().removeGlobalOnLayoutListener(this);
       k tb = this.b;
       if (tb.k == null) {
          return;
       }
       int i = 0;
       int i1 = (tb.d != null)? tb.getMeasuredWidth() - this.b.d.getLeft(): 0;
       QrCodeActionBar c = this.b.c;
       int right = (c != null)? c.getRight(): 0;
       k tb1 = this.b;
       if (this.b.e.getParent() == tb1) {
          RelativeLayout$LayoutParams layoutParams = tb1.e.getLayoutParams();
          int i2 = (i1 >= right)? 0: right - i1;
          layoutParams.rightMargin = i2;
          layoutParams = this.b.e.getLayoutParams();
          if (right < i1) {
             i = i1 - right;
          }
          layoutParams.leftMargin = i;
       }
       return;
    }
}
