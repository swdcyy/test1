package com.kuaishou.tachikoma.b;
import java.lang.Object;
import java.lang.Throwable;
import tx4.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sw4.a;
import java.lang.Runnable;
import t45.c;
import zp8.a;

public class b	// class@000f86
{

    public void b(){
       super();
    }
    public static void a(Throwable p0,w p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "1")) {
          return;
       }
       if (p0 != null) {
          c.a(new a(p1, p0));
       }
       return;
    }
}
