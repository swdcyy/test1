package com.kwai.live.gzone.guess.kshell.f0$b;
import c77.a$a;
import com.kwai.live.gzone.guess.kshell.f0;
import java.lang.String;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import k67.b;
import java.util.Objects;

public class f0$b extends a$a	// class@000d35
{
    public final f0 b;

    public void f0$b(f0 p0,String p1){
       this.b = p0;
       super(p1);
    }
    public void a(LiveGzoneTabSource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0$b.class, "1")) {
          return;
       }
       f0$b tb = this.b;
       tb.D = true;
       if (p0 == LiveGzoneTabSource.GUESS_RESULT) {
          f0 u = tb.u;
          if (u != null && u.hj()) {
             f0$b tb1 = this.b;
             Objects.requireNonNull(tb1);
             if (!PatchProxy.applyVoid(null, tb1, f0.class, "9") && tb1.v != null) {
                tb1.P8();
             }
             return;
          }
       }
       this.b.S8();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f0$b.class, "2")) {
          return;
       }
       this.b.D = false;
       return;
    }
}
