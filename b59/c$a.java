package b59.c$a;
import n3d.a;
import b59.c;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;

public final class c$a implements a	// class@00036d
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(c$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, c$a.class, "1")) {
          return;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       if (qCurrentUser.isLogined()) {
          this.b.i();
       }
       return;
    }
}
