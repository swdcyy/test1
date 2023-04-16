package dz9.f;
import n3d.a;
import dz9.g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import cm5.a;
import android.app.Activity;
import k2b.e0;
import cm5.c;

public final class f implements a	// class@002011
{
    public final g b;
    public final QPhoto c;

    public void f(g p0,QPhoto p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, f.class, "1")) {
          return;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       if (qCurrentUser.isLogined()) {
          f tb = this.b;
          d.a(0x5f78d73).dw(this.c, tb.C, tb.D, true);
       }
       return;
    }
}
