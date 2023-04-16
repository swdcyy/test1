package d02.d$c$a;
import ok.h;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fe3.d;

public final class d$c$a implements h	// class@001ee9
{
    public static final d$c$a b;

    static {
       d$c$a.b = new d$c$a();
    }
    public void d$c$a(){
       super();
    }
    public Object apply(Object p0){
       d uod = PatchProxy.applyOneRefs(p0, this, d$c$a.class, "1");
       if (uod != PatchProxyResult.class) {
       }else if(p0 != null){
          uod = new d(p0);
       }else {
          uod = null;
       }
       return uod;
    }
}
