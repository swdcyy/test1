package com.kuaishou.android.security.base.perf.k;
import java.util.Random;
import java.lang.Object;
import com.kuaishou.android.security.base.perf.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.base.perf.a$a;

public class k	// class@000f0e
{
    public static final float a;

    static {
       k.a = new Random().nextFloat();
    }
    public void k(){
       super();
    }
    public static j a(){
       j obj = PatchProxy.apply(null, null, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new j();
       obj.n();
       return obj;
    }
    public static void a(a$a p0,long p1){
    }
    public static void a(a$a p0,j p1){
    }
}
