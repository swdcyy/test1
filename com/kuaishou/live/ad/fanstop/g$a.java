package com.kuaishou.live.ad.fanstop.g$a;
import pl0.c0;
import com.kuaishou.live.ad.fanstop.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class g$a implements c0	// class@0009a2
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       this.a.S8(p0);
       return;
    }
    public void b(String p0){
       g$a uoa = g$a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "2")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
          this.a.S8(p0);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "4")) {
          return;
       }
       this.a.P8();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "3")) {
          return;
       }
       this.a.R8();
       return;
    }
}
