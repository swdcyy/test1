package e63.x0;
import android.view.View$OnClickListener;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import gx5.c;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import android.content.Context;

public final class x0 implements View$OnClickListener	// class@002679
{
    public final e b;

    public void x0(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       x0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, e.class, "44")) {
       }else {
          tb.d9();
          d.a(0x763547f8).pc(tb.p, tb.r.getUserProfile());
       }
       return;
    }
}
