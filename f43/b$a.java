package f43.b$a;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import f43.b;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import f43.b$b;

public class b$a implements PopupInterface$d	// class@002868
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(c p0,int p1){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, b$a.class, "1")) {
          return;
       }
       b d = this.a.D;
       if (d != null) {
          d.a();
       }
       return;
    }
}
