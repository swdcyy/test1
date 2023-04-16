package ci5.b;
import v55.b;
import java.lang.Object;
import p55.a;
import java.lang.String;
import v55.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wi0.e;
import com.kuaishou.krn.model.LaunchModel;
import com.kwai.sdk.switchconfig.a;
import com.kwai.components.bridge.common.model.BridgeAuthSwitchModel;
import java.lang.reflect.Type;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.lang.StringBuilder;
import ci5.a;
import java.lang.Runnable;
import ekd.k1;

public class b implements b	// class@0006c3
{

    public void b(){
       super();
    }
    public a a(a p0,String p1,String p2){
       BridgeAuthSwitchModel obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.n(p1, "social") && !TextUtils.n(p1, "im")) {
          return new a(true, 0, null);
       }
       if (p0 instanceof e) {
          LaunchModel launchModel = p0.getLaunchModel();
          if (launchModel != null) {
             String str = launchModel.a();
             obj = a.t().getValue("SocialBridgeAuthenticationWhiteList", BridgeAuthSwitchModel.class, new BridgeAuthSwitchModel()).mBridges;
             if (!q.f(obj)) {
                Iterator iterator = obj.iterator();
                while (iterator.hasNext()) {
                   Map map = iterator.next();
                   String str1 = p1+"."+p2;
                   if (!q.h(map) && map.containsKey(str1)) {
                      List list = map.get(str1);
                      if (q.f(list) || (!q.f(list) && !list.contains(str))) {
                         str = str1+"是社交私有桥,没有调用权限,请联系 houruixiang";
                         k1.o(new a(str));
                         return new a(0, 201, str);
                      }
                   }
                }
             }
          }
       }
       return new a(true, 0, null);
    }
}
