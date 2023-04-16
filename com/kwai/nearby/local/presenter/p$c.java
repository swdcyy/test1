package com.kwai.nearby.local.presenter.p$c;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import com.kwai.nearby.local.presenter.p;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;

public final class p$c implements SlidingPaneLayout$d	// class@000fbe
{
    public final p a;

    public void p$c(p p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$c.class, "3")) {
          return;
       }
       a.p(p0, "view");
       return;
    }
    public void b(View p0,float p1){
       if (PatchProxy.isSupport(p$c.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, p$c.class, "1")) {
          return;
       }
       a.p(p0, "view");
       this.a.V8();
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$c.class, "2")) {
          return;
       }
       a.p(p0, "view");
       return;
    }
}
