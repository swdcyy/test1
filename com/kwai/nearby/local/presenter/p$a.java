package com.kwai.nearby.local.presenter.p$a;
import fw8.b;
import com.kwai.nearby.local.presenter.p;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mrb.a;
import q87.c;

public final class p$a extends b	// class@000fbc
{
    public final p b;

    public void p$a(p p0){
       this.b = p0;
       super();
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       Object[] objArray = new Object[0];
       a.C().s("HomeLocalTopBubblePresenter", "Activity paused", objArray);
       this.b.V8();
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       Object[] objArray = new Object[0];
       a.C().s("HomeLocalTopBubblePresenter", "Activity resumed", objArray);
       this.b.c9();
       return;
    }
}
