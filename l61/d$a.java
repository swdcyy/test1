package l61.d$a;
import com.yxcorp.gifshow.widget.m;
import l61.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k61.c;
import androidx.lifecycle.LiveData;
import z61.b;
import k61.f;

public class d$a extends m	// class@002e89
{
    public final d c;

    public void d$a(d p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       d$a tc = this.c;
       if (tc.g != null) {
          c a = tc.a;
          if (a != null && a.getValue() != null) {
             tc = this.c;
             tc.g.c(tc.a.getValue());
          }
       }
       return;
    }
}
