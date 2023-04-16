package mrd.a;
import mrd.c;
import java.lang.Object;
import mrd.a$a;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.lang.Throwable;
import io.reactivex.internal.util.NotificationLite;
import java.lang.System;
import io.reactivex.internal.util.ExceptionHelper;
import ird.a;
import crd.b;
import brd.y;
import io.reactivex.internal.util.a$a;
import io.reactivex.internal.util.a;

public final class a extends c	// class@001d3d
{
    public final AtomicReference b;
    public final AtomicReference c;
    public final ReadWriteLock d;
    public final Lock e;
    public final Lock f;
    public final AtomicReference g;
    public long h;
    public static final Object[] i;
    public static final a$a[] j;
    public static final a$a[] k;

    static {
       Object[] objArray = new Object[0];
       a.i = objArray;
       a$a[] uoaArray = new a$a[0];
       a.j = uoaArray;
       a$a[] uoaArray1 = new a$a[0];
       a.k = uoaArray1;
    }
    public void a(){
       super();
       ReentrantReadWriteLock reentrantRea = new ReentrantReadWriteLock();
       this.d = reentrantRea;
       this.e = reentrantRea.readLock();
       this.f = reentrantRea.writeLock();
       this.c = new AtomicReference(a.j);
       this.b = new AtomicReference();
       this.g = new AtomicReference();
    }
    public void a(Object p0){
       super();
       a.c(p0, "defaultValue is null");
       this.b.lazySet(p0);
    }
    public static a g(){
       return new a();
    }
    public static a h(Object p0){
       return new a(p0);
    }
    public Throwable b(){
       Object obj = this.b.get();
       if (NotificationLite.isError(obj)) {
          return NotificationLite.getError(obj);
       }
       return null;
    }
    public boolean c(){
       return NotificationLite.isComplete(this.b.get());
    }
    public boolean d(){
       boolean b = (this.c.get().length)? true: false;
       return b;
    }
    public boolean e(){
       return NotificationLite.isError(this.b.get());
    }
    public Object i(){
       Object obj = this.b.get();
       if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
          return null;
       }
       return NotificationLite.getValue(obj);
    }
    public boolean j(){
       Object obj = this.b.get();
       boolean b = (obj != null && (!NotificationLite.isComplete(obj) && !NotificationLite.isError(obj)))? true: false;
       return b;
    }
    public void k(a$a p0){
       a$a[] j;
       while (true) {
          a$a[] uoaArray = this.c.get();
          int len = uoaArray.length;
          if (!len) {
          }else {
             a uoa = null;
             int i = 0;
             while (true) {
                if (i < len) {
                   if (uoaArray[i] == p0) {
                   label_0019 :
                      if (i < 0) {
                         return;
                      }
                      object oobject = 1;
                      if (len == oobject) {
                         j = a.j;
                      }else {
                         int i1 = len - 1;
                         a$a[] uoaArray1 = new a$a[i1];
                         System.arraycopy(uoaArray, uoa, uoaArray1, uoa, i);
                         int i2 = i + 1;
                         len = len - i;
                         len = len - oobject;
                         System.arraycopy(uoaArray, i2, uoaArray1, i, len);
                         j = uoaArray1;
                      }
                      if (this.c.compareAndSet(uoaArray, j)) {
                      }
                   }else {
                      i = i + 1;
                   }
                }else {
                   i = -1;
                   goto label_0019 ;
                }
             }
             return;
          }
       }
       return;
    }
    public void l(Object p0){
       this.f.lock();
       this.h = this.h + 1;
       this.b.lazySet(p0);
       this.f.unlock();
    }
    public a$a[] m(Object p0){
       a$a[] k = a.k;
       a$a[] andSet = this.c.getAndSet(k);
       if (andSet != k) {
          this.l(p0);
       }
       return andSet;
    }
    public void onComplete(){
       if (!this.g.compareAndSet(null, ExceptionHelper.a)) {
          return;
       }
       Object obj = NotificationLite.complete();
       a$a[] uoaArray = this.m(obj);
       int len = uoaArray.length;
       for (int i = 0; i < len; i = i + 1) {
          uoaArray[i].a(obj, this.h);
       }
       return;
    }
    public void onError(Throwable p0){
       a.c(p0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
       if (!this.g.compareAndSet(null, p0)) {
          a.l(p0);
          return;
       }else {
          p0 = NotificationLite.error(p0);
          a$a[] uoaArray = this.m(p0);
          int len = uoaArray.length;
          for (int i = 0; i < len; i = i + 1) {
             uoaArray[i].a(p0, this.h);
          }
          return;
       }
    }
    public void onNext(Object p0){
       a.c(p0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
       if (this.g.get() != null) {
          return;
       }
       p0 = NotificationLite.next(p0);
       this.l(p0);
       a$a[] uoaArray = this.c.get();
       int len = uoaArray.length;
       for (int i = 0; i < len; i = i + 1) {
          uoaArray[i].a(p0, this.h);
       }
       return;
    }
    public void onSubscribe(b p0){
       if (this.g.get() != null) {
          p0.dispose();
       }
       return;
    }
    public void subscribeActual(y p0){
       a uoa1;
       a$a uoa = new a$a(p0, this);
       p0.onSubscribe(uoa);
       while (true) {
          a$a[] uoaArray = this.c.get();
          if (uoaArray == a.k) {
             uoa1 = null;
          }else {
             int len = uoaArray.length;
             int i = len + 1;
             a$a[] uoaArray1 = new a$a[i];
             System.arraycopy(uoaArray, false, uoaArray1, false, len);
             uoaArray1[len] = uoa;
             if (this.c.compareAndSet(uoaArray, uoaArray1)) {
                uoa1 = 1;
             }
          }
          if (uoa1) {
             if (uoa.g != null) {
                this.k(uoa);
                break ;
             }else if(uoa.g != null){
                _monitor_enter(uoa);
                if (uoa.g != null) {
                   _monitor_exit(uoa);
                   break ;
                }else if(uoa.c != null){
                   _monitor_exit(uoa);
                   break ;
                }else {
                   a$a b = uoa.b;
                   uoa1 = b.e;
                   uoa1.lock();
                   uoa.h = b.h;
                   b = b.b.get();
                   uoa1.unlock();
                   boolean b1 = (b != null)? true: false;
                   uoa.d = b1;
                   uoa.c = true;
                   _monitor_exit(uoa);
                   if (b != null && !uoa.test(b)) {
                      while (uoa.g == null) {
                         _monitor_enter(uoa);
                         b = uoa.e;
                         if (b == null) {
                            uoa.d = false;
                            _monitor_exit(uoa);
                            break ;
                         }
                         uoa.e = null;
                         _monitor_exit(uoa);
                         b.b(uoa);
                      }
                   }
                }
             }
          }else {
             Throwable throwable = this.g.get();
             if (throwable == ExceptionHelper.a) {
                p0.onComplete();
                break ;
             }else {
                p0.onError(throwable);
                break ;
             }
          }
          break ;
       }
       return;
    }
}
