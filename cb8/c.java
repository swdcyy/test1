package cb8.c;
import erd.g;
import fc8.i;
import java.lang.Object;
import cb8.f$a;
import fc8.c;
import java.lang.Integer;
import java.lang.String;
import com.mini.d;
import java.lang.StringBuilder;

public final class c implements g	// class@0003db
{
    public final i b;

    public void c(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i oi = c.e();
       oi.c("start", Integer.valueOf(p0.a));
       oi.c("end", Integer.valueOf(p0.b));
       this.b.B(oi.k());
       if (d.f()) {
          d.a("#KeyboardBindApi#", "找到正在输入的输入框，光标位置是: start= "+p0.a+" ;end= "+p0.b);
       }
       return;
    }
}
