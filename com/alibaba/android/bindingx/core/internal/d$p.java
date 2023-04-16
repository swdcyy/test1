package com.alibaba.android.bindingx.core.internal.d$p;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;

public final class d$p implements b	// class@000e13
{

    public void d$p(){
       super();
    }
    public Object a(ArrayList p0){
       ArrayList uArrayList = p0;
       double d = uArrayList.get(1).doubleValue();
       double d1 = uArrayList.get(2).doubleValue();
       double d2 = uArrayList.get(3).doubleValue();
       double d3 = Math.min(uArrayList.get(0).doubleValue(), d2);
       if (!d3) {
          return Double.valueOf(d);
       }
       d3 = d3 / d2;
       double d4 = 0x3ff0000000000000;
       if (!d3 - d4) {
          return Double.valueOf((d + d1));
       }
       double d5 = 0x3fd3333333333333 * d2;
       double d6 = (d1 - Math.abs(d1) < 0)? d5 / 4.00f: (d5 / 0x401921fb54442d18) * Math.asin((d1 / d1));
       d3 = d3 - d4;
       return Double.valueOf(((- ((d1 * Math.pow(2.00f, (d3 * 10.00f))) * Math.sin(((((d3 * d2) - d6) * 0x401921fb54442d18) / d5)))) + d));
    }
}
