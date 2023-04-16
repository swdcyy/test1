package com.alibaba.android.bindingx.core.internal.c$p;
import com.alibaba.android.bindingx.core.internal.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;
import android.graphics.Color;
import java.lang.Integer;

public final class c$p implements b	// class@000df0
{

    public void c$p(){
       super();
    }
    public Object a(ArrayList p0){
       if (p0 == null || p0.size() < 4) {
          return null;
       }
       return Integer.valueOf(Color.argb((int)(p0.get(3).doubleValue() * 0x406fe00000000000), (int)p0.get(0).doubleValue(), (int)p0.get(1).doubleValue(), (int)p0.get(2).doubleValue()));
    }
}
