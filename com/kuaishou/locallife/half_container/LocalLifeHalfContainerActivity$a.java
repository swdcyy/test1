package com.kuaishou.locallife.half_container.LocalLifeHalfContainerActivity$a;
import ps6.e;
import com.kuaishou.locallife.half_container.LocalLifeHalfContainerActivity;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;
import android.view.View;
import com.kuaishou.locallife.half_container.view.LocalLifeHalfContainerBehavior;
import com.kuaishou.locallife.half_container.view.LocalLifeHalfContainerBehavior$a;
import android.net.Uri;
import ekd.x0;
import java.lang.CharSequence;
import com.kuaishou.locallife.half_container.logger.CloseType;

public final class LocalLifeHalfContainerActivity$a implements e	// class@00148f
{
    public final LocalLifeHalfContainerActivity a;

    public void LocalLifeHalfContainerActivity$a(LocalLifeHalfContainerActivity p0){
       this.a = p0;
       super();
    }
    public void o0(Throwable p0){
       LocalLifeHalfContainerActivity a;
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalLifeHalfContainerActivity$a.class, "1")) {
          return;
       }
       LocalLifeHalfContainerActivity$a ta = this.a;
       boolean b = true;
       ta.O = b;
       LocalLifeHalfContainerActivity d = ta.D;
       if (d == null) {
          a.S("errorView");
       }
       d.setVisibility(0);
       d = this.a.C;
       if (d == null) {
          a.S("loadingView");
       }
       d.setVisibility(8);
       LocalLifeHalfContainerBehavior$a b1 = LocalLifeHalfContainerBehavior.b;
       a = this.a.A;
       if (a == null) {
          a.S("slideLayout");
       }
       b1.a(a).c(b);
       d = this.a.G;
       if (d == null) {
          a.S("krnUrl");
       }
       String str = x0.a(x0.f(d), "degradeWebUrl");
       if (str != null && str.length()) {
          b = false;
       }
       if (!b) {
          this.a.E3(CloseType.RN_ERROR);
       }
       return;
    }
}
