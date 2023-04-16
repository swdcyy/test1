package fia.f0;
import java.lang.Runnable;
import fia.z;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;

public final class f0 implements Runnable	// class@002909
{
    public final z b;

    public void f0(z p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, f0.class, "1")) {
          return;
       }
       z y = this.b.y;
       if (y != null) {
          y.start();
       }
       return;
    }
}
