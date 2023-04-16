package mld.a;
import com.yxcorp.gifshow.widget.m;
import mld.b$a;
import old.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mld.b;
import mld.c;

public final class a extends m	// class@001d2a
{
    public final b$a c;
    public final a d;

    public void a(b$a p0,a p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "v");
       b i = this.c.d.i;
       if (i != null) {
          i.s(this.d);
       }
       return;
    }
}
