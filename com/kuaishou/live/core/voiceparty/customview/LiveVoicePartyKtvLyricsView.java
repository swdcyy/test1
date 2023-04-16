package com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyKtvLyricsView;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.plugin.live.widget.LiveLyricsLineView;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyKtvLyricsView$b;
import com.yxcorp.gifshow.model.Lyrics$Line;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import ekd.m1;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyKtvLyricsCountDownView;
import java.lang.Boolean;
import java.util.Objects;
import android.widget.LinearLayout;
import android.view.animation.AlphaAnimation;
import sr2.f;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;

public class LiveVoicePartyKtvLyricsView extends RelativeLayout implements d	// class@0014b8
{
    public List b;
    public int c;
    public LiveLyricsLineView d;
    public LiveLyricsLineView e;
    public LiveVoicePartyKtvLyricsCountDownView f;
    public boolean g;

    public void LiveVoicePartyKtvLyricsView(Context p0){
       super(p0, null, 0);
    }
    public void LiveVoicePartyKtvLyricsView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveVoicePartyKtvLyricsView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new ArrayList();
       this.c = a1.a(0x7f062094);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyKtvLyricsView.class, "4")) {
       }else {
          this.doBindView(a.c(p0, R.layout.arg_RES_7f0d0e60, this));
          this.d.setHighLightForWordColor(this.c);
          this.e.setHighLightForWordColor(this.c);
       }
       return;
    }
    public final void a(LiveLyricsLineView p0,LiveVoicePartyKtvLyricsView$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyKtvLyricsView.class, "6")) {
          return;
       }
       if (p1.d != null) {
          return;
       }
       p1.d = true;
       p0.setSelected(false);
       p0.p(p1.a);
       p0.setText(TextUtils.k(p1.a.mText));
       return;
    }
    public final int b(int p0){
       if (PatchProxy.isSupport(LiveVoicePartyKtvLyricsView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveVoicePartyKtvLyricsView.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 0;
       while (true) {
          if (i >= this.b.size()) {
             return 0;
          }
          if (p0 >= this.b.get(i).b && p0 <= this.b.get(i).c) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public final LiveLyricsLineView c(int p0){
       if (!(p0 % 2)) {
          return this.d;
       }
       return this.e;
    }
    public final void d(int p0){
       if (PatchProxy.isSupport(LiveVoicePartyKtvLyricsView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveVoicePartyKtvLyricsView.class, "5")) {
          return;
       }
       if (!this.e(p0)) {
          return;
       }
       this.a(this.c(p0), this.b.get(p0));
       this.c(p0).setVisibility(0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyKtvLyricsView.class, "1")) {
          return;
       }
       this.e = m1.f(p0, 0x7f0a37f0);
       this.f = m1.f(p0, 0x7f0a099a);
       this.d = m1.f(p0, 0x7f0a0ebf);
       return;
    }
    public final boolean e(int p0){
       if (PatchProxy.isSupport(LiveVoicePartyKtvLyricsView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveVoicePartyKtvLyricsView.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 1;
       if ((p0 + i) > this.b.size()) {
          i = false;
       }
       return i;
    }
    public final void f(int p0){
       if (PatchProxy.isSupport(LiveVoicePartyKtvLyricsView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveVoicePartyKtvLyricsView.class, "10")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       this.g = true;
       LiveVoicePartyKtvLyricsView tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.isSupport(LiveVoicePartyKtvLyricsCountDownView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tf, LiveVoicePartyKtvLyricsCountDownView.class, "1")) {
          p0--;
          int i = p0;
          while (i >= 0) {
             if (tf.getChildAt(i).getVisibility()) {
                tf.getChildAt(i).setVisibility(0);
             }
             View childAt = tf.getChildAt(i);
             int i1 = p0 - i;
             i1 = i1 * 1000;
             if (!PatchProxy.isSupport(LiveVoicePartyKtvLyricsCountDownView.class) || !PatchProxy.applyVoidTwoRefs(childAt, Integer.valueOf(i1), tf, LiveVoicePartyKtvLyricsCountDownView.class, "6")) {
                AlphaAnimation uAlphaAnimat = new AlphaAnimation(0x3f800000, 0);
                uAlphaAnimat.setStartOffset((long)i1);
                uAlphaAnimat.setDuration(320);
                uAlphaAnimat.setAnimationListener(new f(tf, childAt));
                childAt.startAnimation(uAlphaAnimat);
             }
             i = i - 1;
          }
       }
       return;
    }
    public final int getFirstLineStartTime(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartyKtvLyricsView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.b.isEmpty()) {
          return 0;
       }
       return this.b.get(0).b;
    }
}
