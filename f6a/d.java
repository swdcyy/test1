package f6a.d;
import android.view.View$OnClickListener;
import f6a.f;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d implements View$OnClickListener	// class@0022c9
{
    public final f b;

    public void d(f p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d.class, "1")) {
          return;
       }
       d tb = this.b;
       tb.R8(tb.D);
       PatchProxy.onMethodExit(d.class, "1");
       return;
    }
}
