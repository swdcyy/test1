package eca.b$a;
import java.lang.Runnable;
import eca.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.TextView;
import android.view.View;

public final class b$a implements Runnable	// class@002106
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "1")) {
          return;
       }
       b$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, b.class, "8")) {
          tb.h.setVisibility(0);
          tb.m.setVisibility(0);
          tb.n.setVisibility(8);
          tb.k.setVisibility(8);
          tb.i();
       }
       return;
    }
}
