package com.google.common.collect.AbstractIterator;
import qk.t0;
import com.google.common.collect.AbstractIterator$State;
import java.lang.Object;
import ok.n;
import com.google.common.collect.AbstractIterator$a;
import java.lang.Enum;
import java.util.NoSuchElementException;

public abstract class AbstractIterator extends t0	// class@00178a
{
    public AbstractIterator$State b;
    public Object c;

    public void AbstractIterator(){
       super();
       this.b = AbstractIterator$State.NOT_READY;
    }
    public abstract Object a();
    public final Object b(){
       this.b = AbstractIterator$State.DONE;
       return null;
    }
    public final boolean hasNext(){
       AbstractIterator$State fAILED = AbstractIterator$State.FAILED;
       boolean b = false;
       int b1 = (this.b != fAILED)? true: false;
       n.n(b1);
       b1 = AbstractIterator$a.a[this.b.ordinal()];
       if (b1 != 1) {
          if (b1 != 2) {
             this.b = fAILED;
             this.c = this.a();
             if (this.b != AbstractIterator$State.DONE) {
                this.b = AbstractIterator$State.READY;
                b = true;
             }
             return b;
          }else {
             return true;
          }
       }else {
          return b;
       }
    }
    public final Object next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       this.b = AbstractIterator$State.NOT_READY;
       AbstractIterator tc = this.c;
       this.c = null;
       return tc;
    }
}
