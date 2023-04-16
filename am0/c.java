package am0.c;
import com.yxcorp.gifshow.widget.m;
import am0.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import am0.a;

public final class c extends m	// class@0000d5
{
    public final b c;

    public void c(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.c.a(true);
       b f = this.c.f;
       if (f != null) {
          f.h7();
       }
       return;
    }
}
