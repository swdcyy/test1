package a04.c;
import erd.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a04.b;
import java.util.Objects;
import java.util.LinkedList;
import java.lang.reflect.Type;
import zw3.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public final class c implements g	// class@000009
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          b d = b.d;
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoidOneRefs(p0, d, b.class, "9")) {
             LinkedList linkedList = b.g(LinkedList.class);
             if (linkedList == null) {
                linkedList = new LinkedList();
             }
             if (linkedList.size() >= 30) {
                linkedList.removeLast();
             }
             linkedList.addFirst(p0);
             p0 = b.a.edit();
             p0.putString("merchant_shop_recent_enter_times", b.e(linkedList));
             g.a(p0);
          }
       }
       return;
    }
}
