package com.kuaishou.live.core.voiceparty.crossroompk.stageview.scoreprogress.view.LivePkScoreProgressView;
import qh3.e;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import qh3.f;
import mr2.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LifecycleOwner;
import qh3.b;
import qh3.a;
import mr2.c;
import qh3.c;
import android.view.View;
import sh3.a;
import mr2.b;
import mr2.a;
import android.view.ViewGroup;
import i2b.a;
import ekd.m1;
import com.kuaishou.live.core.show.pk.LivePkScoreProgressBar;
import android.widget.TextView;
import android.widget.LinearLayout;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.scoreprogress.view.LivePKLottieAnimationView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.core.show.pk.LivePkScoreProgressBar$a;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig;
import hw1.j;

public class LivePkScoreProgressView extends FrameLayout implements e	// class@00148c
{
    public LivePkScoreProgressBar b;
    public LinearLayout c;
    public TextView d;
    public LinearLayout e;
    public TextView f;
    public LivePKLottieAnimationView g;

    public void LivePkScoreProgressView(Context p0){
       super(p0);
       this.b();
    }
    public void LivePkScoreProgressView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b();
    }
    public void LivePkScoreProgressView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b();
    }
    public void F(f p0){
       this.a(p0);
    }
    public void a(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePkScoreProgressView.class, "8")) {
          return;
       }
       b uob = a.a(p0.a());
       uob.a(this.b, p0.b.a);
       uob.a(this.b, p0.b.b);
       uob.a(this.b, p0.b.c);
       uob.a(this.c, p0.c.a);
       uob.a(this.d, p0.c.b);
       uob.a(this.d, p0.c.c);
       uob.a(this.e, p0.d.a);
       uob.a(this.f, p0.d.b);
       uob.a(this.f, p0.d.c);
       uob.a(this.g, p0.e.b);
       uob.a(this.g, p0.e.c);
       uob.a(this.g, p0.e.d);
       uob.a(this.g, p0.e.a);
       return;
    }
    public final void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePkScoreProgressView.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, LivePkScoreProgressView.class, "2")) {
          a.k(this, R.layout.arg_RES_7f0d0d05, true);
          this.b = m1.f(this, 0x7f0a30ab);
          this.f = m1.f(this, 0x7f0a228c);
          this.d = m1.f(this, 0x7f0a22aa);
          this.c = m1.f(this, 0x7f0a22a9);
          this.e = m1.f(this, 0x7f0a228b);
          this.g = m1.f(this, 0x7f0a228e);
       }
       return;
    }
    public int getProgressBarMinWidth(){
       Object obj = PatchProxy.apply(null, this, LivePkScoreProgressView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.getMinWidth();
    }
    public int getProgressBarWidth(){
       Object obj = PatchProxy.apply(null, this, LivePkScoreProgressView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.getWidth();
    }
    public void setLivePkScoreProgressBarListener(LivePkScoreProgressBar$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePkScoreProgressView.class, "3")) {
          return;
       }
       this.b.setLivePkScoreProgressBarListener(p0);
       return;
    }
    public void setPkAnimationsConfig(LiveConfigStartupResponse$LivePkConfig$LivePkProgressAnimationConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePkScoreProgressView.class, "4")) {
          return;
       }
       this.g.setPkAnimationsConfig(p0);
       return;
    }
    public void setPkVoteCountDownProvider(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePkScoreProgressView.class, "5")) {
          return;
       }
       this.g.setPkVoteCountDownProvider(p0);
       return;
    }
}
