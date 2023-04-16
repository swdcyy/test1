package com.alibaba.android.bindingx.core.internal.d$k;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;

public final class d$k implements b	// class@000e0e
{

    public void d$k(){
       super();
    }
    public Object a(ArrayList p0){
       double d = p0.get(3).doubleValue();
       return Double.valueOf(((p0.get(2).doubleValue() * (Math.min(p0.get(0).doubleValue(), d) / d)) + p0.get(1).doubleValue()));
    }
}
