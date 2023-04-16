package b8a.u$b$a;
import androidx.lifecycle.Observer;
import b8a.u$b;
import java.lang.Object;
import b8a.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b8a.g1;
import android.graphics.Bitmap;
import java.lang.Boolean;
import b8a.u;

public final class u$b$a implements Observer	// class@0003fa
{
    public final u$b b;

    public void u$b$a(u$b p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$b$a.class, "1")) {
       }else if(p0 != null){
          if (p0.a != null) {
             p0 = null;
          }else {
             p0.a = true;
             p0 = p0.b;
          }
          if (p0 != null) {
             this.b.b.R8(p0.a, p0.b);
          }
       }
       return;
    }
}
