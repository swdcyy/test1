package com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantView;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.FlattenLyricView$EmptyLyricsStyle;
import com.yxcorp.gifshow.widget.FlattenLyricView;
import com.yxcorp.gifshow.model.Lyrics;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantView$b;
import android.view.animation.Animation$AnimationListener;
import android.widget.ScrollView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import ekd.m1;
import com.kuaishou.live.core.show.music.audiencelyrics.LivePendantLyricsView;
import android.view.ViewGroup;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Float;
import java.lang.Integer;
import android.graphics.RectF;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantView$a;
import java.lang.Long;
import java.util.Objects;
import java.lang.Number;
import java.util.List;
import android.animation.ValueAnimator;
import com.kwai.feature.api.live.musicstation.MusicStationLyricsLineView;
import android.widget.TextView;
import android.view.MotionEvent;
import java.lang.Math;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantView$c;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class LiveAudienceLyricsPendantView extends RelativeLayout implements d	// class@000d3a
{
    public RectF b;
    public Rect c;
    public int d;
    public int e;
    public int f;
    public int g;
    public ViewGroup h;
    public View i;
    public KwaiImageView j;
    public LivePendantLyricsView k;
    public LiveAudienceLyricsPendantView$c l;
    public ObjectAnimator m;

    public void LiveAudienceLyricsPendantView(Context p0){
       super(p0, null);
    }
    public void LiveAudienceLyricsPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAudienceLyricsPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = new Rect();
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = 0;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLyricsPendantView.class, "7")) {
          return;
       }
       this.k.k(p0, FlattenLyricView$EmptyLyricsStyle.AudiencePendantStyle);
       return;
    }
    public void b(Lyrics p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLyricsPendantView.class, "4")) {
          return;
       }
       this.k.h(p0, p0.mDuration);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceLyricsPendantView.class, "15")) {
          return;
       }
       Animation uAnimation = AnimationUtils.loadAnimation(this.getContext(), R.anim.arg_RES_7f01004c);
       uAnimation.setFillAfter(false);
       uAnimation.setAnimationListener(new LiveAudienceLyricsPendantView$b(this));
       this.k.startAnimation(uAnimation);
       return;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceLyricsPendantView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.k.getVisibility())? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLyricsPendantView.class, "1")) {
          return;
       }
       this.i = m1.f(p0, 0x7f0a197b);
       this.k = m1.f(p0, 0x7f0a19cc);
       this.h = m1.f(p0, 0x7f0a197d);
       this.j = m1.f(p0, 0x7f0a197c);
       return;
    }
    public void e(float p0,int p1,float p2,int p3){
       RectF left;
       int paddingLeft;
       RectF top;
       if (PatchProxy.isSupport(LiveAudienceLyricsPendantView.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), Integer.valueOf(p3), this, LiveAudienceLyricsPendantView.class, "13")) {
          return;
       }
       float f = (float)p1 + p0;
       float f1 = (float)p3 + p2;
       if (f - (this.b.left - (float)this.h.getPaddingLeft()) < 0) {
          left = this.b.left;
          paddingLeft = this.h.getPaddingLeft();
       }else if(f - ((this.b.right - (float)this.h.getPaddingRight()) - (float)this.i.getWidth()) > 0){
          left = this.b.right - (float)this.h.getPaddingRight();
          paddingLeft = this.i.getWidth();
       }else if(f1 - (this.b.top - (float)this.h.getPaddingTop()) < 0){
          top = this.b.top;
          paddingLeft = this.h.getPaddingTop();
       }else if(f1 - ((this.b.bottom - (float)this.h.getPaddingBottom()) - (float)this.h.getHeight()) > 0){
          top = this.b.bottom - (float)this.h.getPaddingBottom();
          paddingLeft = this.h.getHeight();
       }else {
       label_00b8 :
          AnimatorSet uAnimatorSet = new AnimatorSet().setDuration(0);
          float[] uofloatArray = new float[]{p0,f};
          float[] uofloatArray1 = new float[]{p2,f1};
          uAnimatorSet.play(ObjectAnimator.ofFloat(this.h, "x", uofloatArray)).with(ObjectAnimator.ofFloat(this.h, "y", uofloatArray1));
          uAnimatorSet.start();
          return;
       }
       f1 = top - (float)paddingLeft;
       goto label_00b8 ;
       f = left - (float)paddingLeft;
       goto label_0070 ;
    }
    public void f(){
    }
    public void g(boolean p0,boolean p1){
       if (PatchProxy.isSupport(LiveAudienceLyricsPendantView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, LiveAudienceLyricsPendantView.class, "5")) {
          return;
       }
       LiveAudienceLyricsPendantView tk = this.k;
       int i = (p0)? 0: 8;
       tk.setVisibility(i);
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceLyricsPendantView.class, "14")) {
          return;
       }
       Animation uAnimation = AnimationUtils.loadAnimation(this.getContext(), R.anim.arg_RES_7f01004a);
       uAnimation.setFillAfter(false);
       uAnimation.setAnimationListener(new LiveAudienceLyricsPendantView$a(this));
       this.k.startAnimation(uAnimation);
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceLyricsPendantView.class, "10")) {
          return;
       }
       LiveAudienceLyricsPendantView tm = this.m;
       if (tm != null && tm.isRunning()) {
          this.m.cancel();
       }
       return;
    }
    public void j(long p0){
       LivePendantLyricsView p;
       boolean b1;
       String str = "8";
       if (PatchProxy.isSupport(LiveAudienceLyricsPendantView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveAudienceLyricsPendantView.class, str)) {
          return;
       }
       LiveAudienceLyricsPendantView tk = this.k;
       int i = (int)p0;
       int i1 = 0;
       int b = (p0 - (long)tk.getCurrentPosition() < 0)? true: false;
       Objects.requireNonNull(tk);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(LivePendantLyricsView.class)) {
          Boolean tRUE = Boolean.TRUE;
          if (!PatchProxy.applyVoidFourRefs(Integer.valueOf(i), tRUE, Boolean.valueOf(b), tRUE, tk, LivePendantLyricsView.class, "7")) {
          label_004d :
             if (tk.N == null) {
                p = tk.P;
                if (p < 5) {
                   tk.P = p + 1;
                }
             }
             tk.L = i;
             if (PatchProxy.isSupport(LivePendantLyricsView.class)) {
                Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(i), Boolean.valueOf(b), tk, LivePendantLyricsView.class, "15");
                if (obj != patchProxyRe) {
                   b = obj.intValue();
                }else if(b){
                   p = null;
                }else {
                   p = tk.M;
                }
                b = (b)? 0: tk.M;
                while (true) {
                   if (b < tk.y.size()) {
                      if (i < tk.y.get(b).intValue() || i >= tk.z.get(b).intValue()) {
                         b++;
                      }
                   }else {
                      LivePendantLyricsView livePendantL = p;
                   }
                }
             }else {
                goto label_007e ;
             }
             if (b != tk.M || tk.N == null) {
                tk.D(b, 1);
                tk.B(b);
                tk.M = b;
                tk.N = true;
                tk.P = i1;
             }else if(PatchProxy.isSupport(LivePendantLyricsView.class)){
                Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(b), tk, LivePendantLyricsView.class, str);
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                label_00ed :
                   if (b1) {
                      tk.D(b, 1);
                   }
                }
             }
             LivePendantLyricsView o = tk.O;
             if (o == null || (!o.isRunning() && tk.A(b) != tk.getScrollY())) {
                i1 = 1;
             }
             b1 = i1;
             goto label_00ed ;
             MusicStationLyricsLineView currentLineV = tk.getCurrentLineView();
             if (currentLineV != null && (!PatchProxy.isSupport(MusicStationLyricsLineView.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i), currentLineV, MusicStationLyricsLineView.class, "7") && (currentLineV.isSelected() && currentLineV.o == null)))) {
                currentLineV.q = i;
                currentLineV.invalidate();
             }
          }
       }else {
          goto label_004d ;
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceLyricsPendantView.class, "3")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveAudienceLyricsPendantView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveAudienceLyricsPendantView.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.i.getHitRect(this.c);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       LiveAudienceLyricsPendantView obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceLyricsPendantView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       boolean b = true;
       if (action) {
          if (action != b) {
             if (action == 2) {
                this.e(this.h.getX(), ((int)p0.getRawX() - this.d), this.h.getY(), ((int)p0.getRawY() - this.e));
                this.d = (int)p0.getRawX();
                this.e = (int)p0.getRawY();
                this.h.requestDisallowInterceptTouchEvent(b);
                return b;
             }
          }else if(this.c.contains((int)p0.getX(), (int)p0.getY())){
             obj = 5;
             if (Math.abs((this.f - this.d)) < obj && Math.abs((this.g - this.e)) < obj) {
                LiveAudienceLyricsPendantView tl = this.l;
                if (tl != null) {
                   tl.a(this.i);
                }
             }
          }
          this.f();
          return false;
       }else {
          this.d = (int)p0.getRawX();
          int i = (int)p0.getRawY();
          this.e = i;
          this.f = this.d;
          this.g = i;
          this.h.requestDisallowInterceptTouchEvent(b);
          return b;
       }
    }
    public void setDiskCover(UserInfos$PicUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLyricsPendantView.class, "11")) {
          return;
       }
       this.j.U(e0.i(p0));
       return;
    }
    public void setLyricsPendantListener(LiveAudienceLyricsPendantView$c p0){
       this.l = p0;
    }
    public void setSlideRange(RectF p0){
       this.b = p0;
    }
}
