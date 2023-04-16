package jc.a;
import jc.b;
import dc.d;
import java.lang.Object;

public class a implements b	// class@0023d7
{
    public final d a;
    public long b;

    public void a(d p0){
       super();
       this.b = -1;
       this.a = p0;
    }
    public long a(long p0){
       long l = this.c();
       long l1 = -1;
       long l2 = 0;
       if (!l - l2) {
          return l1;
       }
       if (!this.d() && (p0 / this.c()) - (long)this.a.getLoopCount() >= 0) {
          return l1;
       }
       l = p0 % l;
       int frameCount = this.a.getFrameCount();
       for (int i = 0; i < frameCount && l2 - l <= 0; i = i + 1) {
          l2 = l2 + (long)this.a.getFrameDurationMs(i);
       }
       return (p0 + (l2 - l));
    }
    public int b(long p0,long p1){
       p1 = this.c();
       long l = 0;
       if (!p1 - l) {
          return this.f(l);
       }
       if (!this.d() && (p0 / p1) - (long)this.a.getLoopCount() >= 0) {
          return -1;
       }
       return this.f((p0 % p1));
    }
    public long c(){
       a tb = this.b;
       if (tb - -1) {
          return tb;
       }
       this.b = 0;
       int frameCount = this.a.getFrameCount();
       for (int i = 0; i < frameCount; i = i + 1) {
          long l = this.b + (long)this.a.getFrameDurationMs(i);
          this.b = l;
       }
       return this.b;
    }
    public boolean d(){
       boolean b = (!this.a.getLoopCount())? true: false;
       return b;
    }
    public long e(int p0){
       long l = 0;
       for (int i = 0; i < p0; i = i + 1) {
          l = l + (long)this.a.getFrameDurationMs(p0);
       }
       return l;
    }
    public int f(long p0){
       int i = 0;
       long l = 0;
       do {
          l = l + (long)this.a.getFrameDurationMs(i);
          i = i + 1;
       } while (p0 - l < 0);
       return (i - 1);
    }
}
