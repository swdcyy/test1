package com.kuaishou.live.core.show.wishlist.sendgift.c$b;
import xq3.a;
import com.kuaishou.live.core.show.wishlist.sendgift.c;
import java.lang.Object;
import xq3.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;

public class c$b implements a	// class@0012f7
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "2")) {
          return;
       }
       this.a.J.remove(p0);
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       this.a.J.add(p0);
       return;
    }
}
