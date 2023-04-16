package fj1.e$b;
import android.content.DialogInterface$OnKeyListener;
import fj1.e;
import java.lang.Object;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.viewcontroller.ViewController;
import bj1.a;
import aj1.a;
import cj1.b;

public final class e$b implements DialogInterface$OnKeyListener	// class@002359
{
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
    }
    public final boolean onKey(DialogInterface p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(e$b.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, e$b.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 4) {
          e$b tb = this.b;
          tb.p.b(tb);
          this.b.Z2().a(this.b.Y2(), 6);
       }
       return false;
    }
}
