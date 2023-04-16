package com.facebook.cache.disk.a$a;
import com.facebook.cache.disk.e;
import com.facebook.cache.disk.a;
import java.lang.Object;
import com.facebook.cache.disk.b$c;

public class a$a implements e	// class@001047
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       long timestamp = p0.getTimestamp();
       long timestamp1 = p1.getTimestamp();
       if (timestamp - timestamp1 < 0) {
          i = -1;
       }else if(!timestamp1 - timestamp){
          i = 0;
       }else {
          i = 1;
       }
       return i;
    }
}
