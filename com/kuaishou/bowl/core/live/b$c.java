package com.kuaishou.bowl.core.live.b$c;
import cv.c;
import com.kuaishou.bowl.core.live.b;
import java.util.List;
import su.g;
import hv.a;
import java.util.Map;
import tu.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import nv.c;
import tu.g;
import xu.a;

public class b$c implements c	// class@0011aa
{
    public final List a;
    public final g b;
    public final a c;
    public final Map d;
    public final h e;
    public final b f;

    public void b$c(b p0,List p1,g p2,a p3,Map p4,h p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       int i = 0;
       StringBuilder str = "LiveApi- materialId: "+this.a.get(i)+" requestComponentData trigger success result size ";
       if (p0 != null) {
          i = p0.size();
       }
       c.a(str+i);
       this.f.v(this.b, p0, this.c.e, this.d, null, null, this.e);
       return;
    }
    public void onFailed(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "2")) {
          return;
       }
       c.a("LiveApi- materialId: "+this.a.get(0)+" requestComponentData trigger failed");
       this.e.onFailed("requestComponentData trigger failed");
       return;
    }
}
