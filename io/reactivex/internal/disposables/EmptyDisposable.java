package io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.j;
import java.lang.Enum;
import java.lang.String;
import brd.d;
import crd.b;
import brd.p;
import brd.y;
import java.lang.Throwable;
import brd.d0;
import java.lang.Class;
import java.lang.Object;
import java.lang.UnsupportedOperationException;

public final class EmptyDisposable extends Enum implements j	// class@001823
{
    public static final EmptyDisposable[] $VALUES;
    public static final EmptyDisposable INSTANCE;
    public static final EmptyDisposable NEVER;

    static {
       EmptyDisposable uEmptyDispos = new EmptyDisposable("INSTANCE", 0);
       EmptyDisposable.INSTANCE = uEmptyDispos;
       EmptyDisposable uEmptyDispos1 = new EmptyDisposable("NEVER", 1);
       EmptyDisposable.NEVER = uEmptyDispos1;
       EmptyDisposable[] uEmptyDispos2 = new EmptyDisposable[]{uEmptyDispos,uEmptyDispos1};
       EmptyDisposable.$VALUES = uEmptyDispos2;
    }
    public void EmptyDisposable(String p0,int p1){
       super(p0, p1);
    }
    public static void complete(d p0){
       p0.onSubscribe(EmptyDisposable.INSTANCE);
       p0.onComplete();
    }
    public static void complete(p p0){
       p0.onSubscribe(EmptyDisposable.INSTANCE);
       p0.onComplete();
    }
    public static void complete(y p0){
       p0.onSubscribe(EmptyDisposable.INSTANCE);
       p0.onComplete();
    }
    public static void error(Throwable p0,d0 p1){
       p1.onSubscribe(EmptyDisposable.INSTANCE);
       p1.onError(p0);
    }
    public static void error(Throwable p0,d p1){
       p1.onSubscribe(EmptyDisposable.INSTANCE);
       p1.onError(p0);
    }
    public static void error(Throwable p0,p p1){
       p1.onSubscribe(EmptyDisposable.INSTANCE);
       p1.onError(p0);
    }
    public static void error(Throwable p0,y p1){
       p1.onSubscribe(EmptyDisposable.INSTANCE);
       p1.onError(p0);
    }
    public static EmptyDisposable valueOf(String p0){
       return Enum.valueOf(EmptyDisposable.class, p0);
    }
    public static EmptyDisposable[] values(){
       return EmptyDisposable.$VALUES.clone();
    }
    public void clear(){
    }
    public void dispose(){
    }
    public boolean isDisposed(){
       boolean b = (this == EmptyDisposable.INSTANCE)? true: false;
       return b;
    }
    public boolean isEmpty(){
       return true;
    }
    public boolean offer(Object p0){
       throw new UnsupportedOperationException("Should not be called!");
    }
    public boolean offer(Object p0,Object p1){
       throw new UnsupportedOperationException("Should not be called!");
    }
    public Object poll(){
       return null;
    }
    public int requestFusion(int p0){
       return (p0 & 0x02);
    }
}
