package com.kuaishou.live.core.basic.activity.LivePlayerLoader;
import com.kuaishou.live.core.basic.activity.j0;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.live.core.basic.activity.LivePlayerLoader$a;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.core.basic.activity.LivePlayerLoader$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.model.QLivePlayConfig;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;

public class LivePlayerLoader	// class@001823
{
    public final LiveAudienceParam a;
    public final LiveStreamFeedWrapper b;
    public final LiveBizParam c;
    public final ViewGroup d;
    public final View e;
    public final boolean f;
    public final LivePlayerLoader$a g;
    public LivePlayTextureView h;
    public int i;
    public QLivePlayConfig j;
    public LivePlayerController k;
    public static final c l;

    static {
       LivePlayerLoader.l = j0.b;
    }
    public void LivePlayerLoader(LiveAudienceParam p0,LiveStreamFeedWrapper p1,LiveBizParam p2,ViewGroup p3,View p4,boolean p5,LivePlayerLoader$a p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       p6.getViewLifecycleOwner().getLifecycle().addObserver(new LivePlayerLoader$1(this));
    }
    public final void a(LivePlayTextureView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerLoader.class, "4")) {
          return;
       }
       if (this.h != null) {
          b.c0(LivePlayerLoader.l, "mPlayView is not null, attachPlayView return", "liveStreamId", this.j.getLiveStreamId());
          return;
       }else {
          p0.setId(R.id.play_view);
          p0.setClickable(true);
          int i = this.d.indexOfChild(this.e);
          this.d.removeView(this.e);
          if (p0.getLayoutParams() instanceof FrameLayout$LayoutParams) {
             this.d.addView(p0, i);
          }else {
             this.d.addView(p0, i, new FrameLayout$LayoutParams(-1, -1, 17));
          }
          this.h = p0;
          return;
       }
    }
    public LivePlayTextureView b(){
       return this.h;
    }
}
