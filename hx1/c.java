package hx1.c;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import hx1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import va1.a0;
import com.kwai.framework.model.user.UserInfo;
import java.util.List;
import b61.a;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;

public class c	// class@0027a0
{

    public void c(){
       super();
    }
    public static void a(QLiveMessage p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "2")) {
          return;
       }
       if (!a0.g(p0)) {
          return;
       }
       UserInfo user = p0.getUser();
       if (user != null && user.mIsConvertFromProto == null) {
          a.f(user, p1.Bi());
       }
       return;
    }
    public static void b(a p0,Collection p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "1")) {
          return;
       }
       if (q.f(p1)) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          c.a(iterator.next(), p0);
       }
       return;
    }
}
