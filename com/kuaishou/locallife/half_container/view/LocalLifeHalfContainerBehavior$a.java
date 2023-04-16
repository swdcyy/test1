package com.kuaishou.locallife.half_container.view.LocalLifeHalfContainerBehavior$a;
import java.lang.Object;
import nsd.u;
import android.view.View;
import com.kuaishou.locallife.half_container.view.LocalLifeHalfContainerBehavior;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;

public final class LocalLifeHalfContainerBehavior$a	// class@001496
{

    public void LocalLifeHalfContainerBehavior$a(){
       super();
    }
    public void LocalLifeHalfContainerBehavior$a(u p0){
       super();
    }
    public final LocalLifeHalfContainerBehavior a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocalLifeHalfContainerBehavior$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "view");
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
       CoordinatorLayout$Behavior uBehavior = layoutParams.f();
       Objects.requireNonNull(uBehavior, "null cannot be cast to non-null type com.kuaishou.locallife.half_container.view.LocalLifeHalfContainerBehavior<android.view.View!>");
       return uBehavior;
    }
}
