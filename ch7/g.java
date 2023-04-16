package ch7.g;
import jh7.c;
import ch7.i;
import java.lang.Long;
import java.lang.Object;
import java.util.List;
import ch7.d;
import java.lang.System;
import java.lang.Float;
import java.lang.String;
import java.lang.Integer;
import dh7.c;
import com.kwai.performance.stability.oom.leakfix.base.LowMemoryLevel;
import yf7.h;

public class g extends c	// class@000555
{
    public final float c;
    public final i d;

    public void g(i p0,Long p1,float p2){
       this.d = p0;
       this.c = p2;
       super(p1);
    }
    public void b(){
       g td = this.d;
       long l = this.a().longValue();
       g tc = this.c;
       if (td.b.isEmpty() || td.a == null) {
          h.g("LeakFixer", "onOverThreshold\(\) | fixer is empty or application is null");
       }else if(td.e.k == null){
          td.n(l);
          if ((System.currentTimeMillis() - td.d) - (long)td.e.f < 0) {
             td.m("onOverThreshold", null, Float.valueOf(tc));
          }else {
             td.d = System.currentTimeMillis();
             c uoc = new c();
             uoc.b = Float.valueOf(tc);
             if (tc - 0x3f7851ec >= 0) {
                uoc.a = LowMemoryLevel.LEVEL5;
             }else if(tc - 0x3f733333 >= 0){
                uoc.a = LowMemoryLevel.LEVEL4;
             }else if(tc - 0x3f6e147b >= 0){
                uoc.a = LowMemoryLevel.LEVEL3;
             }else if(tc - 0x3f666666 >= 0){
                uoc.a = LowMemoryLevel.LEVEL2;
             }else {
                uoc.a = LowMemoryLevel.LEVEL1;
             }
             boolean b = (tc - td.e.h >= 0)? true: false;
             td.g("onOverThreshold", uoc, b);
          }
       }
       return;
    }
}
