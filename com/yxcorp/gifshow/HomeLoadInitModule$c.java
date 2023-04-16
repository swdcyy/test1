package com.yxcorp.gifshow.HomeLoadInitModule$c;
import oh5.a$b;
import com.yxcorp.gifshow.HomeLoadInitModule;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import x95.b;
import x95.a$b;
import x95.a;

public class HomeLoadInitModule$c implements a$b	// class@0012ed
{
    public final HomeLoadInitModule a;

    public void HomeLoadInitModule$c(HomeLoadInitModule p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1,String p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, HomeLoadInitModule$c.class, "2")) {
          return;
       }
       new b(p0).a(new a$b(p1), p2, p3);
       return;
    }
    public void b(String p0,String p1,String p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, HomeLoadInitModule$c.class, "1")) {
          return;
       }
       new b(p0).a(new a$b(p1), p2, p3);
       return;
    }
}
