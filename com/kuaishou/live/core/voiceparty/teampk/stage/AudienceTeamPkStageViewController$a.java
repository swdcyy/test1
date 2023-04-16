package com.kuaishou.live.core.voiceparty.teampk.stage.AudienceTeamPkStageViewController$a;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.core.voiceparty.teampk.stage.AudienceTeamPkStageViewController;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LyricsMode;
import com.kuaishou.live.core.show.music.audiencelyrics.view.ConstraintType;
import android.graphics.PointF;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import com.yxcorp.utility.n;
import lnc.a1;
import qc2.a;

public final class AudienceTeamPkStageViewController$a implements View$OnLayoutChangeListener	// class@001930
{
    public final AudienceTeamPkStageViewController b;
    public final View c;
    public final int d;

    public void AudienceTeamPkStageViewController$a(AudienceTeamPkStageViewController p0,View p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(AudienceTeamPkStageViewController$a.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, AudienceTeamPkStageViewController$a.class, "1")) {
             return;
          }
       }
       a.p(p0, "view");
       p0.removeOnLayoutChangeListener(this);
       int[] ointArray = new int[2]{0,0};
       this.c.getLocationInWindow(ointArray);
       this.b.F.e(LyricsMode.LEFT, ConstraintType.RIGHT_TOP, new PointF(((float)n.k(this.b.B2()) - (float)a1.d(R.dimen.arg_RES_7f070878)), (float)((ointArray[1] + this.c.getHeight()) + this.d)), 1);
       return;
    }
}
