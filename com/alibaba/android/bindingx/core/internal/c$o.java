package com.alibaba.android.bindingx.core.internal.c$o;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import android.graphics.Color;
import java.lang.Integer;

public final class c$o implements b	// class@000def
{

    public void c$o(){
       super();
    }
    public Object a(ArrayList p0){
       if (p0 == null || p0.size() < 3) {
          return null;
       }
       return Integer.valueOf(Color.rgb((int)p0.get(0).doubleValue(), (int)p0.get(1).doubleValue(), (int)p0.get(2).doubleValue()));
    }
}
