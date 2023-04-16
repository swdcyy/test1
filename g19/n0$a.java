package g19.n0$a;
import d6a.a;
import g19.n0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public final class n0$a extends a	// class@0023cb
{
    public final n0 b;

    public void n0$a(n0 p0){
       this.b = p0;
       super();
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, n0$a.class, "1")) {
          return;
       }
       n0 s = this.b.s;
       if (s != null) {
          s.setAlpha(0);
       }
       return;
    }
}
