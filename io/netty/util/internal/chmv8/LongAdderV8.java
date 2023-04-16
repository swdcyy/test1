package io.netty.util.internal.chmv8.LongAdderV8;
import zqd.e;
import io.netty.util.internal.chmv8.Striped64;
import java.lang.Object;
import java.lang.ThreadLocal;
import io.netty.util.internal.chmv8.Striped64$b;
import java.io.ObjectInputStream;
import java.lang.String;
import java.lang.Long;
import java.io.ObjectOutputStream;

public class LongAdderV8 extends Striped64 implements e	// class@00117b
{
    public static final long serialVersionUID = 0x6499de12a37d0a3d;

    public void LongAdderV8(){
       super();
    }
    public void add(long p0){
       Striped64 tcells = this.cells;
       if (tcells == null) {
          Striped64 tbase = this.base;
          if (!this.casBase(tbase, (tbase + p0))) {
          label_000e :
             int[] ointArray = Striped64.threadHashCode.get();
             int i = 1;
             if (ointArray != null && tcells != null) {
                int len = tcells.length;
                if (len >= i) {
                   object oobject = tcells[((len - i) & ointArray[0])];
                   if (oobject != null) {
                      Striped64$b h = oobject.h;
                      i = oobject.a(h, (h + p0));
                      if (i) {
                      label_0034 :
                         return;
                      }
                   }
                }
             }
             this.retryUpdate(p0, ointArray, i);
             goto label_0034 ;
          }else {
             goto label_0034 ;
          }
       }else {
          goto label_000e ;
       }
    }
    public void decrement(){
       this.add(-1);
    }
    public double doubleValue(){
       return (double)this.sum();
    }
    public float floatValue(){
       return (float)this.sum();
    }
    public final long fn(long p0,long p1){
       return (p0 + p1);
    }
    public void increment(){
       this.add(1);
    }
    public int intValue(){
       return (int)this.sum();
    }
    public long longValue(){
       return this.sum();
    }
    public final void readObject(ObjectInputStream p0){
       p0.defaultReadObject();
       this.busy = 0;
       this.cells = null;
       this.base = p0.readLong();
    }
    public void reset(){
       this.internalReset(0);
    }
    public long sum(){
       Striped64 tbase = this.base;
       Striped64 tcells = this.cells;
       if (tcells != null) {
          int len = tcells.length;
          int i = 0;
          while (i < len) {
             object oobject = tcells[i];
             if (oobject != null) {
                tbase = tbase + oobject.h;
             }
             i = i + 1;
          }
       }
       return tbase;
    }
    public long sumThenReset(){
       Striped64 tbase = this.base;
       Striped64 tcells = this.cells;
       this.base = 0;
       if (tcells != null) {
          int len = tcells.length;
          int i = 0;
          while (i < len) {
             object oobject = tcells[i];
             if (oobject != null) {
                tbase = tbase + oobject.h;
                oobject.h = 0;
             }
             i = i + 1;
          }
       }
       return tbase;
    }
    public String toString(){
       return Long.toString(this.sum());
    }
    public long value(){
       return this.sum();
    }
    public final void writeObject(ObjectOutputStream p0){
       p0.defaultWriteObject();
       p0.writeLong(this.sum());
    }
}
