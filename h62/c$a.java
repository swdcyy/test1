package h62.c$a;
import java.lang.Object;
import nsd.u;
import java.util.Map;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import lnc.i3;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Character;
import java.lang.Long;

public final class c$a	// class@002c69
{

    public void c$a(){
       super();
    }
    public void c$a(u p0){
       super();
    }
    public final String a(Map p0){
       Object value;
       i3 obj = PatchProxy.applyOneRefs(p0, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "map");
       obj = i3.f();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getValue() instanceof String) {
             value = uEntry.getValue();
             Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.String");
             obj.d(uEntry.getKey(), value);
          }
          if (uEntry.getValue() instanceof Integer) {
             value = uEntry.getValue();
             Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.Int");
             obj.c(uEntry.getKey(), Integer.valueOf(value.intValue()));
          }
          if (uEntry.getValue() instanceof Boolean) {
             value = uEntry.getValue();
             Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.Boolean");
             obj.a(uEntry.getKey(), Boolean.valueOf(value.booleanValue()));
          }
          if (uEntry.getValue() instanceof Character) {
             value = uEntry.getValue();
             Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.Char");
             obj.b(uEntry.getKey(), Character.valueOf(value.charValue()));
          }
          if (uEntry.getValue() instanceof Long) {
             Object value1 = uEntry.getValue();
             Objects.requireNonNull(value1, "null cannot be cast to non-null type kotlin.Long");
             obj.c(uEntry.getKey(), value1);
          }
       }
       String str = obj.toString();
       a.o(str, "jsonBuilder.toString\(\)");
       return str;
    }
}
