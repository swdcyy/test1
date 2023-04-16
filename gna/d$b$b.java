package gna.d$b$b;
import android.view.View$OnClickListener;
import gna.d$b;
import android.widget.ImageView;
import gna.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gna.b$d;
import gna.b$a;
import java.lang.Boolean;
import msd.l;
import qrd.l1;
import msd.a;
import gna.d$a;

public final class d$b$b implements View$OnClickListener	// class@002b31
{
    public final d$b b;
    public final ImageView c;
    public final b d;

    public void d$b$b(d$b p0,ImageView p1,b p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b$b.class, "1")) {
          return;
       }
       if (this.c.getVisibility()) {
          return;
       }
       d$b$b td = this.d;
       d$b$b uob$b = td;
       uob$b.D((td.B() ^ 0x01));
       if (this.d.B() != this.d.B()) {
          d$b$b tc = this.c;
          int i = (this.d.B())? 0x7f080dfe: 0x7f080e00;
          tc.setImageResource(i);
          d$b r = this.b.r;
          if (r != null) {
             l1 ol1 = r.invoke(Boolean.valueOf(this.d.B()));
          }
       }
       a uoa = this.b.i();
       if (uoa != null) {
          uoa.invoke();
       }
       return;
    }
}
