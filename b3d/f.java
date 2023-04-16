package b3d.f;
import n3d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.lang.Object;
import android.content.Intent;
import com.yxcorp.login.util.f;
import android.app.Activity;
import com.yxcorp.login.util.ActivityPendingLaunchUtil$PendingCategory;
import com.yxcorp.login.loginaction.LoginHelper;

public final class f implements a	// class@000328
{
    public final GifshowActivity b;
    public final String c;
    public final LoginUserResponse d;

    public void f(GifshowActivity p0,String p1,LoginUserResponse p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       if (p1 == -1) {
          f.f(0x4e3b);
          LoginHelper.g(tb, null, false, null, tc, true);
       }else {
          f.j(tb, td, tc, false);
       }
       return;
    }
}
