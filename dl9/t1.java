package dl9.t1;
import n3d.a;
import dl9.u1$a;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class t1 implements a	// class@001fa8
{
    public final u1$a b;
    public final boolean c;

    public void t1(u1$a p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       t1 tb = this.b;
       t1 tc = this.c;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.b(tc);
       }
       return;
    }
}
