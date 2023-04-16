package aq7.b;
import androidx.lifecycle.Observer;
import aq7.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;

public final class b implements Observer	// class@00033e
{
    public final e b;

    public void b(e p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          e l = this.b.l;
          if (l == null) {
             a.S("mTextView");
          }
          l.setText(p0);
       }
       return;
    }
}
