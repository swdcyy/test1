package bsa.d;
import java.lang.Runnable;
import bsa.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import ln5.b;

public final class d implements Runnable	// class@00045d
{
    public final b b;

    public void d(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       d tb = this.b;
       tb.s.a(b.V8(tb).getMeasuredHeight(), true);
       return;
    }
}
