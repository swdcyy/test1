package grd.a;
import crd.b;
import java.lang.Object;
import io.reactivex.internal.util.VolatileSizeArrayList;
import java.util.concurrent.CountDownLatch;
import java.lang.String;
import java.lang.AssertionError;
import java.lang.StringBuilder;
import java.util.List;
import io.reactivex.observers.TestObserver;
import java.lang.CharSequence;
import java.lang.Throwable;
import io.reactivex.exceptions.CompositeException;
import java.lang.Iterable;

public abstract class a implements b	// class@000f5b
{
    public final CountDownLatch b;
    public final List c;
    public final List d;
    public long e;
    public Thread f;
    public boolean g;
    public int h;
    public int i;
    public CharSequence j;
    public boolean k;

    public void a(){
       super();
       this.c = new VolatileSizeArrayList();
       this.d = new VolatileSizeArrayList();
       this.b = new CountDownLatch(1);
    }
    public abstract a a();
    public abstract a b();
    public final AssertionError c(String p0){
       StringBuilder str = new StringBuilder((p0.length() + 64))+p0+" \("+"latch = "+this.b.getCount()+", "+"values = "+this.c.size()+", "+"errors = "+this.d.size()+", "+"completions = "+this.e;
       if (this.k != null) {
          str = str+", timeout!";
       }
       if (this.isDisposed()) {
          str = str+", disposed!";
       }
       a tj = this.j;
       if (tj != null) {
          str = str+", tag = "+tj;
       }
       AssertionError uAssertionEr = new AssertionError(str+')');
       if (!this.d.isEmpty()) {
          if (this.d.size() == 1) {
             uAssertionEr.initCause(this.d.get(0));
          }else {
             uAssertionEr.initCause(new CompositeException(this.d));
          }
       }
       return uAssertionEr;
    }
}
