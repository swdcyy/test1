package nn1.k;
import androidx.lifecycle.Observer;
import nn1.m;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;

public final class k implements Observer	// class@00338a
{
    public final m b;

    public void k(m p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          m b = this.b.b;
          a.o(b, "playCountView");
          b.setText(p0);
       }
       return;
    }
}
