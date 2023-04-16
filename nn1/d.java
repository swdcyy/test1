package nn1.d;
import androidx.lifecycle.Observer;
import nn1.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;

public final class d implements Observer	// class@00337f
{
    public final g b;

    public void d(g p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          g c = this.b.c;
          a.o(c, "titleView");
          c.setText(p0);
       }
       return;
    }
}
