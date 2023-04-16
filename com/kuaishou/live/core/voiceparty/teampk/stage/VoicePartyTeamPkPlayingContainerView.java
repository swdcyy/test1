package com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPlayingContainerView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkScoreView;
import java.lang.CharSequence;
import android.widget.TextView;
import vv2.g;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkTopScoreUserView;
import crd.b;
import lnc.b9;
import java.lang.Long;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkCountDownTextView;
import java.util.concurrent.TimeUnit;
import brd.t;
import aw2.g;
import erd.o;
import t45.d;
import brd.z;
import aw2.f;
import com.kuaishou.live.core.voiceparty.teampk.stage.a;
import erd.g;
import com.kuaishou.livestream.message.nano.TeamStatisticInfo;
import com.kuaishou.livestream.message.nano.TeamPkTopUser;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType;
import android.animation.ObjectAnimator;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import aw2.d;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkTopScoreUserItemView$a;
import aw2.e;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPlayingContainerView$a;
import java.lang.Integer;

public class VoicePartyTeamPkPlayingContainerView extends RelativeLayout	// class@001938
{
    public VoicePartyTeamPkScoreView b;
    public VoicePartyTeamPkCountDownTextView c;
    public VoicePartyTeamPkTopScoreUserView d;
    public VoicePartyTeamPkTopScoreUserView e;
    public LivePkShimmerLayout f;
    public boolean g;
    public VoicePartyTeamPkPlayingContainerView$a h;
    public b i;
    public boolean j;
    public static final int k;

    public void VoicePartyTeamPkPlayingContainerView(Context p0){
       super(p0, null);
    }
    public void VoicePartyTeamPkPlayingContainerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VoicePartyTeamPkPlayingContainerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.d6, p2, 0);
       this.g = typedArray.getBoolean(0, 0);
       this.j = typedArray.getBoolean(1, 0);
       typedArray.recycle();
       a.c(p0, R.layout.arg_RES_7f0d16dc, this);
    }
    public final void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyTeamPkPlayingContainerView.class, "5")) {
          return;
       }
       VoicePartyTeamPkPlayingContainerView tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, VoicePartyTeamPkScoreView.class, "7")) {
          VoicePartyTeamPkScoreView b = tb.b;
          int i = 0;
          if (b != null) {
             b.setText(String.valueOf(i));
          }
          b = tb.c;
          if (b != null) {
             b.setText(String.valueOf(i));
          }
          b = tb.j;
          if (b != null) {
             b.b();
          }
          tb.b(0, 0);
          tb.d();
       }
       this.d.a();
       this.e.a();
       b9.a(this.i);
       return;
    }
    public void b(long p0,boolean p1){
       if (PatchProxy.isSupport(VoicePartyTeamPkPlayingContainerView.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Boolean.valueOf(p1), this, VoicePartyTeamPkPlayingContainerView.class, "2")) {
          return;
       }
       b9.a(this.i);
       this.c.r(p0, p1);
       this.i = t.interval(1, TimeUnit.SECONDS).take(p0).map(new g(p0)).observeOn(d.a).subscribe(new f(this, p1), a.b);
       return;
    }
    public void c(TeamStatisticInfo p0,TeamStatisticInfo p1){
       TeamStatisticInfo score;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTeamPkPlayingContainerView.class, str)) {
          return;
       }
       TeamStatisticInfo teamStatisti = null;
       if (p0 != null) {
          this.d.setTopScoreUserData(p0.topUser);
          score = p0.score;
       }else {
          score = teamStatisti;
       }
       if (p1 != null) {
          this.e.setTopScoreUserData(p1.topUser);
          teamStatisti = p1.score;
       }
       this.b.b(score, teamStatisti);
       if (this.g != null) {
          VoicePartyTeamPkPlayingContainerView tb = this.b;
          Objects.requireNonNull(tb);
          g og = g.class;
          if (!PatchProxy.isSupport(VoicePartyTeamPkScoreView.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(score), Long.valueOf(teamStatisti), tb, VoicePartyTeamPkScoreView.class, "5")) {
             if (tb.j == null) {
                tb.j = new g();
             }
             VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType voicePartySc = tb.a(tb.g, score);
             VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType nONE = VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType.NONE;
             if (voicePartySc != nONE) {
                VoicePartyTeamPkScoreView j = tb.j;
                VoicePartyTeamPkScoreView b = tb.b;
                Objects.requireNonNull(j);
                if (!PatchProxy.applyVoidTwoRefs(b, voicePartySc, j, og, str)) {
                   j.c();
                   ObjectAnimator objectAnimat1 = j.d(b, voicePartySc);
                   j.a = objectAnimat1;
                   objectAnimat1.start();
                }
             }
             voicePartySc = tb.a(tb.h, teamStatisti);
             if (voicePartySc != nONE) {
                VoicePartyTeamPkScoreView j1 = tb.j;
                VoicePartyTeamPkScoreView c = tb.c;
                Objects.requireNonNull(j1);
                if (!PatchProxy.applyVoidTwoRefs(c, voicePartySc, j1, og, "2")) {
                   j1.a();
                   ObjectAnimator objectAnimat = j1.d(c, voicePartySc);
                   j1.b = objectAnimat;
                   objectAnimat.start();
                }
             }
             tb.g = score;
             tb.h = teamStatisti;
          }
       }
       return;
    }
    public View getCountDownView(){
       return this.c;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTeamPkPlayingContainerView.class, "8")) {
          return;
       }
       super.onDetachedFromWindow();
       this.a();
       return;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyTeamPkPlayingContainerView.class, "6")) {
          return;
       }
       super.onFinishInflate();
       if (!PatchProxy.applyVoid(objArray, this, VoicePartyTeamPkPlayingContainerView.class, "9")) {
          this.b = this.findViewById(0x7f0a44f7);
          this.c = this.findViewById(0x7f0a44f1);
          this.e = this.findViewById(0x7f0a44ec);
          this.d = this.findViewById(0x7f0a4506);
          this.f = this.findViewById(0x7f0a44f0);
          this.e.setScoreUserItemClickListener(new d(this));
          this.d.setScoreUserItemClickListener(new e(this));
       }
       return;
    }
    public void setOnTopScoreUserClickListener(VoicePartyTeamPkPlayingContainerView$a p0){
       this.h = p0;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(VoicePartyTeamPkPlayingContainerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VoicePartyTeamPkPlayingContainerView.class, "7")) {
          return;
       }
       if (p0 == this.getVisibility()) {
          return;
       }
       if (p0) {
          this.a();
       }
       super.setVisibility(p0);
       return;
    }
}
