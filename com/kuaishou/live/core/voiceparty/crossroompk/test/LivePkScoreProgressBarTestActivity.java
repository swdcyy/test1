package com.kuaishou.live.core.voiceparty.crossroompk.test.LivePkScoreProgressBarTestActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Handler;
import com.kuaishou.live.core.voiceparty.crossroompk.test.LivePkScoreProgressBarTestActivity$a;
import android.os.Handler$Callback;
import com.kuaishou.live.core.voiceparty.crossroompk.test.LivePkScoreProgressBarTestActivity$b;
import com.kuaishou.live.core.voiceparty.crossroompk.test.LivePkScoreProgressBarTestActivity$c;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.view.View;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.scoreprogress.view.LivePkScoreProgressView;
import com.kuaishou.live.core.show.pk.LivePkScoreProgressBar$a;
import hw1.j;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig;
import qr2.a;
import android.view.View$OnClickListener;
import qr2.b;
import qr2.c;
import qr2.d;
import mr2.d;
import androidx.lifecycle.LifecycleOwner;
import s02.a;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import mr2.b;
import java.lang.Integer;
import sh3.a;
import mr2.a;
import qr2.e;
import java.lang.Runnable;
import android.widget.FrameLayout;

public class LivePkScoreProgressBarTestActivity extends GifshowActivity	// class@0014a5
{
    public boolean A;
    public long B;
    public long C;
    public int D;
    public final Handler E;
    public final LivePkScoreProgressBar$a F;
    public final j G;
    public LivePkScoreProgressView y;
    public d z;
    public static final int H;

    public void LivePkScoreProgressBarTestActivity(){
       super();
       this.E = new Handler(new LivePkScoreProgressBarTestActivity$a(this));
       this.F = new LivePkScoreProgressBarTestActivity$b(this);
       this.G = new LivePkScoreProgressBarTestActivity$c(this);
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LivePkScoreProgressBarTestActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePkScoreProgressBarTestActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d0e4a);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LivePkScoreProgressBarTestActivity.class, "2")) {
          LivePkScoreProgressView livePkScoreP = this.findViewById(R.id.live_pk_score_progress_view);
          this.y = livePkScoreP;
          livePkScoreP.setLivePkScoreProgressBarListener(this.F);
          this.y.setPkVoteCountDownProvider(this.G);
          this.y.setPkAnimationsConfig(new LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig());
          this.findViewById(R.id.reset_button).setOnClickListener(new a(this));
          this.findViewById(R.id.start_pk_button).setOnClickListener(new b(this));
          this.findViewById(R.id.game_over_self_win_button).setOnClickListener(new c(this));
          this.findViewById(R.id.game_over_opponent_win_button).setOnClickListener(new d(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, LivePkScoreProgressBarTestActivity.class, "3")) {
          d uod = new d(this);
          this.z = uod;
          this.y.a(uod);
       }
       this.u3();
       if (!PatchProxy.applyVoid(objArray, this, LivePkScoreProgressBarTestActivity.class, "5")) {
          a.a(false);
          LiveResourceFileUtil.f(false);
       }
       return;
    }
    public final void u3(){
       if (PatchProxy.applyVoid(null, this, LivePkScoreProgressBarTestActivity.class, "4")) {
          return;
       }
       this.z.c.a.setValue(Integer.valueOf(0));
       this.z.c.b.setValue(Integer.valueOf(0));
       this.z.d.a.setValue(Integer.valueOf(0));
       this.z.d.b.setValue(Integer.valueOf(0));
       this.z.e.a.setValue(Integer.valueOf(4));
       this.y.post(new e(this));
       return;
    }
}
