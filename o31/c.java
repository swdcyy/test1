package o31.c;
import erd.g;
import java.lang.Object;
import njd.a;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;

public final class c implements g	// class@00345f
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       QCurrentUser.me().setLiveRedPackRainKoi(p0.a().mIsKoi);
    }
}
