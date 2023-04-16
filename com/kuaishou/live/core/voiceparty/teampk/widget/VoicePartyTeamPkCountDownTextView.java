package com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkCountDownTextView;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import d61.f0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.animation.ValueAnimator;
import java.lang.Long;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkCountDownTextView$CountDownType;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkCountDownTextView$a;
import java.lang.Enum;
import z12.x;
import java.util.Locale;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import java.lang.Math;
import th0.f;
import android.animation.TimeInterpolator;
import cw2.a;
import android.animation.Animator$AnimatorListener;
import java.lang.Integer;

public class VoicePartyTeamPkCountDownTextView extends LiveMediumTextView	// class@001941
{
    public ValueAnimator g;
    public static final int h;
    public static final int i;

    static {
       VoicePartyTeamPkCountDownTextView.h = a1.e(106.00f);
       VoicePartyTeamPkCountDownTextView.i = a1.e(66.00f);
    }
    public void VoicePartyTeamPkCountDownTextView(Context p0){
       super(p0, null, 0);
    }
    public void VoicePartyTeamPkCountDownTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VoicePartyTeamPkCountDownTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       f0.i(this, this.getContext());
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTeamPkCountDownTextView.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       this.release();
       return;
    }
    public final void q(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTeamPkCountDownTextView.class, "3")) {
          return;
       }
       VoicePartyTeamPkCountDownTextView tg = this.g;
       if (tg != null) {
          tg.removeAllListeners();
          if (this.g.isRunning()) {
             this.g.end();
          }
          this.setScaleX(0x3f800000);
          this.setScaleY(0x3f800000);
       }
       return;
    }
    public void r(long p0,boolean p1){
       VoicePartyTeamPkCountDownTextView$CountDownType pUNISH;
       String str;
       if (PatchProxy.isSupport(VoicePartyTeamPkCountDownTextView.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Boolean.valueOf(p1), this, VoicePartyTeamPkCountDownTextView.class, "1")) {
          return;
       }
       if (p1) {
          pUNISH = VoicePartyTeamPkCountDownTextView$CountDownType.PUNISH;
       }else if(p0 - 10 <= 0){
          pUNISH = VoicePartyTeamPkCountDownTextView$CountDownType.REMINDER;
       }else {
          pUNISH = VoicePartyTeamPkCountDownTextView$CountDownType.PKING;
       }
       int i = 2;
       if (PatchProxy.isSupport(VoicePartyTeamPkCountDownTextView.class)) {
          str = PatchProxy.applyTwoRefs(Long.valueOf(p0), pUNISH, this, VoicePartyTeamPkCountDownTextView.class, "6");
          if (str != PatchProxyResult.class) {
          }else {
          label_004b :
             int i1 = VoicePartyTeamPkCountDownTextView$a.a[pUNISH.ordinal()];
             if (i1 != 1) {
                if (i1 != i) {
                   str = x.g((p0 * 1000));
                }else {
                   long l = 0;
                   if (p0 - l <= 0) {
                      str = x.g(l);
                   }else {
                      Object[] objArray = new Object[]{Long.valueOf(p0)};
                      str = String.format(Locale.US, "%02d", objArray);
                   }
                }
             }else {
                str = a1.p(0x7f10512b)+" "+x.g((p0 * 1000));
             }
          }
       }else {
          goto label_004b ;
       }
       this.setText(str);
       if (this.getTag() != null && this.getTag() == pUNISH) {
          return;
       }else {
          this.setTag(pUNISH);
          VoicePartyTeamPkCountDownTextView$CountDownType pUNISH1 = VoicePartyTeamPkCountDownTextView$CountDownType.PUNISH;
          int h = (pUNISH == pUNISH1)? VoicePartyTeamPkCountDownTextView.h: VoicePartyTeamPkCountDownTextView.i;
          this.setWidth(h);
          float f = (pUNISH == pUNISH1)? 12.00f: 14.00f;
          this.setTextSize(f);
          if (pUNISH == VoicePartyTeamPkCountDownTextView$CountDownType.REMINDER) {
             if (!PatchProxy.isSupport(VoicePartyTeamPkCountDownTextView.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, VoicePartyTeamPkCountDownTextView.class, "2")) {
                VoicePartyTeamPkCountDownTextView tg = this.g;
                if (tg == null || !tg.isStarted()) {
                   PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i];
                   propertyValu[0] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[i]{0x40800000,0x3fc00000});
                   propertyValu[1] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[i]{0x40800000,0x3fc00000});
                   ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this, propertyValu).setDuration(1000);
                   this.g = objectAnimat;
                   objectAnimat.setRepeatCount(Math.max(0, (int)(p0 - 1)));
                   this.g.setInterpolator(new f(0x3f800000, 0x3f19999a));
                   this.g.addListener(new a(this));
                   this.g.start();
                }
             }
          }else {
             this.q();
          }
          return;
       }
    }
    public final void release(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTeamPkCountDownTextView.class, "7")) {
          return;
       }
       this.q();
       this.setTag(null);
       return;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(VoicePartyTeamPkCountDownTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VoicePartyTeamPkCountDownTextView.class, "5")) {
          return;
       }
       super.setVisibility(p0);
       if (p0) {
          this.release();
       }
       return;
    }
}
