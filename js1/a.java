package js1.a;
import androidx.lifecycle.Observer;
import js1.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import java.lang.CharSequence;

public final class a implements Observer	// class@002bff
{
    public final c b;

    public void a(c p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a.o(p0, "countdownString");
          int i = 0;
          a uoa = (!p0.length())? 1: null;
          if (uoa) {
             c.V2(this.b).setVisibility(8);
          }else {
             c.V2(this.b).setVisibility(i);
          }
          c.V2(this.b).setText(p0);
       }
       return;
    }
}
