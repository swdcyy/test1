package mb6.h0;
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
import xf6.h;

public class h0 extends a	// class@001e6f
{

    public void h0(){
       super();
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, h0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"upload.gifshow.com","upload.ksapisrv.com"};
       return Lists.e(obj);
    }
    public b c(){
       return RouteType.UPLOAD;
    }
    public String d(){
       return "upload";
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, h0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.d("upload_test_idc");
    }
}
