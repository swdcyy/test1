package com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkScoreProgressBar;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkScoreProgressBar$a;
import android.view.GestureDetector$OnGestureListener;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.content.res.Resources;
import iu1.a;
import android.view.View$OnTouchListener;
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
import android.view.View;
import java.lang.Integer;
import f61.b;
import ht1.a;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkScoreProgressBar$b;
import android.animation.ValueAnimator;
import java.lang.Math;
import d61.v;
import com.kuaishou.live.common.core.component.multipk.render.view.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.multipk.render.view.b;
import android.animation.Animator$AnimatorListener;

public class LiveMultiPkScoreProgressBar extends FrameLayout	// class@00167d
{
    public final Paint b;
    public int c;
    public final Paint d;
    public final float e;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int[] l;
    public int[] m;
    public ValueAnimator n;
    public LiveMultiPkScoreProgressBar$b o;
    public final GestureDetector p;

    public void LiveMultiPkScoreProgressBar(Context p0){
       super(p0, null);
    }
    public void LiveMultiPkScoreProgressBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveMultiPkScoreProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = false;
       this.h = 0;
       this.i = 0;
       this.j = 0;
       this.p = new GestureDetector(this.getContext(), new LiveMultiPkScoreProgressBar$a(this));
       Paint paint = new Paint();
       this.b = paint;
       paint.setStyle(Paint$Style.FILL);
       paint = new Paint();
       this.d = paint;
       paint.setStyle(Paint$Style.FILL);
       this.e = this.getResources().getDimension(0x7f07085a);
       this.f = (int)this.getResources().getDimension(0x7f0708e0);
       this.setWillNotDraw(false);
       this.setOnTouchListener(new a(this));
    }
    public final void a(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkScoreProgressBar.class, "9")) {
          return;
       }
       if (this.i != null) {
          this.c(p0, this.d, this.e, false);
       }
       return;
    }
    public final void b(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkScoreProgressBar.class, "8")) {
          return;
       }
       if (this.i != null) {
          this.c(p0, this.b, this.e, true);
       }
       return;
    }
    public final void c(Canvas p0,Paint p1,float p2,boolean p3){
       LinearGradient linearGradie;
       LiveMultiPkScoreProgressBar liveMultiPkS = this;
       Paint paint = p1;
       if (PatchProxy.isSupport(LiveMultiPkScoreProgressBar.class) && PatchProxy.applyVoidFourRefs(p0, p1, Float.valueOf(p2), Boolean.valueOf(p3), this, LiveMultiPkScoreProgressBar.class, "11")) {
          return;
       }
       if (p3) {
          linearGradie = new LinearGradient(0, 0, (float)liveMultiPkS.i, 0, liveMultiPkS.l, null, Shader$TileMode.CLAMP);
          paint.setShader(v0);
          p0.drawRect(0, 0, (float)liveMultiPkS.i, p2, p1);
       }else {
          linearGradie = new LinearGradient((float)liveMultiPkS.i, 0, (float)this.getWidth(), 0, liveMultiPkS.m, null, Shader$TileMode.CLAMP);
          paint.setShader(v0);
          if (liveMultiPkS.g != null) {
             p0.drawRect((float)liveMultiPkS.i, 0, (float)this.getWidth(), p2, p1);
          }else {
             p0.drawRect((float)(this.getWidth() - liveMultiPkS.i), 0, (float)this.getWidth(), p2, p1);
          }
       }
       return;
    }
    public int getMinWidth(){
       return this.f;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkScoreProgressBar.class, "7")) {
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
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveMultiPkScoreProgressBar.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveMultiPkScoreProgressBar.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (b.a() && p0) {
          p3 = p3 - p1;
          if (p3 > 0 && this.k != p3) {
             this.k = p3;
             LiveMultiPkScoreProgressBar tc = this.c;
             if (tc != null) {
                this.setSelfScoreProgress(tc);
             }
          }
       }
       return;
    }
    public final void setDefaultProgressBarColor(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkScoreProgressBar.class, "2")) {
          return;
       }
       int[] ointArray = new int[]{p0.f("live_pk_score_view_self_left_score_color", this.getResources().getColor(0x7f061506)),p0.f("live_pk_score_view_self_right_score_color", this.getResources().getColor(0x7f061508))};
       this.l = ointArray;
       int[] ointArray1 = new int[]{p0.f("live_pk_score_view_opponent_left_score_color", this.getResources().getColor(0x7f061502)),p0.f("live_pk_score_view_opponent_right_score_color", this.getResources().getColor(0x7f061504))};
       this.m = ointArray1;
       return;
    }
    public void setLivePkScoreProgressBarListener(LiveMultiPkScoreProgressBar$b p0){
       this.o = p0;
    }
    public void setMinWidth(int p0){
       this.f = p0;
    }
    public void setSelfScoreProgress(int p0){
       if (PatchProxy.isSupport(LiveMultiPkScoreProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveMultiPkScoreProgressBar.class, "5")) {
          return;
       }
       this.c = p0;
       if (!PatchProxy.isSupport(LiveMultiPkScoreProgressBar.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveMultiPkScoreProgressBar.class, "10")) {
          LiveMultiPkScoreProgressBar tn = this.n;
          if (tn != null && tn.isRunning()) {
             this.n.cancel();
             this.n.removeAllUpdateListeners();
             this.n.removeAllListeners();
          }
          p0 = v.b((int)Math.ceil(((((double)p0 * 0x3ff0000000000000) / 100.00f) * (double)this.getWidth())), this.f, (this.getWidth() - this.f));
          int[] ointArray = new int[]{this.h,p0};
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          this.n = valueAnimato;
          valueAnimato.setDuration(300);
          this.n.addUpdateListener(new a(this));
          this.n.addListener(new b(this));
          this.n.start();
          this.h = p0;
       }
       return;
    }
}
