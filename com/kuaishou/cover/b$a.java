package com.kuaishou.cover.b$a;
import java.lang.Object;
import com.kuaishou.cover.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class b$a	// class@0016d3
{
    public b a;
    public Map b;
    public a c;
    public a d;
    public boolean e;
    public a f;

    public void b$a(){
       super();
    }
    public b a(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this);
    }
}
