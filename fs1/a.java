package fs1.a;
import java.lang.Runnable;
import fs1.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public final class a implements Runnable	// class@002390
{
    public final b b;

    public void a(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.b.b.requestLayout();
       return;
    }
}
