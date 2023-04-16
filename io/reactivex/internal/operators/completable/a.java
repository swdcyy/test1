package io.reactivex.internal.operators.completable.a;
import brd.a;
import brd.e;
import java.lang.Iterable;
import brd.d;
import java.util.Iterator;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Throwable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.lang.System;
import drd.a;
import crd.a;
import crd.b;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.internal.operators.completable.a$a;
import ird.a;

public final class a extends a	// class@001200
{
    public final e[] b;
    public final Iterable c;

    public void a(e[] p0,Iterable p1){
       super();
       this.b = p0;
       this.c = null;
    }
    public void v(d p0){
       int i;
       int i1;
       a tb = this.b;
       String str = "One of the sources is null";
       if (tb == null) {
          tb = new e[8];
          Iterator iterator = this.c.iterator();
          i = 0;
          while (true) {
             if (iterator.hasNext()) {
                e uoe = iterator.next();
                if (uoe == null) {
                   EmptyDisposable.error(new NullPointerException(str), p0);
                   return;
                }else if(i == tb.length){
                   i1 = i >> 2;
                   i1 = i1 + i;
                   e[] uoeArray = new e[i1];
                   System.arraycopy(tb, 0, uoeArray, 0, i);
                   tb = uoeArray;
                }
                i1 = i + 1;
                tb[i] = uoe;
                i = i1;
             }
          }
       }else {
          i = tb.length;
       }
       a uoa = new a();
       p0.onSubscribe(uoa);
       AtomicBoolean uAtomicBoole = new AtomicBoolean();
       a$a uoa1 = new a$a(uAtomicBoole, uoa, p0);
       int i2 = 0;
       while (true) {
          if (i2 < i) {
             object oobject = tb[i2];
             if (uoa.isDisposed()) {
                return;
             }else if(oobject == null){
                NullPointerException nullPointerE = new NullPointerException(str);
                if (uAtomicBoole.compareAndSet(0, true)) {
                   uoa.dispose();
                   p0.onError(nullPointerE);
                   break ;
                }else {
                   a.l(nullPointerE);
                   break ;
                }
             }else {
                oobject.a(uoa1);
                i2 = i2 + 1;
             }
          }else if(!i){
             p0.onComplete();
          }
          return;
       }
       return;
    }
}
