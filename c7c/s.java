package c7c.s;
import java.lang.Runnable;
import c7c.t;
import java.lang.Object;
import java.util.Objects;
import lnc.a1;
import android.view.View;
import android.widget.TextView;

public final class s implements Runnable	// class@000553
{
    public final t b;

    public void s(t p0){
       this.b = p0;
    }
    public final void run(){
       s tb = this.b;
       Objects.requireNonNull(tb);
       a1.d(R.dimen.arg_RES_7f07031b);
       if ((tb.p.getWidth() - (((tb.R8(tb.u) + tb.R8(tb.q)) + tb.R8(tb.r)) + tb.R8(tb.s))) >= a1.d(0x7f07030d)) {
          tb.t.setVisibility(0);
       }else {
          tb.t.setVisibility(8);
       }
       return;
    }
}
