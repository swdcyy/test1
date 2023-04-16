package androidx.lifecycle.ComputableLiveData$2;
import java.lang.Runnable;
import androidx.lifecycle.ComputableLiveData;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import androidx.lifecycle.LiveData;

public class ComputableLiveData$2 implements Runnable	// class@0007bd
{
    public final ComputableLiveData this$0;

    public void ComputableLiveData$2(ComputableLiveData p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       boolean b;
       do {
          b = false;
          boolean b1 = true;
          if (this.this$0.mComputing.compareAndSet(b, b1)) {
             ComputableLiveData$2 u2 = null;
             int i = 0;
             while (this.this$0.mInvalid.compareAndSet(b1, b)) {
                u2 = this.this$0.compute();
                i = 1;
             }
             if (i) {
                this.this$0.mLiveData.postValue(u2);
             }
             this.this$0.mComputing.set(b);
             b = i;
          }
       } while (!b || !this.this$0.mInvalid.get());
       return;
    }
}
