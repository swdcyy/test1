package b06.d$f;
import tca.h;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class d$f implements h	// class@0003e4
{

    public void d$f(){
       super();
    }
    public String a(){
       return "unknown_feed";
    }
    public boolean accept(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$f.class, "1");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): p0.isUnknownType();
       return b;
    }
}
