package j79.f0;
import android.view.View$OnClickListener;
import j79.d0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class f0 implements View$OnClickListener	// class@002773
{
    public final d0 b;

    public void f0(d0 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "1")) {
          return;
       }
       this.b.h();
       return;
    }
}
