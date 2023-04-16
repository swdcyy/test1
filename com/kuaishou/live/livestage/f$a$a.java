package com.kuaishou.live.livestage.f$a$a;
import com.kuaishou.live.livestage.f$a;
import nsd.u;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ke3.e;
import com.kuaishou.live.livestage.f;
import fe3.b;
import re3.c;
import com.kuaishou.live.livestage.VideoRenderMode;
import ee3.e;
import ee3.d;
import ee3.h0;
import ke3.d;
import ke3.c;
import ee3.a0;
import java.util.List;
import je3.i;
import je3.c;
import je3.b;
import java.util.ArrayList;
import java.lang.IllegalArgumentException;

public final class f$a$a extends f$a	// class@000be8
{
    public a o;
    public e p;

    public void f$a$a(){
       super(null);
    }
    public final f$a$a C(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "provider");
       this.o = p0;
       return this;
    }
    public final f$a$a D(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "mixTypeDelegate");
       this.p = p0;
       return this;
    }
    public f c(){
       Object obj = this;
       Object obj1 = PatchProxy.apply(null, obj, f$a$a.class, "3");
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
       f uof = new f(uob, uoc, this.q(), e.d, this.i(), this.r(), this.k(), this.j(), obj.p, obj.o, this.e(), this.m(), this.p(), this.o(), this.f(), this.h(), this.g(), null);
       return obj1;
    }
}
