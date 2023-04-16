package mb6.m;
import jjd.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import jjd.b;
import com.kwai.framework.model.router.RouteType;
import xf6.l;

public class m extends a	// class@001e78
{

    public void m(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"api.kmovie.gifshow.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.KMOVIE;
    }
    public String d(){
       return "kmovie";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, m.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.g("key_kmovie_test_idc", "");
    }
}
