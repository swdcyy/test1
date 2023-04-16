package bdd.f;
import n3d.a;
import java.lang.Runnable;
import java.lang.Object;
import android.content.Intent;
import com.kwai.framework.model.user.QCurrentUser;

public final class f implements a	// class@0003fb
{
    public final Runnable b;

    public void f(Runnable p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       f tb = this.b;
       if (QCurrentUser.ME.isLogined() && tb != null) {
          tb.run();
       }
       return;
    }
}
