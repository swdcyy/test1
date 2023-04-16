package b15.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.net.Uri;
import ekd.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import android.net.Uri$Builder;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Map;
import androidx.collection.ArrayMap;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import kp.r1;

public final class a	// class@000334
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final String a(String p0,String p1,String p2){
       Iterator iterator;
       String str;
       Uri obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "url");
       a.p(p1, "key");
       a.p(p2, "value");
       obj = x0.f(p0);
       if (obj == null || (!TextUtils.x(p1) && !TextUtils.x(p2))) {
          HashMap hashMap = new HashMap();
          Set queryParamet = obj.getQueryParameterNames();
          if (queryParamet != null) {
             iterator = queryParamet.iterator();
             while (iterator.hasNext()) {
                str = iterator.next();
                if (TextUtils.n(str, p1)) {
                   continue ;
                }else {
                   String queryParamet1 = obj.getQueryParameter(str);
                   if (queryParamet1 != null) {
                      a.o(str, "oldKey");
                      hashMap.put(str, queryParamet1);
                   }
                }
             }
          }
          Uri$Builder uBuilder = obj.buildUpon();
          uBuilder.clearQuery();
          iterator = hashMap.keySet().iterator();
          while (iterator.hasNext()) {
             str = iterator.next();
             uBuilder.appendQueryParameter(str, hashMap.get(str));
          }
          uBuilder.appendQueryParameter(p1, p2);
          hashMap = uBuilder.build().toString();
          a.o(hashMap, "uriBuilder.build\(\).toString\(\)");
       }
    label_009b :
       return p0;
    }
    public static final Map b(BaseFeed p0){
       PhotoAdvertisement photoAdverti;
       a uoa = a.class;
       ArrayMap obj = PatchProxy.applyOneRefs(p0, null, uoa, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayMap();
       String str = PatchProxy.applyOneRefs(p0, null, uoa, "6");
       if (str != PatchProxyResult.class) {
       }else if(p0 != null){
          photoAdverti = p0.get("AD");
          if (photoAdverti != null) {
             photoAdverti = photoAdverti.mFansTopAttributeParams;
          label_0030 :
             str = TextUtils.I(photoAdverti);
             a.o(str, "TextUtils.sanityCheckNul¡­.mFansTopAttributeParams\)");
          }
       }
       photoAdverti = null;
       goto label_0030 ;
       String str1 = PatchProxy.applyOneRefs(p0, null, uoa, "7");
       if (str1 != PatchProxyResult.class) {
       }else if(p0 != null){
          str1 = TextUtils.I(r1.I1(p0));
          a.o(str1, "TextUtils.sanityCheckNul¡­dExt.getServerExpTag\(it\)\)");
       }else {
          str1 = "";
       }
       if (!TextUtils.x(str)) {
          obj.put("fans_top_attribute_params", str);
       }
       if (!TextUtils.x(str1)) {
          obj.put("tuna_live_server_exp_tag", str1);
       }
       return obj;
    }
}
