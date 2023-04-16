package arb.h;
import txb.a;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import arb.g;
import androidx.fragment.app.Fragment;
import xa5.a;

public class h implements a	// class@0002d5
{

    public void h(){
       super();
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean sc(BaseFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, null, g.class, "1");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.j(p0);
       return b;
    }
}
