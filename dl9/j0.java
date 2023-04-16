package dl9.j0;
import n3d.a;
import dl9.m0;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class j0 implements a	// class@001f6e
{
    public final m0 b;

    public void j0(m0 p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       j0 tb = this.b;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.W8();
       }
       return;
    }
}
