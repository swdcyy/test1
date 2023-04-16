package com.alibaba.android.bindingx.core.internal.c$i;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;

public final class c$i implements b	// class@000de9
{

    public void c$i(){
       super();
    }
    public Object a(ArrayList p0){
       if (p0 != null) {
          int i = 1;
          if (p0.size() >= i) {
             double d = p0.get(0).doubleValue();
             int i1 = p0.size();
             while (i < i1) {
                double d1 = p0.get(i).doubleValue();
                if (d1 - d > 0) {
                   d = d1;
                }
                i = i + 1;
             }
             return Double.valueOf(d);
          }
       }
       return null;
    }
}
