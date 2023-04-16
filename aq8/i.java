package aq8.i;
import com.tkruntime.v8.JavaCallback;
import aq8.j;
import java.lang.String;
import com.tachikoma.core.bridge.c;
import com.tachikoma.core.bridge.d;
import java.lang.Object;
import com.tkruntime.v8.V8Object;
import com.tachikoma.core.component.timer.TKTimer;
import com.tkruntime.v8.V8Function;
import java.lang.Integer;
import java.lang.Throwable;
import wp8.a;

public final class i implements JavaCallback	// class@00030f
{
    public final j a;
    public final String b;
    public final c c;
    public final d d;

    public void i(j p0,String p1,c p2,d p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final Object invoke(V8Object p0,Object[] p1){
       Integer integer1;
       i ta = this.a;
       i tb = this.b;
       i tc = this.c;
       i td = this.d;
       if (ta.a == null) {
          ta.a = new TKTimer();
       }
       int i = -1;
       Integer integer = null;
       try{
          int i1 = 3;
          long l = 2;
          int i2 = 0;
          switch (tb.hashCode()){
              case 0x98928347:
                if (tb.equals("setInterval")) {
                   i = 0;
                }
                break;
              case 0xb043ee54:
                if (tb.equals("clearTimeout")) {
                   i = 3;
                }
                break;
              case 0xf5ff6232:
                if (tb.equals("clearInterval")) {
                   i = 2;
                }
                break;
              case 0x62edd69f:
                if (tb.equals("setTimeout")) {
                   i = 1;
                }
                break;
              default:
          }
       label_0048 :
          if (i) {
             if (i != 1) {
                if (i != l) {
                   if (i != i1) {
                   }else {
                      ta.a.clearTimeout(ta.c(p1[i2]));
                   }
                }else {
                   ta.a.clearInterval(ta.c(p1[i2]));
                }
             }else {
                integer1 = Integer.valueOf(ta.a.setTimeout(p1[i2], (long)ta.c(p1[1]), tc.j(), td.e()));
             }
          }else {
             integer1 = Integer.valueOf(ta.a.setInterval(p1[i2], (long)ta.c(p1[1]), tc.j(), td.e()));
          }
          integer = integer1;
       }catch(java.lang.Exception e12){
          a.d(td, e12);
       }
       return integer;
    }
}
