package com.alibaba.android.bindingx.core.internal.d$m;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;

public final class d$m implements b	// class@000e10
{

    public void d$m(){
       super();
    }
    public Object a(ArrayList p0){
       double d = p0.get(3).doubleValue();
       return Double.valueOf((((- p0.get(2).doubleValue()) * (Math.sqrt((0x3ff0000000000000 - ((Math.min(p0.get(0).doubleValue(), d) / d) * (Math.min(p0.get(0).doubleValue(), d) / d)))) - 0x3ff0000000000000)) + p0.get(1).doubleValue()));
    }
}
