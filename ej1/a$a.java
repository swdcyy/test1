package ej1.a$a;
import android.view.View$OnClickListener;
import ej1.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import msd.p;

public final class a$a implements View$OnClickListener	// class@002172
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a.o(p0, "it");
       this.b.l.invoke(p0, this.b.j);
       return;
    }
}
