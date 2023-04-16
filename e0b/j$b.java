package e0b.j$b;
import android.view.View$OnClickListener;
import e0b.j;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import e0b.h$a;

public final class j$b implements View$OnClickListener	// class@0025cc
{
    public final j b;

    public void j$b(j p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$b.class, "1")) {
          return;
       }
       j$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, j.class, "6")) {
          j l = tb.L;
          if (l != null) {
             l.c();
          }
       }
       return;
    }
}
