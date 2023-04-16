package ejd.b;
import java.lang.Runnable;
import ejd.c;
import com.yxcorp.retrofit.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import java.util.Map;
import java.lang.Boolean;
import java.lang.reflect.Method;
import java.lang.Exception;
import okhttp3.OkHttpClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import okhttp3.Interceptor;
import com.yxcorp.retrofit.timing.LoggedInterceptorWrapper;
import java.util.HashMap;
import com.yxcorp.retrofit.e;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.google.gson.Gson;
import mjd.a;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public final class b implements Runnable	// class@000d20
{
    public final c b;
    public final a c;

    public void b(c p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       Interceptor obj;
       LoggedInterceptorWrapper a;
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       if (tc == null) {
       }else {
          String name = tc.getClass().getName();
          Boolean uBoolean = tb.a.get(name);
          if (uBoolean == null || !uBoolean.booleanValue()) {
             String str = "buildClient";
             Object[] objArray = new Object[0];
             Class[] uClassArray = new Class[0];
             try{
                obj = tc.getClass().getMethod(str, uClassArray).invoke(tc, objArray);
             }catch(java.lang.Exception e1){
                e1.printStackTrace();
             }
             if (obj != null) {
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = obj.interceptors().iterator();
                while (iterator.hasNext()) {
                   obj = iterator.next();
                   if (obj instanceof LoggedInterceptorWrapper) {
                      a = obj.a;
                      if (a != null) {
                         uArrayList.add(a.getClass().getName());
                      }
                   }else {
                      uArrayList.add(obj.getClass().getName());
                   }
                }
                tb.a.put(name, Boolean.TRUE);
                HashMap hashMap = new HashMap();
                hashMap.put("class", name);
                name = (e.h().d())? "true": "false";
                hashMap.put("new", name);
                hashMap.put("interceptors_count", Integer.valueOf(uArrayList.size()));
                hashMap.put("interceptors_list", uArrayList);
                Gson b = c.b;
                a.c("InterceptorReportManager", "interceptor report:"+b.q(hashMap));
                String str1 = b.q(hashMap);
                b.a(0x4b316083).f1("API_INTERCEPTOR_REPORT", str1, 33);
             }
          }
       }
       return;
    }
}
