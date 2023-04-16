package h82.l0;
import android.view.View$OnClickListener;
import h82.o0;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.bottombar.component.widget.d;
import z61.b;
import j61.c;

public final class l0 implements View$OnClickListener	// class@002cdb
{
    public final o0 b;

    public void l0(o0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       l0 tb = this.b;
       d i = tb.i;
       if (i != null) {
          o0 l = tb.l;
          if (l != null) {
             i.a(l.mFeatureId);
          }
       }
       return;
    }
}
