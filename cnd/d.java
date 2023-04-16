package cnd.d;
import java.lang.Runnable;
import cnd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;

public final class d implements Runnable	// class@00034a
{
    public final b b;

    public void d(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       d tb;
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       View[] viewArray = new View[]{this.b.e};
       n.Z(0, viewArray);
       View[] viewArray1 = new View[]{tb.f,tb.g,tb.h,tb.j};
       tb = this.b;
       n.Z(8, viewArray1);
       return;
    }
}
