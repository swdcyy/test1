package o41.a;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o41.a$a;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.lang.Iterable;
import o41.a$b;
import java.util.Objects;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Map;
import android.net.Uri;
import java.util.Set;
import android.net.Uri$Builder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map$Entry;
import java.util.LinkedHashMap;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class a	// class@003472
{
    public final HashMap a;

    public void a(){
       super();
       this.a = new HashMap();
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "1")) {
       }else {
          a$a uoa1 = PatchProxy.apply(null, this, uoa, "2");
          if (uoa1 != PatchProxyResult.class) {
          }else {
             uoa1 = a.t().u("SOURCE_LIVE").getValue("liveKrnEntryConfig", a$a.class, null);
          }
          if (uoa1 != null) {
             Iterator iterator = uoa1.krnPages.iterator();
             while (iterator.hasNext()) {
                a$b uob = iterator.next();
                Objects.requireNonNull(uob);
                a$b obj = PatchProxy.apply(null, uob, a$b.class, "1");
                boolean b = true;
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if((uob.pageKey).length() > 0){
                   obj = 1;
                }else {
                   obj = null;
                }
                if (obj) {
                   a uoa2 = ((uob.pageUrl).length() > 0)? 1: null;
                   if (!uoa2) {
                   label_007b :
                      b = false;
                   }
                }else {
                   goto label_007b ;
                }
                if (b) {
                   a$b pageKey = uob.pageKey;
                   Objects.requireNonNull(pageKey, "null cannot be cast to non-null type java.lang.String");
                   String str = pageKey.toLowerCase();
                   a.o(str, "\(this as java.lang.String\).toLowerCase\(\)");
                   this.a.put(str, uob.pageUrl);
                }
             }
          }
       }
       return;
    }
    public final String a(String p0,Map p1,boolean p2){
       Uri obj;
       Iterator iterator1;
       Map$Entry uEntry;
       String key;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 != null) {
          if (p1.isEmpty()) {
             return p0;
          }else {
             try{
                obj = Uri.parse(p0);
                a.o(obj, "uri");
                Set queryParamet = obj.getQueryParameterNames();
                Uri$Builder uBuilder = obj.buildUpon();
                if (p2) {
                   HashMap hashMap = new HashMap(p1);
                   a.o(queryParamet, "oldParames");
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator = queryParamet.iterator();
                   while (iterator.hasNext()) {
                      Object obj1 = iterator.next();
                      int i = p1.containsKey(obj1) ^ 0x01;
                      if (i) {
                         uArrayList.add(obj1);
                      }
                   }
                   iterator1 = uArrayList.iterator();
                   while (iterator1.hasNext()) {
                      String str = iterator1.next();
                      hashMap.put(str, obj.getQueryParameter(str));
                   }
                   uBuilder.clearQuery();
                   iterator1 = hashMap.entrySet().iterator();
                   while (iterator1.hasNext()) {
                      uEntry = iterator1.next();
                      key = uEntry.getKey();
                      uBuilder.appendQueryParameter(key, uEntry.getValue());
                   }
                }else {
                   LinkedHashMap linkedHashMa = new LinkedHashMap();
                   iterator1 = p1.entrySet().iterator();
                   while (iterator1.hasNext()) {
                      Map$Entry uEntry1 = iterator1.next();
                      int i1 = queryParamet.contains(uEntry1.getKey()) ^ 0x01;
                      if (i1) {
                         linkedHashMa.put(uEntry1.getKey(), uEntry1.getValue());
                      }
                   }
                   iterator1 = linkedHashMa.entrySet().iterator();
                   while (iterator1.hasNext()) {
                      uEntry = iterator1.next();
                      key = uEntry.getKey();
                      uBuilder.appendQueryParameter(key, uEntry.getValue());
                   }
                }
                String str1 = uBuilder.build().toString();
                a.o(str1, "uriBuilder.build\(\).toString\(\)");
                return str1;
             }catch(java.lang.Exception e9){
                b.I(LiveJsBridgeLogTag.RN, "addParamsToUrl Uri parse error", e9);
             }
             return p0;
          }
       }else {
          goto label_0110 ;
       }
    }
}
