package en2.h;
import erd.g;
import com.kuaishou.live.core.show.wishlight.download.base.e;
import java.util.concurrent.atomic.AtomicReference;
import com.kuaishou.live.core.show.wishlight.download.base.a$a;
import java.lang.Object;
import java.lang.Throwable;
import java.util.List;
import java.util.concurrent.TimeoutException;
import com.kuaishou.live.core.show.wishlight.download.base.LiveAvatarFailType;
import java.lang.String;

public final class h implements g	// class@002796
{
    public final e b;
    public final AtomicReference c;
    public final a$a d;

    public void h(e p0,AtomicReference p1,a$a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       LiveAvatarFailType tIME_OUT;
       String str;
       h td = this.d;
       this.b.g.remove(this.c);
       if (p0 instanceof TimeoutException) {
          tIME_OUT = LiveAvatarFailType.TIME_OUT;
          str = "download timeout";
       }else {
          tIME_OUT = LiveAvatarFailType.UNKNOWN_EXCEPTION;
          str = "unknown exception";
       }
       if (td != null) {
          td.a(tIME_OUT, str, p0);
       }
       return;
    }
}
