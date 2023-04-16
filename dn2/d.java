package dn2.d;
import dn2.c$e;
import dn2.e;
import java.lang.Object;
import dn2.g;
import java.util.Objects;
import com.kuaishou.live.core.show.wishlight.download.base.LiveAvatarFailType;
import java.lang.String;
import java.lang.Throwable;

public final class d implements c$e	// class@002559
{
    public final e a;

    public void d(e p0){
       this.a = p0;
    }
    public final void a(g p0){
       d ta = this.a;
       Objects.requireNonNull(ta);
       ta.e(p0, LiveAvatarFailType.QUEUE_LIMIT, "queue limit", null);
    }
}
