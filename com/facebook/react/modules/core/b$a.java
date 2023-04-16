package com.facebook.react.modules.core.b$a;
import java.util.Comparator;
import com.facebook.react.modules.core.b;
import java.lang.Object;
import com.facebook.react.modules.core.b$d;

public class b$a implements Comparator	// class@00129b
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       if (!(v2 = p0.d - p1.d)) {
          i = 0;
       }else if(v2 < 0){
          i = -1;
       }else {
          i = 1;
       }
       return i;
    }
}
