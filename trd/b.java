package trd.b;
import java.util.Iterator;
import osd.a;
import java.lang.Object;
import kotlin.collections.State;
import trd.a;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;

public abstract class b implements Iterator, a	// class@00266f
{
    public State b;
    public Object c;

    public void b(){
       super();
       this.b = State.NotReady;
    }
    public abstract void a();
    public final void b(){
       this.b = State.Done;
    }
    public final void c(Object p0){
       this.c = p0;
       this.b = State.Ready;
    }
    public final boolean d(){
       this.b = State.Failed;
       this.a();
       boolean b = (this.b == State.Ready)? true: false;
       return b;
    }
    public boolean hasNext(){
       b tb = this.b;
       boolean b = false;
       int[] ointArray = (tb != State.Failed)? 1: null;
       if (ointArray) {
          int i = a.a[tb.ordinal()];
          if (i != 1) {
             b = (i != 2)? this.d(): true;
          }
       label_0020 :
          return b;
       }else {
          throw new IllegalArgumentException("Failed requirement.".toString());
       }
    }
    public Object next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       this.b = State.NotReady;
       return this.c;
    }
    public void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
