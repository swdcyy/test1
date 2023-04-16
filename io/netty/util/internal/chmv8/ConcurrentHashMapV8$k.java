package io.netty.util.internal.chmv8.ConcurrentHashMapV8$k;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import java.lang.Object;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;

public final class ConcurrentHashMapV8$k extends ConcurrentHashMapV8$r	// class@001158
{
    public final ConcurrentHashMapV8$r[] f;

    public void ConcurrentHashMapV8$k(ConcurrentHashMapV8$r[] p0){
       super(-1, null, null, null);
       this.f = p0;
    }
    public ConcurrentHashMapV8$r a(int p0,Object p1){
       ConcurrentHashMapV8$r or1;
       ConcurrentHashMapV8$r b;
       ConcurrentHashMapV8$r c;
       ConcurrentHashMapV8$k tf = this.f;
       ConcurrentHashMapV8$r or = null;
       while (tf != null) {
          int len = tf.length;
          if (len) {
             len = len - 1;
             len = len & p0;
             or1 = ConcurrentHashMapV8.tabAt(tf, len);
             if (or1 == null) {
                break ;
             }
          }else {
             break ;
          }
          tf = or1.f;
       }
       return or;
    }
}
