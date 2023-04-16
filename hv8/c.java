package hv8.c;
import com.yxcorp.gateway.pay.api.PayRetrofitGlobalConfig;
import com.yxcorp.retrofit.c$b;
import com.yxcorp.gateway.pay.api.e;
import java.util.List;
import java.util.Map;
import qv8.a;
import java.lang.String;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;
import okhttp3.Request;
import android.util.Pair;
import lv8.p;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gateway.pay.api.PayManager;
import android.text.TextUtils;
import java.util.ArrayList;
import lv8.c;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import java.util.Collections;
import okhttp3.HttpUrl;
import java.lang.Exception;
import lv8.j;
import java.lang.Iterable;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;

public final class c	// class@0025e7
{

    public static c$b a(PayRetrofitGlobalConfig p0){
       return e.a;
    }
    public static List b(PayRetrofitGlobalConfig p0){
       return null;
    }
    public static Map c(PayRetrofitGlobalConfig p0){
       return null;
    }
    public static a d(PayRetrofitGlobalConfig p0){
       return null;
    }
    public static String e(PayRetrofitGlobalConfig p0){
       return "";
    }
    public static void f(PayRetrofitGlobalConfig p0,Context p1,String p2,int p3){
       Toast.makeText(p1, p2, p3).show();
    }
    public static Pair g(Request p0,Map p1,Map p2,String p3){
       return c.h(p0, p1, p2, p3);
    }
    public static Pair h(Request p0,Map p1,Map p2,String p3){
       StringBuilder key;
       String str1;
       Iterator iterator1;
       Pair pair = PatchProxy.applyThreeRefs(p0, p1, p2, null, p.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          pair = PayManager.getInstance().getServiceSecurity();
          if (TextUtils.isEmpty(pair)) {
             pair = null;
          }else {
             ArrayList uArrayList = new ArrayList();
             if (!c.k(p2)) {
                Iterator iterator = p2.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   key = uEntry.getKey();
                   if (!TextUtils.isEmpty(key) && !key.startsWith("__")) {
                      StringBuilder str = key+"=";
                      str1 = (TextUtils.isEmpty(uEntry.getValue()))? "": uEntry.getValue();
                      uArrayList.add(str+str1);
                   }
                }
             }
             if (!c.k(p1)) {
                iterator1 = p1.entrySet().iterator();
                while (iterator1.hasNext()) {
                   Map$Entry uEntry1 = iterator1.next();
                   str1 = uEntry1.getKey();
                   if (!TextUtils.isEmpty(str1) && !str1.startsWith("__")) {
                      key = str1+"=";
                      String str2 = (TextUtils.isEmpty(uEntry1.getValue()))? "": uEntry1.getValue();
                      uArrayList.add(key+str2);
                   }
                }
             }
             Collections.sort(uArrayList);
             try{
                iterator1 = 0;
                uArrayList.add(iterator1, (p0.url().encodedPath()).trim());
                uArrayList.add(iterator1, ((p0.method()).toUpperCase()).trim());
             }catch(java.lang.Exception e8){
                e8.printStackTrace();
             }
             j oj = j.a();
             uArrayList.add((oj.toString()).trim());
             pair = Base64.encodeToString(p.b(oj.b(), p.a(Base64.decode(pair, iterator1), (TextUtils.join("&", uArrayList)).getBytes(StandardCharsets.UTF_8))), 11);
          }
       }
       if (TextUtils.isEmpty(pair)) {
          return null;
       }else {
          return new Pair("__clientSign", new String(pair.getBytes(), Charset.forName("UTF-8")));
       }
    }
}
