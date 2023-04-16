package io.reactivex.internal.disposables.DisposableHelper;
import crd.b;
import java.lang.Enum;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import io.reactivex.exceptions.ProtocolViolationException;
import java.lang.Throwable;
import ird.a;
import io.reactivex.internal.functions.a;
import java.lang.NullPointerException;
import java.lang.Class;

public final class DisposableHelper extends Enum implements b	// class@001822
{
    public static final DisposableHelper[] $VALUES;
    public static final DisposableHelper DISPOSED;

    static {
       DisposableHelper uDisposableH = new DisposableHelper("DISPOSED", 0);
       DisposableHelper.DISPOSED = uDisposableH;
       DisposableHelper[] uDisposableH1 = new DisposableHelper[]{uDisposableH};
       DisposableHelper.$VALUES = uDisposableH1;
    }
    public void DisposableHelper(String p0,int p1){
       super(p0, p1);
    }
    public static boolean dispose(AtomicReference p0){
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (p0.get() != dISPOSED) {
          b andSet = p0.getAndSet(dISPOSED);
          if (andSet != dISPOSED) {
             if (andSet != null) {
                andSet.dispose();
             }
             return true;
          }
       }
       return false;
    }
    public static boolean isDisposed(b p0){
       boolean b = (p0 == DisposableHelper.DISPOSED)? true: false;
       return b;
    }
    public static boolean replace(AtomicReference p0,b p1){
       while (true) {
          b uob = p0.get();
          if (uob == DisposableHelper.DISPOSED) {
             if (p1 != null) {
                p1.dispose();
                break ;
             }
             break ;
          }else {
             if (p0.compareAndSet(uob, p1)) {
                return true;
             }
             continue ;
          }
       }
       return false;
    }
    public static void reportDisposableSet(){
       a.l(new ProtocolViolationException("Disposable already set!"));
    }
    public static boolean set(AtomicReference p0,b p1){
       while (true) {
          b uob = p0.get();
          if (uob == DisposableHelper.DISPOSED) {
             if (p1 != null) {
                p1.dispose();
             }
             return false;
          }else {
             if (p0.compareAndSet(uob, p1)) {
                if (uob != null) {
                   uob.dispose();
                   break ;
                }
                break ;
             }
          }
       }
       return true;
    }
    public static boolean setOnce(AtomicReference p0,b p1){
       a.c(p1, "d is null");
       if (p0.compareAndSet(null, p1)) {
          return true;
       }
       p1.dispose();
       if (p0.get() != DisposableHelper.DISPOSED) {
          DisposableHelper.reportDisposableSet();
       }
       return false;
    }
    public static boolean trySet(AtomicReference p0,b p1){
       if (p0.compareAndSet(null, p1)) {
          return true;
       }
       if (p0.get() == DisposableHelper.DISPOSED) {
          p1.dispose();
       }
       return false;
    }
    public static boolean validate(b p0,b p1){
       if (p1 == null) {
          a.l(new NullPointerException("next is null"));
          return false;
       }else if(p0 != null){
          p1.dispose();
          DisposableHelper.reportDisposableSet();
          return false;
       }else {
          return true;
       }
    }
    public static DisposableHelper valueOf(String p0){
       return Enum.valueOf(DisposableHelper.class, p0);
    }
    public static DisposableHelper[] values(){
       return DisposableHelper.$VALUES.clone();
    }
    public void dispose(){
    }
    public boolean isDisposed(){
       return true;
    }
}
