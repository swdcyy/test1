package gaa.f;
import n3d.a;
import gaa.s;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import gaa.j;
import java.lang.Runnable;
import ekd.k1;

public final class f implements a	// class@00242f
{
    public final s b;

    public void f(s p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0 && p1 == -1) {
          k1.r(new j(tb), 120);
       }
       return;
    }
}
