package dy8.a$b;
import n3d.a;
import dy8.a;
import android.app.Activity;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;

public final class a$b implements a	// class@0020f5
{
    public final a b;
    public final int c;
    public final Activity d;

    public void a$b(a p0,int p1,Activity p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(a$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, a$b.class, "1")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (mE.isLogined()) {
          this.b.a(this.c, this.d);
       }
       return;
    }
}
