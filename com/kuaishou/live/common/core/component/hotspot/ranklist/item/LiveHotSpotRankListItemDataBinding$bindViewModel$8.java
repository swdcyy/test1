package com.kuaishou.live.common.core.component.hotspot.ranklist.item.LiveHotSpotRankListItemDataBinding$bindViewModel$8;
import androidx.lifecycle.LifecycleEventObserver;
import zn1.a;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveHotSpotRankListItemDataBinding$bindViewModel$8 implements LifecycleEventObserver	// class@00143c
{
    public final a b;

    public void LiveHotSpotRankListItemDataBinding$bindViewModel$8(a p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveHotSpotRankListItemDataBinding$bindViewModel$8.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       if (p1 == Lifecycle$Event.ON_PAUSE) {
          this.b.a();
       }
       return;
    }
}
