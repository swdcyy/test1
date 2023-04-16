package com.kuaishou.live.external.q;
import qs5.e;
import com.kuaishou.live.external.p;
import java.lang.String;
import brd.v;
import y3.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import os5.l;
import brd.t;
import java.util.Objects;
import g33.o;
import erd.g;
import crd.b;

public class q extends e	// class@001bb9
{
    public final v d;
    public final f e;
    public final p f;

    public void q(p p0,String p1,v p2,f p3){
       this.f = p0;
       this.d = p2;
       this.e = p3;
       super(p1);
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       q td = this.d;
       Objects.requireNonNull(td);
       this.e.b(this.f.n().Jy().subscribe(new o(td)));
       return;
    }
}
