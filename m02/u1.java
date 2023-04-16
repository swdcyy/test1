package m02.u1;
import erd.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.core.basic.activity.LiveShellActivity;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class u1 implements g	// class@0030e5
{
    public final String b;
    public final g c;

    public void u1(String p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.LIVE_PLUGIN, this.b, p0);
       this.c.accept(null);
    }
}
