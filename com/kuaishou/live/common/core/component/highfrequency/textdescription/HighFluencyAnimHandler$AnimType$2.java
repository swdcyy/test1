package com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyAnimHandler$AnimType$2;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyAnimHandler$AnimType;
import java.lang.String;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyAnimHandler$a;
import java.util.LinkedList;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import zm1.a;
import java.lang.Math;

public final class HighFluencyAnimHandler$AnimType$2 extends HighFluencyAnimHandler$AnimType	// class@00133c
{

    public void HighFluencyAnimHandler$AnimType$2(String p0,int p1){
       super(p0, p1, null);
    }
    public LinkedList computeSteps(int p0,int p1,int p2){
       LinkedList obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(HighFluencyAnimHandler$AnimType$2.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, HighFluencyAnimHandler$AnimType$2.class, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), null, a.class, "3");
          if (obj != patchProxyRe) {
          label_0070 :
             return obj;
          }
       }
       p2 = Math.max(p2, 1);
       obj = new LinkedList();
       double d = (double)(p1 - p0) / (double)p2;
       int i = 0;
       int i1 = p2 - 1;
       while (i < i1) {
          i = i + 1;
          double d1 = (double)i * d;
          i1 = (int)d1 + p0;
          obj.add(Integer.valueOf(i1));
       }
       obj.add(Integer.valueOf(p1));
       goto label_0070 ;
    }
}
