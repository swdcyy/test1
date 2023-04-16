package b3d.c;
import n3d.a;
import u07.t;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import android.content.Intent;
import com.kwai.library.widget.popup.common.c;
import com.kwai.framework.model.user.QCurrentUser;
import android.app.Activity;

public final class c implements a	// class@000321
{
    public final t b;
    public final GifshowActivity c;

    public void c(t p0,GifshowActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       c tc = this.c;
       this.b.q(3);
       p0 = (QCurrentUser.me().isLogined())? -1: 0;
       tc.setResult(p0);
       if (QCurrentUser.me().isLogined()) {
          tc.finish();
       }
       return;
    }
}
