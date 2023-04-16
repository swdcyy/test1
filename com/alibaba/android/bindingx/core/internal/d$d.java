package com.alibaba.android.bindingx.core.internal.d$d;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;

public final class d$d implements b	// class@000e03
{

    public void d$d(){
       super();
    }
    public Object a(ArrayList p0){
       double d = p0.get(3).doubleValue();
       double d1 = Math.min(p0.get(0).doubleValue(), d) / d;
       d1 = d1 - 0x3ff0000000000000;
       return Double.valueOf(((p0.get(2).doubleValue() * (((((d1 * d1) * d1) * d1) * d1) + 0x3ff0000000000000)) + p0.get(1).doubleValue()));
    }
}
