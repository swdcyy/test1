package com.kwai.yoda.kernel.cookie.YodaCookie$b;
import java.lang.Runnable;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.kernel.cookie.YodaCookie;
import java.util.List;

public final class YodaCookie$b implements Runnable	// class@001298
{
    public final String b;
    public final Map c;
    public final boolean d;

    public void YodaCookie$b(String p0,Map p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, YodaCookie$b.class, "1")) {
          return;
       }
       YodaCookie f = YodaCookie.f;
       f.l(this.b, f.g(this.c, this.d, false));
       return;
    }
}
