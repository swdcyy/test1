package com.alibaba.android.bindingx.core.internal.d$v;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;
import com.alibaba.android.bindingx.core.internal.d$g0;
import com.alibaba.android.bindingx.core.internal.d;
import com.alibaba.android.bindingx.core.internal.d$h0;

public final class d$v implements b	// class@000e19
{

    public void d$v(){
       super();
    }
    public Object a(ArrayList p0){
       ArrayList uArrayList = p0;
       double d = uArrayList.get(1).doubleValue();
       double d1 = uArrayList.get(2).doubleValue();
       double d2 = uArrayList.get(3).doubleValue();
       double d3 = uArrayList.get(4).doubleValue();
       double d4 = uArrayList.get(5).doubleValue();
       double d5 = uArrayList.get(6).doubleValue();
       double d6 = uArrayList.get(7).doubleValue();
       double d7 = Math.min(uArrayList.get(0).doubleValue(), d2);
       if (!d7 - d2) {
          return Double.valueOf((d + d1));
       }
       float f = (float)d3;
       float f1 = (float)d4;
       float f2 = (float)d5;
       float f3 = (float)d6;
       d$g0 og0 = d.d(f, f1, f2, f3);
       if (og0 == null) {
          og0 = new d$g0(f, f1, f2, f3);
          d.c.a(og0);
       }
       return Double.valueOf(((d1 * (double)og0.getInterpolation((float)(d7 / d2))) + d));
    }
}
