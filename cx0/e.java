package cx0.e;
import cx0.b$b;
import cx0.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public final class e implements b$b	// class@001e92
{
    public final b a;

    public void e(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       e ta = this.a;
       ta.e = ta.e + 1;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       b b = this.a.b;
       if (b != null) {
          b.setVisibility(8);
       }
       return;
    }
}
