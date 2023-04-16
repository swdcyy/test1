package com.kuaishou.render.engine.tk.b$a;
import tx4.s;
import com.kuaishou.render.engine.tk.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mv.a;
import mv.f;

public class b$a implements s	// class@000ef5
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void report(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$a.class, "1")) {
          return;
       }
       f uof = a.a().g();
       if (uof != null && this.a.x != null) {
          uof.report(p0, p1);
       }
       return;
    }
}
