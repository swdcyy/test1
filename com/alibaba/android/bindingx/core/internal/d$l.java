package com.alibaba.android.bindingx.core.internal.d$l;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;

public final class d$l implements b	// class@000e0f
{

    public void d$l(){
       super();
    }
    public Object a(ArrayList p0){
       double d = p0.get(1).doubleValue();
       double d1 = p0.get(2).doubleValue();
       double d2 = p0.get(3).doubleValue();
       double d3 = Math.min(p0.get(0).doubleValue(), d2);
       if (!d3) {
          return Double.valueOf(d);
       }
       if (!d3 - d2) {
          return Double.valueOf((d + d1));
       }
       d3 = d3 / (d2 / 2.00f);
       if (d3 - 0x3ff0000000000000 < 0) {
          return Double.valueOf((((d1 / 2.00f) * Math.pow(2.00f, ((d3 - 0x3ff0000000000000) * 10.00f))) + d));
       }
       return Double.valueOf((((d1 / 2.00f) * ((- Math.pow(2.00f, ((d3 - 0x3ff0000000000000) * -10.00f))) + 2.00f)) + d));
    }
}
