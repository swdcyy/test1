package hf2.j;
import n3d.a;
import java.lang.Object;
import android.content.Intent;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class j implements a	// class@002d85
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       b.c0(LiveLogTag.LIVE_PROFILE, "login success", "isLogin", Boolean.valueOf(QCurrentUser.me().isLogined()));
    }
}
