package h82.m0;
import android.view.View$OnClickListener;
import h82.o0;
import java.lang.Object;
import android.view.View;
import h82.b0;

public final class m0 implements View$OnClickListener	// class@002cdd
{
    public final o0 b;

    public void m0(o0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       o0 l = this.b.l;
       if (l != null) {
          b0 l1 = l.l;
          if (l1 != null) {
             l1.onClick(p0);
          }
       }
       return;
    }
}
