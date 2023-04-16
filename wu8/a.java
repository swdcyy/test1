package wu8.a;
import zk.d;
import com.yxcorp.experiment.ABConfig;
import com.yxcorp.experiment.ABConfigJsonTypeAdapter;
import java.lang.reflect.Type;
import java.lang.Object;
import com.yxcorp.experiment.logger.LogEventWrapper;
import com.yxcorp.experiment.jsonadapter.LogEventWrapperJsonAdapter;
import com.google.gson.Gson;
import java.lang.String;
import java.lang.Class;
import org.json.JSONObject;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import android.util.Base64;
import com.yxcorp.experiment.protobuf.ABTestGroupProtos$ABTestGroup;
import com.yxcorp.experiment.c;
import zu8.a;
import zu8.b;
import java.lang.Throwable;
import java.lang.Integer;
import java.lang.CharSequence;
import yb7.o;
import java.util.Iterator;
import com.google.gson.JsonElement;
import com.yxcorp.experiment.exception.ParseABConfigException;
import xu8.a;
import c97.d;
import q97.c;
import java.lang.StringBuilder;

public class a	// class@002783
{
    public static final Gson a;
    public static ABTestGroupProtos$ABTestGroup b;

    static {
       d uod = new d();
       uod.j();
       uod.f(ABConfig.class, new ABConfigJsonTypeAdapter());
       uod.f(LogEventWrapper.class, new LogEventWrapperJsonAdapter());
       a.a = uod.b();
       a.b = null;
    }
    public static ABConfig a(String p0){
       if (p0 == null || p0.isEmpty()) {
          return null;
       }
       try{
          return a.a.h(p0, ABConfig.class);
       }catch(java.lang.Exception e0){
       }
    }
    public static Map b(JSONObject p0,List p1,boolean p2){
       HashMap hashMap = new HashMap();
       if (p2 && a.b == null) {
          return hashMap;
       }
       if (!p2 && p0 == null) {
          return hashMap;
       }
       ABTestGroupProtos$ABTestGroup b = a.b;
       if (!p2) {
          try{
             b = ABTestGroupProtos$ABTestGroup.parseFrom(Base64.decode(p0.getString("data2"), 0));
             a.b = b;
          }catch(java.lang.Exception e3){
             c.h().i().c(e3);
             return hashMap;
          }
       }
       if (p1.contains(Integer.valueOf(0))) {
          hashMap.putAll(a.c(b.getAppStart(), 0));
       }
       int i = 1;
       if (p1.contains(Integer.valueOf(i))) {
          hashMap.putAll(a.c(b.getLoginChange(), i));
       }
       i = 2;
       if (p1.contains(Integer.valueOf(i))) {
          hashMap.putAll(a.c(b.getImmediately(), i));
       }
       i = 3;
       if (p1.contains(Integer.valueOf(i))) {
          hashMap.putAll(a.c(b.getLazyLoad(), i));
       }
       return hashMap;
    }
    public static Map c(String p0,int p1){
       HashMap hashMap = new HashMap();
       if (o.c(p0)) {
          return hashMap;
       }
       try{
          JSONObject jSONObject = new JSONObject(p0);
          Iterator iterator = jSONObject.keys();
          while (iterator.hasNext()) {
             String str = iterator.next();
             JSONObject jSONObject1 = jSONObject.getJSONObject(str);
             jSONObject1.put("policy", p1);
             String str1 = jSONObject1.toString();
             try{
                ABConfig uABConfig = a.a.h(str1, ABConfig.class);
                if (uABConfig.getValueJsonElement() != null) {
                   uABConfig.setKey(str);
                   uABConfig.setValueRawString(str1);
                   uABConfig.setPolicyType(p1);
                   hashMap.put(str, uABConfig);
                }
             }catch(java.lang.Exception e5){
                a.a(new ParseABConfigException(str, str1, e5));
                goto label_0015 ;
             }
          }
       }catch(java.lang.Exception e1){
          d.a().f().e("ABTest", "parseSplitABConfigPolicyJson failed. policy: "+p1+" , jsonString: "+p0, e1);
       }
       return hashMap;
    }
    public static String d(Object p0){
       try{
          return a.a.q(p0);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static Object e(String p0,Class p1){
       if (!o.c(p0)) {
          return a.a.h(p0, p1);
       }
       return null;
    }
}
