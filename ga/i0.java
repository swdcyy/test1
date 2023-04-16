package ga.i0;
import android.view.View$OnClickListener;
import ga.n0;
import java.lang.Object;
import android.view.View;
import ga.l$f;
import ga.l;

public final class i0 implements View$OnClickListener	// class@002066
{
    public final n0 b;

    public void i0(n0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       i0 tb = this.b;
       if (tb.c.d() != null) {
          tb.c.d().b();
       }
       return;
    }
}
