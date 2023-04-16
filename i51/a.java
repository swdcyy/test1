package i51.a;
import erd.g;
import i51.d;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.kuaishou.live.basic.utils.LiveBasicLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import hf3.a;

public final class a implements g	// class@002820
{
    public final d b;

    public void a(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       b.I(LiveBasicLogTag.LIVE_SOCKET, "getNewRaceInfo failed", p0);
       tb.a.z0();
    }
}
