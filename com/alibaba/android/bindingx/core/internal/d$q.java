package com.alibaba.android.bindingx.core.internal.d$q;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;

public final class d$q implements b	// class@000e14
{

    public void d$q(){
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
       if (!d3 - 0x3ff0000000000000) {
          return Double.valueOf((d + d1));
       }
       double d4 = 0x3fd3333333333333 * d2;
       double d5 = 0x401921fb54442d18;
       double d6 = (d1 - Math.abs(d1) < 0)? d4 / 4.00f: (d4 / d5) * Math.asin((d1 / d1));
       return Double.valueOf(((((Math.pow(2.00f, (d3 * -10.00f)) * d1) * Math.sin(((((d3 * d2) - d6) * 0x401921fb54442d18) / d4))) + d1) + d));
    }
}
