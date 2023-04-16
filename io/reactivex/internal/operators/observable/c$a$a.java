package io.reactivex.internal.operators.observable.c$a$a;
import java.util.Iterator;
import io.reactivex.internal.operators.observable.c$a;
import java.lang.Object;
import io.reactivex.internal.util.NotificationLite;
import java.lang.Throwable;
import java.lang.RuntimeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class c$a$a implements Iterator	// class@0013a3
{
    public Object b;
    public final c$a c;

    public void c$a$a(c$a p0){
       this.c = p0;
       super();
    }
    public boolean hasNext(){
       c$a c = this.c.c;
       this.b = c;
       return (NotificationLite.isComplete(c) ^ 0x01);
    }
    public Object next(){
       if (this.b == null) {
          this.b = this.c.c;
       }
       if (!NotificationLite.isComplete(this.b)) {
          if (!NotificationLite.isError(this.b)) {
             this.b = null;
             return NotificationLite.getValue(this.b);
          }else {
             throw ExceptionHelper.d(NotificationLite.getError(this.b));
          }
       }else {
          throw new NoSuchElementException();
       }
    }
    public void remove(){
       throw new UnsupportedOperationException("Read only iterator");
    }
}
