package ab8.b;
import pf8.a;
import fc8.i;
import java.lang.Object;
import com.mini.misc.api.ComponentDataResponse;
import java.lang.String;
import fc8.c;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class b implements a	// class@00005a
{
    public final i a;

    public void b(i p0){
       this.a = p0;
    }
    public final void a(ComponentDataResponse p0){
       b ta = this.a;
       String str = "";
       i oi = c.g(str);
       oi.c("result", Integer.valueOf(p0.result));
       oi.c("errorMsg", p0.errorMsg);
       if (TextUtils.isEmpty(p0.data)) {
       }else {
          str = p0.data;
       }
       oi.c("data", str);
       if (p0.result > null) {
          ta.B(oi.k());
       }else {
          ta.h(p0.errorMsg);
       }
       return;
    }
}
