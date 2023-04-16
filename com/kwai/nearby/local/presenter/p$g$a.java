package com.kwai.nearby.local.presenter.p$g$a;
import android.view.View$OnClickListener;
import com.kwai.nearby.local.presenter.p$g;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.nearby.local.presenter.p;
import qd7.b;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import k2b.h;
import lnc.i3;

public final class p$g$a implements View$OnClickListener	// class@000fc2
{
    public final p$g b;
    public final boolean c;
    public final c d;

    public void p$g$a(p$g p0,boolean p1,c p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$g$a.class, "1")) {
          return;
       }
       String str = String.valueOf(this.b.b.y);
       p$g b = this.b.b;
       p z = b.z;
       p w = b.w;
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(str, z, Boolean.valueOf(w), null, b.class, "2")) {
          a.p(str, "popId");
          a.p(z, "popContent");
          String str1 = (w != null)? "3291785": "2695140";
          h oh = h.m(str1, "NEARBY_GUIDE_POP");
          i3 oi3 = i3.f();
          oi3.d("pop_id", str);
          oi3.d("pop_content", z);
          oh.n(oi3.e());
          oh.h();
       }
       p$g b1 = this.b.b;
       b.b(b1.y, "TopNearby", b1.z, this.c, null);
       this.b.b.b9();
       this.d.o();
       return;
    }
}
