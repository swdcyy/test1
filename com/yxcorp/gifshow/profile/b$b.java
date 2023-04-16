package com.yxcorp.gifshow.profile.b$b;
import oj0.a;
import java.lang.String;
import z1.a;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.s0;
import com.kuaishou.krn.event.a;
import s1c.i0;
import java.lang.Runnable;
import ekd.k1;
import s1c.j0;

public final class b$b implements a	// class@00121f
{
    public final String b;
    public a c;

    public void b$b(String p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void W(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       if (!s0.a(p0.get("photoId"), this.b)) {
          return;
       }
       a.b().c("KRNSocialProfileSetTopEvent", this);
       p0 = p0.get("topType");
       if (s0.a(p0, "Copy")) {
          k1.r(new i0(this), 200);
       }else if(s0.a(p0, "Move")){
          k1.r(new j0(this), 200);
       }
       return;
    }
}
