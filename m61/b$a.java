package m61.b$a;
import com.yxcorp.gifshow.widget.m;
import m61.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k61.c;
import androidx.lifecycle.LiveData;
import z61.b;
import k61.f;

public class b$a extends m	// class@00312a
{
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       c a = this.c.a;
       if (a != null && a.getValue() != null) {
          b$a tc = this.c;
          tc.h.c(tc.a.getValue());
       }
       return;
    }
}
