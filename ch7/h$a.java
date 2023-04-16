package ch7.h$a;
import jh7.c;
import ch7.h;
import java.lang.Long;
import java.lang.Object;
import ch7.i;
import java.util.List;
import ch7.d;
import java.lang.System;
import java.lang.Integer;
import java.lang.String;
import java.lang.Float;
import dh7.c;
import com.kwai.performance.stability.oom.leakfix.base.LowMemoryLevel;
import yf7.h;

public class h$a extends c	// class@000556
{
    public final int c;
    public final h d;

    public void h$a(h p0,Long p1,int p2){
       this.d = p0;
       this.c = p2;
       super(p1);
    }
    public void b(){
       h b = this.d.b;
       long l = this.a().longValue();
       h$a tc = this.c;
       if (b.b.isEmpty() || b.a == null) {
          h.g("LeakFixer", "onTrimMemory\(\) | fixer is empty or application is null");
       }else if(b.e.j == null){
          b.n(l);
          if ((System.currentTimeMillis() - b.c) - (long)b.e.g < 0) {
             b.m("onTrimMemory", Integer.valueOf(tc), null);
          }else {
             b.c = System.currentTimeMillis();
             c uoc = new c();
             uoc.c = Integer.valueOf(tc);
             if (tc >= 60) {
                uoc.a = LowMemoryLevel.LEVEL5;
             }else if(tc >= 40){
                uoc.a = LowMemoryLevel.LEVEL4;
             }else if(tc >= 20){
                uoc.a = LowMemoryLevel.LEVEL3;
             }else if(tc >= 10){
                uoc.a = LowMemoryLevel.LEVEL2;
             }else {
                uoc.a = LowMemoryLevel.LEVEL1;
             }
             boolean b1 = (tc >= b.e.i)? true: false;
             b.g("onTrimMemory", uoc, b1);
          }
       }
       return;
    }
}
