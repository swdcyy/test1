package ara.a;
import n3d.a;
import com.yxcorp.gifshow.growth.uninstall.CleanCacheMiddleActivity;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class a implements a	// class@0002c6
{
    public final CleanCacheMiddleActivity b;

    public void a(CleanCacheMiddleActivity p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.u3();
       }
       tb.finish();
       return;
    }
}
