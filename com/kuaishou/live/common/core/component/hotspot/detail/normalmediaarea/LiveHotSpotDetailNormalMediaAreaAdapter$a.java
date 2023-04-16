package com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaAdapter$a;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaAdapter;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.detail.model.MediaType;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.item.LiveHotSpotDetailNormalMediaLiveItemViewController;
import androidx.lifecycle.LiveData;
import java.util.Objects;
import msd.p;
import un1.k;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.item.LiveHotSpotDetailNormalMediaPhotoItemViewController;
import android.view.ViewGroup;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiveHotSpotDetailNormalMediaAreaAdapter$a extends ViewControllerAdapter$a	// class@0013d3
{
    public final LiveHotSpotDetailNormalMediaAreaAdapter f;

    public void LiveHotSpotDetailNormalMediaAreaAdapter$a(LiveHotSpotDetailNormalMediaAreaAdapter p0,View p1,LifecycleOwner p2,Activity p3,int p4){
       LiveData liveData;
       LiveHotSpotDetailNormalMediaLiveItemViewController liveHotSpotD;
       a.p(p1, "itemView");
       a.p(p2, "parentLifecycleOwner");
       a.p(p3, "activity");
       this.f = p0;
       super(p1, p2, p3);
       if (p4 == MediaType.LIVE.getType()) {
          liveData = this.b();
          Objects.requireNonNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotLiveViewData>");
          liveHotSpotD = new LiveHotSpotDetailNormalMediaLiveItemViewController(liveData, p0.j, p0.k);
       }else if(p4 == MediaType.PHOTO.getType()){
          liveData = this.b();
          Objects.requireNonNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotPhotoViewData>");
          liveHotSpotD = new LiveHotSpotDetailNormalMediaPhotoItemViewController(liveData, p0.j, p0.k);
       }else {
          liveHotSpotD = null;
       }
       if (liveHotSpotD != null) {
          this.E2(p1, liveHotSpotD);
       }
       return;
    }
}
