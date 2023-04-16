package ekd.d;
import java.lang.Runnable;
import android.app.Activity;
import java.lang.Object;
import java.lang.ref.WeakReference;
import ekd.e0;

public abstract class d implements Runnable	// class@000d32
{
    public final WeakReference b;

    public void d(Activity p0){
       super();
       this.b = new WeakReference(p0);
    }
    public abstract void a();
    public void run(){
       Activity uActivity = this.b.get();
       if (uActivity == null || uActivity.isFinishing()) {
          return;
       }
       try{
          this.a();
       }catch(java.lang.RuntimeException e0){
          if (e0.a) {
          label_001b :
             throw e0;
          }
       }
       return;
    }
}
