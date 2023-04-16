package agc.b;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r33.c;
import agc.e;
import r33.g;
import r33.j;
import com.kuaishou.merchant.reservation.a;
import ig4.c;
import ig4.d;
import com.kuaishou.tuna.plc_base.scheme.TunaCodPluginScheme$b;
import com.kuaishou.tuna.plc_base.scheme.TunaCodPluginScheme;
import com.kuaishou.tuna_core.half_screen_webview.g;
import wz4.m;
import i98.a;
import i98.b;
import kz8.b;
import kz8.d;
import com.yxcorp.gifshow.ad.detail.presenter.ad.miniprogram.a;
import f4a.k0;
import android.app.Activity;
import android.net.Uri;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import java.lang.Integer;

public class b	// class@00011a
{
    public static Map a;

    static {
       b.a = new ConcurrentHashMap();
       if (PatchProxy.applyVoid(null, null, b.class, "3")) {
       }else if(PatchProxy.applyVoid(null, null, c.class, "1")){
          b.b(new c());
       }
       if (!PatchProxy.applyVoid(null, null, g.class, "1")) {
          b.b(new g());
       }
       if (!PatchProxy.applyVoid(null, null, j.class, "1")) {
          b.b(new j());
       }
       if (!PatchProxy.applyVoid(null, null, a.class, "1")) {
          b.b(new a());
       }
       if (!PatchProxy.applyVoid(null, null, c.class, "1")) {
          b.b(new c());
       }
       if (!PatchProxy.applyVoid(null, null, d.class, "1")) {
          b.b(new d());
       }
       if (!PatchProxy.applyVoid(null, null, TunaCodPluginScheme$b.class, "1")) {
          b.b(new TunaCodPluginScheme());
       }
       if (!PatchProxy.applyVoid(null, null, g.class, "1")) {
          b.b(new g());
       }
       if (!PatchProxy.applyVoid(null, null, m.class, "1")) {
          b.b(new m());
       }
       if (!PatchProxy.applyVoid(null, null, a.class, "2")) {
          b.b(new a());
       }
       if (!PatchProxy.applyVoid(null, null, b.class, "1")) {
          b.b(new b());
       }
       if (!PatchProxy.applyVoid(null, null, b.class, "1")) {
          b.b(new b());
       }
       if (!PatchProxy.applyVoid(null, null, d.class, "1")) {
          b.b(new d());
       }
       if (!PatchProxy.applyVoid(null, null, a.class, "1")) {
          b.b(new a());
       }
       if (!PatchProxy.applyVoid(null, null, k0.class, "1")) {
          b.b(new k0());
       }
    }
    public void b(){
       super();
    }
    public static boolean a(Activity p0,Uri p1,Map p2){
       boolean b;
       e value;
       HashMap hashMap;
       Iterator obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.g("ActionSchemeProvider", "handle scheme :"+p1);
       b = false;
       if (p1.getScheme() != null && p1.getHost() != null) {
          obj = b.a.entrySet().iterator();
          while (true) {
             if (obj.hasNext()) {
                value = obj.next().getValue();
                if (!TextUtils.n(p1.getScheme(), value.c()) || (!TextUtils.n(p1.getHost(), value.a()) || (!TextUtils.x(p1.getPath()) || (!TextUtils.x(value.getPath()) && (!TextUtils.n(p1.getPath(), value.getPath()) || !value.b(p1, p2)))))) {
                }else {
                   hashMap = new HashMap();
                   Set queryParamet = p1.getQueryParameterNames();
                   if (queryParamet != null) {
                      Iterator iterator = queryParamet.iterator();
                      while (iterator.hasNext()) {
                         String str = iterator.next();
                         String queryParamet1 = p1.getQueryParameter(str);
                         if (queryParamet1 != null) {
                            hashMap.put(str, queryParamet1);
                         }else {
                            continue ;
                         }
                      }
                   }
                   break ;
                }
             }
          }
          value.d(p0, hashMap, p2);
          Log.g("ActionSchemeProvider", "handle custom scheme :"+p1);
          return true;
       }
       return b;
    }
    public static void b(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "1")) {
          return;
       }
       Log.g("ActionSchemeProvider", "register scheme :"+"scheme:"+TextUtils.I(p0.c())+",host:"+TextUtils.I(p0.a())+",path:"+TextUtils.I(p0.getPath()));
       b.a.put(Integer.valueOf(p0.hashCode()), p0);
       return;
    }
}
