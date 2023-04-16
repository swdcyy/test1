package com.kuaishou.krn.delegate.c;
import com.kuaishou.krn.delegate.c$b;
import java.lang.Object;
import java.util.Map;
import java.util.Collections;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.delegate.c$a;
import com.kuaishou.krn.delegate.BundleLoadMode;

public class c	// class@00085d
{
    public final BundleLoadMode a;
    public final Map b;

    public void c(c$b p0){
       super();
       this.a = p0.a;
       this.b = Collections.unmodifiableMap(p0.b);
    }
    public static c$b a(){
       Object obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c$b(null);
    }
    public BundleLoadMode b(){
       return this.a;
    }
}
