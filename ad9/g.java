package ad9.g;
import java.lang.Runnable;
import ad9.i;
import java.lang.Object;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.view.View;
import com.yxcorp.utility.n;
import lnc.a1;
import java.lang.Math;
import com.kwai.library.widget.popup.common.f;

public final class g implements Runnable	// class@00009e
{
    public final i b;
    public final boolean c;
    public final Runnable d;

    public void g(i p0,boolean p1,Runnable p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       i e;
       g tb = this.b;
       g tc = this.c;
       g td = this.d;
       ViewGroup$LayoutParams layoutParams = tb.d.getLayoutParams();
       if (layoutParams == null) {
       }else {
          boolean b = false;
          n.Y(tb.j, 8, b);
          if (tc != null) {
             e = tb.e;
             if (e != null) {
                n.Y(e, b, b);
                layoutParams.width = Math.min(tb.d.getWidth(), ((a1.h() - i.q) - tb.e.getWidth()));
             label_0056 :
                tb.d.setLayoutParams(layoutParams);
                f.F(tb.c, td);
             }
          }
          e = tb.e;
          if (e == null || e.getWidth() <= 0) {
             b = a1.d(R.dimen.arg_RES_7f0700a4);
          }
          layoutParams.width = tb.d.getWidth() + b;
          goto label_0056 ;
       }
       return;
    }
}
