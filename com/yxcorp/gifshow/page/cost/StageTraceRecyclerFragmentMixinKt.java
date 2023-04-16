package com.yxcorp.gifshow.page.cost.StageTraceRecyclerFragmentMixinKt;
import androidx.fragment.app.Fragment;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import com.yxcorp.gifshow.page.cost.StageTraceRecyclerFragmentMixinKt$autoDispose$1;
import androidx.lifecycle.LifecycleObserver;

public final class StageTraceRecyclerFragmentMixinKt	// class@000e1b
{

    public static final void a(Fragment p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, StageTraceRecyclerFragmentMixinKt.class, "1")) {
          return;
       }
       a.p(p0, "$this$autoDispose");
       a.p(p1, "dis");
       if (p1.isDisposed()) {
          return;
       }
       Lifecycle lifecycle = p0.getLifecycle();
       a.o(lifecycle, "this.lifecycle");
       if (lifecycle.getCurrentState().isAtLeast(Lifecycle$State.CREATED)) {
          p0.getLifecycle().addObserver(new StageTraceRecyclerFragmentMixinKt$autoDispose$1(p1));
       }else {
          p1.dispose();
       }
       return;
    }
}
