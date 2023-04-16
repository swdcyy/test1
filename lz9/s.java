package lz9.s;
import n3d.a;
import lz9.b0;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.List;
import m9a.t$c;

public final class s implements a	// class@002ee9
{
    public final b0 b;
    public final int c;

    public void s(b0 p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       s tb = this.b;
       s tc = this.c;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.q0(tb.X.get(tc));
       }
       return;
    }
}
