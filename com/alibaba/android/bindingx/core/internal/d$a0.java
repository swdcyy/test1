package com.alibaba.android.bindingx.core.internal.d$a0;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;

public final class d$a0 implements b	// class@000dfc
{

    public void d$a0(){
       super();
    }
    public Object a(ArrayList p0){
       double d = p0.get(3).doubleValue();
       double d1 = Math.min(p0.get(0).doubleValue(), d) / d;
       double d2 = (- p0.get(2).doubleValue()) * d1;
       return Double.valueOf(((d2 * (d1 - 2.00f)) + p0.get(1).doubleValue()));
    }
}
