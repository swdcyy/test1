package j79.i0;
import android.view.View$OnClickListener;
import j79.h0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class i0 implements View$OnClickListener	// class@00277a
{
    public final h0 b;

    public void i0(h0 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "1")) {
          return;
       }
       this.b.h();
       return;
    }
}
