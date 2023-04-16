package c8a.b$e;
import com.yxcorp.gifshow.widget.h$b;
import c8a.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c8a.c;

public final class b$e implements h$b	// class@000574
{
    public final b a;

    public void b$e(b p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e.class, "1")) {
          return;
       }
       this.a.P8("CLOSE");
       c.b();
       return;
    }
}
