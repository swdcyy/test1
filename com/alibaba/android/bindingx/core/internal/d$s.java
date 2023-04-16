package com.alibaba.android.bindingx.core.internal.d$s;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;

public final class d$s implements b	// class@000e16
{

    public void d$s(){
       super();
    }
    public Object a(ArrayList p0){
       double d = p0.get(3).doubleValue();
       double d1 = Math.min(p0.get(0).doubleValue(), d) / d;
       double d2 = (p0.get(2).doubleValue() * d1) * d1;
       d = 0x40059cd5f99c38b0 * d1;
       return Double.valueOf(((d2 * (d - 0x3ffb39abf3387161)) + p0.get(1).doubleValue()));
    }
}
