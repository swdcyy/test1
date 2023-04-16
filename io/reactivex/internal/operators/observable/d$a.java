package io.reactivex.internal.operators.observable.d$a;
import java.util.Iterator;
import brd.w;
import io.reactivex.internal.operators.observable.d$b;
import java.lang.Object;
import io.reactivex.internal.operators.observable.a1;
import brd.y;
import brd.t;
import io.reactivex.internal.util.c;
import java.util.concurrent.BlockingQueue;
import brd.s;
import java.lang.Throwable;
import java.lang.RuntimeException;
import io.reactivex.internal.util.ExceptionHelper;
import grd.c;
import java.util.NoSuchElementException;
import java.lang.String;
import java.lang.UnsupportedOperationException;

public final class d$a implements Iterator	// class@0013aa
{
    public final d$b b;
    public final w c;
    public Object d;
    public boolean e;
    public boolean f;
    public Throwable g;
    public boolean h;

    public void d$a(w p0,d$b p1){
       super();
       this.e = true;
       this.f = true;
       this.c = p0;
       this.b = p1;
    }
    public boolean hasNext(){
       d$a tg = this.g;
       if (tg != null) {
          throw ExceptionHelper.d(tg);
       }
       boolean b = false;
       if (this.e == null) {
          return b;
       }
       if (this.f != null) {
          if (this.h == null) {
             this.h = true;
             this.b.a();
             new a1(this.c).subscribe(this.b);
          }
          try{
             tg = this.b;
             tg.a();
             c.a();
             s os = tg.b.take();
             if (os.h()) {
                this.f = b;
                this.d = os.e();
                os = 1;
             }else {
                this.e = b;
                if (os.f()) {
                   os = 0;
                }else {
                   Throwable throwable = os.d();
                   this.g = throwable;
                   throw ExceptionHelper.d(throwable);
                }
             }
             if (!os) {
             label_006b :
                return b;
             }
          }catch(java.lang.InterruptedException e0){
             this.b.dispose();
             this.g = e0;
             throw ExceptionHelper.d(e0);
          }
       }
       b = true;
       goto label_006b ;
    }
    public Object next(){
       d$a tg = this.g;
       if (tg != null) {
          throw ExceptionHelper.d(tg);
       }
       if (!this.hasNext()) {
          throw new NoSuchElementException("No more elements");
       }
       this.f = true;
       return this.d;
    }
    public void remove(){
       throw new UnsupportedOperationException("Read only iterator");
    }
}
