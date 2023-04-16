package kqd.c;
import io.netty.buffer.a;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import io.netty.util.internal.PlatformDependent;
import io.netty.buffer.d;
import java.lang.Object;
import io.netty.util.IllegalReferenceCountException;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public abstract class c extends a	// class@001b53
{
    public int k;
    public static final AtomicIntegerFieldUpdater l;

    static {
       AtomicIntegerFieldUpdater uAtomicInteg = PlatformDependent.v(c.class, "refCnt");
       if (uAtomicInteg == null) {
          uAtomicInteg = AtomicIntegerFieldUpdater.newUpdater(c.class, "k");
       }
       c.l = uAtomicInteg;
    }
    public void c(int p0){
       super(p0);
       this.k = 1;
    }
    public abstract void C7();
    public final void D7(int p0){
       this.k = p0;
    }
    public d Q5(){
       while (true) {
          c tk = this.k;
          AtomicIntegerFieldUpdater uAtomicInteg = 1;
          if (tk == null) {
             throw new IllegalReferenceCountException(0, uAtomicInteg);
          }
          int i = Integer.MAX_VALUE;
          if (tk == i) {
             throw new IllegalReferenceCountException(i, uAtomicInteg);
          }
          i = tk + 1;
          if (c.l.compareAndSet(this, tk, i)) {
             break ;
          }
       }
       return this;
    }
    public d R5(int p0){
       if (p0 <= 0) {
       label_0024 :
          throw new IllegalArgumentException("increment: "+p0+" \(expected: > 0\)");
       }
       while (true) {
          c tk = this.k;
          if (tk == null) {
             throw new IllegalReferenceCountException(0, p0);
          }
          int i = Integer.MAX_VALUE - p0;
          if (tk > i) {
             throw new IllegalReferenceCountException(tk, p0);
          }
          int i1 = tk + p0;
          if (c.l.compareAndSet(this, tk, i1)) {
             break ;
          }
       }
       return this;
    }
    public int g0(){
       return this.k;
    }
    public boolean release(){
       while (true) {
          c tk = this.k;
          if (tk == null) {
             throw new IllegalReferenceCountException(false, -1);
          }
          int i = tk - 1;
          if (c.l.compareAndSet(this, tk, i)) {
             if (tk != true) {
                return false;
             }
             break ;
          }
       }
       this.C7();
       return true;
    }
    public boolean u(int p0){
       if (p0 <= 0) {
       label_0020 :
          throw new IllegalArgumentException("decrement: "+p0+" \(expected: > 0\)");
       }
       while (true) {
          c tk = this.k;
          if (tk < p0) {
             throw new IllegalReferenceCountException(tk, (- p0));
          }
          int i = tk - p0;
          if (c.l.compareAndSet(this, tk, i)) {
             if (tk != p0) {
                return false;
             }
             break ;
          }
       }
       this.C7();
       return true;
    }
    public d u6(){
       return this;
    }
    public d v6(Object p0){
       return this;
    }
}
