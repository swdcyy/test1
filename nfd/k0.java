package nfd.k0;
import qh7.b;
import java.lang.String;
import android.app.Activity;
import java.lang.Object;
import yh7.a;
import java.lang.StringBuilder;
import uy5.b;

public final class k0 implements b	// class@001dc2
{
    public final String a;
    public final Activity b;

    public void k0(String p0,Activity p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(a p0){
       k0 ta = this.a;
       k0 tb = this.b;
       if (p0.a != 200) {
          b.p("SearchBaseExitUtil", "open link error, linkUrl = "+ta+", activity = "+tb);
       }
       return;
    }
}
