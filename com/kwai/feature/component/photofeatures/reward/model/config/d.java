package com.kwai.feature.component.photofeatures.reward.model.config.d;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.concurrent.TimeUnit;
import java.lang.Integer;
import java.lang.System;
import java.lang.Iterable;
import brd.t;
import com.kwai.feature.component.photofeatures.reward.model.config.b;
import erd.o;
import jz5.a;
import erd.r;
import brd.a0;
import com.kwai.feature.component.photofeatures.reward.model.config.c;
import jz5.b;

public class d	// class@00123f
{
    public String a;
    public List b;

    public void d(String p0){
       super();
       this.b = new ArrayList();
       this.a = p0;
    }
    public static long c(long p0,long p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), null, uod, "6");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return ((p0 - p1) / TimeUnit.HOURS.toMillis(1));
    }
    public Long a(){
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object obj = PatchProxy.apply(null, this, uod, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (PatchProxy.isSupport(uod)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(24), this, uod, "4");
          if (obj1 != patchProxyRe) {
          label_004b :
             return obj1;
          }
       }
       obj1 = t.fromIterable(this.b).map(b.b).filter(new a(System.currentTimeMillis(), 24)).count().e();
       goto label_004b ;
    }
    public Long b(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return t.fromIterable(this.b).map(c.b).filter(new b(System.currentTimeMillis(), p0)).count().e();
    }
}
