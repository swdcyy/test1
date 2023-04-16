package com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter$g;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kuaishou.live.core.basic.useraction.LiveAudienceRecoEnterActionPresenter;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import y12.a;
import java.lang.Enum;
import java.lang.StringBuilder;
import y12.b;

public final class LiveAudienceRecoEnterActionPresenter$g implements LivePlayerStateChangeListener	// class@0008d8
{
    public final LiveAudienceRecoEnterActionPresenter b;

    public void LiveAudienceRecoEnterActionPresenter$g(LiveAudienceRecoEnterActionPresenter p0){
       this.b = p0;
       super();
    }
    public final void onStateChange(LivePlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceRecoEnterActionPresenter$g.class, "1")) {
          return;
       }
       a.p(p0, "it");
       int i = a.a[p0.ordinal()];
       if (i != 1) {
          if (i == 2 || (i == 3 || i == 4)) {
             this.b.w.a("receive state:"+p0.name());
          }
       }else if(this.b.R8()){
          this.b.w.d("receive state:"+p0.name());
       }
       return;
    }
}
