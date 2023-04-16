package com.kuaishou.live.core.show.blessingbag.LiveBlessingBagContainer;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.core.show.blessingbag.LiveBlessingBagContainer$AudienceStatus;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.CountDownTimer;
import com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget;
import com.kuaishou.live.core.show.blessingbag.LiveBlessingBagContainer$AnchorStatus;
import com.kuaishou.live.core.show.blessingbag.LiveBlessingBagContainer$b;
import com.kuaishou.live.core.show.blessingbag.LiveBlessingBagContainer$a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$BlessingBagWidgeContentWithStyle;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import android.graphics.Color;
import java.lang.Throwable;
import com.kuaishou.live.core.basic.model.LiveAudienceBlessBagConfig;
import com.kuaishou.live.core.basic.model.LiveAudienceBlessBagConfig$CampaignConfig;
import java.lang.Long;
import com.kuaishou.live.core.show.blessingbag.b;
import lp3.i;
import z1.a;

public class LiveBlessingBagContainer extends FrameLayout	// class@000a04
{
    public final View b;
    public final View c;
    public final KwaiImageView d;
    public final TextView e;
    public AnimatorSet f;
    public Runnable g;
    public a h;
    public CountDownTimer i;
    public LiveBlessingBagContainer$a j;
    public LiveBlessingBagContainer$b k;
    public boolean l;
    public String m;
    public long n;
    public i o;
    public boolean p;
    public boolean q;
    public boolean r;
    public static final int s;

    public void LiveBlessingBagContainer(Context p0){
       super(p0, null);
    }
    public void LiveBlessingBagContainer(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveBlessingBagContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.k = LiveBlessingBagContainer$AudienceStatus.UNKNOW;
       this.p = false;
       this.q = false;
       this.r = true;
       this.setClipChildren(false);
       this.setClipToPadding(false);
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d0e16, this);
       this.b = this.findViewById(0x7f0a26c6);
       this.c = this.findViewById(0x7f0a26c8);
       this.d = this.findViewById(0x7f0a26c7);
       this.e = this.findViewById(0x7f0a26c9);
    }
    public final boolean a(Animator p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveBlessingBagContainer.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && p0.isRunning())? true: false;
       return b;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveBlessingBagContainer.class, "9")) {
          return;
       }
       this.n = 0;
       LiveBlessingBagContainer ti = this.i;
       if (ti != null) {
          ti.cancel();
          this.i = null;
       }
       return;
    }
    public final void c(LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget p0,boolean p1){
       LiveBlessingBagContainer$AnchorStatus uNKNOW;
       LiveRevenueBlessgingBagProto$BlessingBagWidgeContentWithStyle content;
       if (PatchProxy.isSupport(LiveBlessingBagContainer.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LiveBlessingBagContainer.class, "4")) {
          return;
       }
       LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget status = p0.status;
       int i = 1;
       int i1 = this.r ^ i;
       LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget sCLiveRevenu = 4;
       String str = 2;
       if (this.l != null) {
          if (status != i) {
             if (status != str) {
                uNKNOW = (status != sCLiveRevenu)? LiveBlessingBagContainer$AnchorStatus.UNKNOW: LiveBlessingBagContainer$AnchorStatus.FINISH;
             }else {
                uNKNOW = LiveBlessingBagContainer$AnchorStatus.SENDING;
             }
          }else {
             uNKNOW = LiveBlessingBagContainer$AnchorStatus.PREPARE;
          }
       }else if(!p1){
          uNKNOW = (i1)? LiveBlessingBagContainer$AudienceStatus.COUNTDOWN: LiveBlessingBagContainer$AudienceStatus.WAITING_RECEIVE;
       }else if(status != i){
          if (status != str) {
             uNKNOW = (status != sCLiveRevenu)? LiveBlessingBagContainer$AudienceStatus.UNKNOW: LiveBlessingBagContainer$AudienceStatus.FINISH;
          }else {
             uNKNOW = LiveBlessingBagContainer$AudienceStatus.WAITING_RECEIVE;
          }
       }else {
          uNKNOW = LiveBlessingBagContainer$AudienceStatus.WAITING_SEND;
       }
       if (this.k != uNKNOW) {
          this.k = uNKNOW;
          LiveBlessingBagContainer tj = this.j;
          if (tj != null) {
             tj.b(p0.campaignId, uNKNOW.value());
          }
       }
       this.m = p0.campaignId;
       if (p0.bottomText != null) {
          LiveLogTag lIVE_BLESSIN = LiveLogTag.LIVE_BLESSING_BAG;
          lIVE_BLESSIN.appendTag("LiveBlessingBagContainer");
          LiveLogTag liveLogTag = lIVE_BLESSIN;
          LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget bottomText = p0.bottomText;
          b.U(liveLogTag, "updateBlessingBagStatus", "campaignId", p0.campaignId, "content", bottomText.content, "color", bottomText.color);
          LiveBlessingBagContainer te = this.e;
          content = p0.bottomText.content;
          try{
             te.setText(content);
             this.e.setTextColor(Color.parseColor(p0.bottomText.color));
          }catch(java.lang.Exception e10){
             b.y(LiveLogTag.LIVE_BLESSING_BAG.appendTag("LiveBlessingBagContainer"), "updateBlessingBagStatus", e10);
          }
       }
    }
    public final void d(LiveAudienceBlessBagConfig p0,LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveBlessingBagContainer.class, "2")) {
          return;
       }
       String str = "LiveBlessingBagContainer";
       if (p0 == null) {
          b.P(LiveLogTag.LIVE_BLESSING_BAG.appendTag(str), "updateBlessingBagView, anchor");
          if (!PatchProxy.applyVoidOneRefs(p1, this, LiveBlessingBagContainer.class, "3")) {
             this.c(p1, false);
          }
       }else {
          LiveLogTag lIVE_BLESSIN = LiveLogTag.LIVE_BLESSING_BAG;
          lIVE_BLESSIN.appendTag(str);
          b.P(lIVE_BLESSIN, "updateBlessingBagView, audience");
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveBlessingBagContainer.class, "5")) {
             LiveAudienceBlessBagConfig mCampaignCon = p0.mCampaignConfig;
             if (mCampaignCon == null) {
                lIVE_BLESSIN.appendTag(str);
                b.P(lIVE_BLESSIN, "updateAudienceBlessingBagView, config.mCampaignConfig == null");
             }else {
                LiveAudienceBlessBagConfig$CampaignConfig mPrimaryJobF = mCampaignCon.mPrimaryJobFinish;
                if (mPrimaryJobF == null) {
                   if (this.q != null) {
                      lIVE_BLESSIN.appendTag(str);
                      b.P(lIVE_BLESSIN, "updateAudienceBlessingBagView, mIsInCountDownTimer");
                   }else {
                      lIVE_BLESSIN.appendTag(str);
                      b.P(lIVE_BLESSIN, "updateAudienceBlessingBagView, startCountDownTimer");
                      this.q = true;
                      LiveAudienceBlessBagConfig mReceiveWait = p0.mReceiveWaitDurationMs;
                      if (!PatchProxy.isSupport(LiveBlessingBagContainer.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(mReceiveWait), this, LiveBlessingBagContainer.class, "8")) {
                         this.b();
                         b uob = new b(this, mReceiveWait, 100, mReceiveWait);
                         this.i = str;
                         str.start();
                         this.r = false;
                      }
                      this.c(p1, p0.mCampaignConfig.mPrimaryJobFinish);
                   }
                }else {
                   this.q = false;
                   this.c(p1, mPrimaryJobF);
                }
             }
          }
       }
       return;
    }
    public long getCountBagEndTime(){
       return this.n;
    }
    public void setLiveBlessingBagContainerCallback(LiveBlessingBagContainer$a p0){
       this.j = p0;
    }
    public void setLiveServiceManager(i p0){
       this.o = p0;
    }
    public void setLiveTopPendantEnterAnimationService(a p0){
       this.h = p0;
    }
}
