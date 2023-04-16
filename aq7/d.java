package aq7.d;
import androidx.lifecycle.Observer;
import aq7.e;
import java.lang.Object;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import qp7.d;
import kotlin.jvm.internal.a;

public final class d implements Observer	// class@000340
{
    public final e b;

    public void d(e p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.p().setAlpha(p0.floatValue());
       }
       return;
    }
}
