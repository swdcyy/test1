package jz0.e$b;
import com.yxcorp.gifshow.widget.m;
import jz0.e;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mkc.b;
import mkc.c;
import pk1.a;

public class e$b extends m	// class@002c45
{
    public final e c;

    public void e$b(e p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
          return;
       }
       b[] uobArray = new b[]{b.g};
       c.d(this.c.r, uobArray);
       c.h(this.c.r, b.d);
       this.c.P8(a.a());
       return;
    }
}
