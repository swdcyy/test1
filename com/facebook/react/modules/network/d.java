package com.facebook.react.modules.network.d;
import java.lang.Runnable;
import com.facebook.react.modules.network.e;
import java.util.List;
import com.kuaishou.webkit.CookieManager;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import com.facebook.react.modules.network.e$b;

public class d implements Runnable	// class@0012d0
{
    public final List b;
    public final CookieManager c;
    public final String d;
    public final e e;

    public void d(e p0,List p1,CookieManager p2,String p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          this.c.setCookie(this.d, iterator.next());
       }
       this.e.a.a();
       return;
    }
}
