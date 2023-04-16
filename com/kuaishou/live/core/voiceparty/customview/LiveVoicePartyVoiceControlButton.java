package com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyVoiceControlButton;
import android.view.View$OnClickListener;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import android.content.Context;
import android.util.AttributeSet;
import sr2.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import android.widget.ImageView;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyVoiceControlButton$VoiceState;
import w32.f;
import java.lang.Boolean;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import d61.c0;
import android.view.View;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyVoiceControlButton$b;
import com.airbnb.lottie.LottieAnimationView;

public class LiveVoicePartyVoiceControlButton extends LiveLottieAnimationView implements View$OnClickListener	// class@0014bc
{
    public Drawable A;
    public String B;
    public boolean C;
    public boolean D;
    public final Runnable E;
    public Drawable F;
    public LiveVoicePartyVoiceControlButton$VoiceState u;
    public LiveVoicePartyVoiceControlButton$b v;
    public Drawable w;
    public Drawable x;
    public Drawable y;
    public Drawable z;
    public static final int G;

    public void LiveVoicePartyVoiceControlButton(Context p0){
       super(p0, null);
    }
    public void LiveVoicePartyVoiceControlButton(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveVoicePartyVoiceControlButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.C = false;
       this.D = true;
       this.E = new g(this);
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyVoiceControlButton.class, "7")) {
          return;
       }
       this.D = true;
       this.I();
       return;
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyVoiceControlButton.class, "6")) {
          return;
       }
       this.D = false;
       this.I();
       return;
    }
    public final void I(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyVoiceControlButton.class, "9")) {
          return;
       }
       this.removeCallbacks(this.E);
       this.post(this.E);
       return;
    }
    public void J(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyVoiceControlButton.class, "4")) {
          return;
       }
       this.u = LiveVoicePartyVoiceControlButton$VoiceState.Mute;
       this.I();
       return;
    }
    public void K(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyVoiceControlButton.class, "3")) {
          return;
       }
       this.u = LiveVoicePartyVoiceControlButton$VoiceState.Ready;
       this.I();
       return;
    }
    public void L(boolean p0,f p1){
       if (PatchProxy.isSupport(LiveVoicePartyVoiceControlButton.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), null, this, LiveVoicePartyVoiceControlButton.class, "1")) {
          return;
       }
       if (!p0) {
          this.w = this.getResources().getDrawable(0x7f081386);
          this.x = this.getResources().getDrawable(0x7f081301);
          this.y = this.getResources().getDrawable(0x7f0812fb);
          this.z = this.getResources().getDrawable(0x7f0812d2);
          this.B = c0.a.b("udata/pkg/kwai-client-image/chat_room/live_voice_party_audience_speak_icon.json");
          if (!PatchProxy.applyVoid(null, this, LiveVoicePartyVoiceControlButton.class, "2")) {
             this.setOnClickListener(this);
             this.K();
          }
          return;
       }else {
          this.getResources();
          throw null;
       }
    }
    public LiveVoicePartyVoiceControlButton$VoiceState getState(){
       return this.u;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyVoiceControlButton.class, "10")) {
          return;
       }
       LiveVoicePartyVoiceControlButton tv = this.v;
       if (tv != null) {
          LiveVoicePartyVoiceControlButton tu = this.u;
          if (tu != null && this.D != null) {
             tv.a(this, tu);
          }
       }
       return;
    }
    public void setImageDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyVoiceControlButton.class, "8")) {
          return;
       }
       if (p0 != this.F) {
          this.F = p0;
          super.setImageDrawable(p0);
       }
       return;
    }
    public void setOnVoiceControlButtonClickListener(LiveVoicePartyVoiceControlButton$b p0){
       this.v = p0;
    }
    public void setSpeaking(boolean p0){
       if (PatchProxy.isSupport(LiveVoicePartyVoiceControlButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveVoicePartyVoiceControlButton.class, "5")) {
          return;
       }
       this.C = p0;
       if (this.D != null && this.u == LiveVoicePartyVoiceControlButton$VoiceState.Ready) {
          if (p0) {
             if (!this.p()) {
                LiveVoicePartyVoiceControlButton tA = this.A;
                if (tA != null) {
                   this.setBackground(tA);
                }
                this.setAnimationFromUrl(this.B);
                this.setRepeatCount(-1);
                this.s();
             }
          }else {
             this.f();
             this.setBackground(null);
             this.I();
          }
       }
       return;
    }
}
