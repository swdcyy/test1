package a04.b;
import a04.b$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import a04.j;
import java.util.Objects;
import java.util.LinkedList;
import java.lang.reflect.Type;
import zw3.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public final class b	// class@000008
{
    public static int a;
    public static int b;
    public static final s1 c;
    public static final b d;

    static {
       b.d = new b();
       b.c = b$a.b;
    }
    public void b(){
       super();
    }
    public final void a(long p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "3")) {
          return;
       }
       Objects.requireNonNull(j.k);
       b = false;
       if (j.e) {
          j.e = b;
          b = true;
       }
       if (b || (p0 - false && (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "10")))) {
          LinkedList linkedList = b.h(LinkedList.class);
          if (linkedList == null) {
             linkedList = new LinkedList();
          }
          if (linkedList.size() >= 30) {
             linkedList.removeLast();
          }
          linkedList.addFirst(String.valueOf(p0));
          SharedPreferences$Editor uEditor = b.a.edit();
          uEditor.putString("merchant_shop_recent_non_eve_t3s", b.e(linkedList));
          g.a(uEditor);
       }
    label_006f :
       return;
    }
}
