package com.kuaishou.live.core.basic.liveslide.b;
import java.lang.Object;
import com.kuaishou.live.core.basic.liveslide.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import b51.d;
import java.lang.IllegalStateException;
import com.kuaishou.live.core.basic.liveslide.b$b;

public class b	// class@00083e
{
    public d a;
    public b$b b;
    public b$a c;

    public void b(){
       super();
    }
    public b$a a(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          this.c = new b$a(this);
       }
       return this.c;
    }
    public d e(){
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          return obj;
       }
       throw new IllegalStateException("Manager has NOT been attached.");
    }
    public b$b h(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = new b$b(this);
       }
       return this.b;
    }
}
