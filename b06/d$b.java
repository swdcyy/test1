package b06.d$b;
import tca.h;
import java.lang.Object;
import java.util.HashSet;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Set;

public class d$b implements h	// class@0003e0
{
    public final Set a;

    public void d$b(){
       super();
       this.a = new HashSet();
    }
    public String a(){
       return "duplicate_feed";
    }
    public boolean accept(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$b.class, "1");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): this.a.add(p0.getPhotoId()) ^ 0x01;
       return b;
    }
}
