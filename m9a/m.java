package m9a.m;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import e3a.a;
import kzc.c;
import cg6.b;
import java.util.List;
import com.yxcorp.gifshow.widget.popup.c;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.common.c;

public class m	// class@002f8a
{

    public void m(){
       super();
    }
    public static void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, m.class, "1")) {
          return;
       }
       Activity uActivity = a.b(p0);
       if (uActivity == null) {
          return;
       }
       List list = b.a().l(uActivity);
       if (!q.f(list)) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             iterator.next().o();
          }
       }
       return;
    }
}
