package io.reactivex.internal.operators.single.o;
import brd.a0;
import java.lang.Iterable;
import erd.o;
import brd.d0;
import brd.e0;
import java.util.Iterator;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Throwable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Arrays;
import java.util.NoSuchElementException;
import io.reactivex.internal.operators.single.l$a;
import io.reactivex.internal.operators.single.o$a;
import io.reactivex.internal.operators.single.SingleZipArray$ZipCoordinator;
import crd.b;
import drd.a;

public final class o extends a0	// class@00149c
{
    public final Iterable b;
    public final o c;

    public void o(Iterable p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void S(d0 p0){
       int i2;
       e0[] uoe0Array = new e0[8];
       Iterator iterator = this.b.iterator();
       int i = 0;
       int i1 = 0;
       while (true) {
          if (iterator.hasNext()) {
             e0 uoe0 = iterator.next();
             if (uoe0 == null) {
                break ;
             }else if(i1 == uoe0Array.length){
                i2 = i1 >> 2;
                i2 = i2 + i1;
                uoe0Array = Arrays.copyOf(uoe0Array, i2);
             }
             i2 = i1 + 1;
             uoe0Array[i1] = uoe0;
             i1 = i2;
          }else if(!i1){
             EmptyDisposable.error(new NoSuchElementException(), p0);
             return;
          }else if(i1 == 1){
             uoe0Array[i].b(new l$a(p0, new o$a(this)));
             return;
          }else {
             SingleZipArray$ZipCoordinator zipCoordinat = new SingleZipArray$ZipCoordinator(p0, i1, this.c);
             p0.onSubscribe(zipCoordinat);
             while (true) {
                if (i >= i1) {
                   return;
                }
                if (zipCoordinat.isDisposed()) {
                   return;
                }
                uoe0Array[i].b(zipCoordinat.observers[i]);
                i = i + 1;
             }
          }
       }
       EmptyDisposable.error(new NullPointerException("One of the sources is null"), p0);
       return;
    }
}
