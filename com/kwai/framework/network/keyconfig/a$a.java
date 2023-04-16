package com.kwai.framework.network.keyconfig.a$a;
import com.yxcorp.utility.NetworkUtilsCached$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ob6.y;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import t45.c;
import ob6.x;
import java.lang.Runnable;
import java.util.concurrent.Future;

public final class a$a implements NetworkUtilsCached$a	// class@0017e2
{
    public static final a$a b;

    static {
       a$a.b = new a$a();
    }
    public void a$a(){
       super();
    }
    public final void onNetworkChanged(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "1")) {
          return;
       }
       y b = y.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoid(objArray, b, y.class, "1")) {
          c.c().submit(x.b);
       }
       return;
    }
}
