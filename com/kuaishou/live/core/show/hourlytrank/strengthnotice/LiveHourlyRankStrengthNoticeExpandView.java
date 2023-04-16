package com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import fa2.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankSuffixCheckImageView;
import android.widget.TextView;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeViewFlipper;
import androidx.constraintlayout.widget.Group;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.f;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.f$a;
import ga2.a;
import fa2.h;
import ga2.f$a;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.c;
import android.view.View$OnClickListener;
import d61.f0;
import fa2.i;
import android.view.ViewOutlineProvider;
import android.os.CountDownTimer;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank;
import java.lang.Integer;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView$a;
import android.animation.Animator;
import va1.l0;
import com.kwai.robust.PatchProxyResult;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.animation.AnimatorSet$Builder;
import fa2.j;
import android.animation.Animator$AnimatorListener;
import th0.d;
import android.animation.TimeInterpolator;
import java.lang.CharSequence;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeBaseFlipperItemView;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandItemView;
import java.lang.Number;
import java.lang.System;
import ta1.a;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView$b;

public class LiveHourlyRankStrengthNoticeExpandView extends ConstraintLayout	// class@000c32
{
    public TextView B;
    public TextView C;
    public LiveHourlyRankStrengthNoticeViewFlipper D;
    public LiveHourlyRankSuffixCheckImageView E;
    public Group F;
    public a G;
    public CountDownTimer H;
    public long I;
    public LiveHourlyRankSuffixCheckImageView J;
    public f K;
    public LiveHourlyRankStrengthNoticeExpandView$b L;
    public boolean M;
    public Animator N;
    public a O;
    public final f$a P;
    public static final int Q;

    public void LiveHourlyRankStrengthNoticeExpandView(Context p0){
       super(p0, null);
    }
    public void LiveHourlyRankStrengthNoticeExpandView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveHourlyRankStrengthNoticeExpandView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.M = true;
       g og = new g(this);
       this.P = og;
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeExpandView.class, "7")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0c2f, this);
          this.J = this.findViewById(0x7f0a203c);
          this.E = this.findViewById(0x7f0a2038);
          this.B = this.findViewById(0x7f0a203b);
          this.C = this.findViewById(0x7f0a203a);
          this.D = this.findViewById(0x7f0a203f);
          this.F = this.findViewById(0x7f0a2039);
          this.K = new f(this.D, og);
          this.O = new a(this, new h(this));
          this.setOnClickListener(new c(this));
          f0.i(this.C, this.getContext());
          if (!PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeExpandView.class, "8")) {
             this.setOutlineProvider(new i(this));
             this.setClipToOutline(true);
          }
       }
       return;
    }
    public final void L(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeExpandView.class, "14")) {
          return;
       }
       LiveHourlyRankStrengthNoticeExpandView tH = this.H;
       if (tH != null) {
          tH.cancel();
       }
       return;
    }
    public void M(int p0,LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank p1){
       AnimatorSet uAnimatorSet;
       if (PatchProxy.isSupport(LiveHourlyRankStrengthNoticeExpandView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, LiveHourlyRankStrengthNoticeExpandView.class, "5")) {
          return;
       }
       int i = 1;
       if (p0 == i) {
          this.F.setVisibility(8);
          this.O.a(p0, p1);
       }else {
          int i1 = 2;
          if (p0 == i1) {
             LiveHourlyRankStrengthNoticeExpandView$a uoa = new LiveHourlyRankStrengthNoticeExpandView$a(this, p1);
             if (!PatchProxy.applyVoidOneRefs(uoa, this, LiveHourlyRankStrengthNoticeExpandView.class, "9")) {
                l0.m(this.N);
                if (PatchProxy.isSupport(LiveHourlyRankStrengthNoticeExpandView.class)) {
                   uAnimatorSet = PatchProxy.applyTwoRefs(Integer.valueOf(i), Integer.valueOf(0), this, LiveHourlyRankStrengthNoticeExpandView.class, "10");
                   if (uAnimatorSet != PatchProxyResult.class) {
                   label_00a0 :
                      this.N = uAnimatorSet;
                      uAnimatorSet.setDuration(500);
                      this.N.setInterpolator(new d());
                      this.N.addListener(uoa);
                      this.N.start();
                   }
                }
                float[] uofloatArray = new float[i1];
                float f = (float)i;
                uofloatArray[0] = f;
                float f1 = (float)0;
                uofloatArray[i] = f1;
                float[] uofloatArray1 = new float[i1];
                uofloatArray1[0] = f;
                uofloatArray1[i] = f1;
                float[] uofloatArray2 = new float[i1];
                uofloatArray2[0] = f;
                uofloatArray2[i] = f1;
                AnimatorSet uAnimatorSet1 = new AnimatorSet();
                uAnimatorSet1.play(j.a(this.B, uofloatArray)).with(j.a(this.C, uofloatArray1)).with(j.a(this.D, uofloatArray2));
                uAnimatorSet1.addListener(new j(this));
                uAnimatorSet = uAnimatorSet1;
                goto label_00a0 ;
             }
          }else {
             this.O.a(p0, p1);
          }
       }
       return;
    }
    public void N(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeExpandView.class, "15")) {
          return;
       }
       this.C.setText("00:000");
       return;
    }
    public String getCurrentItemViewExtraInfo(){
       Object obj = PatchProxy.apply(null, this, LiveHourlyRankStrengthNoticeExpandView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.K.a() instanceof LiveHourlyRankStrengthNoticeExpandItemView) {
          return this.K.a().getExtraInfo();
       }
       return "";
    }
    public final long getServerTimeMs(){
       LiveHourlyRankStrengthNoticeExpandView obj = PatchProxy.apply(null, this, LiveHourlyRankStrengthNoticeExpandView.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.G;
       long l = (obj == null)? System.currentTimeMillis(): obj.s();
       return l;
    }
    public void setNoticeExpandClickListener(LiveHourlyRankStrengthNoticeExpandView$b p0){
       this.L = p0;
    }
}
