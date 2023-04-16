package gaa.o0;
import n3d.a;
import gaa.w0;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import gaa.q0;
import java.lang.Runnable;
import ekd.k1;

public final class o0 implements a	// class@002442
{
    public final w0 b;

    public void o0(w0 p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       o0 tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0 && p1 == -1) {
          k1.r(new q0(tb), 120);
       }
       return;
    }
}
