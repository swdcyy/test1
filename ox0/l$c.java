package ox0.l$c;
import tyc.r0;
import ox0.l;
import android.app.Activity;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import crd.b;
import lnc.b9;

public class l$c extends r0	// class@0035c3
{
    public final Activity c;
    public final boolean d;
    public final l e;

    public void l$c(l p0,Activity p1,boolean p2){
       this.e = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void a(DialogInterface p0,int p1){
       if (PatchProxy.isSupport(l$c.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, l$c.class, "1")) {
          return;
       }
       b9.a(this.e.c);
       this.e.b(this.c, false, this.d);
       return;
    }
}
