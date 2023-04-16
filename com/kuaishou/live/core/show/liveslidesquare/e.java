package com.kuaishou.live.core.show.liveslidesquare.e;
import ok.h;
import java.lang.Object;
import tb2.b;
import tb2.d;
import tb2.c;

public final class e implements h	// class@000c95
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final Object apply(Object p0){
       d uod = null;
       if (p0 == null) {
       }else {
          b a = p0.a;
          if (a != null) {
             if (a == 1) {
                uod = p0.c;
             }
          }else {
             uod = p0.b;
          }
       }
       return uod;
    }
}
