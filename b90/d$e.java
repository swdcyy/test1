package b90.d$e;
import android.view.View$OnClickListener;
import b90.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z80.b;
import k2b.e0;

public final class d$e implements View$OnClickListener	// class@000af4
{
    public final d b;

    public void d$e(d p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$e.class, "1")) {
          return;
       }
       b.a.a(this.b.p);
       this.b.D(true);
       return;
    }
}
