package b4d.s;
import erd.g;
import b4d.w;
import java.lang.Object;
import java.lang.Boolean;
import android.view.ViewGroup;

public final class s implements g	// class@00038f
{
    public final w b;

    public void s(w p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s tb = this.b;
       w t = tb.t;
       if (t != null && tb.s == 1) {
          int i = (p0.booleanValue())? 8: 0;
          t.setVisibility(i);
       }
       return;
    }
}
