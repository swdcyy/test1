package com.kuaishou.pagedy.d$a;
import java.lang.Object;
import com.kuaishou.pagedy.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class d$a	// class@000a80
{
    public a a;
    public b b;
    public Map c;

    public void d$a(){
       super();
    }
    public d a(){
       Object obj = PatchProxy.apply(null, this, d$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(this);
    }
}
