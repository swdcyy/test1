package d82.m;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class m implements g	// class@002496
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.LIVE_ESCROW, "failed to checkEscrowAuthorizeStatus", p0);
    }
}
