package com.kuaishou.live.core.voiceparty.crossroompk.stageview.scoreprogress.view.LivePKLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.pk.LivePkScoreProgressAnimHelper;
import android.graphics.Canvas;
import android.widget.ImageView;
import android.view.View;
import java.lang.Exception;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig;
import hw1.j;

public class LivePKLottieAnimationView extends LottieAnimationView	// class@00148b
{
    public LivePkScoreProgressAnimHelper r;

    public void LivePKLottieAnimationView(Context p0){
       super(p0);
       this.D();
    }
    public void LivePKLottieAnimationView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.D();
    }
    public void LivePKLottieAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.D();
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, LivePKLottieAnimationView.class, "1")) {
          return;
       }
       this.r = new LivePkScoreProgressAnimHelper(this);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePKLottieAnimationView.class, "8")) {
          return;
       }
       try{
          super.onDraw(p0);
       }catch(java.lang.Exception e3){
          LiveLottieAnimationView.E(this, e3);
       }
       return;
    }
    public void setPkAnimationsConfig(LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePKLottieAnimationView.class, "2")) {
          return;
       }
       this.r.d = p0;
       return;
    }
    public void setPkVoteCountDownProvider(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePKLottieAnimationView.class, "3")) {
          return;
       }
       this.r.e = p0;
       return;
    }
}
