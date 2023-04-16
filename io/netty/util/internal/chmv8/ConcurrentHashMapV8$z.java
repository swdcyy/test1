package io.netty.util.internal.chmv8.ConcurrentHashMapV8$z;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import java.lang.Object;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$k;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$a0;

public class ConcurrentHashMapV8$z	// class@001167
{
    public ConcurrentHashMapV8$r[] b;
    public ConcurrentHashMapV8$r c;
    public int d;
    public int e;
    public int f;
    public final int g;

    public void ConcurrentHashMapV8$z(ConcurrentHashMapV8$r[] p0,int p1,int p2,int p3){
       super();
       this.b = p0;
       this.g = p1;
       this.d = p2;
       this.e = p2;
       this.f = p3;
       this.c = null;
    }
    public final ConcurrentHashMapV8$r e(){
       ConcurrentHashMapV8$z tc = this.c;
       if (tc != null) {
          tc = tc.e;
       }
       while (true) {
          if (tc != null) {
             this.c = tc;
             return tc;
          }else if(this.e < this.f){
             tc = this.b;
             if (tc != null) {
                int len = tc.length;
                ConcurrentHashMapV8$z td = this.d;
                if (len > td && td >= null) {
                   tc = ConcurrentHashMapV8.tabAt(tc, td);
                   if (tc != null && tc.b < null) {
                      if (tc instanceof ConcurrentHashMapV8$k) {
                         this.b = tc.f;
                         tc = null;
                      }else if(tc instanceof ConcurrentHashMapV8$a0){
                         tc = tc.g;
                      }else {
                         tc = null;
                      }
                   }
                   int i = this.d + this.g;
                   this.d = i;
                   if (i >= len) {
                      len = this.e + 1;
                      this.e = len;
                      this.d = len;
                   }
                }
             }
          }
          break ;
       }
       this.c = null;
       return null;
    }
}
