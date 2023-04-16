package com.yxcorp.gifshow.growth.push.permission.PushPermissionManager$c;
import u07.u;
import com.yxcorp.gifshow.growth.push.permission.PushPermissionManager;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.c;
import jqa.b;
import com.yxcorp.gifshow.growth.push.permission.PushPermissionManager$c$a;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kwai.framework.activitycontext.ActivityContext;

public final class PushPermissionManager$c implements u	// class@0014ad
{
    public final PushPermissionManager b;

    public void PushPermissionManager$c(PushPermissionManager p0){
       this.b = p0;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PushPermissionManager$c.class, "1")) {
          return;
       }
       a.p(p0, "dialog");
       this.b.i();
       p0.q(4);
       this.b.j(true);
       p0.e = true;
       b.b(11, 33);
       ActivityContext.i(new PushPermissionManager$c$a(this));
       return;
    }
}
