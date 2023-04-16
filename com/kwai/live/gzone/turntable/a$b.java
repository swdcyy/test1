package com.kwai.live.gzone.turntable.a$b;
import c77.a$a;
import com.kwai.live.gzone.turntable.a;
import java.lang.String;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import y43.a;
import n77.l0;
import java.lang.Boolean;
import brd.y;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;

public class a$b extends a$a	// class@000e2b
{
    public final a b;

    public void a$b(a p0,String p1){
       this.b = p0;
       super(p1);
    }
    public void a(LiveGzoneTabSource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       this.b.w.P.a();
       Boolean tRUE = Boolean.TRUE;
       this.b.D.onNext(tRUE);
       this.b.z.n();
       this.b.I.onNext(tRUE);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "2")) {
          return;
       }
       this.b.I.onNext(Boolean.FALSE);
       return;
    }
}
