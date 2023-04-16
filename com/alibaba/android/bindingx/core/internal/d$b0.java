package com.alibaba.android.bindingx.core.internal.d$b0;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;

public final class d$b0 implements b	// class@000dfe
{

    public void d$b0(){
       super();
    }
    public Object a(ArrayList p0){
       double d = p0.get(1).doubleValue();
       double d1 = p0.get(2).doubleValue();
       double d2 = p0.get(3).doubleValue();
       double d3 = Math.min(p0.get(0).doubleValue(), d2);
       double d4 = 2.00f;
       d3 = d3 / (d2 / d4);
       if (d3 - 0x3ff0000000000000 < 0) {
          return Double.valueOf(((((d1 / d4) * d3) * d3) + d));
       }
       d3 = d3 - 0x3ff0000000000000;
       return Double.valueOf(((((- d1) / d4) * ((d3 * (d3 - d4)) - 0x3ff0000000000000)) + d));
    }
}
