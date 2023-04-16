package com.kuaishou.bowl.core.live.b$a;
import tu.h;
import com.kuaishou.bowl.core.live.b;
import com.kuaishou.bowl.data.center.data.model.live.signal.SignalPendant;
import com.kuaishou.bowl.core.live.a$a;
import com.kuaishou.bowl.core.live.ComponentDataSource;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import java.util.Iterator;
import com.kuaishou.bowl.data.center.data.model.MaterialMap;
import java.lang.StringBuilder;
import nv.c;
import vu.c;
import java.util.HashMap;
import java.lang.Long;

public class b$a implements h	// class@0011a8
{
    public final SignalPendant a;
    public final a$a b;
    public final ComponentDataSource c;
    public final String d;
    public final String e;
    public final long f;
    public final b g;

    public void b$a(b p0,SignalPendant p1,a$a p2,ComponentDataSource p3,String p4,String p5,long p6){
       this.g = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       super();
    }
    public void b(Map p0){
       HashMap hashMap;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       String str = "LiveApi- materialId: ";
       String str1 = "materialId";
       if (p0 != null && p0.size() > 0) {
          b$a uoa = null;
          Iterator iterator = p0.values().iterator();
          while (iterator.hasNext()) {
             MaterialMap materialMap = iterator.next();
             StringBuilder str2 = "LiveApi-tryDispatchComponentCallback requestComponentData match success ";
             String str3 = (materialMap == null)? "": materialMap.pendantCode;
             c.f(str2+str3);
             if (materialMap != null) {
                b$a ta = this.a;
                if (!ta.pendantResourceId - materialMap.pendantResourceId) {
                   materialMap.signalPendant = ta;
                   this.b.c.c(ta.action, materialMap, this.c);
                   uoa = 1;
                   c.f(str+this.a.pendantResourceId+" tryDispatchComponentCallback success from signal and request material");
                   hashMap = new HashMap();
                   hashMap.put(str1, Long.valueOf(this.a.pendantResourceId));
                   this.g.q(this.d, this.e, "tryDispatchComponentCallback success from signal and request material", hashMap);
                }
             }
             if (uoa == null) {
                c.f("LiveApi- tryDispatchComponentCallback not find materialId: "+this.f);
                hashMap = new HashMap();
                hashMap.put(str1, Long.valueOf(this.a.pendantResourceId));
                this.g.p(this.d, this.e, "tryDispatchComponentCallback not find materialId: "+this.f, hashMap);
             }
          }
       }else {
          this.b.c.c(this.a.action, new MaterialMap(), this.c);
          c.f(str+this.a.pendantResourceId+" tryDispatchComponentCallback failed from signal and request material");
          HashMap hashMap1 = new HashMap();
          hashMap1.put(str1, Long.valueOf(this.a.pendantResourceId));
          this.g.p(this.d, this.e, " tryDispatchComponentCallback failed from signal and request material"+this.f, hashMap1);
       }
       return;
    }
    public void onFailed(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
          return;
       }
       this.b.c.c(this.a.action, new MaterialMap(), this.c);
       StringBuilder str = "LiveApi- materialId: "+this.a.pendantResourceId+" tryDispatchComponentCallback failed error: ";
       String str1 = (p0 == null)? "": p0;
       c.f(str+str1);
       this.g.p(this.d, this.e, "tryDispatchComponentCallback failed error:"+p0, null);
       return;
    }
}
