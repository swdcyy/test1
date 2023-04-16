package ox0.n;
import erd.g;
import ox0.l$d;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import ox0.l;
import com.kwai.library.widget.popup.common.c;
import va1.m;
import rd1.d;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.String;
import java.lang.CharSequence;

public final class n implements g	// class@0035c7
{
    public final l$d b;
    public final int c;
    public final TextView d;

    public void n(l$d p0,int p1,TextView p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       n tb = this.b;
       n td = this.d;
       Objects.requireNonNull(tb);
       long l = (long)(this.c - 1);
       if (!p0.longValue() - l) {
          m.c(tb.c.b);
          tb.c.h.p9(2);
       }else {
          l b = tb.c.b;
          if (b != null && b.K()) {
             Object[] objArray = new Object[]{String.valueOf((l - p0.longValue()))};
             td.setText(a.a().a().getString(R.string.arg_RES_7f101e3c, objArray));
          }
       }
       return;
    }
}
