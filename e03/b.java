package e03.b;
import sz2.d;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.effect.resource.download.common.e;
import vz2.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;

public class b implements d	// class@0025f2
{
    public final String a;

    public void b(String p0){
       super();
       this.a = p0;
    }
    public boolean a(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (e.b().he().g(this.b()) != null)? true: false;
       return b;
    }
    public String b(){
       return this.a;
    }
}
