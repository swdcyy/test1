package b74.a$b;
import android.view.View$OnClickListener;
import b74.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c74.c;
import b74.b;

public final class a$b implements View$OnClickListener	// class@00031d
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       a$b tb = this.b;
       a t = tb.t;
       if (t != null) {
          t.a(tb.s);
       }
       return;
    }
}
