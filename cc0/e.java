package cc0.e;
import java.lang.Runnable;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class e implements Runnable	// class@00030a
{
    public final View b;

    public void e(View p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.b.bringToFront();
       return;
    }
}
