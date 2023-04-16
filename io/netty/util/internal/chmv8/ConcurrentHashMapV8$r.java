package io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import java.util.Map$Entry;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.lang.StringBuilder;

public class ConcurrentHashMapV8$r implements Map$Entry	// class@00115f
{
    public final int b;
    public final Object c;
    public Object d;
    public ConcurrentHashMapV8$r e;

    public void ConcurrentHashMapV8$r(int p0,Object p1,Object p2,ConcurrentHashMapV8$r p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public ConcurrentHashMapV8$r a(int p0,Object p1){
       ConcurrentHashMapV8$r or = this;
       do {
          if (or.b == p0) {
             ConcurrentHashMapV8$r c = or.c;
             if (c == p1 || (c != null && p1.equals(c))) {
                return or;
             }
          }
          or = or.e;
       } while (or == null);
       return null;
    }
    public final boolean equals(Object p0){
       boolean b;
       if (p0 instanceof Map$Entry) {
          ConcurrentHashMapV8$r key = p0.getKey();
          if (key != null) {
             p0 = p0.getValue();
             if (p0 != null) {
                ConcurrentHashMapV8$r tc = this.c;
                if (key == tc || key.equals(tc)) {
                   key = this.d;
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
    public final Object getKey(){
       return this.c;
    }
    public final Object getValue(){
       return this.d;
    }
    public final int hashCode(){
       return (this.c.hashCode() ^ this.d.hashCode());
    }
    public final Object setValue(Object p0){
       throw new UnsupportedOperationException();
    }
    public final String toString(){
       return this.c+"="+this.d;
    }
}
