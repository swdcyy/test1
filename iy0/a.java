package iy0.a;
import androidx.lifecycle.Observer;
import iy0.g;
import java.lang.Object;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import iy0.e;
import ekd.q$b;

public final class a implements Observer	// class@0029b3
{
    public final g b;

    public void a(g p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       a tb = this.b;
       tb.p.clear();
       if (!q.f(p0)) {
          q.c(p0, e.a);
          tb.p.addAll(p0);
       }
       tb.R8();
       return;
    }
}
