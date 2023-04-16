package com.kuaishou.live.livestage.f$a$b;
import com.kuaishou.live.livestage.f$a;
import nsd.u;
import ee3.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.livestage.f;
import fe3.b;
import re3.c;
import com.kuaishou.live.livestage.VideoRenderMode;
import ee3.d;
import ee3.h0;
import ke3.d;
import ke3.c;
import msd.a;
import ee3.a0;
import java.util.List;
import je3.i;
import je3.c;
import je3.b;
import java.util.ArrayList;
import ke3.e;
import java.lang.IllegalArgumentException;

public final class f$a$b extends f$a	// class@000be9
{
    public e o;

    public void f$a$b(){
       super(null);
       this.o = e.a;
    }
    public final f$a$b C(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "layoutConfigStrategy");
       this.o = p0;
       return this;
    }
    public f c(){
       Object obj = this;
       Object obj1 = PatchProxy.apply(null, obj, f$a$b.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       b uob = this.l();
       if (uob == null) {
          throw new IllegalArgumentException("biz is not configured");
       }
       c uoc = this.n();
       if (uoc == null) {
          throw new IllegalArgumentException("renderArea is not configured");
       }
       f uof = new f(uob, uoc, this.q(), obj.o, this.i(), this.r(), this.k(), this.j(), null, null, this.e(), this.m(), this.p(), this.o(), this.f(), this.h(), this.g(), null);
       return obj1;
    }
}
