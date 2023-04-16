package dz9.a$g;
import android.view.View$OnClickListener;
import dz9.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kf5.g;
import mf5.w0;
import kotlin.jvm.internal.a;

public final class a$g implements View$OnClickListener	// class@002005
{
    public final a b;

    public void a$g(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$g.class, "1")) {
          return;
       }
       if (this.b.q() == null) {
          return;
       }
       a$g tb = this.b;
       g og = tb.q();
       a.m(og);
       tb.d(tb, og);
       return;
    }
}
