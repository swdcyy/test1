package com.alibaba.android.bindingx.core.internal.d$i;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;

public final class d$i implements b	// class@000e0c
{

    public void d$i(){
       super();
    }
    public Object a(ArrayList p0){
       double d = p0.get(1).doubleValue();
       double d1 = p0.get(2).doubleValue();
       double d2 = p0.get(3).doubleValue();
       double d3 = Math.min(p0.get(0).doubleValue(), d2);
       if (!d3) {
       }else {
          d = d + (d1 * Math.pow(2.00f, (((d3 / d2) - 0x3ff0000000000000) * 10.00f)));
       }
       return Double.valueOf(d);
    }
}
