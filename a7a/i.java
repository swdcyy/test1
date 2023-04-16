package a7a.i;
import android.view.View$OnClickListener;
import a7a.k;
import java.lang.Object;
import android.view.View;
import rf5.u;
import xx9.a;

public final class i implements View$OnClickListener	// class@000059
{
    public final k b;

    public void i(k p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       i tb = this.b;
       if (tb.s.v()) {
          if (!tb.t.c()) {
             tb.P8(false);
          }
       }else {
          tb.s.l();
       }
       return;
    }
}
