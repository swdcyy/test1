package com.kuaishou.live.core.voiceparty.playway.shared.widget.VoicePartyHatView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.animation.Animator;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.ImageView;
import av2.c;
import android.os.Looper;
import java.lang.Runnable;
import java.lang.Integer;

public class VoicePartyHatView extends KwaiImageView	// class@0018a1
{
    public AnimatorSet A;
    public ObjectAnimator B;
    public final int C;
    public CDNUrl[] D;
    public Uri E;
    public boolean x;
    public AnimatorSet y;
    public ObjectAnimator z;

    public void VoicePartyHatView(Context p0){
       super(p0);
       this.C = 500;
       this.p0();
    }
    public void VoicePartyHatView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.C = 500;
       this.p0();
    }
    public final void p0(){
       if (PatchProxy.applyVoid(null, this, VoicePartyHatView.class, "1")) {
          return;
       }
       this.y = new AnimatorSet();
       this.z = ObjectAnimator.ofFloat(this, "scaleX", new float[2]{0x3f800000,0});
       this.y.setDuration(500);
       Animator[] uAnimatorArr = new Animator[]{this.z,ObjectAnimator.ofFloat(this, "scaleY", new float[2]{0x3f800000,0}),j.a(this, new float[2]{0x3f800000,0})};
       this.y.playTogether(uAnimatorArr);
       this.A = new AnimatorSet();
       this.B = ObjectAnimator.ofFloat(this, "scaleX", new float[2]{0,0x3f800000});
       this.A.setDuration(500);
       Animator[] uAnimatorArr1 = new Animator[]{this.B,ObjectAnimator.ofFloat(this, "scaleY", new float[2]{0,0x3f800000}),j.a(this, new float[2]{0,0x3f800000})};
       this.A.playTogether(uAnimatorArr1);
       return;
    }
    public boolean q0(CDNUrl[] p0,CDNUrl[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, VoicePartyHatView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null && p1 == null) {
          return false;
       }
       if (p0 == null) {
          return false;
       }
       if (p1 == null) {
          return false;
       }
       if (p0.length != p1.length) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= p0.length) {
             return true;
          }
          object oobject = p1[i];
          CDNUrl mUrl = p0[i].mUrl;
          if (mUrl == null) {
             break ;
          }else if(!mUrl.equals(oobject.mUrl)){
             return false;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public void r0(){
       if (PatchProxy.applyVoid(null, this, VoicePartyHatView.class, "7")) {
          return;
       }
       this.setScaleX(0x3f800000);
       this.setScaleY(0x3f800000);
       this.setAlpha(0x3f800000);
       this.B.removeAllListeners();
       this.A.cancel();
       this.z.removeAllListeners();
       this.y.cancel();
       this.x = false;
       return;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, VoicePartyHatView.class, "5")) {
          return;
       }
       c uoc = new c(this);
       if (Looper.getMainLooper() == Looper.myLooper()) {
          uoc.run();
       }else {
          this.post(uoc);
       }
       return;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(VoicePartyHatView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VoicePartyHatView.class, "6")) {
          return;
       }
       super.setVisibility(p0);
       if (p0 == 8) {
          this.r0();
       }
       return;
    }
}
