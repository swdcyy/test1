package vi7.a;
import dj5.a;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.Object;
import java.lang.String;
import java.util.Collection;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Set;
import java.util.Collections;
import java.lang.ClassLoader;
import qj7.d;
import java.lang.StringBuilder;
import android.os.Build$VERSION;
import java.lang.CharSequence;
import vi7.b;
import java.lang.Iterable;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.NullPointerException;
import java.lang.Boolean;

public final class a	// class@0026ba
{
    public static final a a;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    public static final HashMap e;
    public static final HashSet f;
    public static String g;
    public static b h;

    static {
       a a;
       a.a = new a();
       a = a.a;
       a.c = a.b() ^ 0x01;
       a.d = a.c() ^ 0x01;
       a.e = new HashMap();
       a.f = new HashSet();
       a.g = "";
    }
    public void a(){
       super();
    }
    public final Collection a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "feature");
       Collection uCollection = a.e.get(p0);
       if (uCollection == null) {
          uCollection = Collections.emptySet();
       }
       return uCollection;
    }
    public synchronized final String b(String p0,ClassLoader p1){
       a a;
       b h;
       Object obj = p0;
       String obj1 = p1;
       String obj2 = PatchProxy.applyTwoRefs(obj, obj1, this, a.class, "7");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(obj, "featureName");
       a.p(obj1, "classLoader");
       d.c(a.C("handle namespace isolation for ", obj));
       obj2 = "";
       if (!a.b) {
          return "handle namespace isolation is not allowed.";
       }
       if (a.c && a.d) {
          return "sdk_version\("+Build$VERSION.SDK_INT+"\) anomaly or environmental anomaly, mErr="+a.g;
       }
       String str = "";
       a = a.a;
       boolean b = true;
       if (a.b() && !a.c) {
          obj1 = a.d(obj1);
          str = (obj1.length() > 0)? 1: null;
          if (str) {
             str = a.C("linkErr: ", obj1);
             a.c = b;
          }else {
             d.c(a.C("link namespace success, plugin=", obj));
             h = a.h;
             if (h != null) {
                h.a(obj, b, obj2);
             }
             return obj2;
          }
       }
       if (a.c() && !a.d) {
          obj1 = a.e();
          StringBuilder str1 = (obj1.length() > 0)? 1: null;
          if (str1) {
             a.d = b;
             obj1 = a.C("replaceErr: ", obj1);
             if (str.length() <= 0) {
                b = false;
             }
             if (b) {
                obj1 = str+" , "+obj1;
             }
             str = obj1;
          }else {
             Collection uCollection = a.e.get(obj);
             if (uCollection != null) {
                d.c(obj+" insert so list for replace namespace, so list="+CollectionsKt___CollectionsKt.V2(uCollection, null, null, null, 0, null, null, 63, null));
                String[] stringArray = new String[false];
                Object[] objArray = uCollection.toArray(stringArray);
                if (objArray != null) {
                   a.a(objArray);
                }else {
                   throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
             }
             d.c(a.C("replace to host namespace success, plugin=", obj));
             h = a.h;
             if (h != null) {
                h.a(obj, b, str);
             }
             return obj2;
          }
       }
       a.g = str;
       h = a.h;
       if (h != null) {
          h.a(obj, false, str);
       }
       return str;
    }
    public final boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "feature");
       boolean b = false;
       if (a.f.contains(p0)) {
          Collection uCollection = a.e.get(p0);
          uCollection = (uCollection != null && (uCollection.isEmpty() ^ 1) == 1)? 1: 0;
          if (uCollection) {
             b = true;
          }
       }
       return b;
    }
}
