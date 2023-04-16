package com.kuaishou.activity.kwaibubble.tk.KwaiPopTk$d$a;
import qn.j;
import com.kuaishou.activity.kwaibubble.tk.KwaiPopTk$d;
import sx4.e;
import java.lang.Object;
import qn.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.activity.kwaibubble.tk.KwaiPopTk;
import zn.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;

public final class KwaiPopTk$d$a implements j	// class@00078f
{
    public final KwaiPopTk$d a;
    public final e b;

    public void KwaiPopTk$d$a(KwaiPopTk$d p0,e p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPopTk$d$a.class, "2")) {
          return;
       }
       a.p(p0, "bubble");
       KwaiPopTk b = this.a.a.b;
       if (b != null) {
          b.c();
       }
       return;
    }
    public View c(h p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, KwaiPopTk$d$a.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       a.p(p0, "bubble");
       a.p(p1, "inflater");
       a.p(p2, "container");
       FrameLayout view = this.b.getView();
       a.o(view, "tkView.view");
       return view;
    }
}
