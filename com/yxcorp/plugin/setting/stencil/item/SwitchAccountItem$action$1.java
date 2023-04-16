package com.yxcorp.plugin.setting.stencil.item.SwitchAccountItem$action$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.plugin.setting.stencil.item.SwitchAccountItem;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import ihc.b;
import android.app.Activity;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import ahd.l;
import android.content.Context;
import n3d.a;

public final class SwitchAccountItem$action$1 extends Lambda implements l	// class@00091c
{
    public final SwitchAccountItem this$0;

    public void SwitchAccountItem$action$1(SwitchAccountItem p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, SwitchAccountItem$action$1.class, str)) {
          return;
       }
       a.p(p0, "it");
       SwitchAccountItem$action$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(null, tthis$0, SwitchAccountItem.class, str) && !tthis$0.k().isFinishing()) {
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          d.a(-1712118428).Vl(tthis$0.k(), new l(tthis$0, qCurrentUser.getId()));
       }
       return;
    }
}
