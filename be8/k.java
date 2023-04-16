package be8.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Application;
import zi8.p;
import android.location.LocationManager;
import android.content.Context;
import androidx.core.content.ContextCompat;
import oi8.l;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import org.json.JSONObject;
import zi8.d0;
import zi8.g1;

public class k	// class@000338
{

    public void k(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, k.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          LocationManager systemServic = p.a().getSystemService("location");
          if (systemServic != null && systemServic.isProviderEnabled("gps")) {
             b = true;
          }
       label_002c :
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean b(){
       Application obj = PatchProxy.apply(null, null, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p.a();
       boolean b = (!ContextCompat.checkSelfPermission(obj, "android.permission.ACCESS_FINE_LOCATION") && !ContextCompat.checkSelfPermission(obj, "android.permission.ACCESS_COARSE_LOCATION"))? true: false;
       return b;
    }
    public static void c(l p0,String p1,boolean p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, k.class, "7")) {
          return;
       }
       if (p0 != null && !TextUtils.isEmpty(p1)) {
          p0.technologyEventLog(null, "API_LOCATION_EVENT", d0.f(ImmutableMap.builder().c("name", p1).c("is_cache", Boolean.valueOf(p2)).a()), g1.a());
       }
       return;
    }
}
