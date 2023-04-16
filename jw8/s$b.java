package jw8.s$b;
import android.view.View$OnClickListener;
import jw8.s;
import ypc.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class s$b implements View$OnClickListener	// class@0029cc
{
    public final s b;
    public final a c;

    public void s$b(s p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$b.class, "1")) {
          return;
       }
       this.b.f(this.c, false);
       return;
    }
}
