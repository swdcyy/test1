package m2a.l;
import dz9.c0;
import android.app.Activity;
import android.content.Context;
import h4d.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import le5.f;

public class l extends c0	// class@002f0c
{
    public final Activity C;
    public final boolean D;
    public final boolean E;

    public void l(Activity p0){
       super();
       this.C = p0;
       this.D = a.d(p0);
       this.E = a.b(p0);
    }
    public boolean E(){
       Object obj = PatchProxy.apply(null, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.D != null || (this.E != null && (!f.f() && f.k())))? true: false;
       return b;
    }
}
