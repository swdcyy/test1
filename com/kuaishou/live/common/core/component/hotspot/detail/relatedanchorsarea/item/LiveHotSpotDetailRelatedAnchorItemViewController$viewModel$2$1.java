package com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewController$viewModel$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewController$viewModel$2;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewController;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.LiveData;
import un1.k;

public final class LiveHotSpotDetailRelatedAnchorItemViewController$viewModel$2$1 extends Lambda implements a	// class@0013f9
{
    public final LiveHotSpotDetailRelatedAnchorItemViewController$viewModel$2 this$0;

    public void LiveHotSpotDetailRelatedAnchorItemViewController$viewModel$2$1(LiveHotSpotDetailRelatedAnchorItemViewController$viewModel$2 p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveHotSpotDetailRelatedAnchorItemViewModel invoke(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailRelatedAnchorItemViewController$viewModel$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveHotSpotDetailRelatedAnchorItemViewController$viewModel$2 this$0 = this.this$0.this$0;
       Activity uActivity = this$0.B2();
       Objects.requireNonNull(uActivity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       return new LiveHotSpotDetailRelatedAnchorItemViewModel(this$0.l, this$0.m, this$0.n, uActivity);
    }
    public Object invoke(){
       return this.invoke();
    }
}
