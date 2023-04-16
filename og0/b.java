package og0.b;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.net.Uri;
import xkd.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kp.r1;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import fg6.a;
import com.google.gson.Gson;
import va1.s0;
import ekd.x0;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import android.net.Uri$Builder;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import kotlin.Pair;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import kotlin.collections.ArraysKt___ArraysKt;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;

public final class b	// class@0034e8
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public static final String a(String p0,BaseFeed p1,String p2){
       String str;
       Uri obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "scheme");
       obj = b.g(p0);
       if (!TextUtils.x(p0) && obj != null) {
          String queryParamet = obj.getQueryParameter("url");
          if (TextUtils.x(queryParamet)) {
             return p0;
          }else if(p1 != null){
             str = TextUtils.I(r1.I1(p1));
          }else {
             str = "";
          }
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("clientExpTag", "0");
          jsonObject.c0("serverExpTag", str);
          JsonArray jsonArray = new JsonArray();
          jsonArray.G(jsonObject);
          str = a.a.p(jsonArray);
          a.m(queryParamet);
          if (!s0.e(queryParamet, "live_stream_id") && !TextUtils.x(p2)) {
             a.m(p2);
             queryParamet = b.b(queryParamet, "live_stream_id", p2);
          }
          a.o(str, "appendJson");
          p0 = b.b(p0, "url", b.b(b.b(b.b(queryParamet, "exp_tag", str), "localLifeJumpSource", "explainCardEntrance"), "localLifeIsFirstEnter", "1"));
       }
       return p0;
    }
    public static final String b(String p0,String p1,String p2){
       Iterator iterator;
       String str;
       Uri obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
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
    label_008c :
       return p0;
    }
    public static final Pair c(LiveStreamFeed p0){
       int i3;
       int[] obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, b.class, "5");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       int i = 0;
       if (p0 == null) {
          return new Pair(Boolean.FALSE, Integer.valueOf(i));
       }
       LiveStreamFeed mTypeViewLis = p0.mTypeViewList;
       if (mTypeViewLis == null || (mTypeViewLis != null && !mTypeViewLis.length)) {
          return new Pair(Boolean.FALSE, Integer.valueOf(i));
       }
       obj = a.t().getValue("liveHousePerRequestRule", int[].class, obj);
       if (obj != null) {
          int i1 = (!obj.length)? 1: 0;
          if (!i1) {
             p0 = p0.mTypeViewList;
             i1 = p0.length;
             int i2 = 0;
             while (true) {
                if (i2 < i1) {
                   object oobject = p0[i2];
                   a.o(oobject, "value");
                   if (ArraysKt___ArraysKt.N7(obj, oobject.intValue())) {
                      i3 = oobject.intValue();
                      i = true;
                      break ;
                   }else {
                      i2 = i2 + 1;
                   }
                }else {
                   i3 = 0;
                   break ;
                }
             }
             return new Pair(Boolean.valueOf(i), Integer.valueOf(i3));
          }
       }
       return new Pair(Boolean.FALSE, Integer.valueOf(i));
    }
    public static final boolean d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "scheme");
       Uri uri = b.g(p0);
       if (uri != null) {
          return TextUtils.n(uri.getScheme(), "kwailive");
       }
       return false;
    }
    public static final CDNUrl[] e(UserInfos$PicUrl[] p0){
       CDNUrl[] uCDNUrlArray = null;
       Object obj = PatchProxy.applyOneRefs(p0, uCDNUrlArray, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          int i = 0;
          int i1 = 1;
          int i2 = (!p0.length)? 1: 0;
          if (!(i2 ^ i1)) {
             p0 = uCDNUrlArray;
          }
          if (p0 != null) {
             i2 = p0.length;
             uCDNUrlArray = new CDNUrl[i2];
             for (i1 = 0; i1 < i2; i1 = i1 + 1) {
                uCDNUrlArray[i1] = new CDNUrl();
             }
             i2 = p0.length;
             for (; i < i2; i = i + 1) {
                object oobject = p0[i];
                uCDNUrlArray[i] = new CDNUrl(oobject.cdn, oobject.url, oobject.ip, oobject.urlPattern);
             }
          }
       }
       return uCDNUrlArray;
    }
}
