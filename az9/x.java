package az9.x;
import n3d.a;
import az9.i0;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.String;

public final class x implements a	// class@00033e
{
    public final i0 b;

    public void x(i0 p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       x tb = this.b;
       Objects.requireNonNull(tb);
       if (QCurrentUser.ME.isLogined()) {
          tb.n0("COVER");
       }
       return;
    }
}
