package com.kuaishou.bowl.core.trigger.b;
import erd.g;
import cv.g;
import cv.c;
import java.util.List;
import java.util.Map$Entry;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import mv.a;
import java.lang.System;
import mv.c;
import java.util.Iterator;
import cv.m;
import java.util.Map;

public class b implements g	// class@0011b3
{
    public final c b;
    public final List c;
    public final Map$Entry d;
    public final g e;

    public void b(g p0,c p1,List p2,Map$Entry p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          p0 = this.e.c;
          if (p0 != null && !p0.isDisposed()) {
             a.a().f.f(System.currentTimeMillis());
             this.b.b(this.c);
             p0 = this.c.iterator();
             while (p0.hasNext()) {
                m om = p0.next();
                if (om == null) {
                   continue ;
                }
                b te = this.e;
                te.j(te.f, om);
             }
          }
          p0 = this.e.a;
          if (p0 != null) {
             p0.remove(this.d.getKey());
          }
       }
       return;
    }
}
