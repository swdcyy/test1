package com.alibaba.android.bindingx.core.internal.c$e;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Integer;

public final class c$e implements b	// class@000de5
{

    public void c$e(){
       super();
    }
    public Object a(ArrayList p0){
       int i = 0;
       double d = p0.get(i).doubleValue();
       p0 = d;
       if (p0 > 0) {
          return Integer.valueOf(1);
       }
       if (!p0) {
          return Integer.valueOf(i);
       }
       if (d < 0) {
          return Integer.valueOf(-1);
       }
       return Double.valueOf(Double.NaN);
    }
}
