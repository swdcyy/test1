package hw8.a;
import n3d.a;
import com.yxcorp.gifshow.activity.login.PostLoginActivity;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import gq.a;
import java.lang.String;
import q87.c;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class a implements a	// class@0025e8
{
    public final PostLoginActivity b;

    public void a(PostLoginActivity p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       Object[] objArray1;
       a tb = this.b;
       Objects.requireNonNull(tb);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PostLoginActivity", "on login callback", objArray);
       if (QCurrentUser.me().isLogined() && !PatchProxy.applyVoid(null, tb, PostLoginActivity.class, "5")) {
          if (tb.y == null) {
             objArray1 = new Object[i];
             a.D().w("PostLoginActivity", "source intent is null", objArray1);
          }else {
             objArray1 = new Object[i];
             a.D().w("PostLoginActivity", "startSourceActivity", objArray1);
             tb.startActivity(tb.y);
          }
       }
       tb.finish();
       return;
    }
}
