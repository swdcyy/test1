package ahd.l;
import n3d.a;
import com.yxcorp.plugin.setting.stencil.item.SwitchAccountItem;
import java.lang.String;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import ihc.b;
import android.app.Activity;

public final class l implements a	// class@000040
{
    public final SwitchAccountItem b;
    public final String c;

    public void l(SwitchAccountItem p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, l.class, "1")) {
          return;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       if (a.g(this.c, qCurrentUser.getId()) ^ 0x01) {
          this.b.k().finish();
       }
       return;
    }
}
