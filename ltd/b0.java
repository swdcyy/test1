package ltd.b0;
import ltd.g;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.lang.Object;

public abstract class b0 extends g	// class@001dff
{
    public final long c;
    public int cleanedAndPointers;
    public static final AtomicIntegerFieldUpdater d;

    static {
       b0.d = AtomicIntegerFieldUpdater.newUpdater(b0.class, "cleanedAndPointers");
    }
    public void b0(long p0,b0 p1,int p2){
       super(p1);
       this.c = p0;
       this.cleanedAndPointers = p2 << 16;
    }
    public boolean f(){
       boolean b = (this.cleanedAndPointers == this.o() && !this.h())? true: false;
       return b;
    }
    public final boolean m(){
       boolean b = (b0.d.addAndGet(this, 0xffff0000) == this.o() && !this.h())? true: false;
       return b;
    }
    public final long n(){
       return this.c;
    }
    public abstract int o();
    public final void p(){
       if (b0.d.incrementAndGet(this) == this.o() && !this.h()) {
          this.k();
       }
       return;
    }
    public final boolean q(){
       int b;
       while (true) {
          b0 tcleanedAndP = this.cleanedAndPointers;
          b = false;
          AtomicIntegerFieldUpdater uAtomicInteg = (tcleanedAndP != this.o() || this.h())? 1: null;
          if (uAtomicInteg) {
             b = 0x10000 + tcleanedAndP;
             if (b0.d.compareAndSet(this, tcleanedAndP, b)) {
                b = true;
                break ;
             }
          }
          break ;
       }
       return b;
    }
}
