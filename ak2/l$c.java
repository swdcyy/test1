package ak2.l$c;
import ak2.b$a;
import ak2.l;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import lnc.a1;
import android.widget.TextView;
import java.lang.Runnable;
import ekd.k1;

public class l$c implements b$a	// class@0000f1
{
    public final l a;

    public void l$c(l p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       l$c uoc = l$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "2")) {
          return;
       }
       l s = this.a.s;
       p0 = (p0 == 1)? 0x7f070337: 0x7f070297;
       s.setMaxWidth(a1.d(p0));
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, l$c.class, "1")) {
          return;
       }
       k1.p(this.a.R, this);
       return;
    }
}
