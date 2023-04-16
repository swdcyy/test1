package bdc.l;
import z1.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bdc.b;
import com.kwai.sdk.switchconfig.a;
import bdc.k;
import bdc.c;

public final class l implements k	// class@00045d
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public Object get(){
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, this, l.class, "1");
       if (objArray1 != PatchProxyResult.class) {
       }else if(a.t().d("enableSocialTrafficSecondarySlideCacheFeed", false)){
          objArray = new b(new k());
       }
       objArray1 = objArray;
       return objArray1;
    }
}
