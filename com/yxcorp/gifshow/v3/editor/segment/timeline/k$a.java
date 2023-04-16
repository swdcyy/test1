package com.yxcorp.gifshow.v3.editor.segment.timeline.k$a;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$e;
import com.yxcorp.gifshow.v3.editor.segment.timeline.k;
import com.kwai.video.editorsdk2.PreviewPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.widget.trimvideo.VideoTrimmer;

public class k$a extends VideoSDKPlayerView$e	// class@0011ef
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public void onTimeUpdate(PreviewPlayer p0,double p1){
       k$a uoa = k$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uoa, "1")) {
          return;
       }
       k$a ta = this.a;
       if (p1 - (ta.C - 0x3fa999999999999a) < 0 || (p1 - ta.D >= 0 && (ta.E != null && ta.B == null))) {
          Object[] objArray = new Object[0];
          a.D().s("SegmentTimelinePresenter", "onTimeUpdate time: "+p1+", clipStart: "+this.a.C+", clipEnd: "+this.a.D, objArray);
          ta = this.a;
          ta.E.seekTo(ta.C);
          this.a.E.play();
       }else if(ta.B == null){
          k e = ta.E;
          if (e != null && !e.isPlaying()) {
             this.a.E.play();
          }
          this.a.s.setCurrentPlayTime((float)p1);
       }
       return;
    }
}
