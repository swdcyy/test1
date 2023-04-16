package com.xiaomi.push.service.v;
import java.lang.Runnable;
import com.xiaomi.push.service.u;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Iterator;
import com.xiaomi.push.service.u$a;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Exception;
import rs8.c;

public class v implements Runnable	// class@001196
{
    public final u b;

    public void v(u p0){
       this.b = p0;
       super();
    }
    public void run(){
       try{
          Iterator iterator = u.e(this.b).values().iterator();
          while (iterator.hasNext()) {
             iterator.next().run();
          }
       }catch(java.lang.Exception e0){
          c.l("Sync job exception :"+e0.getMessage());
       }
       u.h(this.b, false);
       return;
    }
}
