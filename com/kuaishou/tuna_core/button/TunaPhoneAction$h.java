package com.kuaishou.tuna_core.button.TunaPhoneAction$h;
import u07.u;
import com.kuaishou.tuna_core.button.TunaPhoneAction;
import com.kuaishou.tuna_core.network.response.TunaVirtualPhoneResponse$AuthItem;
import msd.a;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.a1;

public final class TunaPhoneAction$h implements u	// class@0010a8
{
    public final TunaPhoneAction b;
    public final TunaVirtualPhoneResponse$AuthItem c;
    public final a d;

    public void TunaPhoneAction$h(TunaPhoneAction p0,TunaVirtualPhoneResponse$AuthItem p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TunaPhoneAction$h.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "<anonymous parameter 1>");
       TunaVirtualPhoneResponse$AuthItem mItemScene = this.c.mItemScene;
       a.o(mItemScene, "authItem.mItemScene");
       String str = a1.p(R.string.cancel);
       a.o(str, "CommonUtil.string\(R.string.cancel\)");
       this.b.g(mItemScene, str);
       this.d.invoke();
       return;
    }
}
