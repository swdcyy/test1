package com.kuaishou.bowl.core.live.b$d;
import cv.c;
import com.kuaishou.bowl.core.live.b;
import su.g;
import java.util.Map;
import tu.h;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cv.m;
import su.o;
import fv.h;
import tu.g;
import ev.b;
import java.util.HashMap;

public class b$d implements c	// class@0011ab
{
    public final g a;
    public final Map b;
    public final h c;
    public final b d;

    public void b$d(b p0,g p1,Map p2,h p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "1")) {
          return;
       }
       int i = 0;
       if (p0 != null && (p0.size() > 0 && p0.get(i).b == 30)) {
          i = 1;
       }
    label_0021 :
       if (i) {
          b$d ta = this.a;
          String str = h.d(ta);
          String str1 = str;
          o.c().s(ta.a, p0, str1, this.b, 0, "LiveWatchDy", null, this.c);
       }else {
          o.c().s(this.a.a, p0, b.b().e(), new HashMap(), true, "Link", null, null);
       }
       return;
    }
    public void onFailed(){
       if (PatchProxy.applyVoid(null, this, b$d.class, "2")) {
          return;
       }
       this.c.onFailed("requestComponentData trigger failed");
       return;
    }
}
