package rv8.a;
import java.lang.Runnable;
import android.app.Activity;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Exception;

public abstract class a implements Runnable	// class@003716
{
    public final WeakReference b;

    public void a(Activity p0){
       this.b = new WeakReference(p0);
    }
    public abstract void a();
    public void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Activity uActivity = this.b.get();
       if (uActivity != null && !uActivity.isFinishing()) {
          try{
             this.a();
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
}
