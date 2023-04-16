package dz9.b0;
import dz9.c0;
import v6a.m0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import android.content.Context;
import h4d.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import le5.f;

public final class b0 extends c0	// class@002008
{
    public final Activity C;
    public final boolean D;
    public final boolean E;
    public final m0 F;

    public void b0(m0 p0){
       a a;
       a.p(p0, "callerContext");
       super();
       this.F = p0;
       a = p0.a;
       this.C = a;
       this.D = a.d(a);
       this.E = a.b(a);
    }
    public boolean E(){
       Object obj = PatchProxy.apply(null, this, b0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.D != null || (this.E != null && (!f.f() && f.k())))? true: false;
       return b;
    }
}
