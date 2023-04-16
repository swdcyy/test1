package io.reactivex.internal.disposables.ArrayCompositeDisposable;
import crd.b;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ArrayCompositeDisposable extends AtomicReferenceArray implements b	// class@0011a8
{
    public static final long serialVersionUID = 0x261d229f8c0b4b20;

    public void ArrayCompositeDisposable(int p0){
       super(p0);
    }
    public void dispose(){
       int i = 0;
       if (this.get(i) != DisposableHelper.DISPOSED) {
          int i1 = this.length();
          while (i < i1) {
             DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
             if (this.get(i) != dISPOSED) {
                b andSet = this.getAndSet(i, dISPOSED);
                if (andSet != dISPOSED && andSet != null) {
                   andSet.dispose();
                }
             }
             i = i + 1;
          }
       }
       return;
    }
    public boolean isDisposed(){
       int i = 0;
       if (this.get(i) == DisposableHelper.DISPOSED) {
          i = true;
       }
       return i;
    }
    public b replaceResource(int p0,b p1){
       b uob;
       while (true) {
          uob = this.get(p0);
          if (uob == DisposableHelper.DISPOSED) {
             p1.dispose();
             return null;
          }else if(this.compareAndSet(p0, uob, p1)){
             break ;
          }
       }
       return uob;
    }
    public boolean setResource(int p0,b p1){
       while (true) {
          b uob = this.get(p0);
          if (uob == DisposableHelper.DISPOSED) {
             p1.dispose();
             return false;
          }else if(this.compareAndSet(p0, uob, p1)){
             if (uob != null) {
                uob.dispose();
                break ;
             }
             break ;
          }
       }
       return true;
    }
}
