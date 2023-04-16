package gaa.z;
import n3d.a;
import gaa.h0;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import gaa.u;
import java.lang.Runnable;
import ekd.k1;

public final class z implements a	// class@002456
{
    public final h0 b;

    public void z(h0 p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       z tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0 && p1 == -1) {
          k1.r(new u(tb), 120);
       }
       return;
    }
}
