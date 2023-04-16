package qk.h$a;
import qk.h;
import java.lang.Double;
import java.lang.Float;
import com.google.common.primitives.Longs;
import java.lang.Comparable;
import java.lang.Object;
import java.util.Comparator;
import vk.a;

public final class h$a extends h	// class@0029fc
{

    public void h$a(){
       super(null);
    }
    public h a(double p0,double p1){
       return this.k(Double.compare(p0, p1));
    }
    public h b(float p0,float p1){
       return this.k(Float.compare(p0, p1));
    }
    public h c(int p0,int p1){
       if (p0 < p1) {
          p0 = -1;
       }else if(p0 > p1){
          p0 = 1;
       }else {
          p0 = 0;
       }
       return this.k(p0);
    }
    public h d(long p0,long p1){
       return this.k(Longs.a(p0, p1));
    }
    public h e(Comparable p0,Comparable p1){
       return this.k(p0.compareTo(p1));
    }
    public h f(Object p0,Object p1,Comparator p2){
       return this.k(p2.compare(p0, p1));
    }
    public h g(boolean p0,boolean p1){
       return this.k(a.a(p0, p1));
    }
    public h h(boolean p0,boolean p1){
       return this.k(a.a(p1, p0));
    }
    public int i(){
       return 0;
    }
    public h k(int p0){
       h b;
       if (p0 < 0) {
          b = h.b;
       }else if(p0 > 0){
          b = h.c;
       }else {
          b = h.a;
       }
       return b;
    }
}
