package ejd.a;
import java.lang.Runnable;
import com.yxcorp.retrofit.dryrun.CommonParamsCompareManager;
import java.lang.String;
import okhttp3.Request;
import java.lang.Object;
import java.util.Map;
import java.util.HashMap;
import okhttp3.HttpUrl;
import java.util.Set;
import java.util.Iterator;
import m3d.a;
import okhttp3.RequestBody;
import okhttp3.FormBody;
import okhttp3.Request$Builder;
import java.util.List;
import java.lang.StringBuilder;
import com.google.gson.Gson;
import mjd.a;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public class a implements Runnable	// class@000d1f
{
    public final String b;
    public final Request c;
    public final boolean d;
    public final CommonParamsCompareManager e;

    public void a(CommonParamsCompareManager p0,String p1,Request p2,boolean p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       Request request;
       Map map;
       a te = this.e;
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       if (!te.a.containsKey(tb) || !te.b.containsKey(tb)) {
          a.b("CommonParamsCompareManager", "Current request map does not contains target request, path: "+tc.url().encodedPath());
       }else {
          request = te.a.remove(tb);
          Request request1 = te.b.remove(tb);
          HashMap hashMap = new HashMap();
          HashMap hashMap1 = new HashMap();
          hashMap.put("path", tc.url().encodedPath());
          Set set = request.url().queryParameterNames();
          HashMap hashMap2 = new HashMap();
          HashMap hashMap3 = new HashMap();
          Iterator iterator = tc.url().queryParameterNames().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             hashMap2.put(str, tc.url().queryParameter(str));
          }
          iterator = set.iterator();
          while (iterator.hasNext()) {
             String str1 = iterator.next();
             hashMap3.put(str1, request.url().queryParameter(str1));
          }
          map = te.a(hashMap2, hashMap3, td);
          if (!map.isEmpty()) {
             hashMap1.put("query", map);
          }
          if (a.c(tc) || tc.body() instanceof FormBody) {
             Map map1 = te.a(a.b(tc.newBuilder().build()), a.b(request.newBuilder().build()), td);
             if (!map1.isEmpty()) {
                hashMap1.put("body", map1);
             }
          }
          Map map2 = te.a(te.b(tc), te.b(request1), td);
          Map map3 = map2;
          List list = map3.remove("Cookie");
          if (!map3.isEmpty()) {
             hashMap1.put("header", map2);
          }
          if (list != null && list.size() == 2) {
             Map map4 = te.a(te.h(list.get(0)), te.h(list.get(1)), td);
             if (!map4.isEmpty()) {
                hashMap1.put("cookie", map4);
             }
          }
          String str2 = "same";
          if (!hashMap1.isEmpty()) {
             hashMap.put("diff", hashMap1);
             hashMap.put(str2, "false");
          }else {
             hashMap.put(str2, "true");
          }
          Gson d = CommonParamsCompareManager.d;
          a.a("CommonParamsCompareManager", "Request params diff:"+d.q(hashMap));
          b.a(0x4b316083).f1("API_COMMON_PARAMS_COMPARE", d.q(hashMap), 33);
       }
       return;
    }
}
