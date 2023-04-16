package com.alibaba.android.bindingx.core.internal.d$y;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;
import com.alibaba.android.bindingx.core.internal.d;

public final class d$y implements b	// class@000e1c
{

    public void d$y(){
       super();
    }
    public Object a(ArrayList p0){
       ArrayList uArrayList = p0;
       double d = uArrayList.get(1).doubleValue();
       double d1 = uArrayList.get(2).doubleValue();
       double d2 = uArrayList.get(3).doubleValue();
       double d3 = Math.min(uArrayList.get(0).doubleValue(), d2);
       if (d3 - (d2 / 2.00f) < 0) {
          return Double.valueOf(((d.b((d3 * 2.00f), 0, d1, d2) * 0x3fe0000000000000) + d));
       }
       return Double.valueOf((((d.c(((d3 * 2.00f) - d2), 0, d1, d2) * 0x3fe0000000000000) + (d1 * 0x3fe0000000000000)) + d));
    }
}
