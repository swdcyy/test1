package com.alibaba.android.bindingx.core.internal.d$c0;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;

public final class d$c0 implements b	// class@000e00
{

    public void d$c0(){
       super();
    }
    public Object a(ArrayList p0){
       double d = p0.get(3).doubleValue();
       double d1 = Math.min(p0.get(0).doubleValue(), d) / d;
       return Double.valueOf(((((p0.get(2).doubleValue() * d1) * d1) * d1) + p0.get(1).doubleValue()));
    }
}
