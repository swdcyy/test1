package a44.a;
import java.util.LinkedHashMap;
import com.kuaishou.merchant.live.cart.onsale.audience.component.NativeComponents;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.Map;
import com.kuaishou.merchant.live.cart.onsale.audience.pendant.PendantComponents;

public final class a	// class@000023
{
    public static final Map a;
    public static final a b;

    static {
       a.b = new a();
       a.a = new LinkedHashMap();
       NativeComponents[] nativeCompon = NativeComponents.values();
       int len = nativeCompon.length;
       int i = 0;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          object oobject = nativeCompon[i1];
          String componentTyp = oobject.getComponentType();
          a.a.put(componentTyp, oobject.getModelClass());
       }
       PendantComponents[] pendantCompo = PendantComponents.values();
       len = pendantCompo.length;
       for (; i < len; i = i + 1) {
          object oobject1 = pendantCompo[i];
          String componentTyp1 = oobject1.getComponentType();
          a.a.put(componentTyp1, oobject1.getModelClass());
       }
    }
    public void a(){
       super();
    }
}
