package com.kuaishou.android.security.internal.plugin.n;
import java.lang.Object;
import com.kuaishou.android.security.internal.plugin.n$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.internal.plugin.a$b;
import com.kuaishou.android.security.internal.plugin.n$b;
import java.util.Map;

public abstract class n	// class@000702
{

    public void n(){
       super();
    }
    public static n$a b(){
       Object obj = PatchProxy.apply(null, null, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       byte[] uobyteArray = new byte[0];
       byte[] uobyteArray1 = new byte[0];
       return new a$b().a(new n$b()).e("").a(uobyteArray).a(0).a("").b(uobyteArray1).a(0);
    }
    public abstract String a();
    public abstract String c();
    public abstract int d();
    public abstract byte[] e();
    public abstract boolean f();
    public abstract n$b g();
    public abstract Map h();
    public abstract byte[] i();
    public abstract int j();
    public abstract String k();
    public abstract String l();
    public abstract String m();
}
