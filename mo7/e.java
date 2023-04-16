package mo7.e;
import zk.d;
import com.kwai.sdk.switchconfig.v1.SwitchConfig;
import com.kwai.sdk.switchconfig.v1.internal.SwitchConfigJsonTypeAdapter;
import java.lang.reflect.Type;
import java.lang.Object;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.String;
import com.google.gson.JsonElement;
import java.lang.Class;
import lo7.f;
import java.lang.Exception;
import com.kwai.sdk.switchconfig.proto.KswitchGroupProtos$KswitchGroup;
import java.util.List;
import java.lang.Integer;
import com.google.gson.c;

public class e	// class@001eb7
{
    public static final Gson a;

    static {
       d uod = new d();
       uod.j();
       uod.f(SwitchConfig.class, new SwitchConfigJsonTypeAdapter());
       e.a = uod.b();
    }
    public static Map a(JsonObject p0){
       HashMap hashMap;
       try{
          hashMap = new HashMap();
          Iterator iterator = p0.w0().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             JsonElement jsonElement = p0.e0(str);
             try{
                hashMap.put(str, e.a.c(jsonElement, SwitchConfig.class));
             }catch(java.lang.Exception e2){
                if (f.a()) {
                   e2.getMessage();
                   goto label_000d ;
                }else {
                   goto label_000d ;
                }
             }
          }
       }catch(java.lang.Exception e6){
          if (f.a()) {
             e6.getMessage();
          }
       }
       return hashMap;
    }
    public static Map b(KswitchGroupProtos$KswitchGroup p0,List p1){
       String str;
       HashMap hashMap1;
       HashMap hashMap = new HashMap();
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          int i = iterator.next().intValue();
          if (i) {
             if (i != 1) {
                if (i != 2) {
                   str = (i != 3)? "": p0.getLazyLoad();
                }else {
                   str = p0.getImmediately();
                }
             }else {
                str = p0.getLoginChange();
             }
          }else {
             str = p0.getAppStart();
          }
          try{
             hashMap1 = new HashMap();
             JsonObject jsonObject = new c().a(str).r();
             Iterator iterator1 = jsonObject.w0().iterator();
             while (iterator1.hasNext()) {
                String str1 = iterator1.next();
                JsonElement jsonElement = jsonObject.e0(str1);
                try{
                   SwitchConfig switchConfig = e.a.c(jsonElement, SwitchConfig.class);
                   if (switchConfig != null) {
                      switchConfig.setPolicyType(i);
                      hashMap1.put(str1, switchConfig);
                   }
                }catch(java.lang.Exception e5){
                   if (f.a()) {
                      e5.getMessage();
                      goto label_0054 ;
                   }else {
                      goto label_0054 ;
                   }
                }
             }
          }catch(java.lang.Exception e1){
             if (f.a()) {
                e1.getMessage();
             }
          }
          hashMap.putAll(hashMap1);
       }
       return hashMap;
    }
}
