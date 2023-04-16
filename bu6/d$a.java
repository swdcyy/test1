package bu6.d$a;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.kwaishare.qq.QQBaseShare;
import com.kwai.kwaishare.qq.QQBaseShare$a;
import bu6.f;

public final class d$a	// class@000608
{

    public void d$a(){
       super();
    }
    public void d$a(u p0){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, d$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (f.a(QQBaseShare.d.b(), "4.1") >= 0)? true: false;
       return b;
    }
}
