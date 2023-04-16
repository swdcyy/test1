package com.alibaba.android.bindingx.core.internal.d$g;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;

public final class d$g implements b	// class@000e09
{

    public void d$g(){
       super();
    }
    public Object a(ArrayList p0){
       double d = p0.get(3).doubleValue();
       double d1 = Math.min(p0.get(0).doubleValue(), d) / d;
       return Double.valueOf(((p0.get(2).doubleValue() * Math.sin((d1 * 0x3ff921fb54442d18))) + p0.get(1).doubleValue()));
    }
}
