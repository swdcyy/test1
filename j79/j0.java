package j79.j0;
import android.view.View$OnClickListener;
import j79.h0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class j0 implements View$OnClickListener	// class@00277c
{
    public final h0 b;

    public void j0(h0 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "1")) {
          return;
       }
       this.b.h();
       return;
    }
}
