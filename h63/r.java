package h63.r;
import n3d.a;
import h63.y;
import android.view.View;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class r implements a	// class@002c99
{
    public final y b;
    public final View c;

    public void r(y p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       r tb = this.b;
       r tc = this.c;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.R8(tc);
       }
       return;
    }
}
