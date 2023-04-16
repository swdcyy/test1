package b06.d$e;
import tca.h;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import yf5.p;

public class d$e implements h	// class@0003e3
{

    public void d$e(){
       super();
    }
    public String a(){
       return "reduce feed";
    }
    public boolean accept(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$e.class, "1");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): p.e(p0);
       return b;
    }
}
