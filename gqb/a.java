package gqb.a;
import fqb.c$a;
import gqb.b;
import java.lang.Object;
import com.yxcorp.gifshow.music.radio.notification.MusicNotificationHelper;
import java.util.Objects;
import fqb.b;

public final class a implements c$a	// class@002b71
{
    public final b a;

    public void a(b p0){
       this.a = p0;
    }
    public final void a(MusicNotificationHelper p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (p0 != null) {
          b p = ta.p;
          if (p != null) {
             p0.l = ta.r;
             p.a = p0;
          }
       }
       return;
    }
}
