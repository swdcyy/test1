package b00.g;
import b00.a;
import java.util.HashMap;
import b00.l;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import java.lang.Class;
import java.lang.Object;
import com.yxcorp.retrofit.e;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import b00.i;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import java.lang.Integer;
import com.yxcorp.utility.SystemUtil;
import o56.c;
import o56.a;
import java.lang.StringBuilder;
import e17.i;

public class g	// class@00022e
{
    public static final Map a;
    public static final Map b;
    public static final a c;
    public static final a d;

    static {
       g.a = new HashMap();
       g.b = new HashMap();
       RouteType aPI = RouteType.API;
       z b = d.b;
       g.c = e.b(new l(aPI, b, true), a.class);
       g.d = e.b(new l(aPI, b, false), a.class);
    }
    public void g(){
       super();
    }
    public static RouteType a(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, i.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = i.a.get(p0);
       }
       if (!TextUtils.isEmpty(obj)) {
          p0 = obj;
       }
       return RouteType.nameOf(p0);
    }
    public static a b(String p0,boolean p1,int p2){
       z obj1;
       a c;
       Map a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), null, g.class, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (p2 > 0 && p2 != 10) {
          if (PatchProxy.isSupport(og)) {
             obj1 = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), null, g.class, "2");
             if (obj1 != patchProxyRe) {
             label_0065 :
                return obj1;
             }
          }
          if (TextUtils.isEmpty(p0)) {
             p0 = "api";
          }
          RouteType routeType = g.a(p0);
          obj1 = d.b;
          if (p2 <= 0) {
             p2 = 10;
          }
          obj1 = e.b(new l(routeType, obj1, p1, p2), uoa);
          goto label_0065 ;
       }else if(TextUtils.isEmpty(p0)){
          c = (p1)? g.c: g.d;
          return c;
       }else if(p1){
          a = g.a;
       }else {
          a = g.b;
       }
       a uoa1 = a.get(p0);
       if (uoa1 == null) {
          RouteType routeType1 = g.a(p0);
          int i = 0;
          if (routeType1 == null) {
             if (SystemUtil.I() || a.a().c()) {
                i.e(R.style.arg_RES_7f11066a, "not support businessName : "+p0, i);
             }
             c = (p1)? g.c: g.d;
             return c;
          }else if(p1){
             uoa1 = e.b(new l(routeType1, d.b, true), uoa);
             g.a.put(p0, uoa1);
          }else {
             uoa1 = e.b(new l(routeType1, d.b, i), uoa);
             g.b.put(p0, uoa1);
          }
       }
       return uoa1;
    }
}
