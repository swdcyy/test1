package a04.f;
import sm7.h;
import java.lang.Object;
import sm7.i;
import ml5.a;
import sm7.k;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.sdk.eve.proto.CustomEvent;
import a04.j;
import java.util.Objects;
import java.util.Map;
import java.util.LinkedHashMap;
import fg6.a;
import java.util.HashMap;
import com.google.gson.Gson;
import java.util.Set;
import java.util.Iterator;
import java.lang.NullPointerException;
import kotlin.Pair;
import qrd.r0;
import trd.t0;

public final class f implements h	// class@00000c
{

    public void f(){
       super();
    }
    public Object a(Object p0,i p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "1");
       if (uoa != patchProxyRe) {
       }else {
          p0 = p0.f();
          String str = "";
          if (p0 != null) {
             p0 = p0.getCustomValue();
             if (p0 != null) {
             label_0026 :
                j k = j.k;
                Objects.requireNonNull(k);
                LinkedHashMap linkedHashMa = PatchProxy.applyOneRefs(p0, k, j.class, "13");
                if (linkedHashMa != patchProxyRe) {
                }else {
                   linkedHashMa = new LinkedHashMap();
                   p0 = a.a.h(p0, HashMap.class);
                   Iterator iterator = p0.keySet().iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         Object obj = iterator.next();
                         if (obj != null) {
                            Object obj1 = obj;
                            obj = p0.get(obj);
                            if (obj != null) {
                               linkedHashMa.put(obj1, obj);
                            }else {
                               throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                         }else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                         }
                      }
                   }
                }
                p0 = p1.e("HistoryTimeDataProvider", new a(str));
                if (p0 != null) {
                   p0 = p0.g();
                   if (p0 != null) {
                   label_0092 :
                      a uoa1 = p1.e("HistoryLocationDataProvider", new a(str));
                      if (uoa1 != null) {
                         String str1 = uoa1.g();
                         if (str1 != null) {
                            str = str1;
                         }
                      }
                      Pair[] pairArray = new Pair[]{r0.a("HistoryTimes", p0),r0.a("HistoryLocations", str)};
                      uoa = new a(t0.n0(linkedHashMa, t0.j0(pairArray)));
                   }
                }
                p0 = str;
                goto label_0092 ;
             }
          }
          p0 = str;
          goto label_0026 ;
       }
       return uoa;
    }
}
