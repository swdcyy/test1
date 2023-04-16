package com.kuaishou.live.core.show.pk.LivePkScoreProgressBar;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.content.res.Resources;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import kw1.b;
import android.view.View;
import java.lang.Integer;
import java.lang.Math;
import hd2.l0;
import com.kuaishou.live.core.show.pk.LivePkScoreProgressBar$a;
import android.animation.ValueAnimator;
import com.kuaishou.live.core.show.pk.t;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.show.pk.u;
import android.animation.Animator$AnimatorListener;

public class LivePkScoreProgressBar extends FrameLayout	// class@000d74
{
    public final Paint b;
    public int c;
    public final Paint d;
    public float e;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int[] o;
    public int[] p;
    public ValueAnimator q;
    public LivePkScoreProgressBar$a r;

    public void LivePkScoreProgressBar(Context p0){
       super(p0, null);
    }
    public void LivePkScoreProgressBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePkScoreProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = false;
       this.h = 0;
       this.i = 0;
       this.j = 0;
       Paint paint = new Paint();
       this.b = paint;
       paint.setStyle(Paint$Style.FILL);
       paint = new Paint();
       this.d = paint;
       paint.setStyle(Paint$Style.FILL);
       this.e = this.getResources().getDimension(0x7f0708df);
       this.f = (int)this.getResources().getDimension(0x7f0708e0);
       this.setWillNotDraw(false);
       this.e();
    }
    public final void a(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePkScoreProgressBar.class, "9")) {
          return;
       }
       if (this.i != null) {
          this.c(p0, this.d, this.e, false);
       }
       return;
    }
    public final void b(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePkScoreProgressBar.class, "8")) {
          return;
       }
       if (this.i != null) {
          this.c(p0, this.b, this.e, true);
       }
       return;
    }
    public final void c(Canvas p0,Paint p1,float p2,boolean p3){
       LinearGradient linearGradie;
       LivePkScoreProgressBar livePkScoreP = this;
       Paint paint = p1;
       if (PatchProxy.isSupport(LivePkScoreProgressBar.class) && PatchProxy.applyVoidFourRefs(p0, p1, Float.valueOf(p2), Boolean.valueOf(p3), this, LivePkScoreProgressBar.class, "11")) {
          return;
       }
       if (p3) {
          linearGradie = new LinearGradient(0, 0, (float)livePkScoreP.i, 0, livePkScoreP.o, null, Shader$TileMode.CLAMP);
          paint.setShader(v0);
          p0.drawRect(0, 0, (float)livePkScoreP.i, p2, p1);
       }else {
          linearGradie = new LinearGradient((float)livePkScoreP.i, 0, (float)this.getWidth(), 0, livePkScoreP.p, null, Shader$TileMode.CLAMP);
          paint.setShader(v0);
          if (livePkScoreP.g != null) {
             p0.drawRect((float)livePkScoreP.i, 0, (float)this.getWidth(), p2, p1);
          }else {
             p0.drawRect((float)(this.getWidth() - livePkScoreP.i), 0, (float)this.getWidth(), p2, p1);
          }
       }
       return;
    }
    public boolean d(){
       return this.g;
    }
    public void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePkScoreProgressBar.class, "1")) {
          return;
       }
       int i = 2;
       if (!PatchProxy.applyVoid(objArray, this, LivePkScoreProgressBar.class, "2")) {
          this.k = b.e("live_pk_score_view_self_left_score_color", this.getResources().getColor(0x7f061506), 1);
          this.l = b.e("live_pk_score_view_self_right_score_color", this.getResources().getColor(0x7f061508), 1);
          this.m = b.e("live_pk_score_view_opponent_left_score_color", this.getResources().getColor(0x7f061502), i);
          this.n = b.e("live_pk_score_view_opponent_right_score_color", this.getResources().getColor(0x7f061504), i);
       }
       int[] ointArray = new int[i];
       ointArray[0] = this.k;
       ointArray[1] = this.l;
       this.o = ointArray;
       ointArray = new int[i];
       ointArray[0] = this.m;
       ointArray[1] = this.n;
       this.p = ointArray;
       this.invalidate();
       return;
    }
    public int getMinWidth(){
       return this.f;
    }
    public int getSelfScoreProgress(){
       return this.c;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePkScoreProgressBar.class, "7")) {
          return;
       }
       super.onDraw(p0);
       if (this.c <= 50) {
          this.b(p0);
          this.a(p0);
       }else {
          this.a(p0);
          this.b(p0);
       }
       return;
    }
    public void setLastScoreBarProgress(int p0){
       if (PatchProxy.isSupport(LivePkScoreProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LivePkScoreProgressBar.class, "5")) {
          return;
       }
       this.j = p0;
       this.h = l0.b((int)Math.ceil(((((double)p0 * 0x3ff0000000000000) / 100.00f) * (double)this.getWidth())), this.f, (this.getWidth() - this.f));
       return;
    }
    public void setLivePkScoreProgressBarListener(LivePkScoreProgressBar$a p0){
       this.r = p0;
    }
    public void setProgressBarHeight(int p0){
       this.e = (float)p0;
    }
    public void setSelfScoreProgress(int p0){
       if (PatchProxy.isSupport(LivePkScoreProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LivePkScoreProgressBar.class, "3")) {
          return;
       }
       this.c = p0;
       if (!PatchProxy.isSupport(LivePkScoreProgressBar.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LivePkScoreProgressBar.class, "10")) {
          LivePkScoreProgressBar tq = this.q;
          if (tq != null && tq.isRunning()) {
             this.q.cancel();
             this.q.removeAllUpdateListeners();
             this.q.removeAllListeners();
          }
          p0 = l0.b((int)Math.ceil(((((double)p0 * 0x3ff0000000000000) / 100.00f) * (double)this.getWidth())), this.f, (this.getWidth() - this.f));
          int[] ointArray = new int[]{this.h,p0};
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          this.q = valueAnimato;
          valueAnimato.setDuration(300);
          this.q.addUpdateListener(new t(this));
          this.q.addListener(new u(this));
          this.q.start();
          this.h = p0;
       }
       return;
    }
    public void setSelfScoreProgressWithoutAnimation(int p0){
       if (PatchProxy.isSupport(LivePkScoreProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LivePkScoreProgressBar.class, "4")) {
          return;
       }
       this.c = p0;
       this.g = true;
       this.i = l0.b((int)Math.ceil(((((double)p0 * 0x3ff0000000000000) / 100.00f) * (double)this.getWidth())), this.f, (this.getWidth() - this.f));
       this.invalidate();
       return;
    }
}
