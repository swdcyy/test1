package com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter$a$a;
import android.os.Handler;
import com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Looper;
import java.lang.ref.WeakReference;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import android.os.Message;
import k57.d;
import x67.j;
import trd.j;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneSpreadGold;
import j47.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter$a$a$a;
import k57.a;
import k57.a$a;
import android.view.View;
import java.lang.Number;
import lnc.l1;
import lnc.a1;
import k57.g;
import java.util.Objects;
import l57.g;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import qrd.l1;
import java.util.List;
import l57.b;
import l57.a;
import android.animation.Animator$AnimatorListener;

public final class LiveGzoneGiftMessageBarPresenter$a$a extends Handler	// class@000d08
{
    public boolean a;
    public WeakReference b;
    public d c;

    public void LiveGzoneGiftMessageBarPresenter$a$a(LiveGzoneGiftMessageBarPresenter p0){
       a.p(p0, "barPresenter");
       Looper looper = Looper.myLooper();
       a.m(looper);
       super(looper);
       this.b = new WeakReference(p0);
    }
    public final ClientEvent$ElementPackage a(String p0,String p1){
       ClientEvent$ElementPackage obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveGzoneGiftMessageBarPresenter$a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.d("activity_id", p0);
       oi3.d("condition_id", p1);
       obj.params = oi3.e();
       return obj;
    }
    public void handleMessage(Message p0){
       LiveGzoneGiftMessageBarPresenter$a$a c;
       SCGzoneSpreadGold activityId;
       Object[] objArray1;
       d uod = this;
       Message obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, uod, LiveGzoneGiftMessageBarPresenter$a$a.class, "1")) {
          return;
       }
       a.p(obj, "msg");
       obj = obj.what;
       int b = false;
       int i = 2;
       boolean b1 = true;
       if (obj != b1) {
          if (obj == i) {
             c = uod.c;
             if (c != null) {
                c.e();
             }
             uod.a = b;
          }
       }else if(uod.a != null){
          return;
       }else {
          c = uod.b;
          Object[] objArray = null;
          LiveGzoneGiftMessageBarPresenter liveGzoneGif = (c != null)? c.get(): objArray;
          if (liveGzoneGif != null) {
             LiveGzoneGiftMessageBarPresenter x = liveGzoneGif.x;
             if (x != null && x.R4() == b1) {
                return;
             }
          }
          if (liveGzoneGif != null) {
             d uod1 = liveGzoneGif.y.F();
             uod.c = uod1;
             if (uod1 != null) {
                uod.a = b1;
                LiveGzoneGiftMessageBarPresenter z = liveGzoneGif.z;
                String str = "";
                if (z != null) {
                   activityId = z.activityId;
                   if (activityId != null) {
                   label_0065 :
                      if (z != null) {
                         SCGzoneSpreadGold goldId = z.goldId;
                         if (goldId != null) {
                            str = goldId;
                         }
                      }
                      String str1 = "2";
                      if (!PatchProxy.applyVoidTwoRefs(activityId, str, uod, LiveGzoneGiftMessageBarPresenter$a$a.class, str1)) {
                         LiveGzoneGiftMessageBarPresenter$a$a b4 = uod.b;
                         z = (b4 != null)? b4.get(): objArray;
                         if (z != null) {
                            ClientEvent$ElementPackage uElementPack = uod.a(activityId, str);
                            uElementPack.action2 = "DROP_TREASURE_CLAIM_BANNER";
                            u1.u0(5, uElementPack, LiveGzoneGiftMessageBarPresenter.P8(z).h3());
                         }
                      }
                      LiveGzoneGiftMessageBarPresenter q = liveGzoneGif.q;
                      if (q == null) {
                         a.S("mBarContainerView");
                      }
                      LiveGzoneGiftMessageBarPresenter$a$a$a uoa$a$a = new LiveGzoneGiftMessageBarPresenter$a$a$a(uod1, liveGzoneGif, uod, liveGzoneGif);
                      if (!PatchProxy.applyVoidTwoRefs(q, uoa$a$a, uod1, d.class, "5")) {
                         a.p(q, "containerView");
                         String str2 = "listener";
                         a.p(uoa$a$a, str2);
                         a$a h = a.h;
                         int i1 = h.a();
                         int i2 = h.a();
                         a$a uoa = h;
                         LiveGzoneGiftMessageBarPresenter$a$a$a uoa$a$a1 = uoa$a$a;
                         LiveGzoneGiftMessageBarPresenter liveGzoneGif1 = q;
                         int i3 = i1;
                         int i4 = i2;
                         d.a(uod1, uod1.h, q, 0, 0, 0, 0, i3, i4, 0, 316, 0);
                         d b2 = uod1.b;
                         int i5 = uoa.b();
                         int i6 = uoa.b();
                         a$a uoa1 = uoa;
                         d obj1 = PatchProxy.apply(objArray, uoa1, a$a.class, str1);
                         if (obj1 != PatchProxyResult.class) {
                            b = obj1.intValue();
                         }else if(l1.a()){
                            b = a1.e(248.00f);
                         }else {
                            b = a1.e(4.00f);
                         }
                         i3 = b;
                         a$a uoa2 = uoa1;
                         d.a(uod1, b2, liveGzoneGif1, i5, i6, 0, a.c, i3, null, a.d, 128, null);
                         uod1.k = uoa$a$a1;
                         obj1 = uod1.i;
                         d b3 = uod1.b;
                         d h1 = uod1.h;
                         g og = new g(uod1);
                         Objects.requireNonNull(obj1);
                         if (!PatchProxy.applyVoidThreeRefs(b3, h1, og, obj1, g.class, "1")) {
                            a.p(b3, "lottieAnimationView");
                            a.p(h1, "rootView");
                            a.p(og, str2);
                            ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(b3, View.ALPHA, new float[i]{0,0x3f800000});
                            float[] uofloatArray = new float[i];
                            uofloatArray[0] = 0;
                            uofloatArray[1] = uoa2.c();
                            ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(b3, View.TRANSLATION_Y, uofloatArray);
                            float[] uofloatArray1 = new float[i];
                            uofloatArray1[0] = 0;
                            uofloatArray1[1] = uoa2.c();
                            AnimatorSet uAnimatorSet = new AnimatorSet();
                            uAnimatorSet.setDuration(600);
                            Animator[] uAnimatorArr = new Animator[i];
                            uAnimatorArr[0] = ObjectAnimator.ofFloat(h1, View.ALPHA, new float[i]{0,0x3f800000});
                            uAnimatorArr[1] = ObjectAnimator.ofFloat(h1, View.TRANSLATION_Y, uofloatArray1);
                            uAnimatorSet.playTogether(uAnimatorArr);
                            uAnimatorSet.start();
                            obj1.a.add(uAnimatorSet);
                            AnimatorSet uAnimatorSet1 = new AnimatorSet();
                            uAnimatorSet1.setStartDelay(300);
                            uAnimatorSet1.setDuration(600);
                            uAnimatorSet1.addListener(new b(og, objectAnimat, objectAnimat1));
                            Animator[] uAnimatorArr1 = new Animator[i];
                            uAnimatorArr1[0] = objectAnimat;
                            uAnimatorArr1[1] = objectAnimat1;
                            uAnimatorSet1.playTogether(uAnimatorArr1);
                            uAnimatorSet1.start();
                            obj1.a.add(uAnimatorSet1);
                         }
                      }
                   }
                }
                activityId = str;
                goto label_0065 ;
             }
          }
       }
    label_01de :
       return;
    }
}
