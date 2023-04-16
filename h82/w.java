package h82.w;
import n3d.a;
import h82.z;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class w implements a	// class@002cee
{
    public final z b;

    public void w(z p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       w tb = this.b;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.a9();
       }
       return;
    }
}
