package com.kwai.feature.post.api.widget.SoftInputPopupWindow$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kwai.feature.post.api.widget.SoftInputPopupWindow;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class SoftInputPopupWindow$1 implements LifecycleEventObserver	// class@001482
{
    public final SoftInputPopupWindow b;

    public void SoftInputPopupWindow$1(SoftInputPopupWindow p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SoftInputPopupWindow$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       if (p1 == Lifecycle$Event.ON_DESTROY) {
          this.b.dismiss();
       }
       return;
    }
}
