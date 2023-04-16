package com.kuaishou.live.core.show.wish.LiveAudienceWishRoomKrnDialogPresenter$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.core.show.wish.LiveAudienceWishRoomKrnDialogPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ym2.g$b;

public class LiveAudienceWishRoomKrnDialogPresenter$1 implements LifecycleEventObserver	// class@001292
{
    public final LiveAudienceWishRoomKrnDialogPresenter b;

    public void LiveAudienceWishRoomKrnDialogPresenter$1(LiveAudienceWishRoomKrnDialogPresenter p0){
       this.b = p0;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceWishRoomKrnDialogPresenter$1.class, "1")) {
          return;
       }
       if (p1 == Lifecycle$Event.ON_DESTROY) {
          this.b.P.a();
       }
       return;
    }
}
