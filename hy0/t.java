package hy0.t;
import android.view.View$OnClickListener;
import hy0.u;
import java.lang.Object;
import android.view.View;
import ya1.j;
import ya1.j$b;

public final class t implements View$OnClickListener	// class@0027b6
{
    public final u b;

    public void t(u p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       t tb = this.b;
       j g = tb.g;
       g.setSelected((g.isSelected() ^ 0x01));
       g = tb.f;
       if (g != null) {
          g.a(tb.g.isSelected());
       }
       return;
    }
}
