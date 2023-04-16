package com.alibaba.android.bindingx.core.internal.d$w;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Math;
import com.alibaba.android.bindingx.core.internal.d;

public final class d$w implements b	// class@000e1a
{

    public void d$w(){
       super();
    }
    public Object a(ArrayList p0){
       double d = p0.get(3).doubleValue();
       return Double.valueOf(d.b(Math.min(p0.get(0).doubleValue(), d), p0.get(1).doubleValue(), p0.get(2).doubleValue(), d));
    }
}
