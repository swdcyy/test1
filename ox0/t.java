package ox0.t;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class t implements g	// class@0035cf
{
    public static final t b;

    static {
       t.b = new t();
    }
    public void t(){
       super();
    }
    public final void accept(Object p0){
       b.B(LiveLogTag.CHAT, p0.getMessage());
    }
}
