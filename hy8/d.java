package hy8.d;
import com.yxcorp.gifshow.widget.m;
import hy8.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.content.Context;
import k59.b2;
import com.yxcorp.gifshow.ad.award.pendant.navigation.NeoNavigationRule;
import android.content.Intent;
import com.yxcorp.gifshow.webview.c;

public final class d extends m	// class@0025f3
{
    public final a c;
    public final View d;

    public void d(a p0,View p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "v");
       this.c.d("pendant");
       c.i(this.d.getContext(), new b2(this.d.getContext(), this.c.c.link).a());
       PatchProxy.onMethodExit(d.class, "1");
       return;
    }
}
