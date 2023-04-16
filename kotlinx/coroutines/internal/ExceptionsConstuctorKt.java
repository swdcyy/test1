package kotlinx.coroutines.internal.ExceptionsConstuctorKt;
import java.lang.Throwable;
import java.lang.Class;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.WeakHashMap;
import java.lang.reflect.Constructor;
import msd.l;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import kotlinx.coroutines.internal.ExceptionsConstuctorKt$createConstructor$$inlined$safeCtor$1;
import kotlinx.coroutines.internal.ExceptionsConstuctorKt$createConstructor$$inlined$safeCtor$2;
import kotlinx.coroutines.internal.ExceptionsConstuctorKt$createConstructor$$inlined$safeCtor$3;
import kotlinx.coroutines.internal.ExceptionsConstuctorKt$createConstructor$$inlined$safeCtor$4;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import vsd.d;
import lsd.a;
import kotlin.Result;
import java.lang.Integer;
import qrd.j0;
import java.lang.Number;
import kotlinx.coroutines.internal.ExceptionsConstuctorKt$safeCtor$1;
import ftd.e0;
import java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock;
import kotlinx.coroutines.internal.ExceptionsConstuctorKt$tryCopyException$4$1;
import java.util.Map;
import qrd.l1;
import kotlinx.coroutines.internal.ExceptionsConstuctorKt$a;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.Iterator;
import kotlinx.coroutines.internal.ExceptionsConstuctorKt$tryCopyException$5$1;

public final class ExceptionsConstuctorKt	// class@001b3c
{
    public static final int a;
    public static final ReentrantReadWriteLock b;
    public static final WeakHashMap c;

    static {
       ExceptionsConstuctorKt.a = ExceptionsConstuctorKt.d(Throwable.class, -1);
       ExceptionsConstuctorKt.b = new ReentrantReadWriteLock();
       ExceptionsConstuctorKt.c = new WeakHashMap();
    }
    public static final l a(Constructor p0){
       String str = String.class;
       Class[] parameterTyp = p0.getParameterTypes();
       int len = parameterTyp.length;
       l ol = null;
       if (len) {
          if (len != 1) {
             if (len == 2 && (a.g(parameterTyp[0], str) && a.g(parameterTyp[1], Throwable.class))) {
                ol = new ExceptionsConstuctorKt$createConstructor$$inlined$safeCtor$1(p0);
             }
          }else {
             object oobject = parameterTyp[0];
             if (a.g(oobject, Throwable.class)) {
                ol = new ExceptionsConstuctorKt$createConstructor$$inlined$safeCtor$2(p0);
             }else if(a.g(oobject, str)){
                ol = new ExceptionsConstuctorKt$createConstructor$$inlined$safeCtor$3(p0);
             }
          }
       }else {
          ol = new ExceptionsConstuctorKt$createConstructor$$inlined$safeCtor$4(p0);
       }
       return ol;
    }
    public static final int b(Class p0,int p1){
       do {
          Field[] declaredFiel = p0.getDeclaredFields();
          int len = declaredFiel.length;
          int i = 0;
          int i1 = 0;
          while (i < len) {
             int i2 = Modifier.isStatic(declaredFiel[i].getModifiers()) ^ 0x01;
             if (i2) {
                i1 = i1 + 1;
             }
             i = i + 1;
          }
          p1 = p1 + i1;
          p0 = p0.getSuperclass();
       } while (p0 != null);
       return p1;
    }
    public static int c(Class p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = 0;
       }
       return ExceptionsConstuctorKt.b(p0, p1);
    }
    public static final int d(Class p0,int p1){
       a.g(p0);
       Integer integer = Result.constructor-impl(Integer.valueOf(ExceptionsConstuctorKt.c(p0, 0, 1, null)));
       Integer integer1 = Integer.valueOf(p1);
       if (Result.isFailure-impl(integer)) {
          integer = integer1;
       }
       return integer.intValue();
    }
    public static final l e(l p0){
       return new ExceptionsConstuctorKt$safeCtor$1(p0);
    }
    public static final Throwable f(Throwable p0){
       int i1;
       ReentrantReadWriteLock$WriteLock writeLock;
       Throwable throwable = null;
       if (p0 instanceof e0) {
          p0 = Result.constructor-impl(p0.createCopy());
          if (!Result.isFailure-impl(p0)) {
             throwable = p0;
          }
          return throwable;
       }else {
          ReentrantReadWriteLock b = ExceptionsConstuctorKt.b;
          ReentrantReadWriteLock$ReadLock readLock = b.readLock();
          readLock.lock();
          l ol = ExceptionsConstuctorKt.c.get(p0.getClass());
          readLock.unlock();
          if (ol != null) {
             return ol.invoke(p0);
          }
          int i = 0;
          if (ExceptionsConstuctorKt.a != ExceptionsConstuctorKt.d(p0.getClass(), i)) {
             readLock = b.readLock();
             int readHoldCoun = (!b.getWriteHoldCount())? b.getReadHoldCount(): 0;
             for (i1 = 0; i1 < readHoldCoun; i1 = i1 + 1) {
                readLock.unlock();
             }
             writeLock = b.writeLock();
             writeLock.lock();
             ExceptionsConstuctorKt.c.put(p0.getClass(), ExceptionsConstuctorKt$tryCopyException$4$1.INSTANCE);
             l1 a = l1.a;
             for (; i < readHoldCoun; i = i + 1) {
                readLock.lock();
             }
             writeLock.unlock();
             return throwable;
          }else {
             Iterator iterator = ArraysKt___ArraysKt.xv(p0.getClass().getConstructors(), new ExceptionsConstuctorKt$a()).iterator();
             Throwable throwable1 = throwable;
             while (iterator.hasNext()) {
                throwable1 = ExceptionsConstuctorKt.a(iterator.next());
                if (throwable1 != null) {
                   break ;
                }
             }
             b = ExceptionsConstuctorKt.b;
             ReentrantReadWriteLock$ReadLock readLock1 = b.readLock();
             i1 = (!b.getWriteHoldCount())? b.getReadHoldCount(): 0;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                readLock1.unlock();
             }
             writeLock = b.writeLock();
             writeLock.lock();
             WeakHashMap c = ExceptionsConstuctorKt.c;
             Class class = p0.getClass();
             Throwable throwable2 = (throwable1 != null)? throwable1: ExceptionsConstuctorKt$tryCopyException$5$1.INSTANCE;
             c.put(class, throwable2);
             l1 a1 = l1.a;
             for (; i < i1; i = i + 1) {
                readLock1.lock();
             }
             writeLock.unlock();
             if (throwable1 != null) {
                throwable = throwable1.invoke(p0);
             }
             return throwable;
          }
       }
    }
}
