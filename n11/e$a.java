package n11.e$a;
import androidx.fragment.app.c$b;
import n11.e;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import p91.m;
import qo1.a;
import n11.d;
import java.lang.Runnable;
import android.view.View;

public class e$a extends c$b	// class@003276
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$a.class, "1")) {
          return;
       }
       if (a.e(this.a.K.Z2)) {
          this.a.P.post(new d(this));
       }
       return;
    }
    public void n(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$a.class, "2")) {
          return;
       }
       this.a.d9();
       return;
    }
}
