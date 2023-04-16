package com.kuaishou.activity.kwaibubble.krn.KwaiPopKrn$b$a;
import qn.j;
import com.kuaishou.activity.kwaibubble.krn.KwaiPopKrn$b;
import java.lang.Object;
import qn.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qn.j$a;
import com.kuaishou.activity.kwaibubble.krn.KwaiPopKrn;
import com.kwai.kds.krn.api.page.KwaiRnContainerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;

public final class KwaiPopKrn$b$a implements j	// class@000777
{
    public final KwaiPopKrn$b a;

    public void KwaiPopKrn$b$a(KwaiPopKrn$b p0){
       this.a = p0;
       super();
    }
    public void a(h p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, KwaiPopKrn$b$a.class, "2")) {
          return;
       }
       a.p(p0, "bubble");
       j$a.a(this, p0);
       KwaiPopKrn b = this.a.b.b;
       if (b != null) {
          b.b();
       }
       PatchProxy.onMethodExit(KwaiPopKrn$b$a.class, "2");
       return;
    }
    public View c(h p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefsWithListener(p0, p1, p2, p3, this, KwaiPopKrn$b$a.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       a.p(p0, "bubble");
       a.p(p1, "inflater");
       a.p(p2, "container");
       KwaiPopKrn b = this.a.b.b;
       a.m(b);
       PatchProxy.onMethodExit(KwaiPopKrn$b$a.class, "1");
       return b;
    }
}
