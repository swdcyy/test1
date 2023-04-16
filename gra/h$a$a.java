package gra.h$a$a;
import n3d.a;
import brd.v;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import brd.g;

public final class h$a$a implements a	// class@002baf
{
    public final v b;

    public void h$a$a(v p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(h$a$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, h$a$a.class, "1")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       this.b.onNext(Boolean.valueOf(mE.isLogined()));
       this.b.onComplete();
       return;
    }
}
