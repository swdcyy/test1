package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.a$a;
import ql1.c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import ql1.b;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import android.view.View;
import n01.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import wk1.b;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$ComboBatchSendGiftConfig;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$RecoBatchConfig;
import java.lang.Integer;
import d61.n;
import d61.n$a;
import n01.g;
import n01.g$a;
import com.yxcorp.gifshow.models.Gift;
import uz0.o;
import n01.c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.LiveGiftBoxBatchTipsView;
import lnc.a1;
import android.util.Property;
import android.animation.ObjectAnimator;
import zi1.e;
import android.animation.TimeInterpolator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.c;
import android.animation.Animator$AnimatorListener;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.giftcomboanimation.c;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.giftcomboanimation.c$a;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import java.lang.CharSequence;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import android.text.SpannableStringBuilder;
import n01.d;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.tips.a$b;

public class a$a implements c	// class@000b62
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(GiftPanelItem p0,int p1,boolean p2){
       b.e(this, p0, p1, p2);
    }
    public void b(GiftPanelItem p0,int p1,boolean p2){
       b.f(this, p0, p1, p2);
    }
    public void c(GiftTab p0,GiftPanelItem p1,int p2,View p3){
       b.h(this, p0, p1, p2, p3);
    }
    public void d(){
       b.d(this);
    }
    public void e(GiftTab p0,GiftPanelItem p1){
       a$a a;
       boolean b;
       PatchProxyResult patchProxyRe1;
       a uoa3;
       boolean b1;
       View$OnClickListener obj3;
       boolean b2;
       b uob1;
       String str3;
       String str4;
       a c;
       n$a a1;
       LiveGiftBoxBatchTipsView c1;
       n$a obj5;
       a$a obj = this;
       a$a obj1 = p1;
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, obj1, obj, a$a.class, str)) {
          return;
       }
       obj.a.b();
       a = obj.a;
       Objects.requireNonNull(a);
       String obj2 = PatchProxy.applyOneRefs(obj1, a, uoa, "3");
       String str1 = "key_of_batch_count_live_room_limit";
       String str2 = "key_of_batch_count_tips_limit";
       a uoa1 = null;
       a uoa2 = 1;
       if (obj2 != patchProxyRe) {
          b = obj2.booleanValue();
       }else {
          boolean b3 = a.d.c();
          if (a.a(obj1) && !b3) {
             a c2 = a.c;
             LiveTimeConsumingUserStatusResponse$RecoBatchConfig mRecoThresho = a.e.mRecoBatchConfig.mRecoThreshold;
             if (PatchProxy.isSupport(uob)) {
                obj5 = PatchProxy.applyTwoRefs(c2, Integer.valueOf(mRecoThresho), uoa1, uob, str);
                if (obj5 != patchProxyRe) {
                   b = obj5.booleanValue();
                label_007b :
                   if (b) {
                      b = true;
                   }
                }
             }
             obj5 = n.a;
             n on = obj5.b(obj5.c(str2), mRecoThresho);
             b = on.a(g.a.a(str1, c2)).c();
             goto label_007b ;
          }
       label_007f :
          b = false;
       }
       obj2 = "5";
       if (b) {
          a = obj.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(obj1, a, uoa, "4")) {
             LiveTimeConsumingUserStatusResponse$RecoBatchConfig mRecentBatch = a.e.mRecoBatchConfig.mRecentBatchSend;
             int i2 = o.a(obj1.mRecoBatchSize, p1.getGift().mPrice);
             if (i2 > uoa2) {
                int i3 = b.a(mRecentBatch);
                a.c();
                LiveTimeConsumingUserStatusResponse$RecoBatchConfig mRecoTextDur = a.e.mRecoBatchConfig.mRecoTextDurationMs;
                uoa2 = a.g;
                c uoc = new c(a, i2, mRecentBatch);
                Objects.requireNonNull(uoa2);
                if (PatchProxy.isSupport(LiveGiftBoxBatchTipsView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(mRecoTextDur), uoc, uoa2, LiveGiftBoxBatchTipsView.class, "2")) {
                   uob1 = uob;
                   patchProxyRe1 = patchProxyRe;
                   uoa3 = uoa;
                   obj1 = a;
                   str3 = str1;
                   str4 = str2;
                }else {
                   patchProxyRe1 = patchProxyRe;
                   uoa3 = uoa;
                   float[] uofloatArray = new float[]{(float)a1.d(0x7f070313),(float)(- a1.d(0x7f070329))};
                   str3 = str1;
                   ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(uoa2.E, View.TRANSLATION_Y, uofloatArray);
                   obj1 = a;
                   objectAnimat.setDuration(160);
                   objectAnimat.setInterpolator(new e(0.17f, 0.17f, 0x3f2b851f, 0x3f800000));
                   float[] obj4 = new float[]{(float)(- a1.d(0x7f070329)),0};
                   ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(uoa2.E, View.TRANSLATION_Y, obj4);
                   objectAnimat1.setDuration(120);
                   objectAnimat1.setStartDelay(160);
                   uob1 = uob;
                   str4 = str2;
                   objectAnimat1.setInterpolator(new e(0.17f, 0.30f, 0x3f2b851f, 0x3f800000));
                   b = 2;
                   ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(uoa2.E, View.ALPHA, new float[b]{0,0x3f800000});
                   objectAnimat2.setDuration(160);
                   AnimatorSet uAnimatorSet = new AnimatorSet();
                   Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
                   uAnimatorSet.playTogether(uAnimatorArr);
                   uAnimatorSet.addListener(new c(uoa2, mRecoTextDur));
                   uAnimatorSet.start();
                   if (!PatchProxy.isSupport(LiveGiftBoxBatchTipsView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i3), Integer.valueOf(i2), uoa2, LiveGiftBoxBatchTipsView.class, obj2)) {
                      c1 = uoa2.B;
                      if (c1 != null) {
                         c1.setVisibility(0);
                         if (i3 == 2) {
                            uoa2.B.setText(new LiveSpannable().b("送出").b(String.valueOf(i2)).b("个触发 ").j(new LiveSpannable$b(TextUtils.I(c.b.a(i2))).d(R.color.arg_RES_7f0604d9)).b(" 彩蛋").k());
                         }else if(i3 == 1){
                            uoa2.B.setText("已为您自动切换至推荐数量");
                         }
                      }
                   }
                   if (!PatchProxy.isSupport(LiveGiftBoxBatchTipsView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i3), uoc, uoa2, LiveGiftBoxBatchTipsView.class, "6")) {
                      c1 = uoa2.C;
                      if (c1 != null) {
                         if (i3 == 2) {
                            c1.setVisibility(0);
                            uoa2.C.setOnClickListener(new d(uoa2, uoc));
                         label_023d :
                            obj3 = null;
                         label_024b :
                            obj1.b.a(mRecentBatch, i3);
                            c = obj1.c;
                            if (PatchProxy.applyVoidOneRefs(c, obj3, uob1, "2")) {
                            label_027f :
                               obj = this;
                               obj1 = obj.a;
                               Objects.requireNonNull(obj1);
                               obj3 = p1;
                               uoa = uoa3;
                               obj4 = PatchProxy.applyOneRefs(obj3, obj1, uoa, obj2);
                               if (obj4 != patchProxyRe1) {
                                  b2 = obj4.booleanValue();
                               }else {
                                  b = obj1.d.c();
                                  int i1 = (obj1.a(obj3) && !b)? 1: 0;
                                  b2 = i1;
                               }
                               if (b2) {
                                  obj1 = obj.a;
                                  Objects.requireNonNull(obj1);
                                  if (!PatchProxy.applyVoidOneRefs(obj3, obj1, uoa, "6")) {
                                     int i = o.a(obj3.mRecoBatchSize, p1.getGift().mPrice);
                                     b1 = b.a(obj1.e.mRecoBatchConfig.mRecentBatchSend);
                                     if (i > 1 && b1 == 1) {
                                        obj1.d(i);
                                        obj1.b.c(i);
                                     }
                                  }
                               }
                               return;
                            }else {
                               a1 = n.a;
                               a1.b(a1.c(str4), 1).a(g.a.a(str3, c)).b();
                               goto label_027f ;
                            }
                         }else {
                            c1.setVisibility(8);
                            obj3 = null;
                            uoa2.C.setOnClickListener(obj3);
                            goto label_024b ;
                         }
                      }
                   }
                }
                b1 = false;
                goto label_023d ;
             }
          }
       }
       patchProxyRe1 = patchProxyRe;
       uoa3 = uoa;
       b1 = false;
       goto label_027f ;
    }
    public void f(){
       b.c(this);
    }
    public void g(GiftTab p0){
       b.g(this, p0);
    }
    public void h(){
       b.b(this);
    }
}
