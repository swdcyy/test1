package com.alibaba.android.bindingx.core.internal.d$h;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;

public final class d$h implements b	// class@000e0b
{

    public void d$h(){
       super();
    }
    public Object a(ArrayList p0){
       double d = p0.get(3).doubleValue();
       return Double.valueOf(((((- p0.get(2).doubleValue()) / 2.00f) * (Math.cos(((Math.min(p0.get(0).doubleValue(), d) * 0x400921fb54442d18) / d)) - 0x3ff0000000000000)) + p0.get(1).doubleValue()));
    }
}
