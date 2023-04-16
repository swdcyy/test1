package f6a.f$a;
import hka.a;
import f6a.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class f$a implements a	// class@0022cb
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public final boolean onBackPressed(){
       f$a uoa = f$a.class;
       f$a obj = PatchProxy.applyWithListener(null, this, uoa, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       obj.R8(obj.B);
       PatchProxy.onMethodExit(uoa, "1");
       return true;
    }
}
