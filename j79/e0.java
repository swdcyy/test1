package j79.e0;
import android.view.View$OnClickListener;
import j79.d0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class e0 implements View$OnClickListener	// class@002771
{
    public final d0 b;

    public void e0(d0 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "1")) {
          return;
       }
       this.b.h();
       return;
    }
}
