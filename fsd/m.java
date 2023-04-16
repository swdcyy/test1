package fsd.m;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class m	// class@00162f
{

    public static final int a(int p0,int p1,int p2){
       return m.e((m.e(p0, p2) - m.e(p1, p2)), p2);
    }
    public static final long b(long p0,long p1,long p2){
       return m.f((m.f(p0, p2) - m.f(p1, p2)), p2);
    }
    public static final int c(int p0,int p1,int p2){
       if (p2 > 0) {
          if (p0 < p1) {
             p1 = p1 - m.a(p1, p0, p2);
          }
       }else if(p2 < 0){
          if (p0 > p1) {
             p1 = p1 + m.a(p0, p1, (- p2));
          }
       }else {
          throw new IllegalArgumentException("Step is zero.");
       }
       return p1;
    }
    public static final long d(long p0,long p1,long p2){
       if ((v2 = p2) > 0) {
          if (p0 - p1 < 0) {
             p1 = p1 - m.b(p1, p0, p2);
          }
       }else if(v2 < 0){
          if (p0 - p1 > 0) {
             p1 = p1 + m.b(p0, p1, (- p2));
          }
       }else {
          throw new IllegalArgumentException("Step is zero.");
       }
       return p1;
    }
    public static final int e(int p0,int p1){
       p0 = p0 % p1;
       if (p0 >= 0) {
       }else {
          p0 = p0 + p1;
       }
       return p0;
    }
    public static final long f(long p0,long p1){
       p0 = p0 % p1;
       if (p0 >= 0) {
       }else {
          p0 = p0 + p1;
       }
       return p0;
    }
}
