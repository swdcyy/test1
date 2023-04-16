package gz2.b;
import ly2.h;
import gz2.h;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import pz2.c;
import cz2.d;

public final class b implements h	// class@002bd5
{
    public final h a;

    public void b(h p0){
       this.a = p0;
    }
    public final void onReceiveRequest(String p0){
       b ta = this.a;
       h d = ta.d;
       if (d != null) {
          h c = ta.c;
          if (TextUtils.x(p0)) {
             p0 = "";
          }
          d.onReceivedEffectEvent(c, p0);
       }
       return;
    }
}
