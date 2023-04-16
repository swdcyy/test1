package b3d.g;
import n3d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import u07.t;
import java.lang.Object;
import android.content.Intent;
import com.yxcorp.login.util.f;
import android.app.Activity;
import com.yxcorp.login.util.ActivityPendingLaunchUtil$PendingCategory;
import com.yxcorp.login.loginaction.LoginHelper;
import com.kwai.library.widget.popup.common.c;

public final class g implements a	// class@00032a
{
    public final GifshowActivity b;
    public final String c;
    public final LoginUserResponse d;
    public final t e;

    public void g(GifshowActivity p0,String p1,LoginUserResponse p2,t p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       g tb = this.b;
       g tc = this.c;
       g td = this.d;
       g te = this.e;
       if (p1 == -1) {
          f.f(0x4e3d);
          LoginHelper.g(tb, null, false, null, tc, false);
       }else {
          f.j(tb, td, tc, false);
       }
       te.q(4);
       return;
    }
}
