package com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyAnimHandler$AnimType$1;
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
import java.lang.Double;
import java.lang.Number;

public final class HighFluencyAnimHandler$AnimType$1 extends HighFluencyAnimHandler$AnimType	// class@00133b
{

    public void HighFluencyAnimHandler$AnimType$1(String p0,int p1){
       super(p0, p1, null);
    }
    public LinkedList computeSteps(int p0,int p1,int p2){
       LinkedList linkedList;
       int i = p2;
       if (PatchProxy.isSupport(HighFluencyAnimHandler$AnimType$1.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, HighFluencyAnimHandler$AnimType$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(a.class)) {
          linkedList = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), null, a.class, "1");
          if (linkedList != PatchProxyResult.class) {
          label_00b0 :
             return linkedList;
          }
       }
       int i1 = p1 - p0;
       LinkedList linkedList1 = new LinkedList();
       double d = (double)i1 / (double)i;
       int i2 = i1;
       int i3 = 0;
       i1 = p0;
       int i4 = i - 1;
       while (i3 < i4) {
          double d1 = d / 2.00f;
          double d2 = 2.00f * d;
          double d3 = d;
          d = (double)i2;
          double d4 = Math.random() * d;
          if (PatchProxy.isSupport(a.class)) {
             Object obj1 = PatchProxy.applyThreeRefs(Double.valueOf(d1), Double.valueOf(d2), Double.valueOf(d4), null, a.class, "2");
             if (obj1 != PatchProxyResult.class) {
                d1 = obj1.doubleValue();
             }else if(d4 - d1 < 0){
                d1 = Math.min(d4, d2);
             }
          }else {
             goto label_008f ;
          }
          d2 = (double)i1 + d1;
          linkedList1.add(Integer.valueOf((int)d2));
          d = d - d1;
          i2 = (int)d;
          i3 = i3 + 1;
          d = d3;
       }
       linkedList1.add(Integer.valueOf(p1));
       linkedList = linkedList1;
       goto label_00b0 ;
    }
}
