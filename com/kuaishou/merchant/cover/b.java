package com.kuaishou.merchant.cover.b;
import t08.a;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.cover.b$b;
import p74.a;
import o74.a;
import java.lang.Throwable;
import com.kuaishou.merchant.cover.b$a;

public final class b implements a	// class@001657
{

    public void b(){
       super();
    }
    public void a(String p0,String p1,String p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "2")) {
          return;
       }
       a.x(new b$b(p0), p1, p2, p3);
       return;
    }
    public void b(String p0,String p1,String p2,Throwable p3,Map p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
             return;
          }
       }
       a.o(new b$a(p0), p1, p2, p3, p4);
       return;
    }
}
