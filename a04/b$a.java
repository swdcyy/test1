package a04.b$a;
import k2b.s1;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import a04.a;
import java.util.List;
import a04.b;
import ot3.u0;
import java.util.Objects;
import java.util.HashMap;
import java.lang.reflect.Type;
import zw3.b;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import trd.y;
import java.lang.Iterable;
import msd.l;
import java.util.Map;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public final class b$a implements s1	// class@000007
{
    public static final b$a b;

    static {
       b$a.b = new b$a();
    }
    public void b$a(){
       super();
    }
    public final void d(String p0,int p1,String p2){
       String str;
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, b$a.class, "1")) {
          return;
       }
       if (p1 == 1 && a.d.a().contains(p0)) {
          b d = b.d;
          p2 = String.valueOf(u0.b());
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoidTwoRefs(p0, p2, d, b.class, "12")) {
             HashMap hashMap = b.f(HashMap.class);
             if (hashMap == null) {
                hashMap = new HashMap();
             }
             if (hashMap.containsKey(p0)) {
                str = hashMap.get(p0);
                if (str != null) {
                label_0060 :
                   String[] stringArray = new String[]{","};
                   List list = CollectionsKt___CollectionsKt.J5(StringsKt__StringsKt.H4(str, stringArray, false, 0, 6, null));
                   if (list.size() >= 30) {
                      y.N0(list);
                   }
                   list.add(0, p2);
                   hashMap.put(p0, CollectionsKt___CollectionsKt.V2(list, ",", null, null, 0, null, null, 62, null));
                   SharedPreferences$Editor uEditor = b.a.edit();
                   uEditor.putString("merchant_shop_recent_core_pages", b.e(hashMap));
                   g.a(uEditor);
                }
             }
             str = "";
             goto label_0060 ;
          }
       }
       return;
    }
}
