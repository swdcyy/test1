package com.yxcorp.gifshow.homepage.kcube.k$c;
import zq6.i;
import com.yxcorp.gifshow.homepage.kcube.k;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zq6.p;

public class k$c implements i	// class@001739
{
    public final k a;

    public void k$c(k p0){
       this.a = p0;
       super();
    }
    public void a(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$c.class, "1")) {
          return;
       }
       this.a.q();
       return;
    }
    public void b(p p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$c.class, "2")) {
          return;
       }
       this.a.q();
       return;
    }
}
