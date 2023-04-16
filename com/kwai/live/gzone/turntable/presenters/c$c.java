package com.kwai.live.gzone.turntable.presenters.c$c;
import n77.l0;
import com.kwai.live.gzone.turntable.presenters.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class c$c implements l0	// class@000e5e
{
    public final c a;

    public void c$c(c p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$c.class, "3")) {
          return;
       }
       this.a.W8();
       return;
    }
    public void b(int p0){
       c$c uoc = c$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "2")) {
          return;
       }
       this.a.X8(p0, false);
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, c$c.class, "1")) {
          return;
       }
       this.a.R8();
       return;
    }
}
