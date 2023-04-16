package dfc.r;
import erd.g;
import dfc.v;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Class;
import j9c.b;
import android.view.View;

public final class r implements g	// class@0021b0
{
    public final v b;

    public void r(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r tb = this.b;
       Objects.requireNonNull(tb);
       p0 = b.c(-8, Boolean.class);
       if (p0 != null && p0.booleanValue()) {
          if (tb.u.getVisibility()) {
             tb.P8();
          }
       }else {
          tb.u.setVisibility(8);
       }
       return;
    }
}
