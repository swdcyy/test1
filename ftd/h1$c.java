package ftd.h1$c;
import java.lang.Runnable;
import java.lang.Comparable;
import ftd.c1;
import ltd.n0;
import java.lang.Object;
import ltd.m0;
import ftd.k1;
import java.lang.IllegalArgumentException;
import java.lang.String;
import ftd.h1$d;
import ftd.h1;
import java.lang.StringBuilder;

public abstract class h1$c implements Runnable, Comparable, c1, n0	// class@001647
{
    public Object b;
    public int c;
    public long d;

    public void h1$c(long p0){
       super();
       this.d = p0;
       this.c = -1;
    }
    public void a(int p0){
       this.c = p0;
    }
    public void b(m0 p0){
       String str = (this.b != k1.a)? 1: null;
       if (str) {
          this.b = p0;
          return;
       }else {
          throw new IllegalArgumentException("Failed requirement.".toString());
       }
    }
    public m0 c(){
       h1$c tb = this.b;
       if (!tb instanceof m0) {
          tb = null;
       }
       return tb;
    }
    public int compareTo(Object p0){
       return this.d(p0);
    }
    public int d(h1$c p0){
       int i;
       p0 = this.d - p0.d;
       if (p0 > 0) {
          i = 1;
       }else if(p0 < 0){
          i = -1;
       }else {
          i = 0;
       }
       return i;
    }
    public synchronized final void dispose(){
       h1$c tb = this.b;
       e0 a = k1.a;
       if (tb == a) {
          return;
       }
       if (!tb instanceof h1$d) {
          tb = null;
       }
       if (tb != null) {
          tb.j(this);
       }
       this.b = a;
       return;
    }
    public synchronized final int e(long p0,h1$d p1,h1 p2){
       if (this.b == k1.a) {
          return 2;
       }
       _monitor_enter(p1);
       h1$c uoc = p1.e();
       if (p2.c()) {
          _monitor_exit(p1);
          return 1;
       }else if(uoc == null){
          p1.b = p0;
       }else {
          h1$c d = uoc.d;
          if ((d - p0) < 0) {
             h1$c uoc1 = d;
          }
          if ((p0 - p1.b) > 0) {
             p1.b = p0;
          }
       }
       h1$d b = p1.b;
       if ((this.d - b) < 0) {
          this.d = b;
       }
       p1.a(this);
       _monitor_exit(p1);
       return 0;
    }
    public final boolean f(long p0){
       boolean b = ((p0 - this.d) >= 0)? true: false;
       return b;
    }
    public int getIndex(){
       return this.c;
    }
    public String toString(){
       return "Delayed[nanos="+this.d+']';
    }
}
