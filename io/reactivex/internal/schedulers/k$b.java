package io.reactivex.internal.schedulers.k$b;
import java.lang.Comparable;
import java.lang.Runnable;
import java.lang.Long;
import java.lang.Object;

public final class k$b implements Comparable	// class@0014b5
{
    public final Runnable b;
    public final long c;
    public final int d;
    public boolean e;

    public void k$b(Runnable p0,Long p1,int p2){
       super();
       this.b = p0;
       this.c = p1.longValue();
       this.d = p2;
    }
    public int compareTo(Object p0){
       k$b uob;
       int i = 0;
       if ((v7 = this.c - p0.c) < 0) {
          uob = -1;
       }else if(v7 > 0){
          uob = 1;
       }else {
          uob = null;
       }
       if (!uob) {
          uob = this.d;
          p0 = p0.d;
          if (uob < p0) {
             i = -1;
          }else if(uob > p0){
             i = 1;
          }
          uob = i;
       }
       return uob;
    }
}
