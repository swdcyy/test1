package ko1.d;
import erd.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class d implements g	// class@002d7c
{
    public final String b;

    public void d(String p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.LIVE_PARTICLE, this.b, p0);
    }
}
