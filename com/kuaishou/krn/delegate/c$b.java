package com.kuaishou.krn.delegate.c$b;
import java.lang.Object;
import com.kuaishou.krn.delegate.BundleLoadMode;
import java.util.HashMap;
import com.kuaishou.krn.delegate.c$a;
import com.kuaishou.krn.delegate.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;

public class c$b	// class@00085c
{
    public BundleLoadMode a;
    public Map b;

    public void c$b(){
       super();
       this.a = BundleLoadMode.LOCAL_FIRST;
       this.b = new HashMap();
    }
    public void c$b(c$a p0){
       super();
       this.a = BundleLoadMode.LOCAL_FIRST;
       this.b = new HashMap();
    }
    public c a(){
       Object obj = PatchProxy.apply(null, this, c$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this);
    }
    public c$b b(String p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b.put(p0, p1);
       return this;
    }
}
