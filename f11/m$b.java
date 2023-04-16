package f11.m$b;
import ho1.b;
import f11.m;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.widget.TextView;
import yq5.b;
import yq5.c;

public class m$b implements b	// class@00227a
{
    public final m a;

    public void m$b(m p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       m$b uob = m$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       uob = this.a;
       uob.S8(uob.getContext());
       this.a.B.setTextColor(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, m$b.class, "2")) {
          return;
       }
       m$b ta = this.a;
       if (ta.B != null) {
          ta.y.c(ta.G);
       }
       this.a.D = true;
       return;
    }
}
