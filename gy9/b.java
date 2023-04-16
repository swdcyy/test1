package gy9.b;
import n3d.a;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;

public final class b implements a	// class@002508
{
    public final IntensifyFollowElement b;

    public void b(IntensifyFollowElement p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, b.class, "1")) {
          return;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       if (qCurrentUser.isLogined()) {
          b tb = this.b;
          tb.t0((IntensifyFollowElement.p0(tb).isFollowingOrFollowRequesting() ^ 0x01));
       }
       return;
    }
}
