package com.kuaishou.live.lite.util.viewupdater.d$b$a;
import java.lang.Object;
import com.kuaishou.live.lite.util.viewupdater.d$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.util.viewupdater.d$c;

public final class d$b$a	// class@000baa
{
    public static final d$b$a a;

    static {
       d$b$a.a = new d$b$a();
    }
    public void d$b$a(){
       super();
    }
    public final d$b a(){
       Object obj = PatchProxy.apply(null, this, d$b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d$c();
    }
}
