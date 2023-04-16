package gna.d$b$a;
import android.view.View$OnClickListener;
import gna.d$b;
import android.widget.ImageView;
import gna.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gna.d$a;
import msd.l;
import java.lang.Boolean;
import qrd.l1;
import msd.p;

public final class d$b$a implements View$OnClickListener	// class@002b30
{
    public final d$b b;
    public final ImageView c;
    public final b d;

    public void d$b$a(d$b p0,ImageView p1,b p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b$a.class, "1")) {
          return;
       }
       if (this.b.l()) {
          return;
       }
       this.c.setBackgroundResource(R.drawable.arg_RES_7f080cf0);
       int i = this.c.isSelected() ^ 0x01;
       this.c.setSelected(i);
       this.d.q(i);
       l ol = this.d.e();
       if (ol != null) {
          l1 ol1 = ol.invoke(Boolean.valueOf(i));
       }
       p op = this.b.j();
       if (op != null) {
          op.invoke(this.d, Boolean.valueOf(i));
       }
       return;
    }
}
