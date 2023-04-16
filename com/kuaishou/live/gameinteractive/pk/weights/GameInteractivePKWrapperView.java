package com.kuaishou.live.gameinteractive.pk.weights.GameInteractivePKWrapperView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yxcorp.utility.n;
import com.kuaishou.live.gameinteractive.pk.weights.GameInteractivePKWrapperView$b;
import android.view.ViewOutlineProvider;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.kuaishou.live.gameinteractive.pk.weights.GameInteractivePKWrapperView$c;
import s43.a;
import java.lang.Runnable;
import com.kuaishou.live.core.show.pk.LivePkScoreProgressBar;
import hd2.l0;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.kuaishou.live.common.core.component.pk.LivePkResource$PkSkinResource;
import com.kuaishou.live.common.core.component.pk.b;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.pk.widget.LivePkPeerInfoView;
import java.util.Objects;
import android.animation.ValueAnimator;
import com.kuaishou.live.common.core.component.multipk.widget.LivePkMvpTopScoreUserView;
import java.lang.Long;
import s43.b;
import android.widget.TextView;
import com.kuaishou.live.gameinteractive.pk.weights.GameInteractivePKMvpTopScoreUserView;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import android.graphics.Typeface;
import ekd.d0;
import com.kuaishou.live.gameinteractive.pk.weights.GameInteractivePKWrapperView$a;
import com.kuaishou.live.core.show.pk.LivePkScoreProgressBar$a;
import com.kuaishou.live.common.core.component.multipk.widget.LivePkMvpTopScoreUserItem$a;
import q43.c;
import com.kuaishou.live.core.show.pk.widget.LivePkPeerInfoView$b;
import java.util.Locale;
import java.lang.CharSequence;
import java.lang.Boolean;

public class GameInteractivePKWrapperView extends RelativeLayout	// class@001bf5
{
    public LivePkScoreProgressBar b;
    public LottieAnimationView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public LivePkPeerInfoView g;
    public GameInteractivePKMvpTopScoreUserView h;
    public GameInteractivePKMvpTopScoreUserView i;
    public LivePkShimmerLayout j;
    public RelativeLayout k;
    public RelativeLayout l;
    public FrameLayout m;
    public FrameLayout n;
    public View o;
    public int p;
    public boolean q;
    public boolean r;
    public static final int s;

    public void GameInteractivePKWrapperView(Context p0){
       super(p0, null);
    }
    public void GameInteractivePKWrapperView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void GameInteractivePKWrapperView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.p = 1;
    }
    public void a(int p0){
       RelativeLayout$LayoutParams layoutParams;
       if (PatchProxy.isSupport(GameInteractivePKWrapperView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GameInteractivePKWrapperView.class, "13")) {
          return;
       }
       if (this.p == p0) {
          return;
       }
       this.p = p0;
       float f = 0;
       boolean b = true;
       int i = 8;
       if (p0 == 2) {
          this.o.setVisibility(i);
          this.g.setVisibility(i);
          layoutParams = new RelativeLayout$LayoutParams(-1, -2);
          layoutParams.addRule(10);
          this.n.setLayoutParams(layoutParams);
          this.j.setBackgroundResource(R.drawable.arg_RES_7f080cae);
          layoutParams = new RelativeLayout$LayoutParams(-1, n.c(this.getContext(), 14.00f));
          layoutParams.addRule(3, this.n.getId());
          this.m.setLayoutParams(layoutParams);
          this.b.setClipToOutline(b);
          this.b.setOutlineProvider(new GameInteractivePKWrapperView$b(this));
          layoutParams = new RelativeLayout$LayoutParams(-1, n.c(this.getContext(), 36.00f));
          Context context = this.getContext();
          if (this.r != null) {
             f = 2.00f;
          }
          layoutParams.topMargin = n.c(context, f);
          layoutParams.addRule(3, this.k.getId());
          this.l.setLayoutParams(layoutParams);
          this.l.getBackground().setCornerRadius((float)n.c(this.getContext(), 4.00f));
       }else {
          GameInteractivePKWrapperView to = this.o;
          if (this.q != null) {
             i = 0;
          }
          to.setVisibility(i);
          this.g.setVisibility(0);
          layoutParams = new RelativeLayout$LayoutParams(-1, n.c(this.getContext(), 14.00f));
          layoutParams.addRule(10);
          this.m.setLayoutParams(layoutParams);
          this.b.setClipToOutline(b);
          this.b.setOutlineProvider(new GameInteractivePKWrapperView$c(this));
          layoutParams = new RelativeLayout$LayoutParams(-1, -2);
          layoutParams.addRule(3, this.o.getId());
          this.n.setLayoutParams(layoutParams);
          this.j.setBackgroundResource(R.drawable.arg_RES_7f080cad);
          layoutParams = new RelativeLayout$LayoutParams(-1, n.c(this.getContext(), 36.00f));
          layoutParams.addRule(12);
          this.l.setLayoutParams(layoutParams);
          this.l.getBackground().setCornerRadius(f);
       }
       if (this.r != null) {
          this.postDelayed(new a(this), 0);
       }
       return;
    }
    public void b(int p0){
       if (PatchProxy.isSupport(GameInteractivePKWrapperView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GameInteractivePKWrapperView.class, "3")) {
          return;
       }
       this.c.setTranslationX((float)(l0.b((int)(((float)p0 / 100.00f) * (float)this.b.getWidth()), this.b.getMinWidth(), (this.b.getWidth() - this.b.getMinWidth())) - (this.c.getWidth() / 2)));
       if (!this.c.p()) {
          b.c(this.c, LivePkResource$PkSkinResource.PK_DIVIDERS);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, GameInteractivePKWrapperView.class, "15")) {
          return;
       }
       this.g.a(null);
       this.d();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, GameInteractivePKWrapperView.class, "14")) {
          return;
       }
       int i = 0;
       this.setPKCountDown(i);
       GameInteractivePKWrapperView tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, LivePkScoreProgressBar.class, "6")) {
          tb.g = i;
          LivePkScoreProgressBar q = tb.q;
          if (q != null) {
             q.cancel();
          }
          tb.h = i;
          tb.i = i;
          tb.j = 50;
       }
       this.h.b();
       this.i.b();
       this.m.setVisibility(8);
       this.n.setVisibility(8);
       this.q = i;
       this.r = i;
       if (!PatchProxy.applyVoid(null, this, GameInteractivePKWrapperView.class, "4") && this.c.p()) {
          this.c.f();
       }
       return;
    }
    public void e(long p0,long p1){
       if (PatchProxy.isSupport(GameInteractivePKWrapperView.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, GameInteractivePKWrapperView.class, "2")) {
          return;
       }
       if (this.r == null) {
          return;
       }
       GameInteractivePKWrapperView gameInteract = null;
       if (p0 - gameInteract >= 0 && p1 - gameInteract >= 0) {
          b uob = new b(this, p0, p1);
          this.b.post(v7);
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, GameInteractivePKWrapperView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.b = this.findViewById(0x7f0a106c);
       this.c = this.findViewById(0x7f0a106b);
       this.d = this.findViewById(0x7f0a1062);
       this.e = this.findViewById(0x7f0a106e);
       this.f = this.findViewById(0x7f0a1069);
       this.g = this.findViewById(0x7f0a106a);
       this.h = this.findViewById(0x7f0a1067);
       this.i = this.findViewById(0x7f0a1066);
       this.m = this.findViewById(0x7f0a106d);
       this.n = this.findViewById(0x7f0a1063);
       this.o = this.findViewById(0x7f0a1064);
       this.l = this.findViewById(0x7f0a1068);
       this.j = this.findViewById(0x7f0a1061);
       this.k = this.findViewById(0x7f0a106f);
       this.d.setTypeface(d0.a("alte-din.ttf", this.getContext()));
       this.b.setLivePkScoreProgressBarListener(new GameInteractivePKWrapperView$a(this));
       return;
    }
    public void setMvpTopScoreUserItemClickListener(LivePkMvpTopScoreUserItem$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GameInteractivePKWrapperView.class, "8")) {
          return;
       }
       this.h.setScoreUserItemClickListener(p0);
       this.i.setScoreUserItemClickListener(p0);
       return;
    }
    public void setOpponentStatus(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GameInteractivePKWrapperView.class, "9")) {
          return;
       }
       this.g.setMuteIconVisibility(p0.b);
       return;
    }
    public void setOpponentUserData(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GameInteractivePKWrapperView.class, "7")) {
          return;
       }
       this.g.a(p0);
       return;
    }
    public void setOpponentUserViewClick(LivePkPeerInfoView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GameInteractivePKWrapperView.class, "10")) {
          return;
       }
       this.g.setOnFollowPeerButtonClickListener(p0);
       return;
    }
    public void setPKCountDown(int p0){
       if (PatchProxy.isSupport(GameInteractivePKWrapperView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GameInteractivePKWrapperView.class, "5")) {
          return;
       }
       Object[] objArray = new Object[]{Long.valueOf((long)(p0 / 60)),Long.valueOf((long)(p0 % 60))};
       this.d.setText(String.format(Locale.US, "%02d:%02d", objArray));
       return;
    }
    public void setPKCountDownVisible(boolean p0){
       if (PatchProxy.isSupport(GameInteractivePKWrapperView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GameInteractivePKWrapperView.class, "12")) {
          return;
       }
       this.q = p0;
       GameInteractivePKWrapperView to = this.o;
       int i = 0;
       int i1 = (p0)? 0: 8;
       to.setVisibility(i1);
       to = this.n;
       if (!p0) {
          i = 8;
       }
       to.setVisibility(i);
       return;
    }
    public void setPKScoreViewVisible(boolean p0){
       if (PatchProxy.isSupport(GameInteractivePKWrapperView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GameInteractivePKWrapperView.class, "11")) {
          return;
       }
       this.r = p0;
       GameInteractivePKWrapperView tm = this.m;
       int i = (p0)? 0: 8;
       tm.setVisibility(i);
       return;
    }
}
