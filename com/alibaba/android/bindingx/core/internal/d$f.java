package com.alibaba.android.bindingx.core.internal.d$f;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;

public final class d$f implements b	// class@000e07
{

    public void d$f(){
       super();
    }
    public Object a(ArrayList p0){
       double d = p0.get(2).doubleValue();
       double d1 = p0.get(3).doubleValue();
       double d2 = Math.min(p0.get(0).doubleValue(), d1) / d1;
       return Double.valueOf(((((- d) * Math.cos((d2 * 0x3ff921fb54442d18))) + d) + p0.get(1).doubleValue()));
    }
}
