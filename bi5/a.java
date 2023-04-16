package bi5.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bi5.b;
import ci5.f;
import com.yxcorp.utility.SystemUtil;
import com.kwai.sdk.switchconfig.a;
import com.kwai.components.bridge.common.model.BridgeAuthSwitchModel;
import java.lang.reflect.Type;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.lang.StringBuilder;
import ci5.e;
import java.lang.Runnable;
import ekd.k1;
import ci5.h;
import com.kwai.components.bridge.common.model.BridgePreofflineSwitchModel;
import ci5.g;

public final class a	// class@0004a8
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final void a(String p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, b.class, "1")) {
          b.a("REACT_METHOD", p0, p1, p2, p3, "socialRnBridgeReport");
       }
       if (p0 != null && (p1 != null && p2 != null)) {
          if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, f.class, "1") && SystemUtil.I()) {
             BridgeAuthSwitchModel mBridges = a.t().getValue("SocialBridgeAuthenticationWhiteList", BridgeAuthSwitchModel.class, new BridgeAuthSwitchModel()).mBridges;
             if (!q.f(mBridges)) {
                Iterator iterator = mBridges.iterator();
                while (iterator.hasNext()) {
                   Map map = iterator.next();
                   String str1 = p0+"."+p1;
                   if (!q.h(map) && map.containsKey(str1)) {
                      List list = map.get(str1);
                      if (q.f(list) || (!q.f(list) && !list.contains(p2))) {
                         k1.o(new e(str1+"是社交私有桥,没有调用权限,请联系 houruixiang"));
                      }
                   }
                }
             }
          }
          if (p3 != null && !PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, h.class, "1")) {
             BridgePreofflineSwitchModel mExpiredRnBr = a.t().getValue("SocialBridgeOfflineWhiteList", BridgePreofflineSwitchModel.class, new BridgePreofflineSwitchModel()).mExpiredRnBridges;
             String str = p0+"."+p1;
             if (!q.f(mExpiredRnBr) && mExpiredRnBr.contains(str)) {
                if (SystemUtil.I()) {
                   k1.o(new g(str+"预下线中,不可调用,请联系 houruixiang"));
                }
                if (!PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, b.class, "2")) {
                   b.a("REACT_METHOD", p0, p1, p2, p3, "socialOfflineBridgeReport");
                }
             }
          }
       }
    label_0146 :
       return;
    }
}
