package c11.a;
import a71.a;
import c11.b$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import android.view.View$OnClickListener;

public final class a implements a	// class@00044a
{
    public final b$a a;

    public void a(b$a p0){
       this.a = p0;
       super();
    }
    public final boolean a(int p0){
       b$a obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.a.d;
       if (obj != null) {
          obj.onClick(null);
       }
       return false;
    }
}
