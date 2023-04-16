package g82.p0;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import va1.l0;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class p0 implements g	// class@002ab0
{
    public static final p0 b;

    static {
       p0.b = new p0();
    }
    public void p0(){
       super();
    }
    public final void accept(Object p0){
       l0.n("获取路由接口报错!");
       b.I(LiveLogTag.FANS_GROUP, "fetchFansGroupTaskAction error", p0);
    }
}
