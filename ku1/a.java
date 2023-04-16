package ku1.a;
import androidx.lifecycle.Observer;
import ku1.b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Runnable;

public final class a implements Observer	// class@002e01
{
    public final b b;

    public void a(b p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a.o(p0, "showArea");
          if (p0.booleanValue()) {
             b.e3(this.b).post(this.b.s);
          }
       }
       return;
    }
}
