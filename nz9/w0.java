package nz9.w0;
import n3d.a;
import nz9.z0;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class w0 implements a	// class@003252
{
    public final z0 b;

    public void w0(z0 p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       w0 tb = this.b;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.r0();
       }
       return;
    }
}
