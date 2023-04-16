package g12.f$a;
import hka.f;
import g12.f;
import java.lang.Object;
import android.view.KeyEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class f$a implements f	// class@002a28
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public boolean a(int p0,KeyEvent p1){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa)) {
          p1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1");
          if (p1 != PatchProxyResult.class) {
             return p1.booleanValue();
          }
       }
       if (p0 == 19) {
          this.a.R8();
          return true;
       }else if(p0 == 20){
          this.a.P8();
          return true;
       }else {
          return false;
       }
    }
}
