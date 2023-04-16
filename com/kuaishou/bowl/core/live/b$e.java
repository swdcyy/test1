package com.kuaishou.bowl.core.live.b$e;
import cv.c;
import com.kuaishou.bowl.core.live.b;
import java.util.Map;
import su.g;
import hv.a;
import vu.a;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import java.util.Iterator;
import cv.m;
import java.lang.CharSequence;
import android.text.TextUtils;
import yz7.e;
import com.kuaishou.bowl.core.live.b$e$a;
import tu.g;
import xu.a;
import tu.h;
import nv.c;

public class b$e implements c	// class@0011ad
{
    public final Map a;
    public final g b;
    public final a c;
    public final a d;
    public final b e;

    public void b$e(b p0,Map p1,g p2,a p3,a p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e.class, "1")) {
          return;
       }
       if (p0 != null && p0.size() > 0) {
          HashMap hashMap = new HashMap();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             m om = iterator.next();
             if (om != null && !TextUtils.isEmpty(om.i)) {
                HashMap hashMap1 = new HashMap();
                hashMap1.put("backToPageParam", e.f(this.a));
                hashMap.put(om.i, hashMap1);
             }
          }
          this.e.v(this.b, p0, this.c.e, hashMap, null, null, new b$e$a(this, p0));
       }else {
          c.f("LiveApi-onBackToPage failed, size 0");
          b$e td = this.d;
          if (td != null) {
             td.b();
          }
       }
       return;
    }
    public void onFailed(){
       if (PatchProxy.applyVoid(null, this, b$e.class, "2")) {
          return;
       }
       c.f("LiveApi-onBackToPage failed");
       b$e td = this.d;
       if (td != null) {
          td.b();
       }
       return;
    }
}
