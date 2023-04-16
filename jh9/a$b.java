package jh9.a$b;
import androidx.lifecycle.Observer;
import jh9.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.google.android.material.appbar.AppBarLayout;

public final class a$b implements Observer	// class@002acc
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          a.o(p0, "collapseAppBar");
          if (p0.booleanValue()) {
             a.P8(this.b).p(false, false);
          }
       }
       return;
    }
}
