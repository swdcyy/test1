package bv4.b;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import hu4.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;

public final class b	// class@0003d4
{

    public void b(){
       super();
    }
    public static m a(String p0,Map p1){
       String str = "componentName";
       String str1 = "bundleId";
       m obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new m("", "", "");
       if (TextUtils.isEmpty(p0)) {
          return obj;
       }
       try{
          Uri uri = Uri.parse(p0);
          String queryParamet = uri.getQueryParameter(str1);
          String queryParamet1 = uri.getQueryParameter(str);
          uri = uri.getQueryParameter("minVersion");
          if (TextUtils.isEmpty(queryParamet) || (TextUtils.isEmpty(queryParamet1) && p1 != null)) {
             if (p1.get(str1) != null) {
                queryParamet = p1.get(str1).toString();
             }
             if (p1.get(str) != null) {
                queryParamet1 = p1.get(str).toString();
             }
             if (p1.get("minVersion") != null) {
                uri = p1.get("minVersion").toString();
             }
          }
       label_006c :
          obj.a = queryParamet;
          obj.b = queryParamet1;
          obj.c = uri;
          return obj;
       }catch(java.lang.Exception e0){
       }
    }
}
