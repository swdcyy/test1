package com.kuaishou.live.core.voiceparty.crossroompk.test.LivePkScoreProgressBarTestActivity$b;
import com.kuaishou.live.core.show.pk.LivePkScoreProgressBar$a;
import com.kuaishou.live.core.voiceparty.crossroompk.test.LivePkScoreProgressBarTestActivity;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import mr2.d;
import mr2.a;
import kr2.b;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.scoreprogress.view.LivePkScoreProgressView;
import sh3.a;
import kr2.a;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.scoreprogress.databinding.entirety.LivePKLottieActionEntirety;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.scoreprogress.databinding.entirety.LivePKLottieActionEntirety$Action;

public class LivePkScoreProgressBarTestActivity$b implements LivePkScoreProgressBar$a	// class@0014a3
{
    public final LivePkScoreProgressBarTestActivity a;

    public void LivePkScoreProgressBarTestActivity$b(LivePkScoreProgressBarTestActivity p0){
       this.a = p0;
       super();
    }
    public void H(){
    }
    public void a(int p0,int p1,int p2){
       if (PatchProxy.isSupport(LivePkScoreProgressBarTestActivity$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, LivePkScoreProgressBarTestActivity$b.class, "2")) {
          return;
       }
       LivePkScoreProgressBarTestActivity$b ta = this.a;
       ta.D = p2;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(LivePkScoreProgressBarTestActivity.class) || (!PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), ta, LivePkScoreProgressBarTestActivity.class, "6") && ta.A != null)) {
          ta.z.e.d.setValue(new b(p2, ta.y.getProgressBarWidth(), ta.y.getProgressBarMinWidth()));
          ta.z.e.b.setValue(new a(p0, p1));
       }
       return;
    }
    public void b(int p0){
       LivePkScoreProgressBarTestActivity$b uob = LivePkScoreProgressBarTestActivity$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       uob = this.a;
       Objects.requireNonNull(uob);
       LivePkScoreProgressBarTestActivity livePkScoreP = LivePkScoreProgressBarTestActivity.class;
       if (!PatchProxy.isSupport(livePkScoreP) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uob, livePkScoreP, "10")) {
          uob.z.e.d.setValue(new b(p0, uob.y.getProgressBarWidth(), uob.y.getProgressBarMinWidth()));
          uob.z.e.c.setValue(new LivePKLottieActionEntirety(LivePKLottieActionEntirety$Action.PLAY_LIGHT_ANIM, 0));
       }
       return;
    }
}
