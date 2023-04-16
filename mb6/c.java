package mb6.c;
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

public class c extends a	// class@001e66
{

    public void c(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"ad.partner.gifshow.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.AD_PARTNER;
    }
    public String d(){
       return "ad_partner";
    }
}
