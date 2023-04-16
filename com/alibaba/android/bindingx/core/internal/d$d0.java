package com.alibaba.android.bindingx.core.internal.d$d0;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;

public final class d$d0 implements b	// class@000e02
{

    public void d$d0(){
       super();
    }
    public Object a(ArrayList p0){
       double d = p0.get(3).doubleValue();
       double d1 = Math.min(p0.get(0).doubleValue(), d) / d;
       d1 = d1 - 0x3ff0000000000000;
       return Double.valueOf(((p0.get(2).doubleValue() * (((d1 * d1) * d1) + 0x3ff0000000000000)) + p0.get(1).doubleValue()));
    }
}
