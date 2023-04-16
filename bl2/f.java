package bl2.f;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import bl2.j;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class f implements g	// class@00040e
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.LIVE_SUBSCRIBE, "bindData Failed", p0);
    }
}
