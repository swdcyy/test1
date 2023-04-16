package f52.w;
import erd.g;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.k;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.String;
import lnc.a1;
import android.widget.TextView;

public final class w implements g	// class@00289c
{
    public final k b;

    public void w(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       w tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.C = false;
          tb.S8(tb.u, a1.p(R.string.arg_RES_7f1042b4), 300);
       }
       return;
    }
}
