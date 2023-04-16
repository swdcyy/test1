package f6a.e;
import android.view.View$OnClickListener;
import f6a.f;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class e implements View$OnClickListener	// class@0022ca
{
    public final f b;

    public void e(f p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "1")) {
          return;
       }
       this.b.c9();
       PatchProxy.onMethodExit(e.class, "1");
       return;
    }
}
