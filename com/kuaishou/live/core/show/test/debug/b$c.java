package com.kuaishou.live.core.show.test.debug.b$c;
import com.kuaishou.live.core.show.test.debug.b;
import java.lang.Object;
import android.view.View;
import android.view.ViewStub;
import com.kwai.debugtools.plugin.wrapper.HostKwaiPlayerDebugInfoView;
import android.widget.FrameLayout;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.player.debuginfo.KwaiPlayerDebugInfoProvider;
import com.kuaishou.android.live.model.QLivePlayConfig;
import wkd.b;
import kc6.b;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import jl2.b;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class b$c	// class@0011a2
{
    public HostKwaiPlayerDebugInfoView a;
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
       HostKwaiPlayerDebugInfoView hostKwaiPlay = p0.q.inflate();
       this.a = hostKwaiPlay;
       hostKwaiPlay.setVisibility(0);
    }
    public void a(){
       b$c uoc = b$c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "1")) {
          return;
       }
       b$c ta = this.a;
       if (ta != null) {
          b w = this.b.w;
          if (w != null) {
             ta.b(w.getLiveMediaPlayer());
             String liveStreamId = this.b.v.getLiveStreamId();
             if (!PatchProxy.applyVoidOneRefs(liveStreamId, this, uoc, "4") && liveStreamId != null) {
                this.b.X7(b.a(-885597376).b(liveStreamId).observeOn(a.c()).subscribe(new b(this, liveStreamId), e.b));
             }
          }
       }
       uoc = this.b;
       uoc.r = uoc.w.getLiveMediaPlayer();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "2")) {
          return;
       }
       this.a.c();
       return;
    }
}
