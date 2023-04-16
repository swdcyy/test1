package com.kuaishou.android.security.bridge.main.b$b;
import u38.c;
import com.kuaishou.android.security.bridge.main.b;
import java.lang.Object;
import u38.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.internal.common.d;

public class b$b implements c	// class@0006bd
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public b getCommonParams(){
       Object obj = PatchProxy.apply(null, this, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d();
    }
}
