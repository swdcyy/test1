package awb.b;
import android.view.View$OnClickListener;
import awb.d;
import java.lang.Object;
import android.view.View;
import y8c.d;
import yvb.e$b;

public final class b implements View$OnClickListener	// class@000341
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       d s = tb.s;
       if (s != null) {
          s.a(tb.r.get(), -1);
       }
       return;
    }
}
