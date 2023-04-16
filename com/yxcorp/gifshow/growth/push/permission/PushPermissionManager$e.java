package com.yxcorp.gifshow.growth.push.permission.PushPermissionManager$e;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ag6.a;
import o07.n;

public final class PushPermissionManager$e implements PopupInterface$f	// class@0014af
{
    public static final PushPermissionManager$e b;

    static {
       PushPermissionManager$e.b = new PushPermissionManager$e();
    }
    public void PushPermissionManager$e(){
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, PushPermissionManager$e.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "inflater");
       return a.c(p1, 0x7f0d02ef, p2, false);
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
