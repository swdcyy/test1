package com.kuaishou.bowl.core.trigger.a$a;
import erd.g;
import com.kuaishou.bowl.core.trigger.a;
import cv.m;
import cv.c;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public class a$a implements g	// class@0011b0
{
    public final m b;
    public final c c;
    public final a d;

    public void a$a(a p0,m p1,c p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          p0 = new ArrayList();
          p0.add(this.b);
          this.c.b(p0);
       }
       return;
    }
}
