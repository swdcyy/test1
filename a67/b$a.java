package a67.b$a;
import a67.b;
import a67.a;
import java.lang.Object;
import android.view.View$OnClickListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.View;
import android.widget.LinearLayout;
import com.kwai.robust.PatchProxyResult;

public class b$a implements b	// class@000051
{
    public a a;

    public void b$a(a p0){
       super();
       this.a = p0;
    }
    public void a(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "3")) {
          return;
       }
       this.a.a(p0);
       return;
    }
    public void b(boolean p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       this.a.b(p0);
       return;
    }
    public void c(boolean p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.a.c(p0);
       return;
    }
    public LinearLayout d(View p0){
       p0 = PatchProxy.applyOneRefs(p0, this, b$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       this.a.d();
       return null;
    }
}
