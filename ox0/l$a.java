package ox0.l$a;
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

public class l$a extends r0	// class@0035c1
{
    public final Activity c;
    public final boolean d;
    public final boolean e;
    public final l f;

    public void l$a(l p0,Activity p1,boolean p2,boolean p3){
       this.f = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void a(DialogInterface p0,int p1){
       if (PatchProxy.isSupport(l$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, l$a.class, "1")) {
          return;
       }
       b9.a(this.f.c);
       this.f.b(this.c, this.d, this.e);
       return;
    }
}
