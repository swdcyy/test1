package ab0.t$b;
import com.yxcorp.gifshow.widget.m;
import ab0.t;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class t$b extends m	// class@00004f
{
    public final t c;

    public void t$b(t p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, t$b.class, "1")) {
          return;
       }
       this.c.R8();
       PatchProxy.onMethodExit(t$b.class, "1");
       return;
    }
}
