package com.meizu.cloud.pushsdk.d.d.c;
import com.meizu.cloud.pushsdk.d.d.d;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import com.meizu.cloud.pushsdk.d.a.a;
import java.lang.Long;
import java.util.List;
import java.util.Map;
import com.meizu.cloud.pushsdk.d.d.a;
import com.meizu.cloud.pushsdk.d.b.c;
import java.util.LinkedList;
import java.util.ArrayList;
import com.meizu.cloud.pushsdk.d.a.c;
import java.lang.StringBuilder;
import java.lang.String;
import com.meizu.cloud.pushsdk.d.f.c;

public class c implements d	// class@00151b
{
    public final int a;
    public final AtomicLong b;
    public final Map c;
    public final List d;

    public void c(int p0){
       super();
       this.b = new AtomicLong(0);
       this.c = new ConcurrentHashMap();
       this.d = new CopyOnWriteArrayList();
       this.a = p0;
    }
    public void a(a p0){
       this.b(p0);
    }
    public boolean a(){
       return true;
    }
    public boolean a(long p0){
       boolean b = (this.d.remove(Long.valueOf(p0)) && this.c.remove(Long.valueOf(p0)) != null)? true: false;
       return b;
    }
    public long b(a p0){
       long andIncrement = this.b.getAndIncrement();
       this.d.add(Long.valueOf(andIncrement));
       this.c.put(Long.valueOf(andIncrement), a.a(p0.a()));
       return andIncrement;
    }
    public long c(){
       return (long)this.d.size();
    }
    public c d(){
       LinkedList linkedList = new LinkedList();
       ArrayList uArrayList = new ArrayList();
       int i = (int)this.c();
       c ta = this.a;
       if (i > ta) {
          i = ta;
       }
       int i1 = 0;
       int i2 = 0;
       while (i2 < i) {
          Long longx = this.d.get(i2);
          if (longx != null) {
             c uoc = new c();
             uoc.a(a.a(this.c.get(longx)));
             Object[] objArray = new Object[i1];
             c.c("MemoryStore", " current key "+longx+" payload "+uoc, objArray);
             linkedList.add(longx);
             uArrayList.add(uoc);
          }
          i2 = i2 + 1;
       }
       return new c(uArrayList, linkedList);
    }
}
