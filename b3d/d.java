package b3d.d;
import n3d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import java.lang.Object;
import android.content.Intent;
import com.yxcorp.login.util.f;
import android.app.Activity;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import com.yxcorp.login.util.ActivityPendingLaunchUtil$PendingCategory;
import com.yxcorp.login.loginaction.LoginHelper;

public final class d implements a	// class@000324
{
    public final GifshowActivity b;
    public final String c;

    public void d(GifshowActivity p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       d tb = this.b;
       d tc = this.c;
       if (p1 == -1) {
          f.f(0x4e3a);
          LoginHelper.g(tb, null, false, null, tc, true);
       }
       return;
    }
}
