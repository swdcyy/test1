package c77.v;
import n3d.a;
import c77.c0;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import android.view.View;
import mkc.c;

public final class v implements a	// class@00050c
{
    public final c0 b;

    public void v(c0 p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       v tb = this.b;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          c.c(tb.w, tb.F);
       }
       return;
    }
}
