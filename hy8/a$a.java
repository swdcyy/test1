package hy8.a$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hy8.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import java.util.HashMap;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.ad.award.pendant.navigation.NeoNavigationRule;
import el.a;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;
import java.util.Map;
import java.lang.ref.WeakReference;

public final class a$a	// class@0025ed
{

    public void a$a(){
       super();
    }
    public void a$a(u p0){
       super();
    }
    public final a a(String p0,int p1,GifshowActivity p2){
       a obj;
       if (PatchProxy.isSupport(a$a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, a$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       int i1 = 1;
       HashMap hashMap = (p0 == null || !p0.length())? 1: null;
       a uoa = null;
       if (!hashMap && p2 != null) {
          Type[] typeArray = new Type[]{String.class,NeoNavigationRule.class};
          obj = a.getParameterized(HashMap.class, typeArray);
          a.o(obj, "TypeToken.getParameteriz¡­nRule::class.java\n      \)");
          Object value = a.t().getValue("neo_navigation_pendant_rule_map", obj.getType(), new HashMap());
          a.o(value, "SwitchConfigManager.getI¡­geType, HashMap\(\)\n      \)");
          NeoNavigationRule neoNavigatio = value.get(p0);
          if (neoNavigatio != null && neoNavigatio.isLegal() == i1) {
             uoa = new a(neoNavigatio, p1, new WeakReference(p2), uoa);
          }
       }
       return uoa;
    }
}
