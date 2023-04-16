package com.alibaba.android.bindingx.core.internal.d$j;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;

public final class d$j implements b	// class@000e0d
{

    public void d$j(){
       super();
    }
    public Object a(ArrayList p0){
       double d = p0.get(1).doubleValue();
       double d1 = p0.get(2).doubleValue();
       double d2 = p0.get(3).doubleValue();
       double d3 = Math.min(p0.get(0).doubleValue(), d2);
       d = (!d3 - d2)? d + d1: d + (d1 * ((- Math.pow(2.00f, ((d3 * -10.00f) / d2))) + 0x3ff0000000000000));
       return Double.valueOf(d);
    }
}
