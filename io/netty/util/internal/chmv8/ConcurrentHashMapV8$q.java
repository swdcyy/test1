package io.netty.util.internal.chmv8.ConcurrentHashMapV8$q;
import java.util.Map$Entry;
import java.lang.Object;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import java.util.Objects;
import java.lang.String;
import java.lang.StringBuilder;

public final class ConcurrentHashMapV8$q implements Map$Entry	// class@00115e
{
    public final Object b;
    public Object c;
    public final ConcurrentHashMapV8 d;

    public void ConcurrentHashMapV8$q(Object p0,Object p1,ConcurrentHashMapV8 p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public boolean equals(Object p0){
       boolean b;
       if (p0 instanceof Map$Entry) {
          ConcurrentHashMapV8$q key = p0.getKey();
          if (key != null) {
             p0 = p0.getValue();
             if (p0 != null) {
                ConcurrentHashMapV8$q tb = this.b;
                if (key == tb || key.equals(tb)) {
                   key = this.c;
                   if (p0 == key || p0.equals(key)) {
                      b = true;
                   label_0029 :
                      return b;
                   }
                }
             }
          }
       }
       b = false;
       goto label_0029 ;
    }
    public Object getKey(){
       return this.b;
    }
    public Object getValue(){
       return this.c;
    }
    public int hashCode(){
       return (this.b.hashCode() ^ this.c.hashCode());
    }
    public Object setValue(Object p0){
       Objects.requireNonNull(p0);
       ConcurrentHashMapV8$q tc = this.c;
       this.c = p0;
       this.d.put(this.b, p0);
       return tc;
    }
    public String toString(){
       return this.b+"="+this.c;
    }
}
