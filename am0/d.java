package am0.d;
import com.yxcorp.gifshow.widget.m;
import am0.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import am0.a;

public final class d extends m	// class@0000d6
{
    public final b c;

    public void d(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       b f = this.c.f;
       if (f != null) {
          f.l1();
       }
       return;
    }
}
