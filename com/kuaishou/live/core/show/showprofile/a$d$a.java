package com.kuaishou.live.core.show.showprofile.a$d$a;
import sfc.a;
import com.kuaishou.live.core.show.showprofile.a$d;
import co2.i0;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import co2.f2;
import com.kuaishou.live.core.show.showprofile.a;
import t02.a0;
import p91.m;
import com.kuaishou.live.core.show.profilecard.b;

public class a$d$a extends a	// class@00101b
{
    public final i0 c;
    public final a$d d;

    public void a$d$a(a$d p0,i0 p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d$a.class, "1")) {
          return;
       }
       super.b(p0);
       b.j(p0, this.c.r0(), this.d.c.p.Z2);
       return;
    }
}
