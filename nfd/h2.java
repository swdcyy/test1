package nfd.h2;
import n3d.a;
import java.lang.Runnable;
import java.lang.Object;
import android.content.Intent;
import com.kwai.framework.model.user.QCurrentUser;

public final class h2 implements a	// class@001db4
{
    public final Runnable b;

    public void h2(Runnable p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       h2 tb = this.b;
       if (QCurrentUser.ME.isLogined() && tb != null) {
          tb.run();
       }
       return;
    }
}
