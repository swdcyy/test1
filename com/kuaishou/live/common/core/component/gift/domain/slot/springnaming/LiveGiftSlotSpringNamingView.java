package com.kuaishou.live.common.core.component.gift.domain.slot.springnaming.LiveGiftSlotSpringNamingView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.livestream.message.nano.SCLiveGiftTitleChangeInfo;
import com.kuaishou.live.core.show.gift.GiftMessage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import com.kuaishou.livestream.message.nano.LiveGiftTitleInfo;
import android.animation.ObjectAnimator;
import java.lang.Float;
import java.lang.Integer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.CharSequence;
import android.animation.AnimatorSet;
import android.animation.Animator;
import com.kuaishou.live.common.core.basic.degrade.LiveDegradeBiz;
import com.kuaishou.live.common.core.basic.degrade.j;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.domain.slot.springnaming.LiveGiftSlotSpringNamingView$SpringNamingStyle;
import ck1.a;
import java.io.File;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class LiveGiftSlotSpringNamingView extends LinearLayout	// class@001278
{
    public RelativeLayout b;
    public TextView c;
    public KwaiImageView d;
    public AnimatorSet e;
    public static final int f;

    public void LiveGiftSlotSpringNamingView(Context p0){
       super(p0);
       this.b(p0);
    }
    public void LiveGiftSlotSpringNamingView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b(p0);
    }
    public static boolean c(SCLiveGiftTitleChangeInfo p0,GiftMessage p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveGiftSlotSpringNamingView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = p0.info;
       if (p0 != null && p0.length) {
          if (p1 instanceof LiveGiftToAudienceMessage) {
             return false;
          }else {
             int len = p0.length;
             int i = 0;
             while (i < len) {
                if (p0[i].giftId == p1.mGiftId) {
                   return true;
                }
                i = i + 1;
             }
          }
       }
       return false;
    }
    public final ObjectAnimator a(float p0,float p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveGiftSlotSpringNamingView.class)) {
          Object obj = PatchProxy.applyFourRefs(Float.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveGiftSlotSpringNamingView.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float[] uofloatArray = new float[]{p0,p1};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.b, "alpha", uofloatArray);
       objectAnimat.setDuration((long)p2);
       objectAnimat.setStartDelay((long)p3);
       objectAnimat.setRepeatCount(0);
       objectAnimat.setRepeatMode(1);
       return objectAnimat;
    }
    public final void b(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftSlotSpringNamingView.class, "2")) {
          return;
       }
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d0b44, this);
       this.b = this.findViewById(0x7f0a1d79);
       this.d = this.findViewById(0x7f0a1d78);
       this.c = this.findViewById(0x7f0a1d7a);
       return;
    }
    public void d(SCLiveGiftTitleChangeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftSlotSpringNamingView.class, "4")) {
          return;
       }
       int i = 0;
       this.b.setVisibility(i);
       p0 = p0.info;
       if (p0[i] == null || p0[i].namingUser == null) {
          b.Z(LiveGiftTag.GIFT_SLOT, "[LiveGiftSlotSpringNamingView][showSpringNamingView\(\)][logTraceInfo] SCLiveGiftTitleChangeInfo.info[0].namingUser == null");
          return;
       }else {
          this.c.setText(p0[i].namingUser.userName);
          if (this.e == null && !PatchProxy.applyVoid(null, this, LiveGiftSlotSpringNamingView.class, "5")) {
             AnimatorSet uAnimatorSet = new AnimatorSet();
             this.e = uAnimatorSet;
             uAnimatorSet.setStartDelay(300);
             Animator[] uAnimatorArr = new Animator[]{this.a(0, 0x3f800000, 300, i),this.a(0x3f800000, 0, 300, 2400)};
             this.e.playSequentially(uAnimatorArr);
          }
          this.e.cancel();
          j.g(this.e, LiveDegradeBiz.GiftSlot);
          return;
       }
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveGiftSlotSpringNamingView.class, "1")) {
          return;
       }
       super.onDetachedFromWindow();
       LiveGiftSlotSpringNamingView te = this.e;
       if (te != null) {
          te.end();
          this.e.cancel();
          this.e = null;
       }
       return;
    }
    public void setStyle(LiveGiftSlotSpringNamingView$SpringNamingStyle p0){
       File uFile;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftSlotSpringNamingView.class, "3")) {
          return;
       }
       if (p0 == LiveGiftSlotSpringNamingView$SpringNamingStyle.NormalStyle) {
          uFile = PatchProxy.apply(null, null, a.class, "1");
          if (uFile != patchProxyRe) {
          }else {
             uFile = a.a("live_gift_slot_spring_naming_label.png");
          }
          this.d.v(uFile, 0, 0);
       }else if(p0 == LiveGiftSlotSpringNamingView$SpringNamingStyle.LiteStyle){
          uFile = PatchProxy.apply(null, null, a.class, "2");
          if (uFile != patchProxyRe) {
          }else {
             uFile = a.a("live_gift_slot_spring_naming_label_lite.png");
          }
          this.d.v(uFile, 0, 0);
       }
       return;
    }
}
