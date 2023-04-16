package hy8.c$a;
import com.yxcorp.gifshow.widget.m;
import hy8.c;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import hy8.a;
import android.content.Context;
import k59.b2;
import com.yxcorp.gifshow.ad.award.pendant.navigation.NeoNavigationRule;
import android.content.Intent;
import com.yxcorp.gifshow.webview.c;
import com.kwai.library.widget.popup.common.c;

public final class c$a extends m	// class@0025f0
{
    public final c c;
    public final ViewGroup d;

    public void c$a(c p0,ViewGroup p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$a.class, "1")) {
          return;
       }
       a.p(p0, "v");
       this.c.b.d("cover");
       c$a td = this.d;
       a.o(td, "container");
       c$a td1 = this.d;
       a.o(td1, "container");
       Context context = td1.getContext();
       c.i(td.getContext(), new b2(context, this.c.b.c.link).a());
       a b = this.c.b.b;
       if (b != null) {
          b.o();
       }
       b = this.c.b.a;
       if (b != null) {
          b.setVisibility(0);
       }
       PatchProxy.onMethodExit(c$a.class, "1");
       return;
    }
}
